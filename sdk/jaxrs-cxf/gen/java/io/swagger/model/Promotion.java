package io.swagger.model;

import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Promotion", propOrder =
	{ "ID", "code", "name", "usagesRemaining", "description", "finePrint", "startDate", "expirationDate", "eligibleExpression", "valueExpression", "canCombine", "xp"
})

@XmlRootElement(name="Promotion")
public class Promotion  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Code")
  private String code = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="UsagesRemaining")
  private Integer usagesRemaining = null;

  @XmlElement(name="Description")
  private String description = null;

  @XmlElement(name="FinePrint")
  private String finePrint = null;

  @XmlElement(name="StartDate")
  private LocalDate startDate = null;

  @XmlElement(name="ExpirationDate")
  private LocalDate expirationDate = null;

  @XmlElement(name="EligibleExpression")
  private String eligibleExpression = null;

  @XmlElement(name="ValueExpression")
  private String valueExpression = null;

  @XmlElement(name="CanCombine")
  private Boolean canCombine = null;

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
  
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  
  public Integer getUsagesRemaining() {
    return usagesRemaining;
  }
  public void setUsagesRemaining(Integer usagesRemaining) {
    this.usagesRemaining = usagesRemaining;
  }
  /**
   **/
  
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  /**
   **/
  
  public String getFinePrint() {
    return finePrint;
  }
  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }
  /**
   **/
  
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  /**
   **/
  
  public LocalDate getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }
  /**
   **/
  
  public String getEligibleExpression() {
    return eligibleExpression;
  }
  public void setEligibleExpression(String eligibleExpression) {
    this.eligibleExpression = eligibleExpression;
  }
  /**
   **/
  
  public String getValueExpression() {
    return valueExpression;
  }
  public void setValueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
  }
  /**
   **/
  
  public Boolean getCanCombine() {
    return canCombine;
  }
  public void setCanCombine(Boolean canCombine) {
    this.canCombine = canCombine;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

