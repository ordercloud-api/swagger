package io.swagger.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EmailTemplate", propOrder =
	{ "subject", "body", "replyEmail", "sendMessageType", "emailFormatType"
})

@XmlRootElement(name="EmailTemplate")
public class EmailTemplate  {
  

  @XmlElement(name="Subject")
  private String subject = null;

  @XmlElement(name="Body")
  private String body = null;

  @XmlElement(name="ReplyEmail")
  private String replyEmail = null;

  @XmlElement(name="SendMessageType")
  private Boolean sendMessageType = null;

  @XmlElement(name="EmailFormatType")
  private String emailFormatType = null;

  /**
   **/
  
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
  /**
   **/
  
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }
  /**
   **/
  
  public String getReplyEmail() {
    return replyEmail;
  }
  public void setReplyEmail(String replyEmail) {
    this.replyEmail = replyEmail;
  }
  /**
   **/
  
  public Boolean getSendMessageType() {
    return sendMessageType;
  }
  public void setSendMessageType(Boolean sendMessageType) {
    this.sendMessageType = sendMessageType;
  }
  /**
   **/
  
  public String getEmailFormatType() {
    return emailFormatType;
  }
  public void setEmailFormatType(String emailFormatType) {
    this.emailFormatType = emailFormatType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

