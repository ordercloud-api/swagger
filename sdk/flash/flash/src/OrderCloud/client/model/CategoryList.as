package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class CategoryList implements ListWrapper {
        // This declaration below of _Category_obj_class is to force flash compiler to include this class
        private var _category_obj_class: OrderCloud.client.model.Category = null;
        [XmlElements(name="category", type="OrderCloud.client.model.Category")]
        public var category: Array = new Array();

        public function getList(): Array{
            return category;
        }

}

}
