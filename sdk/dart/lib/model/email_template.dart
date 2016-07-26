part of swagger.api;


@Entity()
class EmailTemplate {
  
  @Property(name: 'Subject')
  String subject = null;
  

  @Property(name: 'Body')
  String body = null;
  

  @Property(name: 'ReplyEmail')
  String replyEmail = null;
  

  @Property(name: 'SendMessageType')
  bool sendMessageType = null;
  

  @Property(name: 'EmailFormatType')
  String emailFormatType = null;
  
  EmailTemplate();

  @override
  String toString()  {
    return 'EmailTemplate[subject=$subject, body=$body, replyEmail=$replyEmail, sendMessageType=$sendMessageType, emailFormatType=$emailFormatType, ]';
  }

}

