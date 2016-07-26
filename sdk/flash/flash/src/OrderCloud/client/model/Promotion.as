package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Promotion")]
    public class Promotion {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Code")]
        public var code: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="UsagesRemaining")]
        public var usagesRemaining: Number = NaN;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="FinePrint")]
        public var finePrint: String = null;
                [XmlElement(name="StartDate")]
        public var startDate: Date = null;
                [XmlElement(name="ExpirationDate")]
        public var expirationDate: Date = null;
                [XmlElement(name="EligibleExpression")]
        public var eligibleExpression: String = null;
                [XmlElement(name="ValueExpression")]
        public var valueExpression: String = null;
                [XmlElement(name="CanCombine")]
        public var canCombine: Boolean = false;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Promotion: ";
        str += " (id: " + id + ")";
        str += " (code: " + code + ")";
        str += " (name: " + name + ")";
        str += " (usagesRemaining: " + usagesRemaining + ")";
        str += " (description: " + description + ")";
        str += " (finePrint: " + finePrint + ")";
        str += " (startDate: " + startDate + ")";
        str += " (expirationDate: " + expirationDate + ")";
        str += " (eligibleExpression: " + eligibleExpression + ")";
        str += " (valueExpression: " + valueExpression + ")";
        str += " (canCombine: " + canCombine + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
