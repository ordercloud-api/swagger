package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class BuyerAddressList implements ListWrapper {
        // This declaration below of _BuyerAddress_obj_class is to force flash compiler to include this class
        private var _buyerAddress_obj_class: OrderCloud.client.model.BuyerAddress = null;
        [XmlElements(name="buyerAddress", type="OrderCloud.client.model.BuyerAddress")]
        public var buyerAddress: Array = new Array();

        public function getList(): Array{
            return buyerAddress;
        }

}

}
