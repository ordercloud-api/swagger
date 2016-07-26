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
class LineItem {

    String ID = null

    String productID = null

    Integer quantity = null

    BigDecimal unitPrice = null

    String costCenter = null

    Date dateNeeded = null

    String shippingAccount = null

    String shippingAddressID = null

    String shipfromAddressID = null

    String shipperID = null

    List<ShipmentItem> specs = new ArrayList<ShipmentItem>()

    Object xp = null
  

}

