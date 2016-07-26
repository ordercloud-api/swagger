package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class BuyerList implements ListWrapper {
        // This declaration below of _Buyer_obj_class is to force flash compiler to include this class
        private var _buyer_obj_class: OrderCloud.client.model.Buyer = null;
        [XmlElements(name="buyer", type="OrderCloud.client.model.Buyer")]
        public var buyer: Array = new Array();

        public function getList(): Array{
            return buyer;
        }

}

}
