package OrderCloud.client.model {


    [XmlRootNode(name="CategoryAssignment")]
    public class CategoryAssignment {
                [XmlElement(name="CategoryID")]
        public var categoryID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;

    public function toString(): String {
        var str: String = "CategoryAssignment: ";
        str += " (categoryID: " + categoryID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        return str;
    }

}

}
