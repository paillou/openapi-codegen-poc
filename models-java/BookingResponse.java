/*
 * BlaBlaCar APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: squad-edge@blablacar.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * BookingResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-29T13:47:20.209+02:00[Europe/Paris]")
public class BookingResponse {
  @SerializedName("steps")
  private List<AnyOfBookingResponseStepsItems> steps = null;

  @SerializedName("flow_id")
  private UUID flowId = null;

  public BookingResponse steps(List<AnyOfBookingResponseStepsItems> steps) {
    this.steps = steps;
    return this;
  }

  public BookingResponse addStepsItem(AnyOfBookingResponseStepsItems stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<AnyOfBookingResponseStepsItems>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @Schema(description = "")
  public List<AnyOfBookingResponseStepsItems> getSteps() {
    return steps;
  }

  public void setSteps(List<AnyOfBookingResponseStepsItems> steps) {
    this.steps = steps;
  }

  public BookingResponse flowId(UUID flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * This flow identifier is generated by the client application and embedded in the first request to Edge. It will be then added in each subsequent requests and responses of the booking flow.
   * @return flowId
  **/
  @Schema(description = "This flow identifier is generated by the client application and embedded in the first request to Edge. It will be then added in each subsequent requests and responses of the booking flow.")
  public UUID getFlowId() {
    return flowId;
  }

  public void setFlowId(UUID flowId) {
    this.flowId = flowId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingResponse bookingResponse = (BookingResponse) o;
    return Objects.equals(this.steps, bookingResponse.steps) &&
        Objects.equals(this.flowId, bookingResponse.flowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, flowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingResponse {\n");
    
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
