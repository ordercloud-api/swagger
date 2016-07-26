package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class ProductAssignmentList implements ListWrapper {
        // This declaration below of _ProductAssignment_obj_class is to force flash compiler to include this class
        private var _productAssignment_obj_class: OrderCloud.client.model.ProductAssignment = null;
        [XmlElements(name="productAssignment", type="OrderCloud.client.model.ProductAssignment")]
        public var productAssignment: Array = new Array();

        public function getList(): Array{
            return productAssignment;
        }

}

}
