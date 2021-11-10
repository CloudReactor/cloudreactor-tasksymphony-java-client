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


package io.cloudreactor.tasksymphony.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.cloudreactor.tasksymphony.model.CurrentServiceInfo;
import io.cloudreactor.tasksymphony.model.ExecutionMethodCapability;
import io.cloudreactor.tasksymphony.model.Group;
import io.cloudreactor.tasksymphony.model.Link;
import io.cloudreactor.tasksymphony.model.NameAndUuid;
import io.cloudreactor.tasksymphony.model.TaskExecution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PatchedTask
 */
public class PatchedTaskTest {
    private final PatchedTask model = new PatchedTask();

    /**
     * Model tests for PatchedTask
     */
    @Test
    public void testPatchedTask() {
        // TODO: test PatchedTask
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'dashboardUrl'
     */
    @Test
    public void dashboardUrlTest() {
        // TODO: test dashboardUrl
    }

    /**
     * Test the property 'infrastructureWebsiteUrl'
     */
    @Test
    public void infrastructureWebsiteUrlTest() {
        // TODO: test infrastructureWebsiteUrl
    }

    /**
     * Test the property 'maxManualStartDelayBeforeAlertSeconds'
     */
    @Test
    public void maxManualStartDelayBeforeAlertSecondsTest() {
        // TODO: test maxManualStartDelayBeforeAlertSeconds
    }

    /**
     * Test the property 'maxManualStartDelayBeforeAbandonmentSeconds'
     */
    @Test
    public void maxManualStartDelayBeforeAbandonmentSecondsTest() {
        // TODO: test maxManualStartDelayBeforeAbandonmentSeconds
    }

    /**
     * Test the property 'heartbeatIntervalSeconds'
     */
    @Test
    public void heartbeatIntervalSecondsTest() {
        // TODO: test heartbeatIntervalSeconds
    }

    /**
     * Test the property 'maxHeartbeatLatenessBeforeAlertSeconds'
     */
    @Test
    public void maxHeartbeatLatenessBeforeAlertSecondsTest() {
        // TODO: test maxHeartbeatLatenessBeforeAlertSeconds
    }

    /**
     * Test the property 'maxHeartbeatLatenessBeforeAbandonmentSeconds'
     */
    @Test
    public void maxHeartbeatLatenessBeforeAbandonmentSecondsTest() {
        // TODO: test maxHeartbeatLatenessBeforeAbandonmentSeconds
    }

    /**
     * Test the property 'schedule'
     */
    @Test
    public void scheduleTest() {
        // TODO: test schedule
    }

    /**
     * Test the property 'scheduledInstanceCount'
     */
    @Test
    public void scheduledInstanceCountTest() {
        // TODO: test scheduledInstanceCount
    }

    /**
     * Test the property 'isService'
     */
    @Test
    public void isServiceTest() {
        // TODO: test isService
    }

    /**
     * Test the property 'serviceInstanceCount'
     */
    @Test
    public void serviceInstanceCountTest() {
        // TODO: test serviceInstanceCount
    }

    /**
     * Test the property 'minServiceInstanceCount'
     */
    @Test
    public void minServiceInstanceCountTest() {
        // TODO: test minServiceInstanceCount
    }

    /**
     * Test the property 'maxConcurrency'
     */
    @Test
    public void maxConcurrencyTest() {
        // TODO: test maxConcurrency
    }

    /**
     * Test the property 'maxAgeSeconds'
     */
    @Test
    public void maxAgeSecondsTest() {
        // TODO: test maxAgeSeconds
    }

    /**
     * Test the property 'defaultMaxRetries'
     */
    @Test
    public void defaultMaxRetriesTest() {
        // TODO: test defaultMaxRetries
    }

    /**
     * Test the property 'projectUrl'
     */
    @Test
    public void projectUrlTest() {
        // TODO: test projectUrl
    }

    /**
     * Test the property 'logQuery'
     */
    @Test
    public void logQueryTest() {
        // TODO: test logQuery
    }

    /**
     * Test the property 'logsUrl'
     */
    @Test
    public void logsUrlTest() {
        // TODO: test logsUrl
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'runEnvironment'
     */
    @Test
    public void runEnvironmentTest() {
        // TODO: test runEnvironment
    }

    /**
     * Test the property 'executionMethodCapability'
     */
    @Test
    public void executionMethodCapabilityTest() {
        // TODO: test executionMethodCapability
    }

    /**
     * Test the property 'alertMethods'
     */
    @Test
    public void alertMethodsTest() {
        // TODO: test alertMethods
    }

    /**
     * Test the property 'otherMetadata'
     */
    @Test
    public void otherMetadataTest() {
        // TODO: test otherMetadata
    }

    /**
     * Test the property 'latestTaskExecution'
     */
    @Test
    public void latestTaskExecutionTest() {
        // TODO: test latestTaskExecution
    }

    /**
     * Test the property 'currentServiceInfo'
     */
    @Test
    public void currentServiceInfoTest() {
        // TODO: test currentServiceInfo
    }

    /**
     * Test the property 'createdByUser'
     */
    @Test
    public void createdByUserTest() {
        // TODO: test createdByUser
    }

    /**
     * Test the property 'createdByGroup'
     */
    @Test
    public void createdByGroupTest() {
        // TODO: test createdByGroup
    }

    /**
     * Test the property 'wasAutoCreated'
     */
    @Test
    public void wasAutoCreatedTest() {
        // TODO: test wasAutoCreated
    }

    /**
     * Test the property 'passive'
     */
    @Test
    public void passiveTest() {
        // TODO: test passive
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

}