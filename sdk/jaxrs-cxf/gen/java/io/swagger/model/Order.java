package io.swagger.model;

import java.math.BigDecimal;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Order", propOrder =
	{ "ID", "type", "fromUserID", "billingAddressID", "shippingAddressID", "comments", "shippingCost", "taxCost", "xp"
})

@XmlRootElement(name="Order")
public class Order  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Type")
  private String type = null;

  @XmlElement(name="FromUserID")
  private String fromUserID = null;

  @XmlElement(name="BillingAddressID")
  private String billingAddressID = null;

  @XmlElement(name="ShippingAddressID")
  private String shippingAddressID = null;

  @XmlElement(name="Comments")
  private String comments = null;

  @XmlElement(name="ShippingCost")
  private BigDecimal shippingCost = null;

  @XmlElement(name="TaxCost")
  private BigDecimal taxCost = null;

  @XmlElement(name="xp")
  private Object xp = null;

  /**
   **/
  
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }
  /**
   **/
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  /**
   **/
  
  public String getFromUserID() {
    return fromUserID;
  }
  public void setFromUserID(String fromUserID) {
    this.fromUserID = fromUserID;
  }
  /**
   **/
  
  public String getBillingAddressID() {
    return billingAddressID;
  }
  public void setBillingAddressID(String billingAddressID) {
    this.billingAddressID = billingAddressID;
  }
  /**
   **/
  
  public String getShippingAddressID() {
    return shippingAddressID;
  }
  public void setShippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
  }
  /**
   **/
  
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }
  /**
   **/
  
  public BigDecimal getShippingCost() {
    return shippingCost;
  }
  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }
  /**
   **/
  
  public BigDecimal getTaxCost() {
    return taxCost;
  }
  public void setTaxCost(BigDecimal taxCost) {
    this.taxCost = taxCost;
  }
  /**
   **/
  
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

