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
import io.cloudreactor.tasksymphony.model.AwsEcsServiceLoadBalancerDetails;
import io.cloudreactor.tasksymphony.model.PropagateTagsEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Options for running a Task as a service in AWS ECS.
 */
@ApiModel(description = "Options for running a Task as a service in AWS ECS.")
@JsonPropertyOrder({
  AwsEcsServiceOptions.JSON_PROPERTY_LOAD_BALANCERS,
  AwsEcsServiceOptions.JSON_PROPERTY_HEALTH_CHECK_GRACE_PERIOD_SECONDS,
  AwsEcsServiceOptions.JSON_PROPERTY_FORCE_NEW_DEPLOYMENT,
  AwsEcsServiceOptions.JSON_PROPERTY_DEPLOY_MINIMUM_HEALTHY_PERCENT,
  AwsEcsServiceOptions.JSON_PROPERTY_DEPLOY_MAXIMUM_PERCENT,
  AwsEcsServiceOptions.JSON_PROPERTY_DEPLOY_ENABLE_CIRCUIT_BREAKER,
  AwsEcsServiceOptions.JSON_PROPERTY_DEPLOY_ROLLBACK_ON_FAILURE,
  AwsEcsServiceOptions.JSON_PROPERTY_ENABLE_ECS_MANAGED_TAGS,
  AwsEcsServiceOptions.JSON_PROPERTY_PROPAGATE_TAGS,
  AwsEcsServiceOptions.JSON_PROPERTY_TAGS
})
@JsonTypeName("AwsEcsServiceOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwsEcsServiceOptions {
  public static final String JSON_PROPERTY_LOAD_BALANCERS = "load_balancers";
  private List<AwsEcsServiceLoadBalancerDetails> loadBalancers = new ArrayList<>();

  public static final String JSON_PROPERTY_HEALTH_CHECK_GRACE_PERIOD_SECONDS = "health_check_grace_period_seconds";
  private Integer healthCheckGracePeriodSeconds;

  public static final String JSON_PROPERTY_FORCE_NEW_DEPLOYMENT = "force_new_deployment";
  private Boolean forceNewDeployment;

  public static final String JSON_PROPERTY_DEPLOY_MINIMUM_HEALTHY_PERCENT = "deploy_minimum_healthy_percent";
  private Integer deployMinimumHealthyPercent;

  public static final String JSON_PROPERTY_DEPLOY_MAXIMUM_PERCENT = "deploy_maximum_percent";
  private Integer deployMaximumPercent;

  public static final String JSON_PROPERTY_DEPLOY_ENABLE_CIRCUIT_BREAKER = "deploy_enable_circuit_breaker";
  private Boolean deployEnableCircuitBreaker;

  public static final String JSON_PROPERTY_DEPLOY_ROLLBACK_ON_FAILURE = "deploy_rollback_on_failure";
  private Boolean deployRollbackOnFailure;

  public static final String JSON_PROPERTY_ENABLE_ECS_MANAGED_TAGS = "enable_ecs_managed_tags";
  private Boolean enableEcsManagedTags;

  public static final String JSON_PROPERTY_PROPAGATE_TAGS = "propagate_tags";
  private PropagateTagsEnum propagateTags;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Map<String, String>> tags = JsonNullable.<Map<String, String>>undefined();


   /**
   * Get loadBalancers
   * @return loadBalancers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOAD_BALANCERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AwsEcsServiceLoadBalancerDetails> getLoadBalancers() {
    return loadBalancers;
  }




  public AwsEcsServiceOptions healthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
    
    this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    return this;
  }

   /**
   * Get healthCheckGracePeriodSeconds
   * @return healthCheckGracePeriodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEALTH_CHECK_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHealthCheckGracePeriodSeconds() {
    return healthCheckGracePeriodSeconds;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_CHECK_GRACE_PERIOD_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
    this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
  }


  public AwsEcsServiceOptions forceNewDeployment(Boolean forceNewDeployment) {
    
    this.forceNewDeployment = forceNewDeployment;
    return this;
  }

   /**
   * Get forceNewDeployment
   * @return forceNewDeployment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORCE_NEW_DEPLOYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceNewDeployment() {
    return forceNewDeployment;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_NEW_DEPLOYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceNewDeployment(Boolean forceNewDeployment) {
    this.forceNewDeployment = forceNewDeployment;
  }


  public AwsEcsServiceOptions deployMinimumHealthyPercent(Integer deployMinimumHealthyPercent) {
    
    this.deployMinimumHealthyPercent = deployMinimumHealthyPercent;
    return this;
  }

   /**
   * Get deployMinimumHealthyPercent
   * @return deployMinimumHealthyPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOY_MINIMUM_HEALTHY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeployMinimumHealthyPercent() {
    return deployMinimumHealthyPercent;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_MINIMUM_HEALTHY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployMinimumHealthyPercent(Integer deployMinimumHealthyPercent) {
    this.deployMinimumHealthyPercent = deployMinimumHealthyPercent;
  }


  public AwsEcsServiceOptions deployMaximumPercent(Integer deployMaximumPercent) {
    
    this.deployMaximumPercent = deployMaximumPercent;
    return this;
  }

   /**
   * Get deployMaximumPercent
   * @return deployMaximumPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOY_MAXIMUM_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeployMaximumPercent() {
    return deployMaximumPercent;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_MAXIMUM_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployMaximumPercent(Integer deployMaximumPercent) {
    this.deployMaximumPercent = deployMaximumPercent;
  }


  public AwsEcsServiceOptions deployEnableCircuitBreaker(Boolean deployEnableCircuitBreaker) {
    
    this.deployEnableCircuitBreaker = deployEnableCircuitBreaker;
    return this;
  }

   /**
   * Get deployEnableCircuitBreaker
   * @return deployEnableCircuitBreaker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOY_ENABLE_CIRCUIT_BREAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeployEnableCircuitBreaker() {
    return deployEnableCircuitBreaker;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_ENABLE_CIRCUIT_BREAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployEnableCircuitBreaker(Boolean deployEnableCircuitBreaker) {
    this.deployEnableCircuitBreaker = deployEnableCircuitBreaker;
  }


  public AwsEcsServiceOptions deployRollbackOnFailure(Boolean deployRollbackOnFailure) {
    
    this.deployRollbackOnFailure = deployRollbackOnFailure;
    return this;
  }

   /**
   * Get deployRollbackOnFailure
   * @return deployRollbackOnFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOY_ROLLBACK_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeployRollbackOnFailure() {
    return deployRollbackOnFailure;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_ROLLBACK_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployRollbackOnFailure(Boolean deployRollbackOnFailure) {
    this.deployRollbackOnFailure = deployRollbackOnFailure;
  }


  public AwsEcsServiceOptions enableEcsManagedTags(Boolean enableEcsManagedTags) {
    
    this.enableEcsManagedTags = enableEcsManagedTags;
    return this;
  }

   /**
   * Get enableEcsManagedTags
   * @return enableEcsManagedTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_ECS_MANAGED_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableEcsManagedTags() {
    return enableEcsManagedTags;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_ECS_MANAGED_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableEcsManagedTags(Boolean enableEcsManagedTags) {
    this.enableEcsManagedTags = enableEcsManagedTags;
  }


  public AwsEcsServiceOptions propagateTags(PropagateTagsEnum propagateTags) {
    
    this.propagateTags = propagateTags;
    return this;
  }

   /**
   * Get propagateTags
   * @return propagateTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPAGATE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropagateTagsEnum getPropagateTags() {
    return propagateTags;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateTags(PropagateTagsEnum propagateTags) {
    this.propagateTags = propagateTags;
  }


  public AwsEcsServiceOptions tags(Map<String, String> tags) {
    this.tags = JsonNullable.<Map<String, String>>of(tags);
    
    return this;
  }

  public AwsEcsServiceOptions putTagsItem(String key, String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.tags.get().put(key, tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Map<String, String>> tags) {
    this.tags = tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = JsonNullable.<Map<String, String>>of(tags);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsServiceOptions awsEcsServiceOptions = (AwsEcsServiceOptions) o;
    return Objects.equals(this.loadBalancers, awsEcsServiceOptions.loadBalancers) &&
        Objects.equals(this.healthCheckGracePeriodSeconds, awsEcsServiceOptions.healthCheckGracePeriodSeconds) &&
        Objects.equals(this.forceNewDeployment, awsEcsServiceOptions.forceNewDeployment) &&
        Objects.equals(this.deployMinimumHealthyPercent, awsEcsServiceOptions.deployMinimumHealthyPercent) &&
        Objects.equals(this.deployMaximumPercent, awsEcsServiceOptions.deployMaximumPercent) &&
        Objects.equals(this.deployEnableCircuitBreaker, awsEcsServiceOptions.deployEnableCircuitBreaker) &&
        Objects.equals(this.deployRollbackOnFailure, awsEcsServiceOptions.deployRollbackOnFailure) &&
        Objects.equals(this.enableEcsManagedTags, awsEcsServiceOptions.enableEcsManagedTags) &&
        Objects.equals(this.propagateTags, awsEcsServiceOptions.propagateTags) &&
        equalsNullable(this.tags, awsEcsServiceOptions.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancers, healthCheckGracePeriodSeconds, forceNewDeployment, deployMinimumHealthyPercent, deployMaximumPercent, deployEnableCircuitBreaker, deployRollbackOnFailure, enableEcsManagedTags, propagateTags, hashCodeNullable(tags));
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
    sb.append("class AwsEcsServiceOptions {\n");
    sb.append("    loadBalancers: ").append(toIndentedString(loadBalancers)).append("\n");
    sb.append("    healthCheckGracePeriodSeconds: ").append(toIndentedString(healthCheckGracePeriodSeconds)).append("\n");
    sb.append("    forceNewDeployment: ").append(toIndentedString(forceNewDeployment)).append("\n");
    sb.append("    deployMinimumHealthyPercent: ").append(toIndentedString(deployMinimumHealthyPercent)).append("\n");
    sb.append("    deployMaximumPercent: ").append(toIndentedString(deployMaximumPercent)).append("\n");
    sb.append("    deployEnableCircuitBreaker: ").append(toIndentedString(deployEnableCircuitBreaker)).append("\n");
    sb.append("    deployRollbackOnFailure: ").append(toIndentedString(deployRollbackOnFailure)).append("\n");
    sb.append("    enableEcsManagedTags: ").append(toIndentedString(enableEcsManagedTags)).append("\n");
    sb.append("    propagateTags: ").append(toIndentedString(propagateTags)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

