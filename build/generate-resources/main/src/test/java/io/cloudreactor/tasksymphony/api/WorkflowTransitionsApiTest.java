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
import io.cloudreactor.tasksymphony.model.PaginatedWorkflowTransitionList;
import io.cloudreactor.tasksymphony.model.PatchedWorkflowTransition;
import java.util.UUID;
import io.cloudreactor.tasksymphony.model.WorkflowTransition;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowTransitionsApi
 */
@Ignore
public class WorkflowTransitionsApiTest {

    private final WorkflowTransitionsApi api = new WorkflowTransitionsApi();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsCreateTest() throws ApiException {
        WorkflowTransition workflowTransition = null;
        WorkflowTransition response = api.workflowTransitionsCreate(workflowTransition);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsDestroyTest() throws ApiException {
        UUID uuid = null;
        api.workflowTransitionsDestroy(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsListTest() throws ApiException {
        String description = null;
        Integer limit = null;
        Integer offset = null;
        String ordering = null;
        String search = null;
        PaginatedWorkflowTransitionList response = api.workflowTransitionsList(description, limit, offset, ordering, search);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedWorkflowTransition patchedWorkflowTransition = null;
        WorkflowTransition response = api.workflowTransitionsPartialUpdate(uuid, patchedWorkflowTransition);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsRetrieveTest() throws ApiException {
        UUID uuid = null;
        WorkflowTransition response = api.workflowTransitionsRetrieve(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowTransitionsUpdateTest() throws ApiException {
        UUID uuid = null;
        WorkflowTransition workflowTransition = null;
        WorkflowTransition response = api.workflowTransitionsUpdate(uuid, workflowTransition);

        // TODO: test validations
    }
}
