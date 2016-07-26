package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AddressAssignment", propOrder =
	{ "addressID", "userID", "userGroupID", "isShipping", "isBilling"
})

@XmlRootElement(name="AddressAssignment")
public class AddressAssignment  {
  

  @XmlElement(name="AddressID")
  private String addressID = null;

  @XmlElement(name="UserID")
  private String userID = null;

  @XmlElement(name="UserGroupID")
  private String userGroupID = null;

  @XmlElement(name="IsShipping")
  private Boolean isShipping = null;

  @XmlElement(name="IsBilling")
  private Boolean isBilling = null;

  /**
   **/
  
  public String getAddressID() {
    return addressID;
  }
  public void setAddressID(String addressID) {
    this.addressID = addressID;
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
  /**
   **/
  
  public Boolean getIsShipping() {
    return isShipping;
  }
  public void setIsShipping(Boolean isShipping) {
    this.isShipping = isShipping;
  }
  /**
   **/
  
  public Boolean getIsBilling() {
    return isBilling;
  }
  public void setIsBilling(Boolean isBilling) {
    this.isBilling = isBilling;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressAssignment {\n");
    
    sb.append("    addressID: ").append(toIndentedString(addressID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    userGroupID: ").append(toIndentedString(userGroupID)).append("\n");
    sb.append("    isShipping: ").append(toIndentedString(isShipping)).append("\n");
    sb.append("    isBilling: ").append(toIndentedString(isBilling)).append("\n");
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

