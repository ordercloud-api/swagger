package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CostCenterAssignment", propOrder =
	{ "costCenterID", "userID", "userGroupID"
})

@XmlRootElement(name="CostCenterAssignment")
public class CostCenterAssignment  {
  

  @XmlElement(name="CostCenterID")
  private String costCenterID = null;

  @XmlElement(name="UserID")
  private String userID = null;

  @XmlElement(name="UserGroupID")
  private String userGroupID = null;

  /**
   **/
  
  public String getCostCenterID() {
    return costCenterID;
  }
  public void setCostCenterID(String costCenterID) {
    this.costCenterID = costCenterID;
  }
  /**
   **/
  
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }
  /**
   **/
  
  public String getUserGroupID() {
    return userGroupID;
  }
  public void setUserGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

