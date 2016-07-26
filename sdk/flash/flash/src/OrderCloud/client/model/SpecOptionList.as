package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class SpecOptionList implements ListWrapper {
        // This declaration below of _SpecOption_obj_class is to force flash compiler to include this class
        private var _specOption_obj_class: OrderCloud.client.model.SpecOption = null;
        [XmlElements(name="specOption", type="OrderCloud.client.model.SpecOption")]
        public var specOption: Array = new Array();

        public function getList(): Array{
            return specOption;
        }

}

}
