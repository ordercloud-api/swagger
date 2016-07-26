package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class Order {

    String ID = null

    String type = null

    String fromUserID = null

    String billingAddressID = null

    String shippingAddressID = null

    String comments = null

    BigDecimal shippingCost = null

    BigDecimal taxCost = null

    Object xp = null
  

}

