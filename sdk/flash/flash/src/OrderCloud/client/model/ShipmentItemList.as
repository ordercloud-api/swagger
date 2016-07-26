package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class ShipmentItemList implements ListWrapper {
        // This declaration below of _ShipmentItem_obj_class is to force flash compiler to include this class
        private var _shipmentItem_obj_class: OrderCloud.client.model.ShipmentItem = null;
        [XmlElements(name="shipmentItem", type="OrderCloud.client.model.ShipmentItem")]
        public var shipmentItem: Array = new Array();

        public function getList(): Array{
            return shipmentItem;
        }

}

}
