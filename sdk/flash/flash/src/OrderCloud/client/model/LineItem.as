package OrderCloud.client.model {

import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    [XmlRootNode(name="LineItem")]
    public class LineItem {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="ProductID")]
        public var productID: String = null;
                [XmlElement(name="Quantity")]
        public var quantity: Number = NaN;
                [XmlElement(name="UnitPrice")]
        public var unitPrice: Number = NaN;
                [XmlElement(name="CostCenter")]
        public var costCenter: String = null;
                [XmlElement(name="DateNeeded")]
        public var dateNeeded: Date = null;
                [XmlElement(name="ShippingAccount")]
        public var shippingAccount: String = null;
                [XmlElement(name="ShippingAddressID")]
        public var shippingAddressID: String = null;
                [XmlElement(name="ShipfromAddressID")]
        public var shipfromAddressID: String = null;
                [XmlElement(name="ShipperID")]
        public var shipperID: String = null;
                // This declaration below of _specs_obj_class is to force flash compiler to include this class
        private var _specs_obj_class: Array = null;
        [XmlElementWrapper(name="Specs")]
        [XmlElements(name="specs", type="Array")]
                public var specs: Array = new Array();
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "LineItem: ";
        str += " (id: " + id + ")";
        str += " (productID: " + productID + ")";
        str += " (quantity: " + quantity + ")";
        str += " (unitPrice: " + unitPrice + ")";
        str += " (costCenter: " + costCenter + ")";
        str += " (dateNeeded: " + dateNeeded + ")";
        str += " (shippingAccount: " + shippingAccount + ")";
        str += " (shippingAddressID: " + shippingAddressID + ")";
        str += " (shipfromAddressID: " + shipfromAddressID + ")";
        str += " (shipperID: " + shipperID + ")";
        str += " (specs: " + specs + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
