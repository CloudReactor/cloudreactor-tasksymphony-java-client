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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Links represent a URL and associated metadata.
 */
@ApiModel(description = "Links represent a URL and associated metadata.")
@JsonPropertyOrder({
  Link.JSON_PROPERTY_UUID,
  Link.JSON_PROPERTY_NAME,
  Link.JSON_PROPERTY_LINK_URL_TEMPLATE,
  Link.JSON_PROPERTY_LINK_URL,
  Link.JSON_PROPERTY_ICON_URL,
  Link.JSON_PROPERTY_DESCRIPTION,
  Link.JSON_PROPERTY_RANK
})
@JsonTypeName("Link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Link {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LINK_URL_TEMPLATE = "link_url_template";
  private String linkUrlTemplate;

  public static final String JSON_PROPERTY_LINK_URL = "link_url";
  private String linkUrl;

  public static final String JSON_PROPERTY_ICON_URL = "icon_url";
  private String iconUrl;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RANK = "rank";
  private Integer rank;


  public Link uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
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


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public Link name(String name) {
    
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


  public Link linkUrlTemplate(String linkUrlTemplate) {
    
    this.linkUrlTemplate = linkUrlTemplate;
    return this;
  }

   /**
   * Get linkUrlTemplate
   * @return linkUrlTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LINK_URL_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLinkUrlTemplate() {
    return linkUrlTemplate;
  }


  @JsonProperty(JSON_PROPERTY_LINK_URL_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinkUrlTemplate(String linkUrlTemplate) {
    this.linkUrlTemplate = linkUrlTemplate;
  }


   /**
   * Get linkUrl
   * @return linkUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LINK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLinkUrl() {
    return linkUrl;
  }




   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIconUrl() {
    return iconUrl;
  }




  public Link description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Link rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRank() {
    return rank;
  }


  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.uuid, link.uuid) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.linkUrlTemplate, link.linkUrlTemplate) &&
        Objects.equals(this.linkUrl, link.linkUrl) &&
        Objects.equals(this.iconUrl, link.iconUrl) &&
        Objects.equals(this.description, link.description) &&
        Objects.equals(this.rank, link.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, linkUrlTemplate, linkUrl, iconUrl, description, rank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    linkUrlTemplate: ").append(toIndentedString(linkUrlTemplate)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

