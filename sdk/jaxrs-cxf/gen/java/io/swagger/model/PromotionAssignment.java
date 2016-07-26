package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PromotionAssignment", propOrder =
	{ "promotionID", "buyerID", "userID", "userGroupID"
})

@XmlRootElement(name="PromotionAssignment")
public class PromotionAssignment  {
  

  @XmlElement(name="PromotionID")
  private String promotionID = null;

  @XmlElement(name="BuyerID")
  private String buyerID = null;

  @XmlElement(name="UserID")
  private String userID = null;

  @XmlElement(name="UserGroupID")
  private String userGroupID = null;

  /**
   **/
  
  public String getPromotionID() {
    return promotionID;
  }
  public void setPromotionID(String promotionID) {
    this.promotionID = promotionID;
  }
  /**
   **/
  
  public String getBuyerID() {
    return buyerID;
  }
  public void setBuyerID(String buyerID) {
    this.buyerID = buyerID;
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
    sb.append("class PromotionAssignment {\n");
    
    sb.append("    promotionID: ").append(toIndentedString(promotionID)).append("\n");
    sb.append("    buyerID: ").append(toIndentedString(buyerID)).append("\n");
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

