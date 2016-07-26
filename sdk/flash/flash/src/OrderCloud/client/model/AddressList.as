package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class AddressList implements ListWrapper {
        // This declaration below of _Address_obj_class is to force flash compiler to include this class
        private var _address_obj_class: OrderCloud.client.model.Address = null;
        [XmlElements(name="address", type="OrderCloud.client.model.Address")]
        public var address: Array = new Array();

        public function getList(): Array{
            return address;
        }

}

}
