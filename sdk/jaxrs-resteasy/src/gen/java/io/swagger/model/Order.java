package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class Order   {
  
  private String ID = null;
  private String type = null;
  private String fromUserID = null;
  private String billingAddressID = null;
  private String shippingAddressID = null;
  private String comments = null;
  private BigDecimal shippingCost = null;
  private BigDecimal taxCost = null;
  private Object xp = null;

  /**
   **/
  
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @JsonProperty("FromUserID")
  public String getFromUserID() {
    return fromUserID;
  }
  public void setFromUserID(String fromUserID) {
    this.fromUserID = fromUserID;
  }

  /**
   **/
  
  @JsonProperty("BillingAddressID")
  public String getBillingAddressID() {
    return billingAddressID;
  }
  public void setBillingAddressID(String billingAddressID) {
    this.billingAddressID = billingAddressID;
  }

  /**
   **/
  
  @JsonProperty("ShippingAddressID")
  public String getShippingAddressID() {
    return shippingAddressID;
  }
  public void setShippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
  }

  /**
   **/
  
  @JsonProperty("Comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   **/
  
  @JsonProperty("ShippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }
  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  /**
   **/
  
  @JsonProperty("TaxCost")
  public BigDecimal getTaxCost() {
    return taxCost;
  }
  public void setTaxCost(BigDecimal taxCost) {
    this.taxCost = taxCost;
  }

  /**
   **/
  
  @JsonProperty("xp")
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(ID, order.ID) &&
        Objects.equals(type, order.type) &&
        Objects.equals(fromUserID, order.fromUserID) &&
        Objects.equals(billingAddressID, order.billingAddressID) &&
        Objects.equals(shippingAddressID, order.shippingAddressID) &&
        Objects.equals(comments, order.comments) &&
        Objects.equals(shippingCost, order.shippingCost) &&
        Objects.equals(taxCost, order.taxCost) &&
        Objects.equals(xp, order.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, type, fromUserID, billingAddressID, shippingAddressID, comments, shippingCost, taxCost, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromUserID: ").append(toIndentedString(fromUserID)).append("\n");
    sb.append("    billingAddressID: ").append(toIndentedString(billingAddressID)).append("\n");
    sb.append("    shippingAddressID: ").append(toIndentedString(shippingAddressID)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    taxCost: ").append(toIndentedString(taxCost)).append("\n");
    sb.append("    xp: ").append(toIndentedString(xp)).append("\n");
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

