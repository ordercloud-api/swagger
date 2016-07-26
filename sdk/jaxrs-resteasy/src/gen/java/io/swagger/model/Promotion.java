package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class Promotion   {
  
  private String ID = null;
  private String code = null;
  private String name = null;
  private Integer usagesRemaining = null;
  private String description = null;
  private String finePrint = null;
  private Date startDate = null;
  private Date expirationDate = null;
  private String eligibleExpression = null;
  private String valueExpression = null;
  private Boolean canCombine = null;
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
  
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @JsonProperty("UsagesRemaining")
  public Integer getUsagesRemaining() {
    return usagesRemaining;
  }
  public void setUsagesRemaining(Integer usagesRemaining) {
    this.usagesRemaining = usagesRemaining;
  }

  /**
   **/
  
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @JsonProperty("FinePrint")
  public String getFinePrint() {
    return finePrint;
  }
  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  /**
   **/
  
  @JsonProperty("StartDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @JsonProperty("ExpirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   **/
  
  @JsonProperty("EligibleExpression")
  public String getEligibleExpression() {
    return eligibleExpression;
  }
  public void setEligibleExpression(String eligibleExpression) {
    this.eligibleExpression = eligibleExpression;
  }

  /**
   **/
  
  @JsonProperty("ValueExpression")
  public String getValueExpression() {
    return valueExpression;
  }
  public void setValueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
  }

  /**
   **/
  
  @JsonProperty("CanCombine")
  public Boolean getCanCombine() {
    return canCombine;
  }
  public void setCanCombine(Boolean canCombine) {
    this.canCombine = canCombine;
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
    Promotion promotion = (Promotion) o;
    return Objects.equals(ID, promotion.ID) &&
        Objects.equals(code, promotion.code) &&
        Objects.equals(name, promotion.name) &&
        Objects.equals(usagesRemaining, promotion.usagesRemaining) &&
        Objects.equals(description, promotion.description) &&
        Objects.equals(finePrint, promotion.finePrint) &&
        Objects.equals(startDate, promotion.startDate) &&
        Objects.equals(expirationDate, promotion.expirationDate) &&
        Objects.equals(eligibleExpression, promotion.eligibleExpression) &&
        Objects.equals(valueExpression, promotion.valueExpression) &&
        Objects.equals(canCombine, promotion.canCombine) &&
        Objects.equals(xp, promotion.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, code, name, usagesRemaining, description, finePrint, startDate, expirationDate, eligibleExpression, valueExpression, canCombine, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usagesRemaining: ").append(toIndentedString(usagesRemaining)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    finePrint: ").append(toIndentedString(finePrint)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    eligibleExpression: ").append(toIndentedString(eligibleExpression)).append("\n");
    sb.append("    valueExpression: ").append(toIndentedString(valueExpression)).append("\n");
    sb.append("    canCombine: ").append(toIndentedString(canCombine)).append("\n");
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

