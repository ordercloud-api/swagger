package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.ShipmentItem;

    public class ImpersonateTokenRequestList implements ListWrapper {
        // This declaration below of _ImpersonateTokenRequest_obj_class is to force flash compiler to include this class
        private var _impersonateTokenRequest_obj_class: OrderCloud.client.model.ImpersonateTokenRequest = null;
        [XmlElements(name="impersonateTokenRequest", type="OrderCloud.client.model.ImpersonateTokenRequest")]
        public var impersonateTokenRequest: Array = new Array();

        public function getList(): Array{
            return impersonateTokenRequest;
        }

}

}
