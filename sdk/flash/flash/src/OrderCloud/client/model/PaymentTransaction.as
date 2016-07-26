package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="PaymentTransaction")]
    public class PaymentTransaction {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Type")]
        public var type: String = null;
                [XmlElement(name="DateExecuted")]
        public var dateExecuted: Date = null;
                [XmlElement(name="Amount")]
        public var amount: Number = NaN;
                [XmlElement(name="Succeeded")]
        public var succeeded: Boolean = false;
                [XmlElement(name="ResultCode")]
        public var resultCode: String = null;
                [XmlElement(name="ResultMessage")]
        public var resultMessage: String = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "PaymentTransaction: ";
        str += " (id: " + id + ")";
        str += " (type: " + type + ")";
        str += " (dateExecuted: " + dateExecuted + ")";
        str += " (amount: " + amount + ")";
        str += " (succeeded: " + succeeded + ")";
        str += " (resultCode: " + resultCode + ")";
        str += " (resultMessage: " + resultMessage + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
