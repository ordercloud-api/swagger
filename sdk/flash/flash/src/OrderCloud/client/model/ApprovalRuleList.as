package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class ApprovalRuleList implements ListWrapper {
        // This declaration below of _ApprovalRule_obj_class is to force flash compiler to include this class
        private var _approvalRule_obj_class: OrderCloud.client.model.ApprovalRule = null;
        [XmlElements(name="approvalRule", type="OrderCloud.client.model.ApprovalRule")]
        public var approvalRule: Array = new Array();

        public function getList(): Array{
            return approvalRule;
        }

}

}
