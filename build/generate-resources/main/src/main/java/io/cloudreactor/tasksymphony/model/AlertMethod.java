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
import io.cloudreactor.tasksymphony.model.NotificationSeverity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An AlertMethod specifies one or more configured methods of notifying users or external sources of events that trigger when one or more conditions are satisfied.
 */
@ApiModel(description = "An AlertMethod specifies one or more configured methods of notifying users or external sources of events that trigger when one or more conditions are satisfied.")
@JsonPropertyOrder({
  AlertMethod.JSON_PROPERTY_URL,
  AlertMethod.JSON_PROPERTY_UUID,
  AlertMethod.JSON_PROPERTY_NAME,
  AlertMethod.JSON_PROPERTY_DESCRIPTION,
  AlertMethod.JSON_PROPERTY_DASHBOARD_URL,
  AlertMethod.JSON_PROPERTY_ENABLED,
  AlertMethod.JSON_PROPERTY_METHOD_DETAILS,
  AlertMethod.JSON_PROPERTY_NOTIFY_ON_SUCCESS,
  AlertMethod.JSON_PROPERTY_NOTIFY_ON_FAILURE,
  AlertMethod.JSON_PROPERTY_NOTIFY_ON_TIMEOUT,
  AlertMethod.JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_EXECUTION,
  AlertMethod.JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_HEARTBEAT,
  AlertMethod.JSON_PROPERTY_ERROR_SEVERITY_ON_SERVICE_DOWN,
  AlertMethod.JSON_PROPERTY_CREATED_BY_USER,
  AlertMethod.JSON_PROPERTY_CREATED_BY_GROUP,
  AlertMethod.JSON_PROPERTY_RUN_ENVIRONMENT,
  AlertMethod.JSON_PROPERTY_CREATED_AT,
  AlertMethod.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("AlertMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlertMethod {
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

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_METHOD_DETAILS = "method_details";
  private Map<String, Object> methodDetails = new HashMap<>();

  public static final String JSON_PROPERTY_NOTIFY_ON_SUCCESS = "notify_on_success";
  private Boolean notifyOnSuccess;

  public static final String JSON_PROPERTY_NOTIFY_ON_FAILURE = "notify_on_failure";
  private Boolean notifyOnFailure;

  public static final String JSON_PROPERTY_NOTIFY_ON_TIMEOUT = "notify_on_timeout";
  private Boolean notifyOnTimeout;

  public static final String JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_EXECUTION = "error_severity_on_missing_execution";
  private NotificationSeverity errorSeverityOnMissingExecution;

  public static final String JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_HEARTBEAT = "error_severity_on_missing_heartbeat";
  private NotificationSeverity errorSeverityOnMissingHeartbeat;

  public static final String JSON_PROPERTY_ERROR_SEVERITY_ON_SERVICE_DOWN = "error_severity_on_service_down";
  private NotificationSeverity errorSeverityOnServiceDown;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private String createdByUser;

  public static final String JSON_PROPERTY_CREATED_BY_GROUP = "created_by_group";
  private Group createdByGroup;

  public static final String JSON_PROPERTY_RUN_ENVIRONMENT = "run_environment";
  private JsonNullable<NameAndUuid> runEnvironment = JsonNullable.<NameAndUuid>undefined();

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




  public AlertMethod name(String name) {
    
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


  public AlertMethod description(String description) {
    
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




  public AlertMethod enabled(Boolean enabled) {
    
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
   * Get methodDetails
   * @return methodDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METHOD_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getMethodDetails() {
    return methodDetails;
  }




  public AlertMethod notifyOnSuccess(Boolean notifyOnSuccess) {
    
    this.notifyOnSuccess = notifyOnSuccess;
    return this;
  }

   /**
   * Get notifyOnSuccess
   * @return notifyOnSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnSuccess() {
    return notifyOnSuccess;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnSuccess(Boolean notifyOnSuccess) {
    this.notifyOnSuccess = notifyOnSuccess;
  }


  public AlertMethod notifyOnFailure(Boolean notifyOnFailure) {
    
    this.notifyOnFailure = notifyOnFailure;
    return this;
  }

   /**
   * Get notifyOnFailure
   * @return notifyOnFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnFailure() {
    return notifyOnFailure;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnFailure(Boolean notifyOnFailure) {
    this.notifyOnFailure = notifyOnFailure;
  }


  public AlertMethod notifyOnTimeout(Boolean notifyOnTimeout) {
    
    this.notifyOnTimeout = notifyOnTimeout;
    return this;
  }

   /**
   * Get notifyOnTimeout
   * @return notifyOnTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnTimeout() {
    return notifyOnTimeout;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnTimeout(Boolean notifyOnTimeout) {
    this.notifyOnTimeout = notifyOnTimeout;
  }


  public AlertMethod errorSeverityOnMissingExecution(NotificationSeverity errorSeverityOnMissingExecution) {
    
    this.errorSeverityOnMissingExecution = errorSeverityOnMissingExecution;
    return this;
  }

   /**
   * Get errorSeverityOnMissingExecution
   * @return errorSeverityOnMissingExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationSeverity getErrorSeverityOnMissingExecution() {
    return errorSeverityOnMissingExecution;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorSeverityOnMissingExecution(NotificationSeverity errorSeverityOnMissingExecution) {
    this.errorSeverityOnMissingExecution = errorSeverityOnMissingExecution;
  }


  public AlertMethod errorSeverityOnMissingHeartbeat(NotificationSeverity errorSeverityOnMissingHeartbeat) {
    
    this.errorSeverityOnMissingHeartbeat = errorSeverityOnMissingHeartbeat;
    return this;
  }

   /**
   * Get errorSeverityOnMissingHeartbeat
   * @return errorSeverityOnMissingHeartbeat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_HEARTBEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationSeverity getErrorSeverityOnMissingHeartbeat() {
    return errorSeverityOnMissingHeartbeat;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_MISSING_HEARTBEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorSeverityOnMissingHeartbeat(NotificationSeverity errorSeverityOnMissingHeartbeat) {
    this.errorSeverityOnMissingHeartbeat = errorSeverityOnMissingHeartbeat;
  }


  public AlertMethod errorSeverityOnServiceDown(NotificationSeverity errorSeverityOnServiceDown) {
    
    this.errorSeverityOnServiceDown = errorSeverityOnServiceDown;
    return this;
  }

   /**
   * Get errorSeverityOnServiceDown
   * @return errorSeverityOnServiceDown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_SERVICE_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationSeverity getErrorSeverityOnServiceDown() {
    return errorSeverityOnServiceDown;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_SEVERITY_ON_SERVICE_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorSeverityOnServiceDown(NotificationSeverity errorSeverityOnServiceDown) {
    this.errorSeverityOnServiceDown = errorSeverityOnServiceDown;
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




  public AlertMethod runEnvironment(NameAndUuid runEnvironment) {
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
    AlertMethod alertMethod = (AlertMethod) o;
    return Objects.equals(this.url, alertMethod.url) &&
        Objects.equals(this.uuid, alertMethod.uuid) &&
        Objects.equals(this.name, alertMethod.name) &&
        Objects.equals(this.description, alertMethod.description) &&
        Objects.equals(this.dashboardUrl, alertMethod.dashboardUrl) &&
        Objects.equals(this.enabled, alertMethod.enabled) &&
        Objects.equals(this.methodDetails, alertMethod.methodDetails) &&
        Objects.equals(this.notifyOnSuccess, alertMethod.notifyOnSuccess) &&
        Objects.equals(this.notifyOnFailure, alertMethod.notifyOnFailure) &&
        Objects.equals(this.notifyOnTimeout, alertMethod.notifyOnTimeout) &&
        Objects.equals(this.errorSeverityOnMissingExecution, alertMethod.errorSeverityOnMissingExecution) &&
        Objects.equals(this.errorSeverityOnMissingHeartbeat, alertMethod.errorSeverityOnMissingHeartbeat) &&
        Objects.equals(this.errorSeverityOnServiceDown, alertMethod.errorSeverityOnServiceDown) &&
        Objects.equals(this.createdByUser, alertMethod.createdByUser) &&
        Objects.equals(this.createdByGroup, alertMethod.createdByGroup) &&
        equalsNullable(this.runEnvironment, alertMethod.runEnvironment) &&
        Objects.equals(this.createdAt, alertMethod.createdAt) &&
        Objects.equals(this.updatedAt, alertMethod.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, uuid, name, description, dashboardUrl, enabled, methodDetails, notifyOnSuccess, notifyOnFailure, notifyOnTimeout, errorSeverityOnMissingExecution, errorSeverityOnMissingHeartbeat, errorSeverityOnServiceDown, createdByUser, createdByGroup, hashCodeNullable(runEnvironment), createdAt, updatedAt);
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
    sb.append("class AlertMethod {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    methodDetails: ").append(toIndentedString(methodDetails)).append("\n");
    sb.append("    notifyOnSuccess: ").append(toIndentedString(notifyOnSuccess)).append("\n");
    sb.append("    notifyOnFailure: ").append(toIndentedString(notifyOnFailure)).append("\n");
    sb.append("    notifyOnTimeout: ").append(toIndentedString(notifyOnTimeout)).append("\n");
    sb.append("    errorSeverityOnMissingExecution: ").append(toIndentedString(errorSeverityOnMissingExecution)).append("\n");
    sb.append("    errorSeverityOnMissingHeartbeat: ").append(toIndentedString(errorSeverityOnMissingHeartbeat)).append("\n");
    sb.append("    errorSeverityOnServiceDown: ").append(toIndentedString(errorSeverityOnServiceDown)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdByGroup: ").append(toIndentedString(createdByGroup)).append("\n");
    sb.append("    runEnvironment: ").append(toIndentedString(runEnvironment)).append("\n");
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

