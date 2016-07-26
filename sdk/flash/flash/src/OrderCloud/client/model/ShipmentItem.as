package OrderCloud.client.model {


    [XmlRootNode(name="ShipmentItem")]
    public class ShipmentItem {
                [XmlElement(name="OrderID")]
        public var orderID: String = null;
                [XmlElement(name="LineItemID")]
        public var lineItemID: String = null;
                [XmlElement(name="QuantityShipped")]
        public var quantityShipped: Number = NaN;

    public function toString(): String {
        var str: String = "ShipmentItem: ";
        str += " (orderID: " + orderID + ")";
        str += " (lineItemID: " + lineItemID + ")";
        str += " (quantityShipped: " + quantityShipped + ")";
        return str;
    }

}

}
