package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class OrderList implements ListWrapper {
        // This declaration below of _Order_obj_class is to force flash compiler to include this class
        private var _order_obj_class: OrderCloud.client.model.Order = null;
        [XmlElements(name="order", type="OrderCloud.client.model.Order")]
        public var order: Array = new Array();

        public function getList(): Array{
            return order;
        }

}

}
