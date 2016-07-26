package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class BuyerCreditCard {

    String token = null

    String cardType = null

    String partialAccountNumber = null

    String cardholderName = null

    Date expirationDate = null

    Object xp = null
  

}

