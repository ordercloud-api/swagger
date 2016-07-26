package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class Payment {

    String ID = null

    String type = null

    String creditCardID = null

    String spendingAccountID = null

    String description = null

    BigDecimal amount = null

    Object xp = null
  

}

