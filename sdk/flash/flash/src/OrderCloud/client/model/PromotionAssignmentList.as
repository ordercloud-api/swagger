package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class PromotionAssignmentList implements ListWrapper {
        // This declaration below of _PromotionAssignment_obj_class is to force flash compiler to include this class
        private var _promotionAssignment_obj_class: OrderCloud.client.model.PromotionAssignment = null;
        [XmlElements(name="promotionAssignment", type="OrderCloud.client.model.PromotionAssignment")]
        public var promotionAssignment: Array = new Array();

        public function getList(): Array{
            return promotionAssignment;
        }

}

}
