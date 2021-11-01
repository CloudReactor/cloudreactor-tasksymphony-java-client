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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TokenObtainPair
 */
@JsonPropertyOrder({
  TokenObtainPair.JSON_PROPERTY_USERNAME,
  TokenObtainPair.JSON_PROPERTY_PASSWORD,
  TokenObtainPair.JSON_PROPERTY_ACCESS,
  TokenObtainPair.JSON_PROPERTY_REFRESH
})
@JsonTypeName("TokenObtainPair")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-31T16:51:00.429-07:00[America/Los_Angeles]")
public class TokenObtainPair {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ACCESS = "access";
  private String access;

  public static final String JSON_PROPERTY_REFRESH = "refresh";
  private String refresh;


  public TokenObtainPair username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public TokenObtainPair password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


   /**
   * Get access
   * @return access
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccess() {
    return access;
  }




   /**
   * Get refresh
   * @return refresh
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REFRESH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRefresh() {
    return refresh;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenObtainPair tokenObtainPair = (TokenObtainPair) o;
    return Objects.equals(this.username, tokenObtainPair.username) &&
        Objects.equals(this.password, tokenObtainPair.password) &&
        Objects.equals(this.access, tokenObtainPair.access) &&
        Objects.equals(this.refresh, tokenObtainPair.refresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, access, refresh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenObtainPair {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
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

