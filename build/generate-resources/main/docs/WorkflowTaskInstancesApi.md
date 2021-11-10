# WorkflowTaskInstancesApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowTaskInstancesCreate**](WorkflowTaskInstancesApi.md#workflowTaskInstancesCreate) | **POST** /workflow_task_instances/ | 
[**workflowTaskInstancesDestroy**](WorkflowTaskInstancesApi.md#workflowTaskInstancesDestroy) | **DELETE** /workflow_task_instances/{uuid}/ | 
[**workflowTaskInstancesList**](WorkflowTaskInstancesApi.md#workflowTaskInstancesList) | **GET** /workflow_task_instances/ | 
[**workflowTaskInstancesPartialUpdate**](WorkflowTaskInstancesApi.md#workflowTaskInstancesPartialUpdate) | **PATCH** /workflow_task_instances/{uuid}/ | 
[**workflowTaskInstancesRetrieve**](WorkflowTaskInstancesApi.md#workflowTaskInstancesRetrieve) | **GET** /workflow_task_instances/{uuid}/ | 
[**workflowTaskInstancesUpdate**](WorkflowTaskInstancesApi.md#workflowTaskInstancesUpdate) | **PUT** /workflow_task_instances/{uuid}/ | 



## workflowTaskInstancesCreate

> WorkflowTaskInstance workflowTaskInstancesCreate(workflowTaskInstance)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        WorkflowTaskInstance workflowTaskInstance = new WorkflowTaskInstance(); // WorkflowTaskInstance | 
        try {
            WorkflowTaskInstance result = apiInstance.workflowTaskInstancesCreate(workflowTaskInstance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesCreate");
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
 **workflowTaskInstance** | [**WorkflowTaskInstance**](WorkflowTaskInstance.md)|  |

### Return type

[**WorkflowTaskInstance**](WorkflowTaskInstance.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## workflowTaskInstancesDestroy

> workflowTaskInstancesDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.workflowTaskInstancesDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesDestroy");
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


## workflowTaskInstancesList

> PaginatedWorkflowTaskInstanceList workflowTaskInstancesList(description, limit, name, offset, ordering, search, taskName, taskUuid, workflowCreatedByGroupId, workflowRunEnvironmentUuid, workflowUuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        String description = "description_example"; // String | 
        Integer limit = 56; // Integer | Number of results to return per page.
        String name = "name_example"; // String | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String search = "search_example"; // String | A search term.
        String taskName = "taskName_example"; // String | 
        UUID taskUuid = UUID.randomUUID(); // UUID | 
        Integer workflowCreatedByGroupId = 56; // Integer | 
        UUID workflowRunEnvironmentUuid = UUID.randomUUID(); // UUID | 
        UUID workflowUuid = UUID.randomUUID(); // UUID | 
        try {
            PaginatedWorkflowTaskInstanceList result = apiInstance.workflowTaskInstancesList(description, limit, name, offset, ordering, search, taskName, taskUuid, workflowCreatedByGroupId, workflowRunEnvironmentUuid, workflowUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesList");
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
 **description** | **String**|  | [optional]
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **name** | **String**|  | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]
 **ordering** | **String**| Which field to use when ordering the results. | [optional]
 **search** | **String**| A search term. | [optional]
 **taskName** | **String**|  | [optional]
 **taskUuid** | **UUID**|  | [optional]
 **workflowCreatedByGroupId** | **Integer**|  | [optional]
 **workflowRunEnvironmentUuid** | **UUID**|  | [optional]
 **workflowUuid** | **UUID**|  | [optional]

### Return type

[**PaginatedWorkflowTaskInstanceList**](PaginatedWorkflowTaskInstanceList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTaskInstancesPartialUpdate

> WorkflowTaskInstance workflowTaskInstancesPartialUpdate(uuid, patchedWorkflowTaskInstance)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedWorkflowTaskInstance patchedWorkflowTaskInstance = new PatchedWorkflowTaskInstance(); // PatchedWorkflowTaskInstance | 
        try {
            WorkflowTaskInstance result = apiInstance.workflowTaskInstancesPartialUpdate(uuid, patchedWorkflowTaskInstance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesPartialUpdate");
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
 **patchedWorkflowTaskInstance** | [**PatchedWorkflowTaskInstance**](PatchedWorkflowTaskInstance.md)|  | [optional]

### Return type

[**WorkflowTaskInstance**](WorkflowTaskInstance.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTaskInstancesRetrieve

> WorkflowTaskInstance workflowTaskInstancesRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            WorkflowTaskInstance result = apiInstance.workflowTaskInstancesRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesRetrieve");
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

[**WorkflowTaskInstance**](WorkflowTaskInstance.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTaskInstancesUpdate

> WorkflowTaskInstance workflowTaskInstancesUpdate(uuid, workflowTaskInstance)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTaskInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTaskInstancesApi apiInstance = new WorkflowTaskInstancesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        WorkflowTaskInstance workflowTaskInstance = new WorkflowTaskInstance(); // WorkflowTaskInstance | 
        try {
            WorkflowTaskInstance result = apiInstance.workflowTaskInstancesUpdate(uuid, workflowTaskInstance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTaskInstancesApi#workflowTaskInstancesUpdate");
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
 **workflowTaskInstance** | [**WorkflowTaskInstance**](WorkflowTaskInstance.md)|  |

### Return type

[**WorkflowTaskInstance**](WorkflowTaskInstance.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

