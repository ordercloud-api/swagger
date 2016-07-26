package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class UserGroupList implements ListWrapper {
        // This declaration below of _UserGroup_obj_class is to force flash compiler to include this class
        private var _userGroup_obj_class: OrderCloud.client.model.UserGroup = null;
        [XmlElements(name="userGroup", type="OrderCloud.client.model.UserGroup")]
        public var userGroup: Array = new Array();

        public function getList(): Array{
            return userGroup;
        }

}

}
