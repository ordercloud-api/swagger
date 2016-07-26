package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
import io.swagger.model.Date;
@Canonical
class SpendingAccount {

    String ID = null

    String name = null

    BigDecimal balance = null

    Boolean allowAsPaymentMethod = null

    String redemptionCode = null

    Date startDate = null

    Date endDate = null

    Object xp = null
  

}

