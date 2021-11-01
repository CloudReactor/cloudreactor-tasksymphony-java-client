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

package io.cloudreactor.tasksymphony.invoker;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that add parsing/formatting support for Java 8+ {@code OffsetDateTime} class.
 * It's generated for java clients when {@code AbstractJavaCodegen#dateLibrary} specified as {@code java8}.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-31T16:51:00.429-07:00[America/Los_Angeles]")
public class JavaTimeFormatter {

    private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    /**
     * Get the date format used to parse/format {@code OffsetDateTime} parameters.
     * @return DateTimeFormatter
     */
    public DateTimeFormatter getOffsetDateTimeFormatter() {
        return offsetDateTimeFormatter;
    }

    /**
     * Set the date format used to parse/format {@code OffsetDateTime} parameters.
     * @param offsetDateTimeFormatter {@code DateTimeFormatter}
     */
    public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
        this.offsetDateTimeFormatter = offsetDateTimeFormatter;
    }

    /**
     * Parse the given string into {@code OffsetDateTime} object.
     * @param str String
     * @return {@code OffsetDateTime}
     */
    public OffsetDateTime parseOffsetDateTime(String str) {
        try {
            return OffsetDateTime.parse(str, offsetDateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Format the given {@code OffsetDateTime} object into string.
     * @param offsetDateTime {@code OffsetDateTime}
     * @return {@code OffsetDateTime} in string format
     */
    public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTimeFormatter.format(offsetDateTime);
    }
}
