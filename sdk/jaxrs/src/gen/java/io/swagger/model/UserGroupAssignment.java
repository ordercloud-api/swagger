package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-26T21:57:33.980Z")
public class UserGroupAssignment   {
  
  private String userGroupID = null;
  private String userID = null;

  /**
   **/
  public UserGroupAssignment userGroupID(String userGroupID) {
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
  public UserGroupAssignment userID(String userID) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupAssignment userGroupAssignment = (UserGroupAssignment) o;
    return Objects.equals(userGroupID, userGroupAssignment.userGroupID) &&
        Objects.equals(userID, userGroupAssignment.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGroupID, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupAssignment {\n");
    
    sb.append("    userGroupID: ").append(toIndentedString(userGroupID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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

