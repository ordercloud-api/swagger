package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class Payment   {
  
  private String ID = null;
  private String type = null;
  private String creditCardID = null;
  private String spendingAccountID = null;
  private String description = null;
  private BigDecimal amount = null;
  private Object xp = null;

  /**
   **/
  public Payment ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public Payment type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Payment creditCardID(String creditCardID) {
    this.creditCardID = creditCardID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CreditCardID")
  public String getCreditCardID() {
    return creditCardID;
  }
  public void setCreditCardID(String creditCardID) {
    this.creditCardID = creditCardID;
  }

  /**
   **/
  public Payment spendingAccountID(String spendingAccountID) {
    this.spendingAccountID = spendingAccountID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SpendingAccountID")
  public String getSpendingAccountID() {
    return spendingAccountID;
  }
  public void setSpendingAccountID(String spendingAccountID) {
    this.spendingAccountID = spendingAccountID;
  }

  /**
   **/
  public Payment description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public Payment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  public Payment xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    Payment payment = (Payment) o;
    return Objects.equals(ID, payment.ID) &&
        Objects.equals(type, payment.type) &&
        Objects.equals(creditCardID, payment.creditCardID) &&
        Objects.equals(spendingAccountID, payment.spendingAccountID) &&
        Objects.equals(description, payment.description) &&
        Objects.equals(amount, payment.amount) &&
        Objects.equals(xp, payment.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, type, creditCardID, spendingAccountID, description, amount, xp);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

