package OrderCloud.client.model {


    [XmlRootNode(name="PriceBreak")]
    public class PriceBreak {
                [XmlElement(name="Quantity")]
        public var quantity: Number = NaN;
                [XmlElement(name="Price")]
        public var price: Number = NaN;

    public function toString(): String {
        var str: String = "PriceBreak: ";
        str += " (quantity: " + quantity + ")";
        str += " (price: " + price + ")";
        return str;
    }

}

}
