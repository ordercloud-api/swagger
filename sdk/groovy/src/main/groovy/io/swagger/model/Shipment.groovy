package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BigDecimal;
import io.swagger.model.Date;
import io.swagger.model.ShipmentItem;
import java.util.List;
@Canonical
class Shipment {

    String ID = null

    String shipper = null

    Date dateShipped = null

    String trackingNumber = null

    BigDecimal cost = null

    List<ShipmentItem> items = new ArrayList<ShipmentItem>()

    Object xp = null
  

}

