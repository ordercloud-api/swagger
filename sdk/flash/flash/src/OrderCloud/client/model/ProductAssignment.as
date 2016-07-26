package OrderCloud.client.model {


    [XmlRootNode(name="ProductAssignment")]
    public class ProductAssignment {
                [XmlElement(name="ProductID")]
        public var productID: String = null;
                [XmlElement(name="StandardPriceScheduleID")]
        public var standardPriceScheduleID: String = null;
                [XmlElement(name="ReplenishmentPriceScheduleID")]
        public var replenishmentPriceScheduleID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;
                [XmlElement(name="BuyerID")]
        public var buyerID: String = null;

    public function toString(): String {
        var str: String = "ProductAssignment: ";
        str += " (productID: " + productID + ")";
        str += " (standardPriceScheduleID: " + standardPriceScheduleID + ")";
        str += " (replenishmentPriceScheduleID: " + replenishmentPriceScheduleID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        str += " (buyerID: " + buyerID + ")";
        return str;
    }

}

}
