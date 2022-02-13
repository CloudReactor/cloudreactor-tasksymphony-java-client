# RunEnvironmentsApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runEnvironmentsCloneCreate**](RunEnvironmentsApi.md#runEnvironmentsCloneCreate) | **POST** /run_environments/{uuid}/clone/ | 
[**runEnvironmentsCreate**](RunEnvironmentsApi.md#runEnvironmentsCreate) | **POST** /run_environments/ | 
[**runEnvironmentsDestroy**](RunEnvironmentsApi.md#runEnvironmentsDestroy) | **DELETE** /run_environments/{uuid}/ | 
[**runEnvironmentsList**](RunEnvironmentsApi.md#runEnvironmentsList) | **GET** /run_environments/ | 
[**runEnvironmentsPartialUpdate**](RunEnvironmentsApi.md#runEnvironmentsPartialUpdate) | **PATCH** /run_environments/{uuid}/ | 
[**runEnvironmentsRetrieve**](RunEnvironmentsApi.md#runEnvironmentsRetrieve) | **GET** /run_environments/{uuid}/ | 
[**runEnvironmentsUpdate**](RunEnvironmentsApi.md#runEnvironmentsUpdate) | **PUT** /run_environments/{uuid}/ | 



## runEnvironmentsCloneCreate

> RunEnvironment runEnvironmentsCloneCreate(uuid, runEnvironment)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        RunEnvironment runEnvironment = new RunEnvironment(); // RunEnvironment | 
        try {
            RunEnvironment result = apiInstance.runEnvironmentsCloneCreate(uuid, runEnvironment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsCloneCreate");
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
 **runEnvironment** | [**RunEnvironment**](RunEnvironment.md)|  |

### Return type

[**RunEnvironment**](RunEnvironment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## runEnvironmentsCreate

> RunEnvironment runEnvironmentsCreate(runEnvironment)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        RunEnvironment runEnvironment = new RunEnvironment(); // RunEnvironment | 
        try {
            RunEnvironment result = apiInstance.runEnvironmentsCreate(runEnvironment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsCreate");
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
 **runEnvironment** | [**RunEnvironment**](RunEnvironment.md)|  |

### Return type

[**RunEnvironment**](RunEnvironment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## runEnvironmentsDestroy

> runEnvironmentsDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.runEnvironmentsDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsDestroy");
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


## runEnvironmentsList

> PaginatedRunEnvironmentList runEnvironmentsList(createdByGroupId, limit, name, offset, ordering, search)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        Integer createdByGroupId = 56; // Integer | 
        Integer limit = 56; // Integer | Number of results to return per page.
        String name = "name_example"; // String | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String search = "search_example"; // String | A search term.
        try {
            PaginatedRunEnvironmentList result = apiInstance.runEnvironmentsList(createdByGroupId, limit, name, offset, ordering, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsList");
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
 **createdByGroupId** | **Integer**|  | [optional]
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **name** | **String**|  | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]
 **ordering** | **String**| Which field to use when ordering the results. | [optional]
 **search** | **String**| A search term. | [optional]

### Return type

[**PaginatedRunEnvironmentList**](PaginatedRunEnvironmentList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## runEnvironmentsPartialUpdate

> RunEnvironment runEnvironmentsPartialUpdate(uuid, patchedRunEnvironment)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedRunEnvironment patchedRunEnvironment = new PatchedRunEnvironment(); // PatchedRunEnvironment | 
        try {
            RunEnvironment result = apiInstance.runEnvironmentsPartialUpdate(uuid, patchedRunEnvironment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsPartialUpdate");
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
 **patchedRunEnvironment** | [**PatchedRunEnvironment**](PatchedRunEnvironment.md)|  | [optional]

### Return type

[**RunEnvironment**](RunEnvironment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## runEnvironmentsRetrieve

> RunEnvironment runEnvironmentsRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            RunEnvironment result = apiInstance.runEnvironmentsRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsRetrieve");
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

[**RunEnvironment**](RunEnvironment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## runEnvironmentsUpdate

> RunEnvironment runEnvironmentsUpdate(uuid, runEnvironment)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.RunEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RunEnvironmentsApi apiInstance = new RunEnvironmentsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        RunEnvironment runEnvironment = new RunEnvironment(); // RunEnvironment | 
        try {
            RunEnvironment result = apiInstance.runEnvironmentsUpdate(uuid, runEnvironment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEnvironmentsApi#runEnvironmentsUpdate");
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
 **runEnvironment** | [**RunEnvironment**](RunEnvironment.md)|  |

### Return type

[**RunEnvironment**](RunEnvironment.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

