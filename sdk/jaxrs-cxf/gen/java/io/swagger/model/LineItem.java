package io.swagger.model;

import io.swagger.model.ShipmentItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "LineItem", propOrder =
	{ "ID", "productID", "quantity", "unitPrice", "costCenter", "dateNeeded", "shippingAccount", "shippingAddressID", "shipfromAddressID", "shipperID", "specs", "xp"
})

@XmlRootElement(name="LineItem")
public class LineItem  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="ProductID")
  private String productID = null;

  @XmlElement(name="Quantity")
  private Integer quantity = null;

  @XmlElement(name="UnitPrice")
  private BigDecimal unitPrice = null;

  @XmlElement(name="CostCenter")
  private String costCenter = null;

  @XmlElement(name="DateNeeded")
  private LocalDate dateNeeded = null;

  @XmlElement(name="ShippingAccount")
  private String shippingAccount = null;

  @XmlElement(name="ShippingAddressID")
  private String shippingAddressID = null;

  @XmlElement(name="ShipfromAddressID")
  private String shipfromAddressID = null;

  @XmlElement(name="ShipperID")
  private String shipperID = null;

  @XmlElement(name="Specs")
  private List<ShipmentItem> specs = new ArrayList<ShipmentItem>();

  @XmlElement(name="xp")
  private Object xp = null;

  /**
   **/
  
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }
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
  
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  /**
   **/
  
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }
  /**
   **/
  
  public String getCostCenter() {
    return costCenter;
  }
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }
  /**
   **/
  
  public LocalDate getDateNeeded() {
    return dateNeeded;
  }
  public void setDateNeeded(LocalDate dateNeeded) {
    this.dateNeeded = dateNeeded;
  }
  /**
   **/
  
  public String getShippingAccount() {
    return shippingAccount;
  }
  public void setShippingAccount(String shippingAccount) {
    this.shippingAccount = shippingAccount;
  }
  /**
   **/
  
  public String getShippingAddressID() {
    return shippingAddressID;
  }
  public void setShippingAddressID(String shippingAddressID) {
    this.shippingAddressID = shippingAddressID;
  }
  /**
   **/
  
  public String getShipfromAddressID() {
    return shipfromAddressID;
  }
  public void setShipfromAddressID(String shipfromAddressID) {
    this.shipfromAddressID = shipfromAddressID;
  }
  /**
   **/
  
  public String getShipperID() {
    return shipperID;
  }
  public void setShipperID(String shipperID) {
    this.shipperID = shipperID;
  }
  /**
   **/
  
  public List<ShipmentItem> getSpecs() {
    return specs;
  }
  public void setSpecs(List<ShipmentItem> specs) {
    this.specs = specs;
  }
  /**
   **/
  
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

