package OrderCloud.client.model {


    [XmlRootNode(name="CostCenterAssignment")]
    public class CostCenterAssignment {
                [XmlElement(name="CostCenterID")]
        public var costCenterID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;

    public function toString(): String {
        var str: String = "CostCenterAssignment: ";
        str += " (costCenterID: " + costCenterID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        return str;
    }

}

}
