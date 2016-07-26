package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class SpendingAccountList implements ListWrapper {
        // This declaration below of _SpendingAccount_obj_class is to force flash compiler to include this class
        private var _spendingAccount_obj_class: OrderCloud.client.model.SpendingAccount = null;
        [XmlElements(name="spendingAccount", type="OrderCloud.client.model.SpendingAccount")]
        public var spendingAccount: Array = new Array();

        public function getList(): Array{
            return spendingAccount;
        }

}

}
