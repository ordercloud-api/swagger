package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
public class PaymentTransaction   {
  
  private String ID = null;
  private String type = null;
  private Date dateExecuted = null;
  private BigDecimal amount = null;
  private Boolean succeeded = null;
  private String resultCode = null;
  private String resultMessage = null;
  private Object xp = null;

  /**
   **/
  public PaymentTransaction ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public PaymentTransaction type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public PaymentTransaction dateExecuted(Date dateExecuted) {
    this.dateExecuted = dateExecuted;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("DateExecuted")
  public Date getDateExecuted() {
    return dateExecuted;
  }
  public void setDateExecuted(Date dateExecuted) {
    this.dateExecuted = dateExecuted;
  }

  /**
   **/
  public PaymentTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  public PaymentTransaction succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Succeeded")
  public Boolean getSucceeded() {
    return succeeded;
  }
  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }

  /**
   **/
  public PaymentTransaction resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ResultCode")
  public String getResultCode() {
    return resultCode;
  }
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  /**
   **/
  public PaymentTransaction resultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ResultMessage")
  public String getResultMessage() {
    return resultMessage;
  }
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  /**
   **/
  public PaymentTransaction xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
    PaymentTransaction paymentTransaction = (PaymentTransaction) o;
    return Objects.equals(ID, paymentTransaction.ID) &&
        Objects.equals(type, paymentTransaction.type) &&
        Objects.equals(dateExecuted, paymentTransaction.dateExecuted) &&
        Objects.equals(amount, paymentTransaction.amount) &&
        Objects.equals(succeeded, paymentTransaction.succeeded) &&
        Objects.equals(resultCode, paymentTransaction.resultCode) &&
        Objects.equals(resultMessage, paymentTransaction.resultMessage) &&
        Objects.equals(xp, paymentTransaction.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, type, dateExecuted, amount, succeeded, resultCode, resultMessage, xp);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

