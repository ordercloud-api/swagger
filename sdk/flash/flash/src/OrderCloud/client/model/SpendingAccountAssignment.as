package OrderCloud.client.model {


    [XmlRootNode(name="SpendingAccountAssignment")]
    public class SpendingAccountAssignment {
                [XmlElement(name="SpendingAccountID")]
        public var spendingAccountID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;
                [XmlElement(name="AllowExceed")]
        public var allowExceed: Boolean = false;

    public function toString(): String {
        var str: String = "SpendingAccountAssignment: ";
        str += " (spendingAccountID: " + spendingAccountID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        str += " (allowExceed: " + allowExceed + ")";
        return str;
    }

}

}
