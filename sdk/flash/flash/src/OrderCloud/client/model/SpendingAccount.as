package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="SpendingAccount")]
    public class SpendingAccount {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Balance")]
        public var balance: Number = NaN;
                [XmlElement(name="AllowAsPaymentMethod")]
        public var allowAsPaymentMethod: Boolean = false;
                [XmlElement(name="RedemptionCode")]
        public var redemptionCode: String = null;
                [XmlElement(name="StartDate")]
        public var startDate: Date = null;
                [XmlElement(name="EndDate")]
        public var endDate: Date = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "SpendingAccount: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (balance: " + balance + ")";
        str += " (allowAsPaymentMethod: " + allowAsPaymentMethod + ")";
        str += " (redemptionCode: " + redemptionCode + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
