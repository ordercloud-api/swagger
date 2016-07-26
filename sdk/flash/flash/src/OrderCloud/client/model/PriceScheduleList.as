package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.ShipmentItem;

    public class PriceScheduleList implements ListWrapper {
        // This declaration below of _PriceSchedule_obj_class is to force flash compiler to include this class
        private var _priceSchedule_obj_class: OrderCloud.client.model.PriceSchedule = null;
        [XmlElements(name="priceSchedule", type="OrderCloud.client.model.PriceSchedule")]
        public var priceSchedule: Array = new Array();

        public function getList(): Array{
            return priceSchedule;
        }

}

}
