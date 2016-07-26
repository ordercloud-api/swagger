package io.swagger.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import java.util.Objects;


public class Product   {
  
  private String ID = null;
  private String name = null;
  private String description = null;
  private Integer quantityMultiplier = null;
  private BigDecimal shipWeight = null;
  private Boolean active = null;
  private String type = null;
  private Boolean inventoryEnabled = null;
  private Integer inventoryNotificationPoint = null;
  private Boolean variantLevelInventory = null;
  private Object xp = null;
  private Boolean allowOrderExceedInventory = null;
  private Boolean inventoryVisible = null;

  /**
   **/
  public Product ID(String ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  /**
   **/
  public Product name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Product description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public Product quantityMultiplier(Integer quantityMultiplier) {
    this.quantityMultiplier = quantityMultiplier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getQuantityMultiplier() {
    return quantityMultiplier;
  }
  public void setQuantityMultiplier(Integer quantityMultiplier) {
    this.quantityMultiplier = quantityMultiplier;
  }

  /**
   **/
  public Product shipWeight(BigDecimal shipWeight) {
    this.shipWeight = shipWeight;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getShipWeight() {
    return shipWeight;
  }
  public void setShipWeight(BigDecimal shipWeight) {
    this.shipWeight = shipWeight;
  }

  /**
   **/
  public Product active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  public Product type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Product inventoryEnabled(Boolean inventoryEnabled) {
    this.inventoryEnabled = inventoryEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInventoryEnabled() {
    return inventoryEnabled;
  }
  public void setInventoryEnabled(Boolean inventoryEnabled) {
    this.inventoryEnabled = inventoryEnabled;
  }

  /**
   **/
  public Product inventoryNotificationPoint(Integer inventoryNotificationPoint) {
    this.inventoryNotificationPoint = inventoryNotificationPoint;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getInventoryNotificationPoint() {
    return inventoryNotificationPoint;
  }
  public void setInventoryNotificationPoint(Integer inventoryNotificationPoint) {
    this.inventoryNotificationPoint = inventoryNotificationPoint;
  }

  /**
   **/
  public Product variantLevelInventory(Boolean variantLevelInventory) {
    this.variantLevelInventory = variantLevelInventory;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVariantLevelInventory() {
    return variantLevelInventory;
  }
  public void setVariantLevelInventory(Boolean variantLevelInventory) {
    this.variantLevelInventory = variantLevelInventory;
  }

  /**
   **/
  public Product xp(Object xp) {
    this.xp = xp;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Object getXp() {
    return xp;
  }
  public void setXp(Object xp) {
    this.xp = xp;
  }

  /**
   **/
  public Product allowOrderExceedInventory(Boolean allowOrderExceedInventory) {
    this.allowOrderExceedInventory = allowOrderExceedInventory;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowOrderExceedInventory() {
    return allowOrderExceedInventory;
  }
  public void setAllowOrderExceedInventory(Boolean allowOrderExceedInventory) {
    this.allowOrderExceedInventory = allowOrderExceedInventory;
  }

  /**
   **/
  public Product inventoryVisible(Boolean inventoryVisible) {
    this.inventoryVisible = inventoryVisible;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInventoryVisible() {
    return inventoryVisible;
  }
  public void setInventoryVisible(Boolean inventoryVisible) {
    this.inventoryVisible = inventoryVisible;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(ID, product.ID) &&
        Objects.equals(name, product.name) &&
        Objects.equals(description, product.description) &&
        Objects.equals(quantityMultiplier, product.quantityMultiplier) &&
        Objects.equals(shipWeight, product.shipWeight) &&
        Objects.equals(active, product.active) &&
        Objects.equals(type, product.type) &&
        Objects.equals(inventoryEnabled, product.inventoryEnabled) &&
        Objects.equals(inventoryNotificationPoint, product.inventoryNotificationPoint) &&
        Objects.equals(variantLevelInventory, product.variantLevelInventory) &&
        Objects.equals(xp, product.xp) &&
        Objects.equals(allowOrderExceedInventory, product.allowOrderExceedInventory) &&
        Objects.equals(inventoryVisible, product.inventoryVisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, description, quantityMultiplier, shipWeight, active, type, inventoryEnabled, inventoryNotificationPoint, variantLevelInventory, xp, allowOrderExceedInventory, inventoryVisible);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
