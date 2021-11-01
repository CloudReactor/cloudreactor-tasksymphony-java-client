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
import io.cloudreactor.tasksymphony.model.Group;
import io.cloudreactor.tasksymphony.model.NameAndUuid;
import io.cloudreactor.tasksymphony.model.WorkflowExecutionSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WorkflowSummary
 */
@JsonPropertyOrder({
  WorkflowSummary.JSON_PROPERTY_URL,
  WorkflowSummary.JSON_PROPERTY_UUID,
  WorkflowSummary.JSON_PROPERTY_NAME,
  WorkflowSummary.JSON_PROPERTY_DESCRIPTION,
  WorkflowSummary.JSON_PROPERTY_DASHBOARD_URL,
  WorkflowSummary.JSON_PROPERTY_SCHEDULE,
  WorkflowSummary.JSON_PROPERTY_MAX_CONCURRENCY,
  WorkflowSummary.JSON_PROPERTY_MAX_AGE_SECONDS,
  WorkflowSummary.JSON_PROPERTY_DEFAULT_MAX_RETRIES,
  WorkflowSummary.JSON_PROPERTY_LATEST_WORKFLOW_EXECUTION,
  WorkflowSummary.JSON_PROPERTY_CREATED_BY_USER,
  WorkflowSummary.JSON_PROPERTY_CREATED_BY_GROUP,
  WorkflowSummary.JSON_PROPERTY_RUN_ENVIRONMENT,
  WorkflowSummary.JSON_PROPERTY_ENABLED,
  WorkflowSummary.JSON_PROPERTY_CREATED_AT,
  WorkflowSummary.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("WorkflowSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-31T16:51:00.429-07:00[America/Los_Angeles]")
public class WorkflowSummary {
  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DASHBOARD_URL = "dashboard_url";
  private String dashboardUrl;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private String schedule;

  public static final String JSON_PROPERTY_MAX_CONCURRENCY = "max_concurrency";
  private JsonNullable<Integer> maxConcurrency = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAX_AGE_SECONDS = "max_age_seconds";
  private JsonNullable<Integer> maxAgeSeconds = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DEFAULT_MAX_RETRIES = "default_max_retries";
  private Integer defaultMaxRetries;

  public static final String JSON_PROPERTY_LATEST_WORKFLOW_EXECUTION = "latest_workflow_execution";
  private WorkflowExecutionSummary latestWorkflowExecution;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private String createdByUser;

  public static final String JSON_PROPERTY_CREATED_BY_GROUP = "created_by_group";
  private Group createdByGroup;

  public static final String JSON_PROPERTY_RUN_ENVIRONMENT = "run_environment";
  private JsonNullable<NameAndUuid> runEnvironment = JsonNullable.<NameAndUuid>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;


   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getUrl() {
    return url;
  }




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




  public WorkflowSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public WorkflowSummary description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Get dashboardUrl
   * @return dashboardUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DASHBOARD_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDashboardUrl() {
    return dashboardUrl;
  }




  public WorkflowSummary schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public WorkflowSummary maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = JsonNullable.<Integer>of(maxConcurrency);
    
    return this;
  }

   /**
   * Get maxConcurrency
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxConcurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getMaxConcurrency() {
        return maxConcurrency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaxConcurrency_JsonNullable() {
    return maxConcurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_CONCURRENCY)
  public void setMaxConcurrency_JsonNullable(JsonNullable<Integer> maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = JsonNullable.<Integer>of(maxConcurrency);
  }


  public WorkflowSummary maxAgeSeconds(Integer maxAgeSeconds) {
    this.maxAgeSeconds = JsonNullable.<Integer>of(maxAgeSeconds);
    
    return this;
  }

   /**
   * Get maxAgeSeconds
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxAgeSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getMaxAgeSeconds() {
        return maxAgeSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_AGE_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaxAgeSeconds_JsonNullable() {
    return maxAgeSeconds;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_AGE_SECONDS)
  public void setMaxAgeSeconds_JsonNullable(JsonNullable<Integer> maxAgeSeconds) {
    this.maxAgeSeconds = maxAgeSeconds;
  }

  public void setMaxAgeSeconds(Integer maxAgeSeconds) {
    this.maxAgeSeconds = JsonNullable.<Integer>of(maxAgeSeconds);
  }


  public WorkflowSummary defaultMaxRetries(Integer defaultMaxRetries) {
    
    this.defaultMaxRetries = defaultMaxRetries;
    return this;
  }

   /**
   * Get defaultMaxRetries
   * minimum: -2147483648
   * maximum: 2147483647
   * @return defaultMaxRetries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_MAX_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultMaxRetries() {
    return defaultMaxRetries;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_MAX_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultMaxRetries(Integer defaultMaxRetries) {
    this.defaultMaxRetries = defaultMaxRetries;
  }


  public WorkflowSummary latestWorkflowExecution(WorkflowExecutionSummary latestWorkflowExecution) {
    
    this.latestWorkflowExecution = latestWorkflowExecution;
    return this;
  }

   /**
   * Get latestWorkflowExecution
   * @return latestWorkflowExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LATEST_WORKFLOW_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkflowExecutionSummary getLatestWorkflowExecution() {
    return latestWorkflowExecution;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_WORKFLOW_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestWorkflowExecution(WorkflowExecutionSummary latestWorkflowExecution) {
    this.latestWorkflowExecution = latestWorkflowExecution;
  }


   /**
   * Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
   * @return createdByUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedByUser() {
    return createdByUser;
  }




   /**
   * Get createdByGroup
   * @return createdByGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Group getCreatedByGroup() {
    return createdByGroup;
  }




  public WorkflowSummary runEnvironment(NameAndUuid runEnvironment) {
    this.runEnvironment = JsonNullable.<NameAndUuid>of(runEnvironment);
    
    return this;
  }

   /**
   * Get runEnvironment
   * @return runEnvironment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NameAndUuid getRunEnvironment() {
        return runEnvironment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUN_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NameAndUuid> getRunEnvironment_JsonNullable() {
    return runEnvironment;
  }
  
  @JsonProperty(JSON_PROPERTY_RUN_ENVIRONMENT)
  public void setRunEnvironment_JsonNullable(JsonNullable<NameAndUuid> runEnvironment) {
    this.runEnvironment = runEnvironment;
  }

  public void setRunEnvironment(NameAndUuid runEnvironment) {
    this.runEnvironment = JsonNullable.<NameAndUuid>of(runEnvironment);
  }


  public WorkflowSummary enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSummary workflowSummary = (WorkflowSummary) o;
    return Objects.equals(this.url, workflowSummary.url) &&
        Objects.equals(this.uuid, workflowSummary.uuid) &&
        Objects.equals(this.name, workflowSummary.name) &&
        Objects.equals(this.description, workflowSummary.description) &&
        Objects.equals(this.dashboardUrl, workflowSummary.dashboardUrl) &&
        Objects.equals(this.schedule, workflowSummary.schedule) &&
        equalsNullable(this.maxConcurrency, workflowSummary.maxConcurrency) &&
        equalsNullable(this.maxAgeSeconds, workflowSummary.maxAgeSeconds) &&
        Objects.equals(this.defaultMaxRetries, workflowSummary.defaultMaxRetries) &&
        Objects.equals(this.latestWorkflowExecution, workflowSummary.latestWorkflowExecution) &&
        Objects.equals(this.createdByUser, workflowSummary.createdByUser) &&
        Objects.equals(this.createdByGroup, workflowSummary.createdByGroup) &&
        equalsNullable(this.runEnvironment, workflowSummary.runEnvironment) &&
        Objects.equals(this.enabled, workflowSummary.enabled) &&
        Objects.equals(this.createdAt, workflowSummary.createdAt) &&
        Objects.equals(this.updatedAt, workflowSummary.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, uuid, name, description, dashboardUrl, schedule, hashCodeNullable(maxConcurrency), hashCodeNullable(maxAgeSeconds), defaultMaxRetries, latestWorkflowExecution, createdByUser, createdByGroup, hashCodeNullable(runEnvironment), enabled, createdAt, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSummary {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    maxAgeSeconds: ").append(toIndentedString(maxAgeSeconds)).append("\n");
    sb.append("    defaultMaxRetries: ").append(toIndentedString(defaultMaxRetries)).append("\n");
    sb.append("    latestWorkflowExecution: ").append(toIndentedString(latestWorkflowExecution)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdByGroup: ").append(toIndentedString(createdByGroup)).append("\n");
    sb.append("    runEnvironment: ").append(toIndentedString(runEnvironment)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
