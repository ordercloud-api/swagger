package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class PromotionList implements ListWrapper {
        // This declaration below of _Promotion_obj_class is to force flash compiler to include this class
        private var _promotion_obj_class: OrderCloud.client.model.Promotion = null;
        [XmlElements(name="promotion", type="OrderCloud.client.model.Promotion")]
        public var promotion: Array = new Array();

        public function getList(): Array{
            return promotion;
        }

}

}
