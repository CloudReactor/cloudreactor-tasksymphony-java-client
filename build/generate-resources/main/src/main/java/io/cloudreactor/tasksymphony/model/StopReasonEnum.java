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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets StopReasonEnum
 */
public enum StopReasonEnum {
  
  MANUAL("MANUAL"),
  
  MAX_EXECUTION_TIME_EXCEEDED("MAX_EXECUTION_TIME_EXCEEDED"),
  
  MISSING_HEARTBEAT("MISSING_HEARTBEAT"),
  
  FAILED_TO_START("FAILED_TO_START"),
  
  WORKFLOW_EXECUTION_STOPPED("WORKFLOW_EXECUTION_STOPPED"),
  
  WORKFLOW_EXECUTION_RETRIED("WORKFLOW_EXECUTION_RETRIED"),
  
  WORKFLOW_EXECUTION_TIMED_OUT("WORKFLOW_EXECUTION_TIMED_OUT");

  private String value;

  StopReasonEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StopReasonEnum fromValue(String value) {
    for (StopReasonEnum b : StopReasonEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

