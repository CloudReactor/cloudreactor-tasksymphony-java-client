# CloudReactor Java API Client and Status Updater

![Java CI](https://github.com/CloudReactor/cloudreactor-tasksymphony-wrapper-io-java/workflows/Java%20CI/badge.svg?branch=master)

## Overview

This Java library consists of 2 parts:

1) The CloudReactor API client allows JVM applications to programmatically 
monitor and manage Tasks and Workflows. Most notably you can start and stop
Tasks and Workflows by creating Task Executions and Workflow Executions. 

2) The Wrapper I/O package allows a JVM process to communicate with the 
[CloudReactor wrapper](https://github.com/CloudReactor/cloudreactor-procwrapper) 
which is the parent process. 
 
 
## Wrapper I/O

`io.cloudreactor.tasksymphony.wrapperio`

5) , so it can send updates about your process to the CloudReactor API
server. Updates can include:

* success count
* error count
* skipped count
* expected count
* last status message
* any additional properties that can be serialized into JSON

See the [CloudReactor landing page](https://www.cloudreactor.io/) to see the benefits of monitoring and managing your 
tasks with CloudReactor.

## Example usage

    // Use the environment variables 
    // PROC_WRAPPER_ENABLE_STATUS_UPDATE_LISTENER
    // PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT
    // PROC_WRAPPER_STATUS_UPDATE_SOCKET_BIND_PORT
    // to determine configuration. These environment variables are typically passed
    // to the proc_wrapper.py script which then passes them on to your process.    
    TaskStatusUpdater statusUpdater = new TaskStatusUpdater()
    
    statusUpdater.sendUpdate(
        1L,    // success count
        2L,    // error count
        null,  // skipped count
        null,  // expected count 
        "running", // last status message
        null); // extra props    
        
    statusUpdater.close()

## License

This project is covered by the [BSD 2-clause license](https://opensource.org/licenses/BSD-2-Clause).
