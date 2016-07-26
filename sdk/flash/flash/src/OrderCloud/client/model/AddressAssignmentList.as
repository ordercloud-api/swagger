package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class AddressAssignmentList implements ListWrapper {
        // This declaration below of _AddressAssignment_obj_class is to force flash compiler to include this class
        private var _addressAssignment_obj_class: OrderCloud.client.model.AddressAssignment = null;
        [XmlElements(name="addressAssignment", type="OrderCloud.client.model.AddressAssignment")]
        public var addressAssignment: Array = new Array();

        public function getList(): Array{
            return addressAssignment;
        }

}

}
