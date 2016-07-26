package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class CostCenterAssignmentList implements ListWrapper {
        // This declaration below of _CostCenterAssignment_obj_class is to force flash compiler to include this class
        private var _costCenterAssignment_obj_class: OrderCloud.client.model.CostCenterAssignment = null;
        [XmlElements(name="costCenterAssignment", type="OrderCloud.client.model.CostCenterAssignment")]
        public var costCenterAssignment: Array = new Array();

        public function getList(): Array{
            return costCenterAssignment;
        }

}

}
