package io.swagger.model;

import io.swagger.model.ShipmentItem;
import java.util.ArrayList;
import java.util.List;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PriceSchedule", propOrder =
	{ "ID", "name", "applyTax", "applyShipping", "maxQuantity", "useCumulativeQuantity", "restrictedQuantity", "orderType", "priceBreaks", "xp"
})

@XmlRootElement(name="PriceSchedule")
public class PriceSchedule  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="ApplyTax")
  private Boolean applyTax = null;

  @XmlElement(name="ApplyShipping")
  private Boolean applyShipping = null;

  @XmlElement(name="MaxQuantity")
  private Integer maxQuantity = null;

  @XmlElement(name="UseCumulativeQuantity")
  private Boolean useCumulativeQuantity = null;

  @XmlElement(name="RestrictedQuantity")
  private Boolean restrictedQuantity = null;

  @XmlElement(name="OrderType")
  private String orderType = null;

  @XmlElement(name="PriceBreaks")
  private List<ShipmentItem> priceBreaks = new ArrayList<ShipmentItem>();

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
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  /**
   **/
  
  public Boolean getApplyTax() {
    return applyTax;
  }
  public void setApplyTax(Boolean applyTax) {
    this.applyTax = applyTax;
  }
  /**
   **/
  
  public Boolean getApplyShipping() {
    return applyShipping;
  }
  public void setApplyShipping(Boolean applyShipping) {
    this.applyShipping = applyShipping;
  }
  /**
   **/
  
  public Integer getMaxQuantity() {
    return maxQuantity;
  }
  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }
  /**
   **/
  
  public Boolean getUseCumulativeQuantity() {
    return useCumulativeQuantity;
  }
  public void setUseCumulativeQuantity(Boolean useCumulativeQuantity) {
    this.useCumulativeQuantity = useCumulativeQuantity;
  }
  /**
   **/
  
  public Boolean getRestrictedQuantity() {
    return restrictedQuantity;
  }
  public void setRestrictedQuantity(Boolean restrictedQuantity) {
    this.restrictedQuantity = restrictedQuantity;
  }
  /**
   **/
  
  public String getOrderType() {
    return orderType;
  }
  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }
  /**
   **/
  
  public List<ShipmentItem> getPriceBreaks() {
    return priceBreaks;
  }
  public void setPriceBreaks(List<ShipmentItem> priceBreaks) {
    this.priceBreaks = priceBreaks;
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
    sb.append("class PriceSchedule {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applyTax: ").append(toIndentedString(applyTax)).append("\n");
    sb.append("    applyShipping: ").append(toIndentedString(applyShipping)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    useCumulativeQuantity: ").append(toIndentedString(useCumulativeQuantity)).append("\n");
    sb.append("    restrictedQuantity: ").append(toIndentedString(restrictedQuantity)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    priceBreaks: ").append(toIndentedString(priceBreaks)).append("\n");
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

