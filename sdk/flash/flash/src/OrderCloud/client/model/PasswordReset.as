package OrderCloud.client.model {


    [XmlRootNode(name="PasswordReset")]
    public class PasswordReset {
                [XmlElement(name="ClientID")]
        public var clientID: String = null;
                [XmlElement(name="Username")]
        public var username: String = null;
                [XmlElement(name="Password")]
        public var password: String = null;

    public function toString(): String {
        var str: String = "PasswordReset: ";
        str += " (clientID: " + clientID + ")";
        str += " (username: " + username + ")";
        str += " (password: " + password + ")";
        return str;
    }

}

}
