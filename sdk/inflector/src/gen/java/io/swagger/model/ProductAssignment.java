package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
public class ProductAssignment   {
  
  private String productID = null;
  private String standardPriceScheduleID = null;
  private String replenishmentPriceScheduleID = null;
  private String userID = null;
  private String userGroupID = null;
  private String buyerID = null;

  /**
   **/
  public ProductAssignment productID(String productID) {
    this.productID = productID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ProductID")
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }

  /**
   **/
  public ProductAssignment standardPriceScheduleID(String standardPriceScheduleID) {
    this.standardPriceScheduleID = standardPriceScheduleID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("StandardPriceScheduleID")
  public String getStandardPriceScheduleID() {
    return standardPriceScheduleID;
  }
  public void setStandardPriceScheduleID(String standardPriceScheduleID) {
    this.standardPriceScheduleID = standardPriceScheduleID;
  }

  /**
   **/
  public ProductAssignment replenishmentPriceScheduleID(String replenishmentPriceScheduleID) {
    this.replenishmentPriceScheduleID = replenishmentPriceScheduleID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ReplenishmentPriceScheduleID")
  public String getReplenishmentPriceScheduleID() {
    return replenishmentPriceScheduleID;
  }
  public void setReplenishmentPriceScheduleID(String replenishmentPriceScheduleID) {
    this.replenishmentPriceScheduleID = replenishmentPriceScheduleID;
  }

  /**
   **/
  public ProductAssignment userID(String userID) {
    this.userID = userID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("UserID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   **/
  public ProductAssignment userGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("UserGroupID")
  public String getUserGroupID() {
    return userGroupID;
  }
  public void setUserGroupID(String userGroupID) {
    this.userGroupID = userGroupID;
  }

  /**
   **/
  public ProductAssignment buyerID(String buyerID) {
    this.buyerID = buyerID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("BuyerID")
  public String getBuyerID() {
    return buyerID;
  }
  public void setBuyerID(String buyerID) {
    this.buyerID = buyerID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAssignment productAssignment = (ProductAssignment) o;
    return Objects.equals(productID, productAssignment.productID) &&
        Objects.equals(standardPriceScheduleID, productAssignment.standardPriceScheduleID) &&
        Objects.equals(replenishmentPriceScheduleID, productAssignment.replenishmentPriceScheduleID) &&
        Objects.equals(userID, productAssignment.userID) &&
        Objects.equals(userGroupID, productAssignment.userGroupID) &&
        Objects.equals(buyerID, productAssignment.buyerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productID, standardPriceScheduleID, replenishmentPriceScheduleID, userID, userGroupID, buyerID);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

