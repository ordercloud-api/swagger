package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

public class CreditCardAssignment   {
  
  private String creditCardID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  public CreditCardAssignment creditCardID(String creditCardID) {
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
  public CreditCardAssignment userID(String userID) {
    this.userID = userID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UserID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   **/
  public CreditCardAssignment userGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

