package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class SpendingAccountAssignmentList implements ListWrapper {
        // This declaration below of _SpendingAccountAssignment_obj_class is to force flash compiler to include this class
        private var _spendingAccountAssignment_obj_class: OrderCloud.client.model.SpendingAccountAssignment = null;
        [XmlElements(name="spendingAccountAssignment", type="OrderCloud.client.model.SpendingAccountAssignment")]
        public var spendingAccountAssignment: Array = new Array();

        public function getList(): Array{
            return spendingAccountAssignment;
        }

}

}
