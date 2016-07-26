package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.ShipmentItem;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;




@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-07-26T21:57:43.737Z")
public class LineItem   {
  
  private String ID = null;
  private String productID = null;
  private Integer quantity = null;
  private BigDecimal unitPrice = null;
  private String costCenter = null;
  private Date dateNeeded = null;
  private String shippingAccount = null;
  private String shippingAddressID = null;
  private String shipfromAddressID = null;
  private String shipperID = null;
  private List<ShipmentItem> specs = new ArrayList<ShipmentItem>();
  private Object xp = null;

  /**
   **/
  
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  
  @JsonProperty("ProductID")
  public String getProductID() {
    return productID;
  }
  public void setProductID(String productID) {
    this.productID = productID;
  }

  /**
   **/
  
  @JsonProperty("Quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  
  @JsonProperty("UnitPrice")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   **/
  
  @JsonProperty("CostCenter")
  public String getCostCenter() {
    return costCenter;
  }
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  /**
   **/
  
  @JsonProperty("DateNeeded")
  public Date getDateNeeded() {
    return dateNeeded;
  }
  public void setDateNeeded(Date dateNeeded) {
    this.dateNeeded = dateNeeded;
  }

  /**
   **/
  
  @JsonProperty("ShippingAccount")
  public String getShippingAccount() {
    return shippingAccount;
  }
  public void setShippingAccount(String shippingAccount) {
    this.shippingAccount = shippingAccount;
  }

  /**
   **/
  
  @JsonProperty("ShippingAddressID")
  public String getShippingAddressID() {
    return shippingAddressID;
  }
  public void setShippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
  }

  /**
   **/
  
  @JsonProperty("ShipfromAddressID")
  public String getShipfromAddressID() {
    return shipfromAddressID;
  }
  public void setShipfromAddressID(String shipfromAddressID) {
    this.shipfromAddressID = shipfromAddressID;
  }

  /**
   **/
  
  @JsonProperty("ShipperID")
  public String getShipperID() {
    return shipperID;
  }
  public void setShipperID(String shipperID) {
    this.shipperID = shipperID;
  }

  /**
   **/
  
  @JsonProperty("Specs")
  public List<ShipmentItem> getSpecs() {
    return specs;
  }
  public void setSpecs(List<ShipmentItem> specs) {
    this.specs = specs;
  }

  /**
   **/
  
  @JsonProperty("xp")
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(ID, lineItem.ID) &&
        Objects.equals(productID, lineItem.productID) &&
        Objects.equals(quantity, lineItem.quantity) &&
        Objects.equals(unitPrice, lineItem.unitPrice) &&
        Objects.equals(costCenter, lineItem.costCenter) &&
        Objects.equals(dateNeeded, lineItem.dateNeeded) &&
        Objects.equals(shippingAccount, lineItem.shippingAccount) &&
        Objects.equals(shippingAddressID, lineItem.shippingAddressID) &&
        Objects.equals(shipfromAddressID, lineItem.shipfromAddressID) &&
        Objects.equals(shipperID, lineItem.shipperID) &&
        Objects.equals(specs, lineItem.specs) &&
        Objects.equals(xp, lineItem.xp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, productID, quantity, unitPrice, costCenter, dateNeeded, shippingAccount, shippingAddressID, shipfromAddressID, shipperID, specs, xp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    dateNeeded: ").append(toIndentedString(dateNeeded)).append("\n");
    sb.append("    shippingAccount: ").append(toIndentedString(shippingAccount)).append("\n");
    sb.append("    shippingAddressID: ").append(toIndentedString(shippingAddressID)).append("\n");
    sb.append("    shipfromAddressID: ").append(toIndentedString(shipfromAddressID)).append("\n");
    sb.append("    shipperID: ").append(toIndentedString(shipperID)).append("\n");
    sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
    sb.append("    xp: ").append(toIndentedString(xp)).append("\n");
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

