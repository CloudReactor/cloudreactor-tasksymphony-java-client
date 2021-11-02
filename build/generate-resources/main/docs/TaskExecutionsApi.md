# TaskExecutionsApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taskExecutionsCreate**](TaskExecutionsApi.md#taskExecutionsCreate) | **POST** /task_executions/ | 
[**taskExecutionsDestroy**](TaskExecutionsApi.md#taskExecutionsDestroy) | **DELETE** /task_executions/{uuid}/ | 
[**taskExecutionsList**](TaskExecutionsApi.md#taskExecutionsList) | **GET** /task_executions/ | 
[**taskExecutionsPartialUpdate**](TaskExecutionsApi.md#taskExecutionsPartialUpdate) | **PATCH** /task_executions/{uuid}/ | 
[**taskExecutionsRetrieve**](TaskExecutionsApi.md#taskExecutionsRetrieve) | **GET** /task_executions/{uuid}/ | 
[**taskExecutionsUpdate**](TaskExecutionsApi.md#taskExecutionsUpdate) | **PUT** /task_executions/{uuid}/ | 



## taskExecutionsCreate

> TaskExecution taskExecutionsCreate(taskExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        TaskExecution taskExecution = new TaskExecution(); // TaskExecution | 
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

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskExecution** | [**TaskExecution**](TaskExecution.md)|  |

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## taskExecutionsDestroy

> taskExecutionsDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.taskExecutionsDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## taskExecutionsList

> PaginatedTaskExecutionList taskExecutionsList(limit, offset, ordering, search, taskCreatedByGroupId, taskUuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        Integer limit = 56; // Integer | Number of results to return per page.
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String search = "search_example"; // String | A search term.
        Integer taskCreatedByGroupId = 56; // Integer | 
        String taskUuid = "taskUuid_example"; // String | 
        try {
            PaginatedTaskExecutionList result = apiInstance.taskExecutionsList(limit, offset, ordering, search, taskCreatedByGroupId, taskUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]
 **ordering** | **String**| Which field to use when ordering the results. | [optional]
 **search** | **String**| A search term. | [optional]
 **taskCreatedByGroupId** | **Integer**|  | [optional]
 **taskUuid** | **String**|  | [optional]

### Return type

[**PaginatedTaskExecutionList**](PaginatedTaskExecutionList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## taskExecutionsPartialUpdate

> TaskExecution taskExecutionsPartialUpdate(uuid, patchedTaskExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedTaskExecution patchedTaskExecution = new PatchedTaskExecution(); // PatchedTaskExecution | 
        try {
            TaskExecution result = apiInstance.taskExecutionsPartialUpdate(uuid, patchedTaskExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **UUID**|  |
 **patchedTaskExecution** | [**PatchedTaskExecution**](PatchedTaskExecution.md)|  | [optional]

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## taskExecutionsRetrieve

> TaskExecution taskExecutionsRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            TaskExecution result = apiInstance.taskExecutionsRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **UUID**|  |

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## taskExecutionsUpdate

> TaskExecution taskExecutionsUpdate(uuid, taskExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.TaskExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        TaskExecutionsApi apiInstance = new TaskExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        TaskExecution taskExecution = new TaskExecution(); // TaskExecution | 
        try {
            TaskExecution result = apiInstance.taskExecutionsUpdate(uuid, taskExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskExecutionsApi#taskExecutionsUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **UUID**|  |
 **taskExecution** | [**TaskExecution**](TaskExecution.md)|  |

### Return type

[**TaskExecution**](TaskExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

