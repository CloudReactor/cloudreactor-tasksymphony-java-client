/*
 * CloudReactor API
 * CloudReactor API Documentation
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: jeff@cloudreactor.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.cloudreactor.tasksymphony.api;

import com.fasterxml.jackson.core.type.TypeReference;

import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.invoker.ApiClient;
import io.cloudreactor.tasksymphony.invoker.Configuration;
import io.cloudreactor.tasksymphony.model.*;
import io.cloudreactor.tasksymphony.invoker.Pair;

import io.cloudreactor.tasksymphony.model.PaginatedRunEnvironmentList;
import io.cloudreactor.tasksymphony.model.PatchedRunEnvironment;
import io.cloudreactor.tasksymphony.model.RunEnvironment;
import java.util.UUID;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RunEnvironmentsApi {
  private ApiClient apiClient;

  public RunEnvironmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RunEnvironmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param uuid  (required)
   * @param runEnvironment  (required)
   * @return RunEnvironment
   * @throws ApiException if fails to make API call
   */
  public RunEnvironment runEnvironmentsCloneCreate(UUID uuid, RunEnvironment runEnvironment) throws ApiException {
    Object localVarPostBody = runEnvironment;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling runEnvironmentsCloneCreate");
    }
    
    // verify the required parameter 'runEnvironment' is set
    if (runEnvironment == null) {
      throw new ApiException(400, "Missing the required parameter 'runEnvironment' when calling runEnvironmentsCloneCreate");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/{uuid}/clone/"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<RunEnvironment> localVarReturnType = new TypeReference<RunEnvironment>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param runEnvironment  (required)
   * @return RunEnvironment
   * @throws ApiException if fails to make API call
   */
  public RunEnvironment runEnvironmentsCreate(RunEnvironment runEnvironment) throws ApiException {
    Object localVarPostBody = runEnvironment;
    
    // verify the required parameter 'runEnvironment' is set
    if (runEnvironment == null) {
      throw new ApiException(400, "Missing the required parameter 'runEnvironment' when calling runEnvironmentsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<RunEnvironment> localVarReturnType = new TypeReference<RunEnvironment>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param uuid  (required)
   * @throws ApiException if fails to make API call
   */
  public void runEnvironmentsDestroy(UUID uuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling runEnvironmentsDestroy");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/{uuid}/"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }
  /**
   * 
   * 
   * @param createdByGroupId  (optional)
   * @param limit Number of results to return per page. (optional)
   * @param name  (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @param ordering Which field to use when ordering the results. (optional)
   * @param search A search term. (optional)
   * @return PaginatedRunEnvironmentList
   * @throws ApiException if fails to make API call
   */
  public PaginatedRunEnvironmentList runEnvironmentsList(Integer createdByGroupId, Integer limit, String name, Integer offset, String ordering, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/run_environments/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("created_by_group__id", createdByGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("ordering", ordering));
    localVarQueryParams.addAll(apiClient.parameterToPair("search", search));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<PaginatedRunEnvironmentList> localVarReturnType = new TypeReference<PaginatedRunEnvironmentList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param uuid  (required)
   * @param patchedRunEnvironment  (optional)
   * @return RunEnvironment
   * @throws ApiException if fails to make API call
   */
  public RunEnvironment runEnvironmentsPartialUpdate(UUID uuid, PatchedRunEnvironment patchedRunEnvironment) throws ApiException {
    Object localVarPostBody = patchedRunEnvironment;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling runEnvironmentsPartialUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/{uuid}/"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<RunEnvironment> localVarReturnType = new TypeReference<RunEnvironment>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param uuid  (required)
   * @return RunEnvironment
   * @throws ApiException if fails to make API call
   */
  public RunEnvironment runEnvironmentsRetrieve(UUID uuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling runEnvironmentsRetrieve");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/{uuid}/"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<RunEnvironment> localVarReturnType = new TypeReference<RunEnvironment>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param uuid  (required)
   * @param runEnvironment  (required)
   * @return RunEnvironment
   * @throws ApiException if fails to make API call
   */
  public RunEnvironment runEnvironmentsUpdate(UUID uuid, RunEnvironment runEnvironment) throws ApiException {
    Object localVarPostBody = runEnvironment;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling runEnvironmentsUpdate");
    }
    
    // verify the required parameter 'runEnvironment' is set
    if (runEnvironment == null) {
      throw new ApiException(400, "Missing the required parameter 'runEnvironment' when calling runEnvironmentsUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/run_environments/{uuid}/"
      .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<RunEnvironment> localVarReturnType = new TypeReference<RunEnvironment>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
