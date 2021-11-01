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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.cloudreactor.tasksymphony.model.NameAndUuid;
import io.cloudreactor.tasksymphony.model.TaskExecution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A ModelSerializer that takes additional arguments for \&quot;fields\&quot;, \&quot;omit\&quot; and \&quot;expand\&quot; in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations
 */
@ApiModel(description = "A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations")
@JsonPropertyOrder({
  WorkflowTaskInstanceExecution.JSON_PROPERTY_UUID,
  WorkflowTaskInstanceExecution.JSON_PROPERTY_WORKFLOW_EXECUTION,
  WorkflowTaskInstanceExecution.JSON_PROPERTY_WORKFLOW_TASK_INSTANCE,
  WorkflowTaskInstanceExecution.JSON_PROPERTY_TASK_EXECUTION,
  WorkflowTaskInstanceExecution.JSON_PROPERTY_IS_LATEST,
  WorkflowTaskInstanceExecution.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("WorkflowTaskInstanceExecution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-31T16:51:00.429-07:00[America/Los_Angeles]")
public class WorkflowTaskInstanceExecution {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_WORKFLOW_EXECUTION = "workflow_execution";
  private NameAndUuid workflowExecution;

  public static final String JSON_PROPERTY_WORKFLOW_TASK_INSTANCE = "workflow_task_instance";
  private NameAndUuid workflowTaskInstance;

  public static final String JSON_PROPERTY_TASK_EXECUTION = "task_execution";
  private TaskExecution taskExecution;

  public static final String JSON_PROPERTY_IS_LATEST = "is_latest";
  private Boolean isLatest;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;


   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUuid() {
    return uuid;
  }




   /**
   * Get workflowExecution
   * @return workflowExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NameAndUuid getWorkflowExecution() {
    return workflowExecution;
  }




   /**
   * Get workflowTaskInstance
   * @return workflowTaskInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_TASK_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NameAndUuid getWorkflowTaskInstance() {
    return workflowTaskInstance;
  }




  public WorkflowTaskInstanceExecution taskExecution(TaskExecution taskExecution) {
    
    this.taskExecution = taskExecution;
    return this;
  }

   /**
   * Get taskExecution
   * @return taskExecution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TASK_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TaskExecution getTaskExecution() {
    return taskExecution;
  }


  @JsonProperty(JSON_PROPERTY_TASK_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaskExecution(TaskExecution taskExecution) {
    this.taskExecution = taskExecution;
  }


  public WorkflowTaskInstanceExecution isLatest(Boolean isLatest) {
    
    this.isLatest = isLatest;
    return this;
  }

   /**
   * Get isLatest
   * @return isLatest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLatest() {
    return isLatest;
  }


  @JsonProperty(JSON_PROPERTY_IS_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTaskInstanceExecution workflowTaskInstanceExecution = (WorkflowTaskInstanceExecution) o;
    return Objects.equals(this.uuid, workflowTaskInstanceExecution.uuid) &&
        Objects.equals(this.workflowExecution, workflowTaskInstanceExecution.workflowExecution) &&
        Objects.equals(this.workflowTaskInstance, workflowTaskInstanceExecution.workflowTaskInstance) &&
        Objects.equals(this.taskExecution, workflowTaskInstanceExecution.taskExecution) &&
        Objects.equals(this.isLatest, workflowTaskInstanceExecution.isLatest) &&
        Objects.equals(this.createdAt, workflowTaskInstanceExecution.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, workflowExecution, workflowTaskInstance, taskExecution, isLatest, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTaskInstanceExecution {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    workflowExecution: ").append(toIndentedString(workflowExecution)).append("\n");
    sb.append("    workflowTaskInstance: ").append(toIndentedString(workflowTaskInstance)).append("\n");
    sb.append("    taskExecution: ").append(toIndentedString(taskExecution)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

