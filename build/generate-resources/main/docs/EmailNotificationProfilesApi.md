# EmailNotificationProfilesApi

All URIs are relative to *https://api.cloudreactor.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailNotificationProfilesCloneCreate**](EmailNotificationProfilesApi.md#emailNotificationProfilesCloneCreate) | **POST** /email_notification_profiles/{uuid}/clone/ | 
[**emailNotificationProfilesCreate**](EmailNotificationProfilesApi.md#emailNotificationProfilesCreate) | **POST** /email_notification_profiles/ | 
[**emailNotificationProfilesDestroy**](EmailNotificationProfilesApi.md#emailNotificationProfilesDestroy) | **DELETE** /email_notification_profiles/{uuid}/ | 
[**emailNotificationProfilesList**](EmailNotificationProfilesApi.md#emailNotificationProfilesList) | **GET** /email_notification_profiles/ | 
[**emailNotificationProfilesPartialUpdate**](EmailNotificationProfilesApi.md#emailNotificationProfilesPartialUpdate) | **PATCH** /email_notification_profiles/{uuid}/ | 
[**emailNotificationProfilesRetrieve**](EmailNotificationProfilesApi.md#emailNotificationProfilesRetrieve) | **GET** /email_notification_profiles/{uuid}/ | 
[**emailNotificationProfilesUpdate**](EmailNotificationProfilesApi.md#emailNotificationProfilesUpdate) | **PUT** /email_notification_profiles/{uuid}/ | 



## emailNotificationProfilesCloneCreate

> EmailNotificationProfile emailNotificationProfilesCloneCreate(uuid, emailNotificationProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        EmailNotificationProfile emailNotificationProfile = new EmailNotificationProfile(); // EmailNotificationProfile | 
        try {
            EmailNotificationProfile result = apiInstance.emailNotificationProfilesCloneCreate(uuid, emailNotificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesCloneCreate");
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
 **emailNotificationProfile** | [**EmailNotificationProfile**](EmailNotificationProfile.md)|  |

### Return type

[**EmailNotificationProfile**](EmailNotificationProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## emailNotificationProfilesCreate

> EmailNotificationProfile emailNotificationProfilesCreate(emailNotificationProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        EmailNotificationProfile emailNotificationProfile = new EmailNotificationProfile(); // EmailNotificationProfile | 
        try {
            EmailNotificationProfile result = apiInstance.emailNotificationProfilesCreate(emailNotificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesCreate");
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
 **emailNotificationProfile** | [**EmailNotificationProfile**](EmailNotificationProfile.md)|  |

### Return type

[**EmailNotificationProfile**](EmailNotificationProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## emailNotificationProfilesDestroy

> emailNotificationProfilesDestroy(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.emailNotificationProfilesDestroy(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesDestroy");
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


## emailNotificationProfilesList

> PaginatedEmailNotificationProfileList emailNotificationProfilesList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        Integer createdByGroupId = 56; // Integer | 
        Integer limit = 56; // Integer | Number of results to return per page.
        String name = "name_example"; // String | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String runEnvironmentUuid = "runEnvironmentUuid_example"; // String | 
        String search = "search_example"; // String | A search term.
        try {
            PaginatedEmailNotificationProfileList result = apiInstance.emailNotificationProfilesList(createdByGroupId, limit, name, offset, ordering, runEnvironmentUuid, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesList");
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

[**PaginatedEmailNotificationProfileList**](PaginatedEmailNotificationProfileList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## emailNotificationProfilesPartialUpdate

> EmailNotificationProfile emailNotificationProfilesPartialUpdate(uuid, patchedEmailNotificationProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        PatchedEmailNotificationProfile patchedEmailNotificationProfile = new PatchedEmailNotificationProfile(); // PatchedEmailNotificationProfile | 
        try {
            EmailNotificationProfile result = apiInstance.emailNotificationProfilesPartialUpdate(uuid, patchedEmailNotificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesPartialUpdate");
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
 **patchedEmailNotificationProfile** | [**PatchedEmailNotificationProfile**](PatchedEmailNotificationProfile.md)|  | [optional]

### Return type

[**EmailNotificationProfile**](EmailNotificationProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## emailNotificationProfilesRetrieve

> EmailNotificationProfile emailNotificationProfilesRetrieve(uuid)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        try {
            EmailNotificationProfile result = apiInstance.emailNotificationProfilesRetrieve(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesRetrieve");
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

[**EmailNotificationProfile**](EmailNotificationProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## emailNotificationProfilesUpdate

> EmailNotificationProfile emailNotificationProfilesUpdate(uuid, emailNotificationProfile)



### Example

```java
// Import classes:
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.invoker.auth.*;
import io.cloudreactor.tasksymphony.invoker.models.*;
import io.cloudreactor.tasksymphony.api.EmailNotificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.cloudreactor.io/api/v1");
        
        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        EmailNotificationProfilesApi apiInstance = new EmailNotificationProfilesApi(defaultClient);
        UUID uuid = UUID.randomUUID(); // UUID | 
        EmailNotificationProfile emailNotificationProfile = new EmailNotificationProfile(); // EmailNotificationProfile | 
        try {
            EmailNotificationProfile result = apiInstance.emailNotificationProfilesUpdate(uuid, emailNotificationProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailNotificationProfilesApi#emailNotificationProfilesUpdate");
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
 **emailNotificationProfile** | [**EmailNotificationProfile**](EmailNotificationProfile.md)|  |

### Return type

[**EmailNotificationProfile**](EmailNotificationProfile.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

