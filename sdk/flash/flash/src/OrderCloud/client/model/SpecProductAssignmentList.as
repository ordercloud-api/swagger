package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class SpecProductAssignmentList implements ListWrapper {
        // This declaration below of _SpecProductAssignment_obj_class is to force flash compiler to include this class
        private var _specProductAssignment_obj_class: OrderCloud.client.model.SpecProductAssignment = null;
        [XmlElements(name="specProductAssignment", type="OrderCloud.client.model.SpecProductAssignment")]
        public var specProductAssignment: Array = new Array();

        public function getList(): Array{
            return specProductAssignment;
        }

}

}
