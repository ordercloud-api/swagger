package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class VariantList implements ListWrapper {
        // This declaration below of _Variant_obj_class is to force flash compiler to include this class
        private var _variant_obj_class: OrderCloud.client.model.Variant = null;
        [XmlElements(name="variant", type="OrderCloud.client.model.Variant")]
        public var variant: Array = new Array();

        public function getList(): Array{
            return variant;
        }

}

}
