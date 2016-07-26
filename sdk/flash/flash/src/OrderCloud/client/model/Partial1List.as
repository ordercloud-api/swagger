package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class Partial1List implements ListWrapper {
        // This declaration below of _Partial&#x60;1_obj_class is to force flash compiler to include this class
        private var _partial&#x60;1_obj_class: OrderCloud.client.model.Partial1 = null;
        [XmlElements(name="partial&#x60;1", type="OrderCloud.client.model.Partial1")]
        public var partial&#x60;1: Array = new Array();

        public function getList(): Array{
            return partial&#x60;1;
        }

}

}
