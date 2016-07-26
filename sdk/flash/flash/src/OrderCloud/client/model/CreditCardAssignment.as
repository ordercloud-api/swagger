package OrderCloud.client.model {


    [XmlRootNode(name="CreditCardAssignment")]
    public class CreditCardAssignment {
                [XmlElement(name="CreditCardID")]
        public var creditCardID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;

    public function toString(): String {
        var str: String = "CreditCardAssignment: ";
        str += " (creditCardID: " + creditCardID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        return str;
    }

}

}
