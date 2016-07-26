package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class CostCenterAssignment   {
  
  private String costCenterID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  public CostCenterAssignment costCenterID(String costCenterID) {
    this.costCenterID = costCenterID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCostCenterID() {
    return costCenterID;
  }
  public void setCostCenterID(String costCenterID) {
    this.costCenterID = costCenterID;
  }

  /**
   **/
  public CostCenterAssignment userID(String userID) {
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
  public CostCenterAssignment userGroupID(String userGroupID) {
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
    CostCenterAssignment costCenterAssignment = (CostCenterAssignment) o;
    return Objects.equals(costCenterID, costCenterAssignment.costCenterID) &&
        Objects.equals(userID, costCenterAssignment.userID) &&
        Objects.equals(userGroupID, costCenterAssignment.userGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCenterID, userID, userGroupID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostCenterAssignment {\n");
    
    sb.append("    costCenterID: ").append(toIndentedString(costCenterID)).append("\n");
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
