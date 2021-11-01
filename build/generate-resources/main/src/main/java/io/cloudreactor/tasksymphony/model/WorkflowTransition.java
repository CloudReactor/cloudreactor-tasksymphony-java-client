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
import io.cloudreactor.tasksymphony.model.RuleTypeEnum;
import io.cloudreactor.tasksymphony.model.ThresholdPropertyEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WorkflowTransition
 */
@JsonPropertyOrder({
  WorkflowTransition.JSON_PROPERTY_URL,
  WorkflowTransition.JSON_PROPERTY_UUID,
  WorkflowTransition.JSON_PROPERTY_DESCRIPTION,
  WorkflowTransition.JSON_PROPERTY_FROM_WORKFLOW_TASK_INSTANCE,
  WorkflowTransition.JSON_PROPERTY_TO_WORKFLOW_TASK_INSTANCE,
  WorkflowTransition.JSON_PROPERTY_RULE_TYPE,
  WorkflowTransition.JSON_PROPERTY_EXIT_CODES,
  WorkflowTransition.JSON_PROPERTY_THRESHOLD_PROPERTY,
  WorkflowTransition.JSON_PROPERTY_CUSTOM_EXPRESSION,
  WorkflowTransition.JSON_PROPERTY_PRIORITY,
  WorkflowTransition.JSON_PROPERTY_UI_COLOR,
  WorkflowTransition.JSON_PROPERTY_UI_LINE_STYLE,
  WorkflowTransition.JSON_PROPERTY_UI_SCALE,
  WorkflowTransition.JSON_PROPERTY_CREATED_AT,
  WorkflowTransition.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("WorkflowTransition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-31T16:51:00.429-07:00[America/Los_Angeles]")
public class WorkflowTransition {
  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FROM_WORKFLOW_TASK_INSTANCE = "from_workflow_task_instance";
  private NameAndUuid fromWorkflowTaskInstance;

  public static final String JSON_PROPERTY_TO_WORKFLOW_TASK_INSTANCE = "to_workflow_task_instance";
  private NameAndUuid toWorkflowTaskInstance;

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private RuleTypeEnum ruleType;

  public static final String JSON_PROPERTY_EXIT_CODES = "exit_codes";
  private JsonNullable<List<String>> exitCodes = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_THRESHOLD_PROPERTY = "threshold_property";
  private ThresholdPropertyEnum thresholdProperty;

  public static final String JSON_PROPERTY_CUSTOM_EXPRESSION = "custom_expression";
  private String customExpression;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<Integer> priority = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UI_COLOR = "ui_color";
  private String uiColor;

  public static final String JSON_PROPERTY_UI_LINE_STYLE = "ui_line_style";
  private String uiLineStyle;

  public static final String JSON_PROPERTY_UI_SCALE = "ui_scale";
  private JsonNullable<Float> uiScale = JsonNullable.<Float>undefined();

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




  public WorkflowTransition description(String description) {
    
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
   * Get fromWorkflowTaskInstance
   * @return fromWorkflowTaskInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FROM_WORKFLOW_TASK_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NameAndUuid getFromWorkflowTaskInstance() {
    return fromWorkflowTaskInstance;
  }




   /**
   * Get toWorkflowTaskInstance
   * @return toWorkflowTaskInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TO_WORKFLOW_TASK_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NameAndUuid getToWorkflowTaskInstance() {
    return toWorkflowTaskInstance;
  }




  public WorkflowTransition ruleType(RuleTypeEnum ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RuleTypeEnum getRuleType() {
    return ruleType;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }


  public WorkflowTransition exitCodes(List<String> exitCodes) {
    this.exitCodes = JsonNullable.<List<String>>of(exitCodes);
    
    return this;
  }

  public WorkflowTransition addExitCodesItem(String exitCodesItem) {
    if (this.exitCodes == null || !this.exitCodes.isPresent()) {
      this.exitCodes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.exitCodes.get().add(exitCodesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get exitCodes
   * @return exitCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getExitCodes() {
        return exitCodes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXIT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getExitCodes_JsonNullable() {
    return exitCodes;
  }
  
  @JsonProperty(JSON_PROPERTY_EXIT_CODES)
  public void setExitCodes_JsonNullable(JsonNullable<List<String>> exitCodes) {
    this.exitCodes = exitCodes;
  }

  public void setExitCodes(List<String> exitCodes) {
    this.exitCodes = JsonNullable.<List<String>>of(exitCodes);
  }


  public WorkflowTransition thresholdProperty(ThresholdPropertyEnum thresholdProperty) {
    
    this.thresholdProperty = thresholdProperty;
    return this;
  }

   /**
   * Get thresholdProperty
   * @return thresholdProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThresholdPropertyEnum getThresholdProperty() {
    return thresholdProperty;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdProperty(ThresholdPropertyEnum thresholdProperty) {
    this.thresholdProperty = thresholdProperty;
  }


  public WorkflowTransition customExpression(String customExpression) {
    
    this.customExpression = customExpression;
    return this;
  }

   /**
   * Get customExpression
   * @return customExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomExpression() {
    return customExpression;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomExpression(String customExpression) {
    this.customExpression = customExpression;
  }


  public WorkflowTransition priority(Integer priority) {
    this.priority = JsonNullable.<Integer>of(priority);
    
    return this;
  }

   /**
   * Get priority
   * minimum: -2147483648
   * maximum: 2147483647
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPriority() {
        return priority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPriority_JsonNullable() {
    return priority;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  public void setPriority_JsonNullable(JsonNullable<Integer> priority) {
    this.priority = priority;
  }

  public void setPriority(Integer priority) {
    this.priority = JsonNullable.<Integer>of(priority);
  }


  public WorkflowTransition uiColor(String uiColor) {
    
    this.uiColor = uiColor;
    return this;
  }

   /**
   * Get uiColor
   * @return uiColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UI_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUiColor() {
    return uiColor;
  }


  @JsonProperty(JSON_PROPERTY_UI_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiColor(String uiColor) {
    this.uiColor = uiColor;
  }


  public WorkflowTransition uiLineStyle(String uiLineStyle) {
    
    this.uiLineStyle = uiLineStyle;
    return this;
  }

   /**
   * Get uiLineStyle
   * @return uiLineStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UI_LINE_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUiLineStyle() {
    return uiLineStyle;
  }


  @JsonProperty(JSON_PROPERTY_UI_LINE_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiLineStyle(String uiLineStyle) {
    this.uiLineStyle = uiLineStyle;
  }


  public WorkflowTransition uiScale(Float uiScale) {
    this.uiScale = JsonNullable.<Float>of(uiScale);
    
    return this;
  }

   /**
   * Get uiScale
   * @return uiScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Float getUiScale() {
        return uiScale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UI_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getUiScale_JsonNullable() {
    return uiScale;
  }
  
  @JsonProperty(JSON_PROPERTY_UI_SCALE)
  public void setUiScale_JsonNullable(JsonNullable<Float> uiScale) {
    this.uiScale = uiScale;
  }

  public void setUiScale(Float uiScale) {
    this.uiScale = JsonNullable.<Float>of(uiScale);
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
    WorkflowTransition workflowTransition = (WorkflowTransition) o;
    return Objects.equals(this.url, workflowTransition.url) &&
        Objects.equals(this.uuid, workflowTransition.uuid) &&
        Objects.equals(this.description, workflowTransition.description) &&
        Objects.equals(this.fromWorkflowTaskInstance, workflowTransition.fromWorkflowTaskInstance) &&
        Objects.equals(this.toWorkflowTaskInstance, workflowTransition.toWorkflowTaskInstance) &&
        Objects.equals(this.ruleType, workflowTransition.ruleType) &&
        equalsNullable(this.exitCodes, workflowTransition.exitCodes) &&
        Objects.equals(this.thresholdProperty, workflowTransition.thresholdProperty) &&
        Objects.equals(this.customExpression, workflowTransition.customExpression) &&
        equalsNullable(this.priority, workflowTransition.priority) &&
        Objects.equals(this.uiColor, workflowTransition.uiColor) &&
        Objects.equals(this.uiLineStyle, workflowTransition.uiLineStyle) &&
        equalsNullable(this.uiScale, workflowTransition.uiScale) &&
        Objects.equals(this.createdAt, workflowTransition.createdAt) &&
        Objects.equals(this.updatedAt, workflowTransition.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, uuid, description, fromWorkflowTaskInstance, toWorkflowTaskInstance, ruleType, hashCodeNullable(exitCodes), thresholdProperty, customExpression, hashCodeNullable(priority), uiColor, uiLineStyle, hashCodeNullable(uiScale), createdAt, updatedAt);
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
    sb.append("class WorkflowTransition {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fromWorkflowTaskInstance: ").append(toIndentedString(fromWorkflowTaskInstance)).append("\n");
    sb.append("    toWorkflowTaskInstance: ").append(toIndentedString(toWorkflowTaskInstance)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    exitCodes: ").append(toIndentedString(exitCodes)).append("\n");
    sb.append("    thresholdProperty: ").append(toIndentedString(thresholdProperty)).append("\n");
    sb.append("    customExpression: ").append(toIndentedString(customExpression)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    uiColor: ").append(toIndentedString(uiColor)).append("\n");
    sb.append("    uiLineStyle: ").append(toIndentedString(uiLineStyle)).append("\n");
    sb.append("    uiScale: ").append(toIndentedString(uiScale)).append("\n");
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
