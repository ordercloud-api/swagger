package io.swagger.model;

import java.math.BigDecimal;
import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SpendingAccount", propOrder =
	{ "ID", "name", "balance", "allowAsPaymentMethod", "redemptionCode", "startDate", "endDate", "xp"
})

@XmlRootElement(name="SpendingAccount")
public class SpendingAccount  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="Balance")
  private BigDecimal balance = null;

  @XmlElement(name="AllowAsPaymentMethod")
  private Boolean allowAsPaymentMethod = null;

  @XmlElement(name="RedemptionCode")
  private String redemptionCode = null;

  @XmlElement(name="StartDate")
  private LocalDate startDate = null;

  @XmlElement(name="EndDate")
  private LocalDate endDate = null;

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
  
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
  /**
   **/
  
  public Boolean getAllowAsPaymentMethod() {
    return allowAsPaymentMethod;
  }
  public void setAllowAsPaymentMethod(Boolean allowAsPaymentMethod) {
    this.allowAsPaymentMethod = allowAsPaymentMethod;
  }
  /**
   **/
  
  public String getRedemptionCode() {
    return redemptionCode;
  }
  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
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
  
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
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
    sb.append("class SpendingAccount {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    allowAsPaymentMethod: ").append(toIndentedString(allowAsPaymentMethod)).append("\n");
    sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

