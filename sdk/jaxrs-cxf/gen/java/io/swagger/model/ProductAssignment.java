package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProductAssignment", propOrder =
	{ "productID", "standardPriceScheduleID", "replenishmentPriceScheduleID", "userID", "userGroupID", "buyerID"
})

@XmlRootElement(name="ProductAssignment")
public class ProductAssignment  {
  

  @XmlElement(name="ProductID")
  private String productID = null;

  @XmlElement(name="StandardPriceScheduleID")
  private String standardPriceScheduleID = null;

  @XmlElement(name="ReplenishmentPriceScheduleID")
  private String replenishmentPriceScheduleID = null;

  @XmlElement(name="UserID")
  private String userID = null;

  @XmlElement(name="UserGroupID")
  private String userGroupID = null;

  @XmlElement(name="BuyerID")
  private String buyerID = null;

  /**
   **/
  
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }
  /**
   **/
  
  public String getStandardPriceScheduleID() {
    return standardPriceScheduleID;
  }
  public void setStandardPriceScheduleID(String standardPriceScheduleID) {
    this.standardPriceScheduleID = standardPriceScheduleID;
  }
  /**
   **/
  
  public String getReplenishmentPriceScheduleID() {
    return replenishmentPriceScheduleID;
  }
  public void setReplenishmentPriceScheduleID(String replenishmentPriceScheduleID) {
    this.replenishmentPriceScheduleID = replenishmentPriceScheduleID;
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
  
  public String getBuyerID() {
    return buyerID;
  }
  public void setBuyerID(String buyerID) {
    this.buyerID = buyerID;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAssignment {\n");
    
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    standardPriceScheduleID: ").append(toIndentedString(standardPriceScheduleID)).append("\n");
    sb.append("    replenishmentPriceScheduleID: ").append(toIndentedString(replenishmentPriceScheduleID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    userGroupID: ").append(toIndentedString(userGroupID)).append("\n");
    sb.append("    buyerID: ").append(toIndentedString(buyerID)).append("\n");
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

