package OrderCloud.client.model {


    [XmlRootNode(name="CategoryProductAssignment")]
    public class CategoryProductAssignment {
                [XmlElement(name="CategoryID")]
        public var categoryID: String = null;
                [XmlElement(name="ProductID")]
        public var productID: String = null;
                [XmlElement(name="ListOrder")]
        public var listOrder: Number = NaN;

    public function toString(): String {
        var str: String = "CategoryProductAssignment: ";
        str += " (categoryID: " + categoryID + ")";
        str += " (productID: " + productID + ")";
        str += " (listOrder: " + listOrder + ")";
        return str;
    }

}

}
