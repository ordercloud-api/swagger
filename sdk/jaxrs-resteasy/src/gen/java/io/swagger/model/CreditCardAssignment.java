package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class CreditCardAssignment   {
  
  private String creditCardID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  
  @JsonProperty("CreditCardID")
  public String getCreditCardID() {
    return creditCardID;
  }
  public void setCreditCardID(String creditCardID) {
    this.creditCardID = creditCardID;
  }

  /**
   **/
  
  @JsonProperty("UserID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   **/
  
  @JsonProperty("UserGroupID")
  public String getUserGroupID() {
    return userGroupID;
  }
  public void setUserGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardAssignment creditCardAssignment = (CreditCardAssignment) o;
    return Objects.equals(creditCardID, creditCardAssignment.creditCardID) &&
        Objects.equals(userID, creditCardAssignment.userID) &&
        Objects.equals(userGroupID, creditCardAssignment.userGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardID, userID, userGroupID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardAssignment {\n");
    
    sb.append("    creditCardID: ").append(toIndentedString(creditCardID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    userGroupID: ").append(toIndentedString(userGroupID)).append("\n");
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

