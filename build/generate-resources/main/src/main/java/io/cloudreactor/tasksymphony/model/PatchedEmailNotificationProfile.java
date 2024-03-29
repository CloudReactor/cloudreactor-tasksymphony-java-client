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
 * An EmailProfile contains settings for emailing notifications.
 */
@ApiModel(description = "An EmailProfile contains settings for emailing notifications.")
@JsonPropertyOrder({
  PatchedEmailNotificationProfile.JSON_PROPERTY_URL,
  PatchedEmailNotificationProfile.JSON_PROPERTY_UUID,
  PatchedEmailNotificationProfile.JSON_PROPERTY_NAME,
  PatchedEmailNotificationProfile.JSON_PROPERTY_DESCRIPTION,
  PatchedEmailNotificationProfile.JSON_PROPERTY_DASHBOARD_URL,
  PatchedEmailNotificationProfile.JSON_PROPERTY_CREATED_BY_USER,
  PatchedEmailNotificationProfile.JSON_PROPERTY_CREATED_BY_GROUP,
  PatchedEmailNotificationProfile.JSON_PROPERTY_RUN_ENVIRONMENT,
  PatchedEmailNotificationProfile.JSON_PROPERTY_CREATED_AT,
  PatchedEmailNotificationProfile.JSON_PROPERTY_UPDATED_AT,
  PatchedEmailNotificationProfile.JSON_PROPERTY_TO_ADDRESSES,
  PatchedEmailNotificationProfile.JSON_PROPERTY_CC_ADDRESSES,
  PatchedEmailNotificationProfile.JSON_PROPERTY_BCC_ADDRESSES,
  PatchedEmailNotificationProfile.JSON_PROPERTY_SUBJECT_TEMPLATE,
  PatchedEmailNotificationProfile.JSON_PROPERTY_BODY_TEMPLATE
})
@JsonTypeName("PatchedEmailNotificationProfile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchedEmailNotificationProfile {
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

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private String createdByUser;

  public static final String JSON_PROPERTY_CREATED_BY_GROUP = "created_by_group";
  private JsonNullable<Group> createdByGroup = JsonNullable.<Group>undefined();

  public static final String JSON_PROPERTY_RUN_ENVIRONMENT = "run_environment";
  private JsonNullable<NameAndUuid> runEnvironment = JsonNullable.<NameAndUuid>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_TO_ADDRESSES = "to_addresses";
  private JsonNullable<List<String>> toAddresses = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CC_ADDRESSES = "cc_addresses";
  private JsonNullable<List<String>> ccAddresses = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_BCC_ADDRESSES = "bcc_addresses";
  private JsonNullable<List<String>> bccAddresses = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SUBJECT_TEMPLATE = "subject_template";
  private String subjectTemplate;

  public static final String JSON_PROPERTY_BODY_TEMPLATE = "body_template";
  private String bodyTemplate;


   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getUrl() {
    return url;
  }




   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUuid() {
    return uuid;
  }




  public PatchedEmailNotificationProfile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PatchedEmailNotificationProfile description(String description) {
    
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DASHBOARD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardUrl() {
    return dashboardUrl;
  }




   /**
   * Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
   * @return createdByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedByUser() {
    return createdByUser;
  }




   /**
   * Get createdByGroup
   * @return createdByGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Group getCreatedByGroup() {
    
    if (createdByGroup == null) {
      createdByGroup = JsonNullable.<Group>undefined();
    }
    return createdByGroup.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Group> getCreatedByGroup_JsonNullable() {
    return createdByGroup;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_GROUP)
  private void setCreatedByGroup_JsonNullable(JsonNullable<Group> createdByGroup) {
    this.createdByGroup = createdByGroup;
  }



  public PatchedEmailNotificationProfile runEnvironment(NameAndUuid runEnvironment) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public PatchedEmailNotificationProfile toAddresses(List<String> toAddresses) {
    this.toAddresses = JsonNullable.<List<String>>of(toAddresses);
    
    return this;
  }

  public PatchedEmailNotificationProfile addToAddressesItem(String toAddressesItem) {
    if (this.toAddresses == null || !this.toAddresses.isPresent()) {
      this.toAddresses = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.toAddresses.get().add(toAddressesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get toAddresses
   * @return toAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getToAddresses() {
        return toAddresses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TO_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getToAddresses_JsonNullable() {
    return toAddresses;
  }
  
  @JsonProperty(JSON_PROPERTY_TO_ADDRESSES)
  public void setToAddresses_JsonNullable(JsonNullable<List<String>> toAddresses) {
    this.toAddresses = toAddresses;
  }

  public void setToAddresses(List<String> toAddresses) {
    this.toAddresses = JsonNullable.<List<String>>of(toAddresses);
  }


  public PatchedEmailNotificationProfile ccAddresses(List<String> ccAddresses) {
    this.ccAddresses = JsonNullable.<List<String>>of(ccAddresses);
    
    return this;
  }

  public PatchedEmailNotificationProfile addCcAddressesItem(String ccAddressesItem) {
    if (this.ccAddresses == null || !this.ccAddresses.isPresent()) {
      this.ccAddresses = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.ccAddresses.get().add(ccAddressesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get ccAddresses
   * @return ccAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getCcAddresses() {
        return ccAddresses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CC_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getCcAddresses_JsonNullable() {
    return ccAddresses;
  }
  
  @JsonProperty(JSON_PROPERTY_CC_ADDRESSES)
  public void setCcAddresses_JsonNullable(JsonNullable<List<String>> ccAddresses) {
    this.ccAddresses = ccAddresses;
  }

  public void setCcAddresses(List<String> ccAddresses) {
    this.ccAddresses = JsonNullable.<List<String>>of(ccAddresses);
  }


  public PatchedEmailNotificationProfile bccAddresses(List<String> bccAddresses) {
    this.bccAddresses = JsonNullable.<List<String>>of(bccAddresses);
    
    return this;
  }

  public PatchedEmailNotificationProfile addBccAddressesItem(String bccAddressesItem) {
    if (this.bccAddresses == null || !this.bccAddresses.isPresent()) {
      this.bccAddresses = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.bccAddresses.get().add(bccAddressesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get bccAddresses
   * @return bccAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getBccAddresses() {
        return bccAddresses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BCC_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getBccAddresses_JsonNullable() {
    return bccAddresses;
  }
  
  @JsonProperty(JSON_PROPERTY_BCC_ADDRESSES)
  public void setBccAddresses_JsonNullable(JsonNullable<List<String>> bccAddresses) {
    this.bccAddresses = bccAddresses;
  }

  public void setBccAddresses(List<String> bccAddresses) {
    this.bccAddresses = JsonNullable.<List<String>>of(bccAddresses);
  }


  public PatchedEmailNotificationProfile subjectTemplate(String subjectTemplate) {
    
    this.subjectTemplate = subjectTemplate;
    return this;
  }

   /**
   * Get subjectTemplate
   * @return subjectTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectTemplate() {
    return subjectTemplate;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectTemplate(String subjectTemplate) {
    this.subjectTemplate = subjectTemplate;
  }


  public PatchedEmailNotificationProfile bodyTemplate(String bodyTemplate) {
    
    this.bodyTemplate = bodyTemplate;
    return this;
  }

   /**
   * Get bodyTemplate
   * @return bodyTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BODY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBodyTemplate() {
    return bodyTemplate;
  }


  @JsonProperty(JSON_PROPERTY_BODY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBodyTemplate(String bodyTemplate) {
    this.bodyTemplate = bodyTemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedEmailNotificationProfile patchedEmailNotificationProfile = (PatchedEmailNotificationProfile) o;
    return Objects.equals(this.url, patchedEmailNotificationProfile.url) &&
        Objects.equals(this.uuid, patchedEmailNotificationProfile.uuid) &&
        Objects.equals(this.name, patchedEmailNotificationProfile.name) &&
        Objects.equals(this.description, patchedEmailNotificationProfile.description) &&
        Objects.equals(this.dashboardUrl, patchedEmailNotificationProfile.dashboardUrl) &&
        Objects.equals(this.createdByUser, patchedEmailNotificationProfile.createdByUser) &&
        equalsNullable(this.createdByGroup, patchedEmailNotificationProfile.createdByGroup) &&
        equalsNullable(this.runEnvironment, patchedEmailNotificationProfile.runEnvironment) &&
        Objects.equals(this.createdAt, patchedEmailNotificationProfile.createdAt) &&
        Objects.equals(this.updatedAt, patchedEmailNotificationProfile.updatedAt) &&
        equalsNullable(this.toAddresses, patchedEmailNotificationProfile.toAddresses) &&
        equalsNullable(this.ccAddresses, patchedEmailNotificationProfile.ccAddresses) &&
        equalsNullable(this.bccAddresses, patchedEmailNotificationProfile.bccAddresses) &&
        Objects.equals(this.subjectTemplate, patchedEmailNotificationProfile.subjectTemplate) &&
        Objects.equals(this.bodyTemplate, patchedEmailNotificationProfile.bodyTemplate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, uuid, name, description, dashboardUrl, createdByUser, hashCodeNullable(createdByGroup), hashCodeNullable(runEnvironment), createdAt, updatedAt, hashCodeNullable(toAddresses), hashCodeNullable(ccAddresses), hashCodeNullable(bccAddresses), subjectTemplate, bodyTemplate);
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
    sb.append("class PatchedEmailNotificationProfile {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdByGroup: ").append(toIndentedString(createdByGroup)).append("\n");
    sb.append("    runEnvironment: ").append(toIndentedString(runEnvironment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    toAddresses: ").append(toIndentedString(toAddresses)).append("\n");
    sb.append("    ccAddresses: ").append(toIndentedString(ccAddresses)).append("\n");
    sb.append("    bccAddresses: ").append(toIndentedString(bccAddresses)).append("\n");
    sb.append("    subjectTemplate: ").append(toIndentedString(subjectTemplate)).append("\n");
    sb.append("    bodyTemplate: ").append(toIndentedString(bodyTemplate)).append("\n");
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

