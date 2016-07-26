package OrderCloud.client.model {


    [XmlRootNode(name="PromotionAssignment")]
    public class PromotionAssignment {
                [XmlElement(name="PromotionID")]
        public var promotionID: String = null;
                [XmlElement(name="BuyerID")]
        public var buyerID: String = null;
                [XmlElement(name="UserID")]
        public var userID: String = null;
                [XmlElement(name="UserGroupID")]
        public var userGroupID: String = null;

    public function toString(): String {
        var str: String = "PromotionAssignment: ";
        str += " (promotionID: " + promotionID + ")";
        str += " (buyerID: " + buyerID + ")";
        str += " (userID: " + userID + ")";
        str += " (userGroupID: " + userGroupID + ")";
        return str;
    }

}

}
