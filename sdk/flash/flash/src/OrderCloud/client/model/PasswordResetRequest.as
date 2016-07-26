package OrderCloud.client.model {


    [XmlRootNode(name="PasswordResetRequest")]
    public class PasswordResetRequest {
                [XmlElement(name="ClientID")]
        public var clientID: String = null;
                [XmlElement(name="Email")]
        public var email: String = null;
                [XmlElement(name="Username")]
        public var username: String = null;
                [XmlElement(name="URL")]
        public var url: String = null;

    public function toString(): String {
        var str: String = "PasswordResetRequest: ";
        str += " (clientID: " + clientID + ")";
        str += " (email: " + email + ")";
        str += " (username: " + username + ")";
        str += " (url: " + url + ")";
        return str;
    }

}

}
