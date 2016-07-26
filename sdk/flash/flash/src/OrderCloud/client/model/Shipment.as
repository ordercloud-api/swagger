package OrderCloud.client.model {

import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    [XmlRootNode(name="Shipment")]
    public class Shipment {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Shipper")]
        public var shipper: String = null;
                [XmlElement(name="DateShipped")]
        public var dateShipped: Date = null;
                [XmlElement(name="TrackingNumber")]
        public var trackingNumber: String = null;
                [XmlElement(name="Cost")]
        public var cost: Number = NaN;
                // This declaration below of _items_obj_class is to force flash compiler to include this class
        private var _items_obj_class: Array = null;
        [XmlElementWrapper(name="Items")]
        [XmlElements(name="items", type="Array")]
                public var items: Array = new Array();
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Shipment: ";
        str += " (id: " + id + ")";
        str += " (shipper: " + shipper + ")";
        str += " (dateShipped: " + dateShipped + ")";
        str += " (trackingNumber: " + trackingNumber + ")";
        str += " (cost: " + cost + ")";
        str += " (items: " + items + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
