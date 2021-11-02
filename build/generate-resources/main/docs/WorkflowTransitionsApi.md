# WorkflowTransitionsApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowTransitionsCreate**](WorkflowTransitionsApi.md#workflowTransitionsCreate) | **POST** /workflow_transitions/ | 
[**workflowTransitionsDestroy**](WorkflowTransitionsApi.md#workflowTransitionsDestroy) | **DELETE** /workflow_transitions/{uuid}/ | 
[**workflowTransitionsList**](WorkflowTransitionsApi.md#workflowTransitionsList) | **GET** /workflow_transitions/ | 
[**workflowTransitionsPartialUpdate**](WorkflowTransitionsApi.md#workflowTransitionsPartialUpdate) | **PATCH** /workflow_transitions/{uuid}/ | 
[**workflowTransitionsRetrieve**](WorkflowTransitionsApi.md#workflowTransitionsRetrieve) | **GET** /workflow_transitions/{uuid}/ | 
[**workflowTransitionsUpdate**](WorkflowTransitionsApi.md#workflowTransitionsUpdate) | **PUT** /workflow_transitions/{uuid}/ | 



## workflowTransitionsCreate

> WorkflowTransition workflowTransitionsCreate(workflowTransition)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        WorkflowTransition workflowTransition = new WorkflowTransition(); // WorkflowTransition | 
        try {
            WorkflowTransition result = apiInstance.workflowTransitionsCreate(workflowTransition);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsCreate");
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
 **workflowTransition** | [**WorkflowTransition**](WorkflowTransition.md)|  |

### Return type

[**WorkflowTransition**](WorkflowTransition.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## workflowTransitionsDestroy

> workflowTransitionsDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.workflowTransitionsDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsDestroy");
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


## workflowTransitionsList

> PaginatedWorkflowTransitionList workflowTransitionsList(description, limit, offset, ordering, search)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        String description = "description_example"; // String | 
        Integer limit = 56; // Integer | Number of results to return per page.
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String search = "search_example"; // String | A search term.
        try {
            PaginatedWorkflowTransitionList result = apiInstance.workflowTransitionsList(description, limit, offset, ordering, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsList");
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
 **offset** | **Integer**| The initial index from which to return the results. | [optional]
 **ordering** | **String**| Which field to use when ordering the results. | [optional]
 **search** | **String**| A search term. | [optional]

### Return type

[**PaginatedWorkflowTransitionList**](PaginatedWorkflowTransitionList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTransitionsPartialUpdate

> WorkflowTransition workflowTransitionsPartialUpdate(uuid, patchedWorkflowTransition)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedWorkflowTransition patchedWorkflowTransition = new PatchedWorkflowTransition(); // PatchedWorkflowTransition | 
        try {
            WorkflowTransition result = apiInstance.workflowTransitionsPartialUpdate(uuid, patchedWorkflowTransition);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsPartialUpdate");
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
 **patchedWorkflowTransition** | [**PatchedWorkflowTransition**](PatchedWorkflowTransition.md)|  | [optional]

### Return type

[**WorkflowTransition**](WorkflowTransition.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTransitionsRetrieve

> WorkflowTransition workflowTransitionsRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            WorkflowTransition result = apiInstance.workflowTransitionsRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsRetrieve");
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

[**WorkflowTransition**](WorkflowTransition.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## workflowTransitionsUpdate

> WorkflowTransition workflowTransitionsUpdate(uuid, workflowTransition)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.WorkflowTransitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WorkflowTransitionsApi apiInstance = new WorkflowTransitionsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        WorkflowTransition workflowTransition = new WorkflowTransition(); // WorkflowTransition | 
        try {
            WorkflowTransition result = apiInstance.workflowTransitionsUpdate(uuid, workflowTransition);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowTransitionsApi#workflowTransitionsUpdate");
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
 **workflowTransition** | [**WorkflowTransition**](WorkflowTransition.md)|  |

### Return type

[**WorkflowTransition**](WorkflowTransition.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

