package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-26T21:59:26.456Z")

public class CategoryProductAssignment   {
  
  private String categoryID = null;
  private String productID = null;
  private Integer listOrder = null;

  /**
   **/
  public CategoryProductAssignment categoryID(String categoryID) {
    this.categoryID = categoryID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CategoryID")
  public String getCategoryID() {
    return categoryID;
  }
  public void setCategoryID(String categoryID) {
    this.categoryID = categoryID;
  }

  /**
   **/
  public CategoryProductAssignment productID(String productID) {
    this.productID = productID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ProductID")
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }

  /**
   **/
  public CategoryProductAssignment listOrder(Integer listOrder) {
    this.listOrder = listOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ListOrder")
  public Integer getListOrder() {
    return listOrder;
  }
  public void setListOrder(Integer listOrder) {
    this.listOrder = listOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryProductAssignment categoryProductAssignment = (CategoryProductAssignment) o;
    return Objects.equals(categoryID, categoryProductAssignment.categoryID) &&
        Objects.equals(productID, categoryProductAssignment.productID) &&
        Objects.equals(listOrder, categoryProductAssignment.listOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryID, productID, listOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryProductAssignment {\n");
    
    sb.append("    categoryID: ").append(toIndentedString(categoryID)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    listOrder: ").append(toIndentedString(listOrder)).append("\n");
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

