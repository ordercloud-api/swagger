package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class PromotionAssignment   {
  
  private String promotionID = null;
  private String buyerID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  
  @JsonProperty("PromotionID")
  public String getPromotionID() {
    return promotionID;
  }
  public void setPromotionID(String promotionID) {
    this.promotionID = promotionID;
  }

  /**
   **/
  
  @JsonProperty("BuyerID")
  public String getBuyerID() {
    return buyerID;
  }
  public void setBuyerID(String buyerID) {
    this.buyerID = buyerID;
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
    PromotionAssignment promotionAssignment = (PromotionAssignment) o;
    return Objects.equals(promotionID, promotionAssignment.promotionID) &&
        Objects.equals(buyerID, promotionAssignment.buyerID) &&
        Objects.equals(userID, promotionAssignment.userID) &&
        Objects.equals(userGroupID, promotionAssignment.userGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionID, buyerID, userID, userGroupID);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

