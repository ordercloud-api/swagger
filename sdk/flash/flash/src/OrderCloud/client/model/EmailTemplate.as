package OrderCloud.client.model {


    [XmlRootNode(name="EmailTemplate")]
    public class EmailTemplate {
                [XmlElement(name="Subject")]
        public var subject: String = null;
                [XmlElement(name="Body")]
        public var body: String = null;
                [XmlElement(name="ReplyEmail")]
        public var replyEmail: String = null;
                [XmlElement(name="SendMessageType")]
        public var sendMessageType: Boolean = false;
                [XmlElement(name="EmailFormatType")]
        public var emailFormatType: String = null;

    public function toString(): String {
        var str: String = "EmailTemplate: ";
        str += " (subject: " + subject + ")";
        str += " (body: " + body + ")";
        str += " (replyEmail: " + replyEmail + ")";
        str += " (sendMessageType: " + sendMessageType + ")";
        str += " (emailFormatType: " + emailFormatType + ")";
        return str;
    }

}

}
