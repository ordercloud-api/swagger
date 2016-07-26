package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class PaymentList implements ListWrapper {
        // This declaration below of _Payment_obj_class is to force flash compiler to include this class
        private var _payment_obj_class: OrderCloud.client.model.Payment = null;
        [XmlElements(name="payment", type="OrderCloud.client.model.Payment")]
        public var payment: Array = new Array();

        public function getList(): Array{
            return payment;
        }

}

}
