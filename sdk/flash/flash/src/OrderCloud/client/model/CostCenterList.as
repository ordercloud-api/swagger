package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class CostCenterList implements ListWrapper {
        // This declaration below of _CostCenter_obj_class is to force flash compiler to include this class
        private var _costCenter_obj_class: OrderCloud.client.model.CostCenter = null;
        [XmlElements(name="costCenter", type="OrderCloud.client.model.CostCenter")]
        public var costCenter: Array = new Array();

        public function getList(): Array{
            return costCenter;
        }

}

}
