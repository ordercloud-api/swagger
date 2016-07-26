package OrderCloud.client.model {

import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    [XmlRootNode(name="PriceSchedule")]
    public class PriceSchedule {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="ApplyTax")]
        public var applyTax: Boolean = false;
                [XmlElement(name="ApplyShipping")]
        public var applyShipping: Boolean = false;
                [XmlElement(name="MaxQuantity")]
        public var maxQuantity: Number = NaN;
                [XmlElement(name="UseCumulativeQuantity")]
        public var useCumulativeQuantity: Boolean = false;
                [XmlElement(name="RestrictedQuantity")]
        public var restrictedQuantity: Boolean = false;
                [XmlElement(name="OrderType")]
        public var orderType: String = null;
                // This declaration below of _priceBreaks_obj_class is to force flash compiler to include this class
        private var _priceBreaks_obj_class: Array = null;
        [XmlElementWrapper(name="PriceBreaks")]
        [XmlElements(name="priceBreaks", type="Array")]
                public var priceBreaks: Array = new Array();
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "PriceSchedule: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (applyTax: " + applyTax + ")";
        str += " (applyShipping: " + applyShipping + ")";
        str += " (maxQuantity: " + maxQuantity + ")";
        str += " (useCumulativeQuantity: " + useCumulativeQuantity + ")";
        str += " (restrictedQuantity: " + restrictedQuantity + ")";
        str += " (orderType: " + orderType + ")";
        str += " (priceBreaks: " + priceBreaks + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
