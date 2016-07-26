package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ShipmentItem;
import java.util.List;
@Canonical
class ImpersonateTokenRequest {

    String clientID = null

    List<ShipmentItem> claims = new ArrayList<ShipmentItem>()
  

}

