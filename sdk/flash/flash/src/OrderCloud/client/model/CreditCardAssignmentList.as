package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class CreditCardAssignmentList implements ListWrapper {
        // This declaration below of _CreditCardAssignment_obj_class is to force flash compiler to include this class
        private var _creditCardAssignment_obj_class: OrderCloud.client.model.CreditCardAssignment = null;
        [XmlElements(name="creditCardAssignment", type="OrderCloud.client.model.CreditCardAssignment")]
        public var creditCardAssignment: Array = new Array();

        public function getList(): Array{
            return creditCardAssignment;
        }

}

}
