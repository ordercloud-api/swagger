package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class EmailTemplate {

    String subject = null

    String body = null

    String replyEmail = null

    Boolean sendMessageType = null

    String emailFormatType = null
  

}

