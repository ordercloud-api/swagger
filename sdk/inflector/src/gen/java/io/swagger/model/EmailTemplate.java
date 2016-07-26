package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-07-26T21:57:53.079Z")
public class EmailTemplate   {
  
  private String subject = null;
  private String body = null;
  private String replyEmail = null;
  private Boolean sendMessageType = null;
  private String emailFormatType = null;

  /**
   **/
  public EmailTemplate subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   **/
  public EmailTemplate body(String body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  /**
   **/
  public EmailTemplate replyEmail(String replyEmail) {
    this.replyEmail = replyEmail;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ReplyEmail")
  public String getReplyEmail() {
    return replyEmail;
  }
  public void setReplyEmail(String replyEmail) {
    this.replyEmail = replyEmail;
  }

  /**
   **/
  public EmailTemplate sendMessageType(Boolean sendMessageType) {
    this.sendMessageType = sendMessageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("SendMessageType")
  public Boolean getSendMessageType() {
    return sendMessageType;
  }
  public void setSendMessageType(Boolean sendMessageType) {
    this.sendMessageType = sendMessageType;
  }

  /**
   **/
  public EmailTemplate emailFormatType(String emailFormatType) {
    this.emailFormatType = emailFormatType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("EmailFormatType")
  public String getEmailFormatType() {
    return emailFormatType;
  }
  public void setEmailFormatType(String emailFormatType) {
    this.emailFormatType = emailFormatType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTemplate emailTemplate = (EmailTemplate) o;
    return Objects.equals(subject, emailTemplate.subject) &&
        Objects.equals(body, emailTemplate.body) &&
        Objects.equals(replyEmail, emailTemplate.replyEmail) &&
        Objects.equals(sendMessageType, emailTemplate.sendMessageType) &&
        Objects.equals(emailFormatType, emailTemplate.emailFormatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, body, replyEmail, sendMessageType, emailFormatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplate {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    replyEmail: ").append(toIndentedString(replyEmail)).append("\n");
    sb.append("    sendMessageType: ").append(toIndentedString(sendMessageType)).append("\n");
    sb.append("    emailFormatType: ").append(toIndentedString(emailFormatType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

