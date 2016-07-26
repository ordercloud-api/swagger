package io.swagger.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import java.util.Objects;


public class PriceBreak   {
  
  private Integer quantity = null;
  private BigDecimal price = null;

  /**
   **/
  public PriceBreak quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  public PriceBreak price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceBreak priceBreak = (PriceBreak) o;
    return Objects.equals(quantity, priceBreak.quantity) &&
        Objects.equals(price, priceBreak.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceBreak {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
