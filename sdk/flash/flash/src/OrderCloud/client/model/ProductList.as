package OrderCloud.client.model {

import io.swagger.common.ListWrapper;
import OrderCloud.client.model.Object;

    public class ProductList implements ListWrapper {
        // This declaration below of _Product_obj_class is to force flash compiler to include this class
        private var _product_obj_class: OrderCloud.client.model.Product = null;
        [XmlElements(name="product", type="OrderCloud.client.model.Product")]
        public var product: Array = new Array();

        public function getList(): Array{
            return product;
        }

}

}
