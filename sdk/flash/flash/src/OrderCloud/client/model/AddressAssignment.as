package OrderCloud.client.model {


    [XmlRootNode(name="AddressAssignment")]
    public class AddressAssignment {
                [XmlElement(name="AddressID")]
        public var addressID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;
                [XmlElement(name="IsShipping")]
        public var isShipping: Boolean = false;
                [XmlElement(name="IsBilling")]
        public var isBilling: Boolean = false;

    public function toString(): String {
        var str: String = "AddressAssignment: ";
        str += " (addressID: " + addressID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        str += " (isShipping: " + isShipping + ")";
        str += " (isBilling: " + isBilling + ")";
        return str;
    }

}

}
