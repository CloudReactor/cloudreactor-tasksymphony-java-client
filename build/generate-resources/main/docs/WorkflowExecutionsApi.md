# WorkflowExecutionsApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowExecutionsCreate**](WorkflowExecutionsApi.md#workflowExecutionsCreate) | **POST** /workflow_executions/ | 
[**workflowExecutionsDestroy**](WorkflowExecutionsApi.md#workflowExecutionsDestroy) | **DELETE** /workflow_executions/{uuid}/ | 
[**workflowExecutionsList**](WorkflowExecutionsApi.md#workflowExecutionsList) | **GET** /workflow_executions/ | 
[**workflowExecutionsPartialUpdate**](WorkflowExecutionsApi.md#workflowExecutionsPartialUpdate) | **PATCH** /workflow_executions/{uuid}/ | 
[**workflowExecutionsRetrieve**](WorkflowExecutionsApi.md#workflowExecutionsRetrieve) | **GET** /workflow_executions/{uuid}/ | 
[**workflowExecutionsRetryCreate**](WorkflowExecutionsApi.md#workflowExecutionsRetryCreate) | **POST** /workflow_executions/{uuid}/retry/ | 
[**workflowExecutionsUpdate**](WorkflowExecutionsApi.md#workflowExecutionsUpdate) | **PUT** /workflow_executions/{uuid}/ | 
[**workflowExecutionsWorkflowTaskInstanceExecutionsCreate**](WorkflowExecutionsApi.md#workflowExecutionsWorkflowTaskInstanceExecutionsCreate) | **POST** /workflow_executions/{uuid}/workflow_task_instance_executions/ | 



## workflowExecutionsCreate

> WorkflowExecution workflowExecutionsCreate(workflowExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        WorkflowExecution workflowExecution = new WorkflowExecution(); // WorkflowExecution | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsCreate(workflowExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsCreate");
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
 **workflowExecution** | [**WorkflowExecution**](WorkflowExecution.md)|  |

### Return type

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## workflowExecutionsDestroy

> workflowExecutionsDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.workflowExecutionsDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsDestroy");
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


## workflowExecutionsList

> PaginatedWorkflowExecutionSummaryList workflowExecutionsList(limit, offset, ordering, search, workflowCreatedByGroupId, workflowUuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        Integer limit = 56; // Integer | Number of results to return per page.
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String search = "search_example"; // String | A search term.
        String workflowCreatedByGroupId = "workflowCreatedByGroupId_example"; // String | 
        String workflowUuid = "workflowUuid_example"; // String | 
        try {
            PaginatedWorkflowExecutionSummaryList result = apiInstance.workflowExecutionsList(limit, offset, ordering, search, workflowCreatedByGroupId, workflowUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsList");
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
 **workflowCreatedByGroupId** | **String**|  | [optional]
 **workflowUuid** | **String**|  | [optional]

### Return type

[**PaginatedWorkflowExecutionSummaryList**](PaginatedWorkflowExecutionSummaryList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowExecutionsPartialUpdate

> WorkflowExecution workflowExecutionsPartialUpdate(uuid, patchedWorkflowExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedWorkflowExecution patchedWorkflowExecution = new PatchedWorkflowExecution(); // PatchedWorkflowExecution | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsPartialUpdate(uuid, patchedWorkflowExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsPartialUpdate");
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
 **patchedWorkflowExecution** | [**PatchedWorkflowExecution**](PatchedWorkflowExecution.md)|  | [optional]

### Return type

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowExecutionsRetrieve

> WorkflowExecution workflowExecutionsRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsRetrieve");
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

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowExecutionsRetryCreate

> WorkflowExecution workflowExecutionsRetryCreate(uuid, workflowExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        WorkflowExecution workflowExecution = new WorkflowExecution(); // WorkflowExecution | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsRetryCreate(uuid, workflowExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsRetryCreate");
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
 **workflowExecution** | [**WorkflowExecution**](WorkflowExecution.md)|  |

### Return type

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowExecutionsUpdate

> WorkflowExecution workflowExecutionsUpdate(uuid, workflowExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        WorkflowExecution workflowExecution = new WorkflowExecution(); // WorkflowExecution | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsUpdate(uuid, workflowExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsUpdate");
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
 **workflowExecution** | [**WorkflowExecution**](WorkflowExecution.md)|  |

### Return type

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowExecutionsWorkflowTaskInstanceExecutionsCreate

> WorkflowExecution workflowExecutionsWorkflowTaskInstanceExecutionsCreate(uuid, workflowExecution)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowExecutionsApi apiInstance = new WorkflowExecutionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        WorkflowExecution workflowExecution = new WorkflowExecution(); // WorkflowExecution | 
        try {
            WorkflowExecution result = apiInstance.workflowExecutionsWorkflowTaskInstanceExecutionsCreate(uuid, workflowExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowExecutionsApi#workflowExecutionsWorkflowTaskInstanceExecutionsCreate");
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
 **workflowExecution** | [**WorkflowExecution**](WorkflowExecution.md)|  |

### Return type

[**WorkflowExecution**](WorkflowExecution.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

