package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Payment")]
    public class Payment {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Type")]
        public var type: String = null;
                [XmlElement(name="CreditCardID")]
        public var creditCardID: String = null;
                [XmlElement(name="SpendingAccountID")]
        public var spendingAccountID: String = null;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="Amount")]
        public var amount: Number = NaN;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Payment: ";
        str += " (id: " + id + ")";
        str += " (type: " + type + ")";
        str += " (creditCardID: " + creditCardID + ")";
        str += " (spendingAccountID: " + spendingAccountID + ")";
        str += " (description: " + description + ")";
        str += " (amount: " + amount + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
