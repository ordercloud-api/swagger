package OrderCloud.client.model {


    [XmlRootNode(name="UserGroupAssignment")]
    public class UserGroupAssignment {
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;

    public function toString(): String {
        var str: String = "UserGroupAssignment: ";
        str += " (userGroupID: " + userGroupID + ")";
        str += " (userID: " + userID + ")";
        return str;
    }

}

}
