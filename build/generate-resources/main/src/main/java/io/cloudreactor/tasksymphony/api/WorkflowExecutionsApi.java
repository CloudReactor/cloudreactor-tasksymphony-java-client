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

import io.cloudreactor.tasksymphony.model.PaginatedWorkflowExecutionSummaryList;
import io.cloudreactor.tasksymphony.model.PatchedWorkflowExecution;
import java.util.UUID;
import io.cloudreactor.tasksymphony.model.WorkflowExecution;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkflowExecutionsApi {
  private ApiClient apiClient;

  public WorkflowExecutionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowExecutionsApi(ApiClient apiClient) {
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
   * @param workflowExecution  (required)
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsCreate(WorkflowExecution workflowExecution) throws ApiException {
    Object localVarPostBody = workflowExecution;
    
    // verify the required parameter 'workflowExecution' is set
    if (workflowExecution == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowExecution' when calling workflowExecutionsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/";

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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
  public void workflowExecutionsDestroy(UUID uuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsDestroy");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/"
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
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @param ordering Which field to use when ordering the results. (optional)
   * @param search A search term. (optional)
   * @param workflowCreatedByGroupId  (optional)
   * @param workflowUuid  (optional)
   * @return PaginatedWorkflowExecutionSummaryList
   * @throws ApiException if fails to make API call
   */
  public PaginatedWorkflowExecutionSummaryList workflowExecutionsList(Integer limit, Integer offset, String ordering, String search, String workflowCreatedByGroupId, String workflowUuid) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/workflow_executions/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("ordering", ordering));
    localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
    localVarQueryParams.addAll(apiClient.parameterToPair("workflow__created_by_group__id", workflowCreatedByGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPair("workflow__uuid", workflowUuid));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuth" };

    TypeReference<PaginatedWorkflowExecutionSummaryList> localVarReturnType = new TypeReference<PaginatedWorkflowExecutionSummaryList>() {};
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
   * @param patchedWorkflowExecution  (optional)
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsPartialUpdate(UUID uuid, PatchedWorkflowExecution patchedWorkflowExecution) throws ApiException {
    Object localVarPostBody = patchedWorkflowExecution;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsPartialUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/"
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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsRetrieve(UUID uuid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsRetrieve");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/"
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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
   * @param workflowExecution  (required)
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsRetryCreate(UUID uuid, WorkflowExecution workflowExecution) throws ApiException {
    Object localVarPostBody = workflowExecution;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsRetryCreate");
    }
    
    // verify the required parameter 'workflowExecution' is set
    if (workflowExecution == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowExecution' when calling workflowExecutionsRetryCreate");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/retry/"
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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
   * @param workflowExecution  (required)
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsUpdate(UUID uuid, WorkflowExecution workflowExecution) throws ApiException {
    Object localVarPostBody = workflowExecution;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsUpdate");
    }
    
    // verify the required parameter 'workflowExecution' is set
    if (workflowExecution == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowExecution' when calling workflowExecutionsUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/"
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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
  /**
   * 
   * 
   * @param uuid  (required)
   * @param workflowExecution  (required)
   * @return WorkflowExecution
   * @throws ApiException if fails to make API call
   */
  public WorkflowExecution workflowExecutionsWorkflowTaskInstanceExecutionsCreate(UUID uuid, WorkflowExecution workflowExecution) throws ApiException {
    Object localVarPostBody = workflowExecution;
    
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling workflowExecutionsWorkflowTaskInstanceExecutionsCreate");
    }
    
    // verify the required parameter 'workflowExecution' is set
    if (workflowExecution == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowExecution' when calling workflowExecutionsWorkflowTaskInstanceExecutionsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/workflow_executions/{uuid}/workflow_task_instance_executions/"
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

    TypeReference<WorkflowExecution> localVarReturnType = new TypeReference<WorkflowExecution>() {};
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
}
