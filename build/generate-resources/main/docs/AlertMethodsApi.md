# AlertMethodsApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alertMethodsCloneCreate**](AlertMethodsApi.md#alertMethodsCloneCreate) | **POST** /alert_methods/{uuid}/clone/ | 
[**alertMethodsCreate**](AlertMethodsApi.md#alertMethodsCreate) | **POST** /alert_methods/ | 
[**alertMethodsDestroy**](AlertMethodsApi.md#alertMethodsDestroy) | **DELETE** /alert_methods/{uuid}/ | 
[**alertMethodsList**](AlertMethodsApi.md#alertMethodsList) | **GET** /alert_methods/ | 
[**alertMethodsPartialUpdate**](AlertMethodsApi.md#alertMethodsPartialUpdate) | **PATCH** /alert_methods/{uuid}/ | 
[**alertMethodsRetrieve**](AlertMethodsApi.md#alertMethodsRetrieve) | **GET** /alert_methods/{uuid}/ | 
[**alertMethodsUpdate**](AlertMethodsApi.md#alertMethodsUpdate) | **PUT** /alert_methods/{uuid}/ | 



## alertMethodsCloneCreate

> AlertMethod alertMethodsCloneCreate(uuid, alertMethod)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        AlertMethod alertMethod = new AlertMethod(); // AlertMethod | 
        try {
            AlertMethod result = apiInstance.alertMethodsCloneCreate(uuid, alertMethod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsCloneCreate");
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
 **alertMethod** | [**AlertMethod**](AlertMethod.md)|  |

### Return type

[**AlertMethod**](AlertMethod.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## alertMethodsCreate

> AlertMethod alertMethodsCreate(alertMethod)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        AlertMethod alertMethod = new AlertMethod(); // AlertMethod | 
        try {
            AlertMethod result = apiInstance.alertMethodsCreate(alertMethod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsCreate");
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
 **alertMethod** | [**AlertMethod**](AlertMethod.md)|  |

### Return type

[**AlertMethod**](AlertMethod.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## alertMethodsDestroy

> alertMethodsDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.alertMethodsDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsDestroy");
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


## alertMethodsList

> PaginatedAlertMethodList alertMethodsList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        Integer createdByGroupId = 56; // Integer | 
        Integer limit = 56; // Integer | Number of results to return per page.
        String name = "name_example"; // String | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String runEnvironmentUuid = "runEnvironmentUuid_example"; // String | 
        String search = "search_example"; // String | A search term.
        try {
            PaginatedAlertMethodList result = apiInstance.alertMethodsList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsList");
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
 **runEnvironmentUuid** | **String**|  | [optional]
 **search** | **String**| A search term. | [optional]

### Return type

[**PaginatedAlertMethodList**](PaginatedAlertMethodList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## alertMethodsPartialUpdate

> AlertMethod alertMethodsPartialUpdate(uuid, patchedAlertMethod)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedAlertMethod patchedAlertMethod = new PatchedAlertMethod(); // PatchedAlertMethod | 
        try {
            AlertMethod result = apiInstance.alertMethodsPartialUpdate(uuid, patchedAlertMethod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsPartialUpdate");
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
 **patchedAlertMethod** | [**PatchedAlertMethod**](PatchedAlertMethod.md)|  | [optional]

### Return type

[**AlertMethod**](AlertMethod.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## alertMethodsRetrieve

> AlertMethod alertMethodsRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            AlertMethod result = apiInstance.alertMethodsRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsRetrieve");
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

[**AlertMethod**](AlertMethod.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## alertMethodsUpdate

> AlertMethod alertMethodsUpdate(uuid, alertMethod)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.AlertMethodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        AlertMethodsApi apiInstance = new AlertMethodsApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        AlertMethod alertMethod = new AlertMethod(); // AlertMethod | 
        try {
            AlertMethod result = apiInstance.alertMethodsUpdate(uuid, alertMethod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertMethodsApi#alertMethodsUpdate");
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
 **alertMethod** | [**AlertMethod**](AlertMethod.md)|  |

### Return type

[**AlertMethod**](AlertMethod.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

