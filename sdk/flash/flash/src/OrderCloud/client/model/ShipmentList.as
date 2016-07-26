package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    public class ShipmentList implements ListWrapper {
        // This declaration below of _Shipment_obj_class is to force flash compiler to include this class
        private var _shipment_obj_class: OrderCloud.client.model.Shipment = null;
        [XmlElements(name="shipment", type="OrderCloud.client.model.Shipment")]
        public var shipment: Array = new Array();

        public function getList(): Array{
            return shipment;
        }

}

}
