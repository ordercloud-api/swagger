package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Order")]
    public class Order {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Type")]
        public var type: String = null;
                [XmlElement(name="FromUserID")]
        public var fromUserID: String = null;
                [XmlElement(name="BillingAddressID")]
        public var billingAddressID: String = null;
                [XmlElement(name="ShippingAddressID")]
        public var shippingAddressID: String = null;
                [XmlElement(name="Comments")]
        public var comments: String = null;
                [XmlElement(name="ShippingCost")]
        public var shippingCost: Number = NaN;
                [XmlElement(name="TaxCost")]
        public var taxCost: Number = NaN;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Order: ";
        str += " (id: " + id + ")";
        str += " (type: " + type + ")";
        str += " (fromUserID: " + fromUserID + ")";
        str += " (billingAddressID: " + billingAddressID + ")";
        str += " (shippingAddressID: " + shippingAddressID + ")";
        str += " (comments: " + comments + ")";
        str += " (shippingCost: " + shippingCost + ")";
        str += " (taxCost: " + taxCost + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
