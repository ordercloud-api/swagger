package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ShipmentItem;
import java.util.List;
@Canonical
class PriceSchedule {

    String ID = null

    String name = null

    Boolean applyTax = null

    Boolean applyShipping = null

    Integer maxQuantity = null

    Boolean useCumulativeQuantity = null

    Boolean restrictedQuantity = null

    String orderType = null

    List<ShipmentItem> priceBreaks = new ArrayList<ShipmentItem>()

    Object xp = null
  

}

