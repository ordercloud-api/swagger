package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class SpecOption   {
  
  private String ID = null;
  private String value = null;
  private Integer listOrder = null;
  private Boolean isOpenText = null;
  private String priceMarkupType = null;
  private BigDecimal priceMarkup = null;
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
  
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  
  @JsonProperty("ListOrder")
  public Integer getListOrder() {
    return listOrder;
  }
  public void setListOrder(Integer listOrder) {
    this.listOrder = listOrder;
  }

  /**
   **/
  
  @JsonProperty("IsOpenText")
  public Boolean getIsOpenText() {
    return isOpenText;
  }
  public void setIsOpenText(Boolean isOpenText) {
    this.isOpenText = isOpenText;
  }

  /**
   **/
  
  @JsonProperty("PriceMarkupType")
  public String getPriceMarkupType() {
    return priceMarkupType;
  }
  public void setPriceMarkupType(String priceMarkupType) {
    this.priceMarkupType = priceMarkupType;
  }

  /**
   **/
  
  @JsonProperty("PriceMarkup")
  public BigDecimal getPriceMarkup() {
    return priceMarkup;
  }
  public void setPriceMarkup(BigDecimal priceMarkup) {
    this.priceMarkup = priceMarkup;
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
    SpecOption specOption = (SpecOption) o;
    return Objects.equals(ID, specOption.ID) &&
        Objects.equals(value, specOption.value) &&
        Objects.equals(listOrder, specOption.listOrder) &&
        Objects.equals(isOpenText, specOption.isOpenText) &&
        Objects.equals(priceMarkupType, specOption.priceMarkupType) &&
        Objects.equals(priceMarkup, specOption.priceMarkup) &&
        Objects.equals(xp, specOption.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, value, listOrder, isOpenText, priceMarkupType, priceMarkup, xp);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

