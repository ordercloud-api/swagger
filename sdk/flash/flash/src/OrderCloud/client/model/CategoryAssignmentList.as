package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class CategoryAssignmentList implements ListWrapper {
        // This declaration below of _CategoryAssignment_obj_class is to force flash compiler to include this class
        private var _categoryAssignment_obj_class: OrderCloud.client.model.CategoryAssignment = null;
        [XmlElements(name="categoryAssignment", type="OrderCloud.client.model.CategoryAssignment")]
        public var categoryAssignment: Array = new Array();

        public function getList(): Array{
            return categoryAssignment;
        }

}

}
