package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class CreditCard   {
  
  private String ID = null;
  private String token = null;
  private String cardType = null;
  private String partialAccountNumber = null;
  private String cardholderName = null;
  private Date expirationDate = null;
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
  
  @JsonProperty("Token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  
  @JsonProperty("CardType")
  public String getCardType() {
    return cardType;
  }
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  /**
   **/
  
  @JsonProperty("PartialAccountNumber")
  public String getPartialAccountNumber() {
    return partialAccountNumber;
  }
  public void setPartialAccountNumber(String partialAccountNumber) {
    this.partialAccountNumber = partialAccountNumber;
  }

  /**
   **/
  
  @JsonProperty("CardholderName")
  public String getCardholderName() {
    return cardholderName;
  }
  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
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

