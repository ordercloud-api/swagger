package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

public class SpendingAccountAssignment   {
  
  private String spendingAccountID = null;
  private String userID = null;
  private String userGroupID = null;
  private Boolean allowExceed = null;

  /**
   **/
  public SpendingAccountAssignment spendingAccountID(String spendingAccountID) {
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
  public SpendingAccountAssignment userID(String userID) {
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
  public SpendingAccountAssignment userGroupID(String userGroupID) {
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

  /**
   **/
  public SpendingAccountAssignment allowExceed(Boolean allowExceed) {
    this.allowExceed = allowExceed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AllowExceed")
  public Boolean getAllowExceed() {
    return allowExceed;
  }
  public void setAllowExceed(Boolean allowExceed) {
    this.allowExceed = allowExceed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingAccountAssignment spendingAccountAssignment = (SpendingAccountAssignment) o;
    return Objects.equals(spendingAccountID, spendingAccountAssignment.spendingAccountID) &&
        Objects.equals(userID, spendingAccountAssignment.userID) &&
        Objects.equals(userGroupID, spendingAccountAssignment.userGroupID) &&
        Objects.equals(allowExceed, spendingAccountAssignment.allowExceed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendingAccountID, userID, userGroupID, allowExceed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingAccountAssignment {\n");
    
    sb.append("    spendingAccountID: ").append(toIndentedString(spendingAccountID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    userGroupID: ").append(toIndentedString(userGroupID)).append("\n");
    sb.append("    allowExceed: ").append(toIndentedString(allowExceed)).append("\n");
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

