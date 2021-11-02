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
import io.cloudreactor.tasksymphony.model.AwsEcsServiceOptions;
import io.cloudreactor.tasksymphony.model.SupportedLaunchTypesEnum;
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
 * A ModelSerializer that takes additional arguments for \&quot;fields\&quot;, \&quot;omit\&quot; and \&quot;expand\&quot; in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations
 */
@ApiModel(description = "A ModelSerializer that takes additional arguments for \"fields\", \"omit\" and \"expand\" in order to control which fields are displayed, and whether to replace simple values with complex, nested serializations")
@JsonPropertyOrder({
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_TASK_DEFINITION_ARN,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_TASK_DEFINITION_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_ALLOCATED_CPU_UNITS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_ALLOCATED_MEMORY_MB,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_TYPE,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_CAPABILITIES,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_TAGS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_SUBNETS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_SUBNET_INFRASTRUCTURE_WEBSITE_URLS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_LAUNCH_TYPE,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_SUPPORTED_LAUNCH_TYPES,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_CLUSTER_ARN,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_CLUSTER_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_SECURITY_GROUPS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_ASSIGN_PUBLIC_IP,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_EXECUTION_ROLE,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_TASK_ROLE,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_DEFAULT_PLATFORM_VERSION,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_MAIN_CONTAINER_NAME,
  AwsEcsExecutionMethodCapability.JSON_PROPERTY_SERVICE_OPTIONS
})
@JsonTypeName("AwsEcsExecutionMethodCapability")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwsEcsExecutionMethodCapability {
  public static final String JSON_PROPERTY_TASK_DEFINITION_ARN = "task_definition_arn";
  private String taskDefinitionArn;

  public static final String JSON_PROPERTY_TASK_DEFINITION_INFRASTRUCTURE_WEBSITE_URL = "task_definition_infrastructure_website_url";
  private String taskDefinitionInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_ALLOCATED_CPU_UNITS = "allocated_cpu_units";
  private Integer allocatedCpuUnits;

  public static final String JSON_PROPERTY_ALLOCATED_MEMORY_MB = "allocated_memory_mb";
  private Integer allocatedMemoryMb;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private List<String> capabilities = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_DEFAULT_SUBNETS = "default_subnets";
  private JsonNullable<List<String>> defaultSubnets = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEFAULT_SUBNET_INFRASTRUCTURE_WEBSITE_URLS = "default_subnet_infrastructure_website_urls";
  private List<String> defaultSubnetInfrastructureWebsiteUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_DEFAULT_LAUNCH_TYPE = "default_launch_type";
  private JsonNullable<SupportedLaunchTypesEnum> defaultLaunchType = JsonNullable.<SupportedLaunchTypesEnum>undefined();

  public static final String JSON_PROPERTY_SUPPORTED_LAUNCH_TYPES = "supported_launch_types";
  private JsonNullable<List<SupportedLaunchTypesEnum>> supportedLaunchTypes = JsonNullable.<List<SupportedLaunchTypesEnum>>undefined();

  public static final String JSON_PROPERTY_DEFAULT_CLUSTER_ARN = "default_cluster_arn";
  private String defaultClusterArn;

  public static final String JSON_PROPERTY_DEFAULT_CLUSTER_INFRASTRUCTURE_WEBSITE_URL = "default_cluster_infrastructure_website_url";
  private String defaultClusterInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_DEFAULT_SECURITY_GROUPS = "default_security_groups";
  private JsonNullable<List<String>> defaultSecurityGroups = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEFAULT_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS = "default_security_group_infrastructure_website_urls";
  private List<String> defaultSecurityGroupInfrastructureWebsiteUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_DEFAULT_ASSIGN_PUBLIC_IP = "default_assign_public_ip";
  private JsonNullable<Boolean> defaultAssignPublicIp = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DEFAULT_EXECUTION_ROLE = "default_execution_role";
  private String defaultExecutionRole;

  public static final String JSON_PROPERTY_DEFAULT_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL = "default_execution_role_infrastructure_website_url";
  private String defaultExecutionRoleInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_DEFAULT_TASK_ROLE = "default_task_role";
  private String defaultTaskRole;

  public static final String JSON_PROPERTY_DEFAULT_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL = "default_task_role_infrastructure_website_url";
  private String defaultTaskRoleInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_DEFAULT_PLATFORM_VERSION = "default_platform_version";
  private String defaultPlatformVersion;

  public static final String JSON_PROPERTY_MAIN_CONTAINER_NAME = "main_container_name";
  private String mainContainerName;

  public static final String JSON_PROPERTY_SERVICE_OPTIONS = "service_options";
  private AwsEcsServiceOptions serviceOptions;


  public AwsEcsExecutionMethodCapability taskDefinitionArn(String taskDefinitionArn) {
    
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




  public AwsEcsExecutionMethodCapability allocatedCpuUnits(Integer allocatedCpuUnits) {
    
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


  public AwsEcsExecutionMethodCapability allocatedMemoryMb(Integer allocatedMemoryMb) {
    
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




   /**
   * Get capabilities
   * @return capabilities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getCapabilities() {
    return capabilities;
  }




  public AwsEcsExecutionMethodCapability tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AwsEcsExecutionMethodCapability putTagsItem(String key, String tagsItem) {
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


  public AwsEcsExecutionMethodCapability defaultSubnets(List<String> defaultSubnets) {
    this.defaultSubnets = JsonNullable.<List<String>>of(defaultSubnets);
    
    return this;
  }

  public AwsEcsExecutionMethodCapability addDefaultSubnetsItem(String defaultSubnetsItem) {
    if (this.defaultSubnets == null || !this.defaultSubnets.isPresent()) {
      this.defaultSubnets = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.defaultSubnets.get().add(defaultSubnetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get defaultSubnets
   * @return defaultSubnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getDefaultSubnets() {
        return defaultSubnets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getDefaultSubnets_JsonNullable() {
    return defaultSubnets;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBNETS)
  public void setDefaultSubnets_JsonNullable(JsonNullable<List<String>> defaultSubnets) {
    this.defaultSubnets = defaultSubnets;
  }

  public void setDefaultSubnets(List<String> defaultSubnets) {
    this.defaultSubnets = JsonNullable.<List<String>>of(defaultSubnets);
  }


   /**
   * Get defaultSubnetInfrastructureWebsiteUrls
   * @return defaultSubnetInfrastructureWebsiteUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBNET_INFRASTRUCTURE_WEBSITE_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDefaultSubnetInfrastructureWebsiteUrls() {
    return defaultSubnetInfrastructureWebsiteUrls;
  }




  public AwsEcsExecutionMethodCapability defaultLaunchType(SupportedLaunchTypesEnum defaultLaunchType) {
    this.defaultLaunchType = JsonNullable.<SupportedLaunchTypesEnum>of(defaultLaunchType);
    
    return this;
  }

   /**
   * Get defaultLaunchType
   * @return defaultLaunchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SupportedLaunchTypesEnum getDefaultLaunchType() {
        return defaultLaunchType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_LAUNCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SupportedLaunchTypesEnum> getDefaultLaunchType_JsonNullable() {
    return defaultLaunchType;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_LAUNCH_TYPE)
  public void setDefaultLaunchType_JsonNullable(JsonNullable<SupportedLaunchTypesEnum> defaultLaunchType) {
    this.defaultLaunchType = defaultLaunchType;
  }

  public void setDefaultLaunchType(SupportedLaunchTypesEnum defaultLaunchType) {
    this.defaultLaunchType = JsonNullable.<SupportedLaunchTypesEnum>of(defaultLaunchType);
  }


  public AwsEcsExecutionMethodCapability supportedLaunchTypes(List<SupportedLaunchTypesEnum> supportedLaunchTypes) {
    this.supportedLaunchTypes = JsonNullable.<List<SupportedLaunchTypesEnum>>of(supportedLaunchTypes);
    
    return this;
  }

  public AwsEcsExecutionMethodCapability addSupportedLaunchTypesItem(SupportedLaunchTypesEnum supportedLaunchTypesItem) {
    if (this.supportedLaunchTypes == null || !this.supportedLaunchTypes.isPresent()) {
      this.supportedLaunchTypes = JsonNullable.<List<SupportedLaunchTypesEnum>>of(new ArrayList<>());
    }
    try {
      this.supportedLaunchTypes.get().add(supportedLaunchTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get supportedLaunchTypes
   * @return supportedLaunchTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<SupportedLaunchTypesEnum> getSupportedLaunchTypes() {
        return supportedLaunchTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUPPORTED_LAUNCH_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SupportedLaunchTypesEnum>> getSupportedLaunchTypes_JsonNullable() {
    return supportedLaunchTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_SUPPORTED_LAUNCH_TYPES)
  public void setSupportedLaunchTypes_JsonNullable(JsonNullable<List<SupportedLaunchTypesEnum>> supportedLaunchTypes) {
    this.supportedLaunchTypes = supportedLaunchTypes;
  }

  public void setSupportedLaunchTypes(List<SupportedLaunchTypesEnum> supportedLaunchTypes) {
    this.supportedLaunchTypes = JsonNullable.<List<SupportedLaunchTypesEnum>>of(supportedLaunchTypes);
  }


  public AwsEcsExecutionMethodCapability defaultClusterArn(String defaultClusterArn) {
    
    this.defaultClusterArn = defaultClusterArn;
    return this;
  }

   /**
   * Get defaultClusterArn
   * @return defaultClusterArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CLUSTER_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultClusterArn() {
    return defaultClusterArn;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CLUSTER_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultClusterArn(String defaultClusterArn) {
    this.defaultClusterArn = defaultClusterArn;
  }


   /**
   * Get defaultClusterInfrastructureWebsiteUrl
   * @return defaultClusterInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CLUSTER_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultClusterInfrastructureWebsiteUrl() {
    return defaultClusterInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethodCapability defaultSecurityGroups(List<String> defaultSecurityGroups) {
    this.defaultSecurityGroups = JsonNullable.<List<String>>of(defaultSecurityGroups);
    
    return this;
  }

  public AwsEcsExecutionMethodCapability addDefaultSecurityGroupsItem(String defaultSecurityGroupsItem) {
    if (this.defaultSecurityGroups == null || !this.defaultSecurityGroups.isPresent()) {
      this.defaultSecurityGroups = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.defaultSecurityGroups.get().add(defaultSecurityGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get defaultSecurityGroups
   * @return defaultSecurityGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getDefaultSecurityGroups() {
        return defaultSecurityGroups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getDefaultSecurityGroups_JsonNullable() {
    return defaultSecurityGroups;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SECURITY_GROUPS)
  public void setDefaultSecurityGroups_JsonNullable(JsonNullable<List<String>> defaultSecurityGroups) {
    this.defaultSecurityGroups = defaultSecurityGroups;
  }

  public void setDefaultSecurityGroups(List<String> defaultSecurityGroups) {
    this.defaultSecurityGroups = JsonNullable.<List<String>>of(defaultSecurityGroups);
  }


   /**
   * Get defaultSecurityGroupInfrastructureWebsiteUrls
   * @return defaultSecurityGroupInfrastructureWebsiteUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_SECURITY_GROUP_INFRASTRUCTURE_WEBSITE_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDefaultSecurityGroupInfrastructureWebsiteUrls() {
    return defaultSecurityGroupInfrastructureWebsiteUrls;
  }




  public AwsEcsExecutionMethodCapability defaultAssignPublicIp(Boolean defaultAssignPublicIp) {
    this.defaultAssignPublicIp = JsonNullable.<Boolean>of(defaultAssignPublicIp);
    
    return this;
  }

   /**
   * Get defaultAssignPublicIp
   * @return defaultAssignPublicIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getDefaultAssignPublicIp() {
        return defaultAssignPublicIp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_ASSIGN_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDefaultAssignPublicIp_JsonNullable() {
    return defaultAssignPublicIp;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_ASSIGN_PUBLIC_IP)
  public void setDefaultAssignPublicIp_JsonNullable(JsonNullable<Boolean> defaultAssignPublicIp) {
    this.defaultAssignPublicIp = defaultAssignPublicIp;
  }

  public void setDefaultAssignPublicIp(Boolean defaultAssignPublicIp) {
    this.defaultAssignPublicIp = JsonNullable.<Boolean>of(defaultAssignPublicIp);
  }


  public AwsEcsExecutionMethodCapability defaultExecutionRole(String defaultExecutionRole) {
    
    this.defaultExecutionRole = defaultExecutionRole;
    return this;
  }

   /**
   * Get defaultExecutionRole
   * @return defaultExecutionRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_EXECUTION_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultExecutionRole() {
    return defaultExecutionRole;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_EXECUTION_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultExecutionRole(String defaultExecutionRole) {
    this.defaultExecutionRole = defaultExecutionRole;
  }


   /**
   * Get defaultExecutionRoleInfrastructureWebsiteUrl
   * @return defaultExecutionRoleInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_EXECUTION_ROLE_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultExecutionRoleInfrastructureWebsiteUrl() {
    return defaultExecutionRoleInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethodCapability defaultTaskRole(String defaultTaskRole) {
    
    this.defaultTaskRole = defaultTaskRole;
    return this;
  }

   /**
   * Get defaultTaskRole
   * @return defaultTaskRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TASK_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultTaskRole() {
    return defaultTaskRole;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_TASK_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultTaskRole(String defaultTaskRole) {
    this.defaultTaskRole = defaultTaskRole;
  }


   /**
   * Get defaultTaskRoleInfrastructureWebsiteUrl
   * @return defaultTaskRoleInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TASK_ROLE_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultTaskRoleInfrastructureWebsiteUrl() {
    return defaultTaskRoleInfrastructureWebsiteUrl;
  }




  public AwsEcsExecutionMethodCapability defaultPlatformVersion(String defaultPlatformVersion) {
    
    this.defaultPlatformVersion = defaultPlatformVersion;
    return this;
  }

   /**
   * Get defaultPlatformVersion
   * @return defaultPlatformVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_PLATFORM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultPlatformVersion() {
    return defaultPlatformVersion;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PLATFORM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultPlatformVersion(String defaultPlatformVersion) {
    this.defaultPlatformVersion = defaultPlatformVersion;
  }


  public AwsEcsExecutionMethodCapability mainContainerName(String mainContainerName) {
    
    this.mainContainerName = mainContainerName;
    return this;
  }

   /**
   * Get mainContainerName
   * @return mainContainerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAIN_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainContainerName() {
    return mainContainerName;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainContainerName(String mainContainerName) {
    this.mainContainerName = mainContainerName;
  }


  public AwsEcsExecutionMethodCapability serviceOptions(AwsEcsServiceOptions serviceOptions) {
    
    this.serviceOptions = serviceOptions;
    return this;
  }

   /**
   * Get serviceOptions
   * @return serviceOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AwsEcsServiceOptions getServiceOptions() {
    return serviceOptions;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceOptions(AwsEcsServiceOptions serviceOptions) {
    this.serviceOptions = serviceOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsExecutionMethodCapability awsEcsExecutionMethodCapability = (AwsEcsExecutionMethodCapability) o;
    return Objects.equals(this.taskDefinitionArn, awsEcsExecutionMethodCapability.taskDefinitionArn) &&
        Objects.equals(this.taskDefinitionInfrastructureWebsiteUrl, awsEcsExecutionMethodCapability.taskDefinitionInfrastructureWebsiteUrl) &&
        Objects.equals(this.allocatedCpuUnits, awsEcsExecutionMethodCapability.allocatedCpuUnits) &&
        Objects.equals(this.allocatedMemoryMb, awsEcsExecutionMethodCapability.allocatedMemoryMb) &&
        Objects.equals(this.type, awsEcsExecutionMethodCapability.type) &&
        Objects.equals(this.capabilities, awsEcsExecutionMethodCapability.capabilities) &&
        Objects.equals(this.tags, awsEcsExecutionMethodCapability.tags) &&
        equalsNullable(this.defaultSubnets, awsEcsExecutionMethodCapability.defaultSubnets) &&
        Objects.equals(this.defaultSubnetInfrastructureWebsiteUrls, awsEcsExecutionMethodCapability.defaultSubnetInfrastructureWebsiteUrls) &&
        equalsNullable(this.defaultLaunchType, awsEcsExecutionMethodCapability.defaultLaunchType) &&
        equalsNullable(this.supportedLaunchTypes, awsEcsExecutionMethodCapability.supportedLaunchTypes) &&
        Objects.equals(this.defaultClusterArn, awsEcsExecutionMethodCapability.defaultClusterArn) &&
        Objects.equals(this.defaultClusterInfrastructureWebsiteUrl, awsEcsExecutionMethodCapability.defaultClusterInfrastructureWebsiteUrl) &&
        equalsNullable(this.defaultSecurityGroups, awsEcsExecutionMethodCapability.defaultSecurityGroups) &&
        Objects.equals(this.defaultSecurityGroupInfrastructureWebsiteUrls, awsEcsExecutionMethodCapability.defaultSecurityGroupInfrastructureWebsiteUrls) &&
        equalsNullable(this.defaultAssignPublicIp, awsEcsExecutionMethodCapability.defaultAssignPublicIp) &&
        Objects.equals(this.defaultExecutionRole, awsEcsExecutionMethodCapability.defaultExecutionRole) &&
        Objects.equals(this.defaultExecutionRoleInfrastructureWebsiteUrl, awsEcsExecutionMethodCapability.defaultExecutionRoleInfrastructureWebsiteUrl) &&
        Objects.equals(this.defaultTaskRole, awsEcsExecutionMethodCapability.defaultTaskRole) &&
        Objects.equals(this.defaultTaskRoleInfrastructureWebsiteUrl, awsEcsExecutionMethodCapability.defaultTaskRoleInfrastructureWebsiteUrl) &&
        Objects.equals(this.defaultPlatformVersion, awsEcsExecutionMethodCapability.defaultPlatformVersion) &&
        Objects.equals(this.mainContainerName, awsEcsExecutionMethodCapability.mainContainerName) &&
        Objects.equals(this.serviceOptions, awsEcsExecutionMethodCapability.serviceOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskDefinitionArn, taskDefinitionInfrastructureWebsiteUrl, allocatedCpuUnits, allocatedMemoryMb, type, capabilities, tags, hashCodeNullable(defaultSubnets), defaultSubnetInfrastructureWebsiteUrls, hashCodeNullable(defaultLaunchType), hashCodeNullable(supportedLaunchTypes), defaultClusterArn, defaultClusterInfrastructureWebsiteUrl, hashCodeNullable(defaultSecurityGroups), defaultSecurityGroupInfrastructureWebsiteUrls, hashCodeNullable(defaultAssignPublicIp), defaultExecutionRole, defaultExecutionRoleInfrastructureWebsiteUrl, defaultTaskRole, defaultTaskRoleInfrastructureWebsiteUrl, defaultPlatformVersion, mainContainerName, serviceOptions);
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
    sb.append("class AwsEcsExecutionMethodCapability {\n");
    sb.append("    taskDefinitionArn: ").append(toIndentedString(taskDefinitionArn)).append("\n");
    sb.append("    taskDefinitionInfrastructureWebsiteUrl: ").append(toIndentedString(taskDefinitionInfrastructureWebsiteUrl)).append("\n");
    sb.append("    allocatedCpuUnits: ").append(toIndentedString(allocatedCpuUnits)).append("\n");
    sb.append("    allocatedMemoryMb: ").append(toIndentedString(allocatedMemoryMb)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    defaultSubnets: ").append(toIndentedString(defaultSubnets)).append("\n");
    sb.append("    defaultSubnetInfrastructureWebsiteUrls: ").append(toIndentedString(defaultSubnetInfrastructureWebsiteUrls)).append("\n");
    sb.append("    defaultLaunchType: ").append(toIndentedString(defaultLaunchType)).append("\n");
    sb.append("    supportedLaunchTypes: ").append(toIndentedString(supportedLaunchTypes)).append("\n");
    sb.append("    defaultClusterArn: ").append(toIndentedString(defaultClusterArn)).append("\n");
    sb.append("    defaultClusterInfrastructureWebsiteUrl: ").append(toIndentedString(defaultClusterInfrastructureWebsiteUrl)).append("\n");
    sb.append("    defaultSecurityGroups: ").append(toIndentedString(defaultSecurityGroups)).append("\n");
    sb.append("    defaultSecurityGroupInfrastructureWebsiteUrls: ").append(toIndentedString(defaultSecurityGroupInfrastructureWebsiteUrls)).append("\n");
    sb.append("    defaultAssignPublicIp: ").append(toIndentedString(defaultAssignPublicIp)).append("\n");
    sb.append("    defaultExecutionRole: ").append(toIndentedString(defaultExecutionRole)).append("\n");
    sb.append("    defaultExecutionRoleInfrastructureWebsiteUrl: ").append(toIndentedString(defaultExecutionRoleInfrastructureWebsiteUrl)).append("\n");
    sb.append("    defaultTaskRole: ").append(toIndentedString(defaultTaskRole)).append("\n");
    sb.append("    defaultTaskRoleInfrastructureWebsiteUrl: ").append(toIndentedString(defaultTaskRoleInfrastructureWebsiteUrl)).append("\n");
    sb.append("    defaultPlatformVersion: ").append(toIndentedString(defaultPlatformVersion)).append("\n");
    sb.append("    mainContainerName: ").append(toIndentedString(mainContainerName)).append("\n");
    sb.append("    serviceOptions: ").append(toIndentedString(serviceOptions)).append("\n");
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

