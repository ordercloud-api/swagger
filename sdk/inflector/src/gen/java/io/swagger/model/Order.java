package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
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
  public Order ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public Order type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Order fromUserID(String fromUserID) {
    this.fromUserID = fromUserID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("FromUserID")
  public String getFromUserID() {
    return fromUserID;
  }
  public void setFromUserID(String fromUserID) {
    this.fromUserID = fromUserID;
  }

  /**
   **/
  public Order billingAddressID(String billingAddressID) {
    this.billingAddressID = billingAddressID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("BillingAddressID")
  public String getBillingAddressID() {
    return billingAddressID;
  }
  public void setBillingAddressID(String billingAddressID) {
    this.billingAddressID = billingAddressID;
  }

  /**
   **/
  public Order shippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ShippingAddressID")
  public String getShippingAddressID() {
    return shippingAddressID;
  }
  public void setShippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
  }

  /**
   **/
  public Order comments(String comments) {
    this.comments = comments;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   **/
  public Order shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ShippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }
  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  /**
   **/
  public Order taxCost(BigDecimal taxCost) {
    this.taxCost = taxCost;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("TaxCost")
  public BigDecimal getTaxCost() {
    return taxCost;
  }
  public void setTaxCost(BigDecimal taxCost) {
    this.taxCost = taxCost;
  }

  /**
   **/
  public Order xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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

