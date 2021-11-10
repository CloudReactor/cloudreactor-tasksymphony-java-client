# PagerdutyProfilesApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagerdutyProfilesCloneCreate**](PagerdutyProfilesApi.md#pagerdutyProfilesCloneCreate) | **POST** /pagerduty_profiles/{uuid}/clone/ | 
[**pagerdutyProfilesCreate**](PagerdutyProfilesApi.md#pagerdutyProfilesCreate) | **POST** /pagerduty_profiles/ | 
[**pagerdutyProfilesDestroy**](PagerdutyProfilesApi.md#pagerdutyProfilesDestroy) | **DELETE** /pagerduty_profiles/{uuid}/ | 
[**pagerdutyProfilesList**](PagerdutyProfilesApi.md#pagerdutyProfilesList) | **GET** /pagerduty_profiles/ | 
[**pagerdutyProfilesPartialUpdate**](PagerdutyProfilesApi.md#pagerdutyProfilesPartialUpdate) | **PATCH** /pagerduty_profiles/{uuid}/ | 
[**pagerdutyProfilesRetrieve**](PagerdutyProfilesApi.md#pagerdutyProfilesRetrieve) | **GET** /pagerduty_profiles/{uuid}/ | 
[**pagerdutyProfilesUpdate**](PagerdutyProfilesApi.md#pagerdutyProfilesUpdate) | **PUT** /pagerduty_profiles/{uuid}/ | 



## pagerdutyProfilesCloneCreate

> PagerDutyProfile pagerdutyProfilesCloneCreate(uuid, pagerDutyProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PagerDutyProfile pagerDutyProfile = new PagerDutyProfile(); // PagerDutyProfile | 
        try {
            PagerDutyProfile result = apiInstance.pagerdutyProfilesCloneCreate(uuid, pagerDutyProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesCloneCreate");
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
 **pagerDutyProfile** | [**PagerDutyProfile**](PagerDutyProfile.md)|  |

### Return type

[**PagerDutyProfile**](PagerDutyProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## pagerdutyProfilesCreate

> PagerDutyProfile pagerdutyProfilesCreate(pagerDutyProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        PagerDutyProfile pagerDutyProfile = new PagerDutyProfile(); // PagerDutyProfile | 
        try {
            PagerDutyProfile result = apiInstance.pagerdutyProfilesCreate(pagerDutyProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesCreate");
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
 **pagerDutyProfile** | [**PagerDutyProfile**](PagerDutyProfile.md)|  |

### Return type

[**PagerDutyProfile**](PagerDutyProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## pagerdutyProfilesDestroy

> pagerdutyProfilesDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.pagerdutyProfilesDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesDestroy");
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


## pagerdutyProfilesList

> PaginatedPagerDutyProfileList pagerdutyProfilesList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        Integer createdByGroupId = 56; // Integer | 
        Integer limit = 56; // Integer | Number of results to return per page.
        String name = "name_example"; // String | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String runEnvironmentUuid = "runEnvironmentUuid_example"; // String | 
        String search = "search_example"; // String | A search term.
        try {
            PaginatedPagerDutyProfileList result = apiInstance.pagerdutyProfilesList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesList");
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

[**PaginatedPagerDutyProfileList**](PaginatedPagerDutyProfileList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## pagerdutyProfilesPartialUpdate

> PagerDutyProfile pagerdutyProfilesPartialUpdate(uuid, patchedPagerDutyProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedPagerDutyProfile patchedPagerDutyProfile = new PatchedPagerDutyProfile(); // PatchedPagerDutyProfile | 
        try {
            PagerDutyProfile result = apiInstance.pagerdutyProfilesPartialUpdate(uuid, patchedPagerDutyProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesPartialUpdate");
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
 **patchedPagerDutyProfile** | [**PatchedPagerDutyProfile**](PatchedPagerDutyProfile.md)|  | [optional]

### Return type

[**PagerDutyProfile**](PagerDutyProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## pagerdutyProfilesRetrieve

> PagerDutyProfile pagerdutyProfilesRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            PagerDutyProfile result = apiInstance.pagerdutyProfilesRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesRetrieve");
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

[**PagerDutyProfile**](PagerDutyProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## pagerdutyProfilesUpdate

> PagerDutyProfile pagerdutyProfilesUpdate(uuid, pagerDutyProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.PagerdutyProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        PagerdutyProfilesApi apiInstance = new PagerdutyProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PagerDutyProfile pagerDutyProfile = new PagerDutyProfile(); // PagerDutyProfile | 
        try {
            PagerDutyProfile result = apiInstance.pagerdutyProfilesUpdate(uuid, pagerDutyProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerdutyProfilesApi#pagerdutyProfilesUpdate");
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
 **pagerDutyProfile** | [**PagerDutyProfile**](PagerDutyProfile.md)|  |

### Return type

[**PagerDutyProfile**](PagerDutyProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

