package io.swagger.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class PromotionAssignment   {
  
  private String promotionID = null;
  private String buyerID = null;
  private String userID = null;
  private String userGroupID = null;

  /**
   **/
  public PromotionAssignment promotionID(String promotionID) {
    this.promotionID = promotionID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPromotionID() {
    return promotionID;
  }
  public void setPromotionID(String promotionID) {
    this.promotionID = promotionID;
  }

  /**
   **/
  public PromotionAssignment buyerID(String buyerID) {
    this.buyerID = buyerID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBuyerID() {
    return buyerID;
  }
  public void setBuyerID(String buyerID) {
    this.buyerID = buyerID;
  }

  /**
   **/
  public PromotionAssignment userID(String userID) {
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
  public PromotionAssignment userGroupID(String userGroupID) {
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
