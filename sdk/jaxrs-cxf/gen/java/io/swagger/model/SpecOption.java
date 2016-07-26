package io.swagger.model;

import java.math.BigDecimal;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SpecOption", propOrder =
	{ "ID", "value", "listOrder", "isOpenText", "priceMarkupType", "priceMarkup", "xp"
})

@XmlRootElement(name="SpecOption")
public class SpecOption  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Value")
  private String value = null;

  @XmlElement(name="ListOrder")
  private Integer listOrder = null;

  @XmlElement(name="IsOpenText")
  private Boolean isOpenText = null;

  @XmlElement(name="PriceMarkupType")
  private String priceMarkupType = null;

  @XmlElement(name="PriceMarkup")
  private BigDecimal priceMarkup = null;

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
  
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  /**
   **/
  
  public Integer getListOrder() {
    return listOrder;
  }
  public void setListOrder(Integer listOrder) {
    this.listOrder = listOrder;
  }
  /**
   **/
  
  public Boolean getIsOpenText() {
    return isOpenText;
  }
  public void setIsOpenText(Boolean isOpenText) {
    this.isOpenText = isOpenText;
  }
  /**
   **/
  
  public String getPriceMarkupType() {
    return priceMarkupType;
  }
  public void setPriceMarkupType(String priceMarkupType) {
    this.priceMarkupType = priceMarkupType;
  }
  /**
   **/
  
  public BigDecimal getPriceMarkup() {
    return priceMarkup;
  }
  public void setPriceMarkup(BigDecimal priceMarkup) {
    this.priceMarkup = priceMarkup;
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
    sb.append("class SpecOption {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
    sb.append("    isOpenText: ").append(toIndentedString(isOpenText)).append("\n");
    sb.append("    priceMarkupType: ").append(toIndentedString(priceMarkupType)).append("\n");
    sb.append("    priceMarkup: ").append(toIndentedString(priceMarkup)).append("\n");
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

