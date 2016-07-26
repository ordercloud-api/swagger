package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class PasswordResetList implements ListWrapper {
        // This declaration below of _PasswordReset_obj_class is to force flash compiler to include this class
        private var _passwordReset_obj_class: OrderCloud.client.model.PasswordReset = null;
        [XmlElements(name="passwordReset", type="OrderCloud.client.model.PasswordReset")]
        public var passwordReset: Array = new Array();

        public function getList(): Array{
            return passwordReset;
        }

}

}
