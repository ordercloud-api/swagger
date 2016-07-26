package io.swagger.model;

import org.joda.time.LocalDate;



import io.swagger.annotations.*;
import java.util.Objects;


public class BuyerCreditCard   {
  
  private String token = null;
  private String cardType = null;
  private String partialAccountNumber = null;
  private String cardholderName = null;
  private LocalDate expirationDate = null;
  private Object xp = null;

  /**
   **/
  public BuyerCreditCard token(String token) {
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
  public BuyerCreditCard cardType(String cardType) {
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
  public BuyerCreditCard partialAccountNumber(String partialAccountNumber) {
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
  public BuyerCreditCard cardholderName(String cardholderName) {
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
  public BuyerCreditCard expirationDate(LocalDate expirationDate) {
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
  public BuyerCreditCard xp(Object xp) {
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
    BuyerCreditCard buyerCreditCard = (BuyerCreditCard) o;
    return Objects.equals(token, buyerCreditCard.token) &&
        Objects.equals(cardType, buyerCreditCard.cardType) &&
        Objects.equals(partialAccountNumber, buyerCreditCard.partialAccountNumber) &&
        Objects.equals(cardholderName, buyerCreditCard.cardholderName) &&
        Objects.equals(expirationDate, buyerCreditCard.expirationDate) &&
        Objects.equals(xp, buyerCreditCard.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cardType, partialAccountNumber, cardholderName, expirationDate, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerCreditCard {\n");
    
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
