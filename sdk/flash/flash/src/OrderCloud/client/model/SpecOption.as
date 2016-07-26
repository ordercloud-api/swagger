package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="SpecOption")]
    public class SpecOption {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Value")]
        public var value: String = null;
                [XmlElement(name="ListOrder")]
        public var listOrder: Number = NaN;
                [XmlElement(name="IsOpenText")]
        public var isOpenText: Boolean = false;
                [XmlElement(name="PriceMarkupType")]
        public var priceMarkupType: String = null;
                [XmlElement(name="PriceMarkup")]
        public var priceMarkup: Number = NaN;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "SpecOption: ";
        str += " (id: " + id + ")";
        str += " (value: " + value + ")";
        str += " (listOrder: " + listOrder + ")";
        str += " (isOpenText: " + isOpenText + ")";
        str += " (priceMarkupType: " + priceMarkupType + ")";
        str += " (priceMarkup: " + priceMarkup + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
