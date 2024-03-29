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

import io.cloudreactor.tasksymphony.invoker.ApiException;
import io.cloudreactor.tasksymphony.model.PaginatedWorkflowTaskInstanceList;
import io.cloudreactor.tasksymphony.model.PatchedWorkflowTaskInstance;
import java.util.UUID;
import io.cloudreactor.tasksymphony.model.WorkflowTaskInstance;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowTaskInstancesApi
 */
@Ignore
public class WorkflowTaskInstancesApiTest {

    private final WorkflowTaskInstancesApi api = new WorkflowTaskInstancesApi();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesCreateTest() throws ApiException {
        WorkflowTaskInstance workflowTaskInstance = null;
        WorkflowTaskInstance response = api.workflowTaskInstancesCreate(workflowTaskInstance);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesDestroyTest() throws ApiException {
        UUID uuid = null;
        api.workflowTaskInstancesDestroy(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesListTest() throws ApiException {
        String description = null;
        Integer limit = null;
        String name = null;
        Integer offset = null;
        String ordering = null;
        String search = null;
        String taskName = null;
        UUID taskUuid = null;
        Integer workflowCreatedByGroupId = null;
        UUID workflowRunEnvironmentUuid = null;
        UUID workflowUuid = null;
        PaginatedWorkflowTaskInstanceList response = api.workflowTaskInstancesList(description, limit, name, offset, ordering, search, taskName, taskUuid, workflowCreatedByGroupId, workflowRunEnvironmentUuid, workflowUuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedWorkflowTaskInstance patchedWorkflowTaskInstance = null;
        WorkflowTaskInstance response = api.workflowTaskInstancesPartialUpdate(uuid, patchedWorkflowTaskInstance);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesRetrieveTest() throws ApiException {
        UUID uuid = null;
        WorkflowTaskInstance response = api.workflowTaskInstancesRetrieve(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTaskInstancesUpdateTest() throws ApiException {
        UUID uuid = null;
        WorkflowTaskInstance workflowTaskInstance = null;
        WorkflowTaskInstance response = api.workflowTaskInstancesUpdate(uuid, workflowTaskInstance);

        // TODO: test validations
    }
}
