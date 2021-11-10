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
import io.cloudreactor.tasksymphony.model.AwsEcsLaunchType;
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
 * AwsEcsExecutionMethods contain configuration for running Tasks in AWS ECS.
 */
@ApiModel(description = "AwsEcsExecutionMethods contain configuration for running Tasks in AWS ECS.")
@JsonPropertyOrder({
  AwsEcsExecutionMethod.JSON_PROPERTY_TYPE,
  AwsEcsExecutionMethod.JSON_PROPERTY_TASK_DEFINITION_ARN,
  AwsEcsExecutionMethod.JSON_PROPERTY_TASK_DEFINITION_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethod.JSON_PROPERTY_ALLOCATED_CPU_UNITS,
  AwsEcsExecutionMethod.JSON_PROPERTY_ALLOCATED_MEMORY_MB,
  AwsEcsExecutionMethod.JSON_PROPERTY_TAGS,
  AwsEcsExecutionMethod.JSON_PROPERTY_SUBNETS,
  AwsEcsExecutionMethod.JSON_PROPERTY_SUBNET_INFRASTRUCTURE_WEBSITE_URLS,
  AwsEcsExecutionMethod.JSON_PROPERTY_SECURITY_GROUPS,
  AwsEcsExecutionMethod.JSON_PROPERTY_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS,
  AwsEcsExecutionMethod.JSON_PROPERTY_ASSIGN_PUBLIC_IP,
  AwsEcsExecutionMethod.JSON_PROPERTY_TASK_ARN,
  AwsEcsExecutionMethod.JSON_PROPERTY_LAUNCH_TYPE,
  AwsEcsExecutionMethod.JSON_PROPERTY_CLUSTER_ARN,
  AwsEcsExecutionMethod.JSON_PROPERTY_CLUSTER_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethod.JSON_PROPERTY_EXECUTION_ROLE,
  AwsEcsExecutionMethod.JSON_PROPERTY_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethod.JSON_PROPERTY_TASK_ROLE,
  AwsEcsExecutionMethod.JSON_PROPERTY_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethod.JSON_PROPERTY_PLATFORM_VERSION
})
@JsonTypeName("AwsEcsExecutionMethod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwsEcsExecutionMethod {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TASK_DEFINITION_ARN = "task_definition_arn";
  private String taskDefinitionArn;

  public static final String JSON_PROPERTY_TASK_DEFINITION_INFRASTRUCTURE_WEBSITE_URL = "task_definition_infrastructure_website_url";
  private String taskDefinitionInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_ALLOCATED_CPU_UNITS = "allocated_cpu_units";
  private Integer allocatedCpuUnits;

  public static final String JSON_PROPERTY_ALLOCATED_MEMORY_MB = "allocated_memory_mb";
  private Integer allocatedMemoryMb;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_SUBNETS = "subnets";
  private List<String> subnets = null;

  public static final String JSON_PROPERTY_SUBNET_INFRASTRUCTURE_WEBSITE_URLS = "subnet_infrastructure_website_urls";
  private List<String> subnetInfrastructureWebsiteUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security_groups";
  private List<String> securityGroups = null;

  public static final String JSON_PROPERTY_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS = "security_group_infrastructure_website_urls";
  private List<String> securityGroupInfrastructureWebsiteUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSIGN_PUBLIC_IP = "assign_public_ip";
  private Boolean assignPublicIp;

  public static final String JSON_PROPERTY_TASK_ARN = "task_arn";
  private String taskArn;

  public static final String JSON_PROPERTY_LAUNCH_TYPE = "launch_type";
  private JsonNullable<AwsEcsLaunchType> launchType = JsonNullable.<AwsEcsLaunchType>undefined();

  public static final String JSON_PROPERTY_CLUSTER_ARN = "cluster_arn";
  private String clusterArn;

  public static final String JSON_PROPERTY_CLUSTER_INFRASTRUCTURE_WEBSITE_URL = "cluster_infrastructure_website_url";
  private String clusterInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_EXECUTION_ROLE = "execution_role";
  private String executionRole;

  public static final String JSON_PROPERTY_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL = "execution_role_infrastructure_website_url";
  private String executionRoleInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_TASK_ROLE = "task_role";
  private String taskRole;

  public static final String JSON_PROPERTY_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL = "task_role_infrastructure_website_url";
  private String taskRoleInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_PLATFORM_VERSION = "platform_version";
  private String platformVersion;


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  public AwsEcsExecutionMethod taskDefinitionArn(String taskDefinitionArn) {
    
    this.taskDefinitionArn = taskDefinitionArn;
    return this;
  }

   /**
   * Get taskDefinitionArn
   * @return taskDefinitionArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskDefinitionArn() {
    return taskDefinitionArn;
  }


  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskDefinitionArn(String taskDefinitionArn) {
    this.taskDefinitionArn = taskDefinitionArn;
  }


   /**
   * Get taskDefinitionInfrastructureWebsiteUrl
   * @return taskDefinitionInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITION_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaskDefinitionInfrastructureWebsiteUrl() {
    return taskDefinitionInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethod allocatedCpuUnits(Integer allocatedCpuUnits) {
    
    this.allocatedCpuUnits = allocatedCpuUnits;
    return this;
  }

   /**
   * Get allocatedCpuUnits
   * @return allocatedCpuUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOCATED_CPU_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllocatedCpuUnits() {
    return allocatedCpuUnits;
  }


  @JsonProperty(JSON_PROPERTY_ALLOCATED_CPU_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllocatedCpuUnits(Integer allocatedCpuUnits) {
    this.allocatedCpuUnits = allocatedCpuUnits;
  }


  public AwsEcsExecutionMethod allocatedMemoryMb(Integer allocatedMemoryMb) {
    
    this.allocatedMemoryMb = allocatedMemoryMb;
    return this;
  }

   /**
   * Get allocatedMemoryMb
   * @return allocatedMemoryMb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOCATED_MEMORY_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllocatedMemoryMb() {
    return allocatedMemoryMb;
  }


  @JsonProperty(JSON_PROPERTY_ALLOCATED_MEMORY_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllocatedMemoryMb(Integer allocatedMemoryMb) {
    this.allocatedMemoryMb = allocatedMemoryMb;
  }


  public AwsEcsExecutionMethod tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AwsEcsExecutionMethod putTagsItem(String key, String tagsItem) {
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public AwsEcsExecutionMethod subnets(List<String> subnets) {
    
    this.subnets = subnets;
    return this;
  }

  public AwsEcsExecutionMethod addSubnetsItem(String subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubnets() {
    return subnets;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }


   /**
   * Get subnetInfrastructureWebsiteUrls
   * @return subnetInfrastructureWebsiteUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBNET_INFRASTRUCTURE_WEBSITE_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSubnetInfrastructureWebsiteUrls() {
    return subnetInfrastructureWebsiteUrls;
  }




  public AwsEcsExecutionMethod securityGroups(List<String> securityGroups) {
    
    this.securityGroups = securityGroups;
    return this;
  }

  public AwsEcsExecutionMethod addSecurityGroupsItem(String securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Get securityGroups
   * @return securityGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSecurityGroups() {
    return securityGroups;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
  }


   /**
   * Get securityGroupInfrastructureWebsiteUrls
   * @return securityGroupInfrastructureWebsiteUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSecurityGroupInfrastructureWebsiteUrls() {
    return securityGroupInfrastructureWebsiteUrls;
  }




  public AwsEcsExecutionMethod assignPublicIp(Boolean assignPublicIp) {
    
    this.assignPublicIp = assignPublicIp;
    return this;
  }

   /**
   * Get assignPublicIp
   * @return assignPublicIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSIGN_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAssignPublicIp() {
    return assignPublicIp;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGN_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignPublicIp(Boolean assignPublicIp) {
    this.assignPublicIp = assignPublicIp;
  }


  public AwsEcsExecutionMethod taskArn(String taskArn) {
    
    this.taskArn = taskArn;
    return this;
  }

   /**
   * Get taskArn
   * @return taskArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskArn() {
    return taskArn;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskArn(String taskArn) {
    this.taskArn = taskArn;
  }


  public AwsEcsExecutionMethod launchType(AwsEcsLaunchType launchType) {
    this.launchType = JsonNullable.<AwsEcsLaunchType>of(launchType);
    
    return this;
  }

   /**
   * Get launchType
   * @return launchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public AwsEcsLaunchType getLaunchType() {
        return launchType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAUNCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AwsEcsLaunchType> getLaunchType_JsonNullable() {
    return launchType;
  }
  
  @JsonProperty(JSON_PROPERTY_LAUNCH_TYPE)
  public void setLaunchType_JsonNullable(JsonNullable<AwsEcsLaunchType> launchType) {
    this.launchType = launchType;
  }

  public void setLaunchType(AwsEcsLaunchType launchType) {
    this.launchType = JsonNullable.<AwsEcsLaunchType>of(launchType);
  }


  public AwsEcsExecutionMethod clusterArn(String clusterArn) {
    
    this.clusterArn = clusterArn;
    return this;
  }

   /**
   * Get clusterArn
   * @return clusterArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterArn() {
    return clusterArn;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterArn(String clusterArn) {
    this.clusterArn = clusterArn;
  }


   /**
   * Get clusterInfrastructureWebsiteUrl
   * @return clusterInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterInfrastructureWebsiteUrl() {
    return clusterInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethod executionRole(String executionRole) {
    
    this.executionRole = executionRole;
    return this;
  }

   /**
   * Get executionRole
   * @return executionRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutionRole() {
    return executionRole;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionRole(String executionRole) {
    this.executionRole = executionRole;
  }


   /**
   * Get executionRoleInfrastructureWebsiteUrl
   * @return executionRoleInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExecutionRoleInfrastructureWebsiteUrl() {
    return executionRoleInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethod taskRole(String taskRole) {
    
    this.taskRole = taskRole;
    return this;
  }

   /**
   * Get taskRole
   * @return taskRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskRole() {
    return taskRole;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskRole(String taskRole) {
    this.taskRole = taskRole;
  }


   /**
   * Get taskRoleInfrastructureWebsiteUrl
   * @return taskRoleInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaskRoleInfrastructureWebsiteUrl() {
    return taskRoleInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethod platformVersion(String platformVersion) {
    
    this.platformVersion = platformVersion;
    return this;
  }

   /**
   * Get platformVersion
   * @return platformVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatformVersion() {
    return platformVersion;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsExecutionMethod awsEcsExecutionMethod = (AwsEcsExecutionMethod) o;
    return Objects.equals(this.type, awsEcsExecutionMethod.type) &&
        Objects.equals(this.taskDefinitionArn, awsEcsExecutionMethod.taskDefinitionArn) &&
        Objects.equals(this.taskDefinitionInfrastructureWebsiteUrl, awsEcsExecutionMethod.taskDefinitionInfrastructureWebsiteUrl) &&
        Objects.equals(this.allocatedCpuUnits, awsEcsExecutionMethod.allocatedCpuUnits) &&
        Objects.equals(this.allocatedMemoryMb, awsEcsExecutionMethod.allocatedMemoryMb) &&
        Objects.equals(this.tags, awsEcsExecutionMethod.tags) &&
        Objects.equals(this.subnets, awsEcsExecutionMethod.subnets) &&
        Objects.equals(this.subnetInfrastructureWebsiteUrls, awsEcsExecutionMethod.subnetInfrastructureWebsiteUrls) &&
        Objects.equals(this.securityGroups, awsEcsExecutionMethod.securityGroups) &&
        Objects.equals(this.securityGroupInfrastructureWebsiteUrls, awsEcsExecutionMethod.securityGroupInfrastructureWebsiteUrls) &&
        Objects.equals(this.assignPublicIp, awsEcsExecutionMethod.assignPublicIp) &&
        Objects.equals(this.taskArn, awsEcsExecutionMethod.taskArn) &&
        equalsNullable(this.launchType, awsEcsExecutionMethod.launchType) &&
        Objects.equals(this.clusterArn, awsEcsExecutionMethod.clusterArn) &&
        Objects.equals(this.clusterInfrastructureWebsiteUrl, awsEcsExecutionMethod.clusterInfrastructureWebsiteUrl) &&
        Objects.equals(this.executionRole, awsEcsExecutionMethod.executionRole) &&
        Objects.equals(this.executionRoleInfrastructureWebsiteUrl, awsEcsExecutionMethod.executionRoleInfrastructureWebsiteUrl) &&
        Objects.equals(this.taskRole, awsEcsExecutionMethod.taskRole) &&
        Objects.equals(this.taskRoleInfrastructureWebsiteUrl, awsEcsExecutionMethod.taskRoleInfrastructureWebsiteUrl) &&
        Objects.equals(this.platformVersion, awsEcsExecutionMethod.platformVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, taskDefinitionArn, taskDefinitionInfrastructureWebsiteUrl, allocatedCpuUnits, allocatedMemoryMb, tags, subnets, subnetInfrastructureWebsiteUrls, securityGroups, securityGroupInfrastructureWebsiteUrls, assignPublicIp, taskArn, hashCodeNullable(launchType), clusterArn, clusterInfrastructureWebsiteUrl, executionRole, executionRoleInfrastructureWebsiteUrl, taskRole, taskRoleInfrastructureWebsiteUrl, platformVersion);
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
    sb.append("class AwsEcsExecutionMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taskDefinitionArn: ").append(toIndentedString(taskDefinitionArn)).append("\n");
    sb.append("    taskDefinitionInfrastructureWebsiteUrl: ").append(toIndentedString(taskDefinitionInfrastructureWebsiteUrl)).append("\n");
    sb.append("    allocatedCpuUnits: ").append(toIndentedString(allocatedCpuUnits)).append("\n");
    sb.append("    allocatedMemoryMb: ").append(toIndentedString(allocatedMemoryMb)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    subnetInfrastructureWebsiteUrls: ").append(toIndentedString(subnetInfrastructureWebsiteUrls)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    securityGroupInfrastructureWebsiteUrls: ").append(toIndentedString(securityGroupInfrastructureWebsiteUrls)).append("\n");
    sb.append("    assignPublicIp: ").append(toIndentedString(assignPublicIp)).append("\n");
    sb.append("    taskArn: ").append(toIndentedString(taskArn)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
    sb.append("    clusterArn: ").append(toIndentedString(clusterArn)).append("\n");
    sb.append("    clusterInfrastructureWebsiteUrl: ").append(toIndentedString(clusterInfrastructureWebsiteUrl)).append("\n");
    sb.append("    executionRole: ").append(toIndentedString(executionRole)).append("\n");
    sb.append("    executionRoleInfrastructureWebsiteUrl: ").append(toIndentedString(executionRoleInfrastructureWebsiteUrl)).append("\n");
    sb.append("    taskRole: ").append(toIndentedString(taskRole)).append("\n");
    sb.append("    taskRoleInfrastructureWebsiteUrl: ").append(toIndentedString(taskRoleInfrastructureWebsiteUrl)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
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

