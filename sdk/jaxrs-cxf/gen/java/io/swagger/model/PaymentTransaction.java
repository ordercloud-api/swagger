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
 @XmlType(name = "PaymentTransaction", propOrder =
	{ "ID", "type", "dateExecuted", "amount", "succeeded", "resultCode", "resultMessage", "xp"
})

@XmlRootElement(name="PaymentTransaction")
public class PaymentTransaction  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Type")
  private String type = null;

  @XmlElement(name="DateExecuted")
  private LocalDate dateExecuted = null;

  @XmlElement(name="Amount")
  private BigDecimal amount = null;

  @XmlElement(name="Succeeded")
  private Boolean succeeded = null;

  @XmlElement(name="ResultCode")
  private String resultCode = null;

  @XmlElement(name="ResultMessage")
  private String resultMessage = null;

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
  
  public LocalDate getDateExecuted() {
    return dateExecuted;
  }
  public void setDateExecuted(LocalDate dateExecuted) {
    this.dateExecuted = dateExecuted;
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
  
  public Boolean getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }
  /**
   **/
  
  public String getResultCode() {
    return resultCode;
  }
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }
  /**
   **/
  
  public String getResultMessage() {
    return resultMessage;
  }
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
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
    sb.append("class PaymentTransaction {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateExecuted: ").append(toIndentedString(dateExecuted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
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

