package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class PaymentTransactionList implements ListWrapper {
        // This declaration below of _PaymentTransaction_obj_class is to force flash compiler to include this class
        private var _paymentTransaction_obj_class: OrderCloud.client.model.PaymentTransaction = null;
        [XmlElements(name="paymentTransaction", type="OrderCloud.client.model.PaymentTransaction")]
        public var paymentTransaction: Array = new Array();

        public function getList(): Array{
            return paymentTransaction;
        }

}

}
