package io.swagger.model;

import java.math.BigDecimal;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Payment", propOrder =
	{ "ID", "type", "creditCardID", "spendingAccountID", "description", "amount", "xp"
})

@XmlRootElement(name="Payment")
public class Payment  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Type")
  private String type = null;

  @XmlElement(name="CreditCardID")
  private String creditCardID = null;

  @XmlElement(name="SpendingAccountID")
  private String spendingAccountID = null;

  @XmlElement(name="Description")
  private String description = null;

  @XmlElement(name="Amount")
  private BigDecimal amount = null;

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
  
  public String getCreditCardID() {
    return creditCardID;
  }
  public void setCreditCardID(String creditCardID) {
    this.creditCardID = creditCardID;
  }
  /**
   **/
  
  public String getSpendingAccountID() {
    return spendingAccountID;
  }
  public void setSpendingAccountID(String spendingAccountID) {
    this.spendingAccountID = spendingAccountID;
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
  
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
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
    sb.append("class Payment {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creditCardID: ").append(toIndentedString(creditCardID)).append("\n");
    sb.append("    spendingAccountID: ").append(toIndentedString(spendingAccountID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

