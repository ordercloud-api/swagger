package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class PriceBreakList implements ListWrapper {
        // This declaration below of _PriceBreak_obj_class is to force flash compiler to include this class
        private var _priceBreak_obj_class: OrderCloud.client.model.PriceBreak = null;
        [XmlElements(name="priceBreak", type="OrderCloud.client.model.PriceBreak")]
        public var priceBreak: Array = new Array();

        public function getList(): Array{
            return priceBreak;
        }

}

}
