package io.swagger.model;

import org.joda.time.LocalDate;



import io.swagger.annotations.*;
import java.util.Objects;


public class CreditCard   {
  
  private String ID = null;
  private String token = null;
  private String cardType = null;
  private String partialAccountNumber = null;
  private String cardholderName = null;
  private LocalDate expirationDate = null;
  private Object xp = null;

  /**
   **/
  public CreditCard ID(String ID) {
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
  public CreditCard token(String token) {
    this.token = token;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  public CreditCard cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCardType() {
    return cardType;
  }
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  /**
   **/
  public CreditCard partialAccountNumber(String partialAccountNumber) {
    this.partialAccountNumber = partialAccountNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPartialAccountNumber() {
    return partialAccountNumber;
  }
  public void setPartialAccountNumber(String partialAccountNumber) {
    this.partialAccountNumber = partialAccountNumber;
  }

  /**
   **/
  public CreditCard cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCardholderName() {
    return cardholderName;
  }
  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  /**
   **/
  public CreditCard expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   **/
  public CreditCard xp(Object xp) {
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
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(ID, creditCard.ID) &&
        Objects.equals(token, creditCard.token) &&
        Objects.equals(cardType, creditCard.cardType) &&
        Objects.equals(partialAccountNumber, creditCard.partialAccountNumber) &&
        Objects.equals(cardholderName, creditCard.cardholderName) &&
        Objects.equals(expirationDate, creditCard.expirationDate) &&
        Objects.equals(xp, creditCard.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, token, cardType, partialAccountNumber, cardholderName, expirationDate, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    partialAccountNumber: ").append(toIndentedString(partialAccountNumber)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
