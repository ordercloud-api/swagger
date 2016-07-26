package io.swagger.model;

import java.math.BigDecimal;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Product", propOrder =
	{ "ID", "name", "description", "quantityMultiplier", "shipWeight", "active", "type", "inventoryEnabled", "inventoryNotificationPoint", "variantLevelInventory", "xp", "allowOrderExceedInventory", "inventoryVisible"
})

@XmlRootElement(name="Product")
public class Product  {
  

  @XmlElement(name="ID")
  private String ID = null;

  @XmlElement(name="Name")
  private String name = null;

  @XmlElement(name="Description")
  private String description = null;

  @XmlElement(name="QuantityMultiplier")
  private Integer quantityMultiplier = null;

  @XmlElement(name="ShipWeight")
  private BigDecimal shipWeight = null;

  @XmlElement(name="Active")
  private Boolean active = null;

  @XmlElement(name="Type")
  private String type = null;

  @XmlElement(name="InventoryEnabled")
  private Boolean inventoryEnabled = null;

  @XmlElement(name="InventoryNotificationPoint")
  private Integer inventoryNotificationPoint = null;

  @XmlElement(name="VariantLevelInventory")
  private Boolean variantLevelInventory = null;

  @XmlElement(name="xp")
  private Object xp = null;

  @XmlElement(name="AllowOrderExceedInventory")
  private Boolean allowOrderExceedInventory = null;

  @XmlElement(name="InventoryVisible")
  private Boolean inventoryVisible = null;

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
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  /**
   **/
  
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  /**
   **/
  
  public Integer getQuantityMultiplier() {
    return quantityMultiplier;
  }
  public void setQuantityMultiplier(Integer quantityMultiplier) {
    this.quantityMultiplier = quantityMultiplier;
  }
  /**
   **/
  
  public BigDecimal getShipWeight() {
    return shipWeight;
  }
  public void setShipWeight(BigDecimal shipWeight) {
    this.shipWeight = shipWeight;
  }
  /**
   **/
  
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }
  /**
   **/
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  /**
   **/
  
  public Boolean getInventoryEnabled() {
    return inventoryEnabled;
  }
  public void setInventoryEnabled(Boolean inventoryEnabled) {
    this.inventoryEnabled = inventoryEnabled;
  }
  /**
   **/
  
  public Integer getInventoryNotificationPoint() {
    return inventoryNotificationPoint;
  }
  public void setInventoryNotificationPoint(Integer inventoryNotificationPoint) {
    this.inventoryNotificationPoint = inventoryNotificationPoint;
  }
  /**
   **/
  
  public Boolean getVariantLevelInventory() {
    return variantLevelInventory;
  }
  public void setVariantLevelInventory(Boolean variantLevelInventory) {
    this.variantLevelInventory = variantLevelInventory;
  }
  /**
   **/
  
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }
  /**
   **/
  
  public Boolean getAllowOrderExceedInventory() {
    return allowOrderExceedInventory;
  }
  public void setAllowOrderExceedInventory(Boolean allowOrderExceedInventory) {
    this.allowOrderExceedInventory = allowOrderExceedInventory;
  }
  /**
   **/
  
  public Boolean getInventoryVisible() {
    return inventoryVisible;
  }
  public void setInventoryVisible(Boolean inventoryVisible) {
    this.inventoryVisible = inventoryVisible;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantityMultiplier: ").append(toIndentedString(quantityMultiplier)).append("\n");
    sb.append("    shipWeight: ").append(toIndentedString(shipWeight)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inventoryEnabled: ").append(toIndentedString(inventoryEnabled)).append("\n");
    sb.append("    inventoryNotificationPoint: ").append(toIndentedString(inventoryNotificationPoint)).append("\n");
    sb.append("    variantLevelInventory: ").append(toIndentedString(variantLevelInventory)).append("\n");
    sb.append("    xp: ").append(toIndentedString(xp)).append("\n");
    sb.append("    allowOrderExceedInventory: ").append(toIndentedString(allowOrderExceedInventory)).append("\n");
    sb.append("    inventoryVisible: ").append(toIndentedString(inventoryVisible)).append("\n");
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

