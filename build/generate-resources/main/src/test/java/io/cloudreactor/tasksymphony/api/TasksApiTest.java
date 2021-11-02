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
import io.cloudreactor.tasksymphony.model.PaginatedTaskList;
import io.cloudreactor.tasksymphony.model.PatchedTask;
import io.cloudreactor.tasksymphony.model.Task;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksCreateTest() throws ApiException {
        Task task = null;
        Task response = api.tasksCreate(task);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksDestroyTest() throws ApiException {
        UUID uuid = null;
        api.tasksDestroy(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksListTest() throws ApiException {
        String description = null;
        Integer limit = null;
        String name = null;
        Integer offset = null;
        String ordering = null;
        UUID runEnvironmentUuid = null;
        String search = null;
        PaginatedTaskList response = api.tasksList(description, limit, name, offset, ordering, runEnvironmentUuid, search);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksPartialUpdateTest() throws ApiException {
        UUID uuid = null;
        PatchedTask patchedTask = null;
        Task response = api.tasksPartialUpdate(uuid, patchedTask);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksRetrieveTest() throws ApiException {
        UUID uuid = null;
        Task response = api.tasksRetrieve(uuid);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksUpdateTest() throws ApiException {
        UUID uuid = null;
        Task task = null;
        Task response = api.tasksUpdate(uuid, task);

        // TODO: test validations
    }
}
