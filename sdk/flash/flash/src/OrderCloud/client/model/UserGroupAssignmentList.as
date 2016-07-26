package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class UserGroupAssignmentList implements ListWrapper {
        // This declaration below of _UserGroupAssignment_obj_class is to force flash compiler to include this class
        private var _userGroupAssignment_obj_class: OrderCloud.client.model.UserGroupAssignment = null;
        [XmlElements(name="userGroupAssignment", type="OrderCloud.client.model.UserGroupAssignment")]
        public var userGroupAssignment: Array = new Array();

        public function getList(): Array{
            return userGroupAssignment;
        }

}

}
