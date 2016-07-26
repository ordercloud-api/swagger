package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class Product {

    String ID = null

    String name = null

    String description = null

    Integer quantityMultiplier = null

    BigDecimal shipWeight = null

    Boolean active = null

    String type = null

    Boolean inventoryEnabled = null

    Integer inventoryNotificationPoint = null

    Boolean variantLevelInventory = null

    Object xp = null

    Boolean allowOrderExceedInventory = null

    Boolean inventoryVisible = null
  

}

