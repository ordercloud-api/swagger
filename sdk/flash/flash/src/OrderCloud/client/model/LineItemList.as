package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    public class LineItemList implements ListWrapper {
        // This declaration below of _LineItem_obj_class is to force flash compiler to include this class
        private var _lineItem_obj_class: OrderCloud.client.model.LineItem = null;
        [XmlElements(name="lineItem", type="OrderCloud.client.model.LineItem")]
        public var lineItem: Array = new Array();

        public function getList(): Array{
            return lineItem;
        }

}

}
