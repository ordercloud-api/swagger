package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class SpecList implements ListWrapper {
        // This declaration below of _Spec_obj_class is to force flash compiler to include this class
        private var _spec_obj_class: OrderCloud.client.model.Spec = null;
        [XmlElements(name="spec", type="OrderCloud.client.model.Spec")]
        public var spec: Array = new Array();

        public function getList(): Array{
            return spec;
        }

}

}
