# CloudReactor Java API Client and Status Updater


![Maven Central](https://img.shields.io/maven-central/v/io.cloudreactor/tasksymphony)
![Java CI](https://github.com/CloudReactor/cloudreactor-tasksymphony-wrapper-io-java/workflows/Java%20CI/badge.svg?branch=master)
![GitHub](https://img.shields.io/github/license/CloudReactor/cloudreactor-tasksymphony-java-client)

## Overview

This Java library consists of 2 parts:

1) The CloudReactor API client allows JVM applications to programmatically 
create, monitor, and manage Tasks and Workflows. Most notably you can start and stop
Tasks and Workflows by creating Task Executions and Workflow Executions. 

2) The Wrapper I/O package allows a JVM process to communicate with the 
[CloudReactor wrapper](https://github.com/CloudReactor/cloudreactor-procwrapper) 
which is the parent process. 

See the [CloudReactor landing page](https://www.cloudreactor.io/) to see the
benefits of monitoring and managing your tasks with CloudReactor.

## API Client

The API client allows your program to control various entities in CloudReactor,
most notable Tasks and Workflows. To start an existing Task, create a 
TaskExecution linked to the Task, with a status of 
`TaskExecutionStatus.MANUALLY_STARTED`:

```java
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;
import io.cloudreactor.tasksymphony.auth.*;
import io.cloudreactor.tasksymphony.model.*;
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        
        // Use the fluent API instead of setX() methods which are an alternative.
        TaskExecution taskExecution = new TaskExecution().task(
            // Either UUID or name of the Task has to be specified to identify the Task
            new NameAndUuid().name("My Task"))
            .status(TaskExecutionStatus.MANUALLY_STARTED);
        
        try {
            TaskExecution result = apiInstance.taskExecutionsCreate(taskExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

Note that you don't need to know the details of how the Task runs, because
the default settings (populated when the Task was created during deployment) 
are used unless you override them.
 
## Wrapper I/O

While running a JVM process that is wrapped by the CloudReactor proc_wrapper,
you can use `io.cloudreactor.tasksymphony.wrapperio.TaskStatusUpdater` to
send updates about your process to the wrapper. The wrapper will send those
updates to the CloudReactor API server during its next heartbeat.
Updates can include:

* success count
* error count
* skipped count
* expected count
* last status message
* any additional properties that can be serialized into JSON

Updates are communicated via a local UDP socket which means they are 
theoretically unreliable. However, in practice, updates are almost always
picked up correctly.

### Example usage

    // Use the environment variables 
    // PROC_WRAPPER_ENABLE_STATUS_UPDATE_LISTENER
    // PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT
    // PROC_WRAPPER_STATUS_UPDATE_SOCKET_BIND_PORT
    // to determine configuration. These environment variables are typically passed
    // to the proc_wrapper.py script which then passes them on to your process.
    //
    // This uses a try-with-resources statement that will close the updater
    // whether or not the block threw an exception.
    try (TaskStatusUpdater statusUpdater = new TaskStatusUpdater()) { 
        statusUpdater.sendUpdate(
            1L,    // success count
            2L,    // error count
            null,  // skipped count
            null,  // expected count 
            "running", // last status message
            null); // extra props
    } 

## More Documentation

* [Javadoc](https://javadoc.cloudreactor.io/)
* [More documentation for each entity](https://github.com/CloudReactor/cloudreactor-tasksymphony-java-client/tree/master/build/generate-resources/main/docs)

## License

This project is covered by the [BSD 2-clause license](https://opensource.org/licenses/BSD-2-Clause).
