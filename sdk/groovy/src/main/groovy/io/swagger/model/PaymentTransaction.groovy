package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
import io.swagger.model.Date;
@Canonical
class PaymentTransaction {

    String ID = null

    String type = null

    Date dateExecuted = null

    BigDecimal amount = null

    Boolean succeeded = null

    String resultCode = null

    String resultMessage = null

    Object xp = null
  

}

