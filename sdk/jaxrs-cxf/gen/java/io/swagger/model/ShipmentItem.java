package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ShipmentItem", propOrder =
	{ "orderID", "lineItemID", "quantityShipped"
})

@XmlRootElement(name="ShipmentItem")
public class ShipmentItem  {
  

  @XmlElement(name="OrderID")
  private String orderID = null;

  @XmlElement(name="LineItemID")
  private String lineItemID = null;

  @XmlElement(name="QuantityShipped")
  private Integer quantityShipped = null;

  /**
   **/
  
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }
  /**
   **/
  
  public String getLineItemID() {
    return lineItemID;
  }
  public void setLineItemID(String lineItemID) {
    this.lineItemID = lineItemID;
  }
  /**
   **/
  
  public Integer getQuantityShipped() {
    return quantityShipped;
  }
  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

