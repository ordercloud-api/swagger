package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class CategoryProductAssignmentList implements ListWrapper {
        // This declaration below of _CategoryProductAssignment_obj_class is to force flash compiler to include this class
        private var _categoryProductAssignment_obj_class: OrderCloud.client.model.CategoryProductAssignment = null;
        [XmlElements(name="categoryProductAssignment", type="OrderCloud.client.model.CategoryProductAssignment")]
        public var categoryProductAssignment: Array = new Array();

        public function getList(): Array{
            return categoryProductAssignment;
        }

}

}
