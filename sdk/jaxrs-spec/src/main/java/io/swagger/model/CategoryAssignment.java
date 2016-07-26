package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class CategoryAssignment   {
  
  private String categoryID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  public CategoryAssignment categoryID(String categoryID) {
    this.categoryID = categoryID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryID() {
    return categoryID;
  }
  public void setCategoryID(String categoryID) {
    this.categoryID = categoryID;
  }

  /**
   **/
  public CategoryAssignment userID(String userID) {
    this.userID = userID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   **/
  public CategoryAssignment userGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
    CategoryAssignment categoryAssignment = (CategoryAssignment) o;
    return Objects.equals(categoryID, categoryAssignment.categoryID) &&
        Objects.equals(userID, categoryAssignment.userID) &&
        Objects.equals(userGroupID, categoryAssignment.userGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryID, userID, userGroupID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryAssignment {\n");
    
    sb.append("    categoryID: ").append(toIndentedString(categoryID)).append("\n");
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
