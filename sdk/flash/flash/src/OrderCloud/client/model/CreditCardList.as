package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class CreditCardList implements ListWrapper {
        // This declaration below of _CreditCard_obj_class is to force flash compiler to include this class
        private var _creditCard_obj_class: OrderCloud.client.model.CreditCard = null;
        [XmlElements(name="creditCard", type="OrderCloud.client.model.CreditCard")]
        public var creditCard: Array = new Array();

        public function getList(): Array{
            return creditCard;
        }

}

}
