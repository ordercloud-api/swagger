package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class BuyerCreditCardList implements ListWrapper {
        // This declaration below of _BuyerCreditCard_obj_class is to force flash compiler to include this class
        private var _buyerCreditCard_obj_class: OrderCloud.client.model.BuyerCreditCard = null;
        [XmlElements(name="buyerCreditCard", type="OrderCloud.client.model.BuyerCreditCard")]
        public var buyerCreditCard: Array = new Array();

        public function getList(): Array{
            return buyerCreditCard;
        }

}

}
