package io.swagger.model;

import java.math.BigDecimal;
import org.joda.time.LocalDate;



import io.swagger.annotations.*;
import java.util.Objects;


public class SpendingAccount   {
  
  private String ID = null;
  private String name = null;
  private BigDecimal balance = null;
  private Boolean allowAsPaymentMethod = null;
  private String redemptionCode = null;
  private LocalDate startDate = null;
  private LocalDate endDate = null;
  private Object xp = null;

  /**
   **/
  public SpendingAccount ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public SpendingAccount name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public SpendingAccount balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  /**
   **/
  public SpendingAccount allowAsPaymentMethod(Boolean allowAsPaymentMethod) {
    this.allowAsPaymentMethod = allowAsPaymentMethod;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowAsPaymentMethod() {
    return allowAsPaymentMethod;
  }
  public void setAllowAsPaymentMethod(Boolean allowAsPaymentMethod) {
    this.allowAsPaymentMethod = allowAsPaymentMethod;
  }

  /**
   **/
  public SpendingAccount redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRedemptionCode() {
    return redemptionCode;
  }
  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  /**
   **/
  public SpendingAccount startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  public SpendingAccount endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  public SpendingAccount xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
    SpendingAccount spendingAccount = (SpendingAccount) o;
    return Objects.equals(ID, spendingAccount.ID) &&
        Objects.equals(name, spendingAccount.name) &&
        Objects.equals(balance, spendingAccount.balance) &&
        Objects.equals(allowAsPaymentMethod, spendingAccount.allowAsPaymentMethod) &&
        Objects.equals(redemptionCode, spendingAccount.redemptionCode) &&
        Objects.equals(startDate, spendingAccount.startDate) &&
        Objects.equals(endDate, spendingAccount.endDate) &&
        Objects.equals(xp, spendingAccount.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, balance, allowAsPaymentMethod, redemptionCode, startDate, endDate, xp);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
