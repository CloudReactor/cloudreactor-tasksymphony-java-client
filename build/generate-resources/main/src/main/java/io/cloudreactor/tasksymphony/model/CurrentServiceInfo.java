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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CurrentServiceInfo
 */
@JsonPropertyOrder({
  CurrentServiceInfo.JSON_PROPERTY_TYPE,
  CurrentServiceInfo.JSON_PROPERTY_SERVICE_ARN,
  CurrentServiceInfo.JSON_PROPERTY_SERVICE_INFRASTRUCTURE_WEBSITE_URL,
  CurrentServiceInfo.JSON_PROPERTY_SERVICE_ARN_UPDATED_AT
})
@JsonTypeName("CurrentServiceInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CurrentServiceInfo {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_SERVICE_ARN = "service_arn";
  private String serviceArn;

  public static final String JSON_PROPERTY_SERVICE_INFRASTRUCTURE_WEBSITE_URL = "service_infrastructure_website_url";
  private String serviceInfrastructureWebsiteUrl;

  public static final String JSON_PROPERTY_SERVICE_ARN_UPDATED_AT = "service_arn_updated_at";
  private OffsetDateTime serviceArnUpdatedAt;


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
   * Get serviceArn
   * @return serviceArn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceArn() {
    return serviceArn;
  }




   /**
   * Get serviceInfrastructureWebsiteUrl
   * @return serviceInfrastructureWebsiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_INFRASTRUCTURE_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceInfrastructureWebsiteUrl() {
    return serviceInfrastructureWebsiteUrl;
  }




   /**
   * Get serviceArnUpdatedAt
   * @return serviceArnUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ARN_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getServiceArnUpdatedAt() {
    return serviceArnUpdatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentServiceInfo currentServiceInfo = (CurrentServiceInfo) o;
    return Objects.equals(this.type, currentServiceInfo.type) &&
        Objects.equals(this.serviceArn, currentServiceInfo.serviceArn) &&
        Objects.equals(this.serviceInfrastructureWebsiteUrl, currentServiceInfo.serviceInfrastructureWebsiteUrl) &&
        Objects.equals(this.serviceArnUpdatedAt, currentServiceInfo.serviceArnUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, serviceArn, serviceInfrastructureWebsiteUrl, serviceArnUpdatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentServiceInfo {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceArn: ").append(toIndentedString(serviceArn)).append("\n");
    sb.append("    serviceInfrastructureWebsiteUrl: ").append(toIndentedString(serviceInfrastructureWebsiteUrl)).append("\n");
    sb.append("    serviceArnUpdatedAt: ").append(toIndentedString(serviceArnUpdatedAt)).append("\n");
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

