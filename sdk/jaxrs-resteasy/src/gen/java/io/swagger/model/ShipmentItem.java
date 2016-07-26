package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class ShipmentItem   {
  
  private String orderID = null;
  private String lineItemID = null;
  private Integer quantityShipped = null;

  /**
   **/
  
  @JsonProperty("OrderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  
  @JsonProperty("LineItemID")
  public String getLineItemID() {
    return lineItemID;
  }
  public void setLineItemID(String lineItemID) {
    this.lineItemID = lineItemID;
  }

  /**
   **/
  
  @JsonProperty("QuantityShipped")
  public Integer getQuantityShipped() {
    return quantityShipped;
  }
  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentItem shipmentItem = (ShipmentItem) o;
    return Objects.equals(orderID, shipmentItem.orderID) &&
        Objects.equals(lineItemID, shipmentItem.lineItemID) &&
        Objects.equals(quantityShipped, shipmentItem.quantityShipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, lineItemID, quantityShipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentItem {\n");
    
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    lineItemID: ").append(toIndentedString(lineItemID)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
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

