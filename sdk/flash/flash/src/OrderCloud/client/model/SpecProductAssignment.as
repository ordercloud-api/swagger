package OrderCloud.client.model {


    [XmlRootNode(name="SpecProductAssignment")]
    public class SpecProductAssignment {
                [XmlElement(name="SpecID")]
        public var specID: String = null;
                [XmlElement(name="ProductID")]
        public var productID: String = null;
                [XmlElement(name="DefinesVariant")]
        public var definesVariant: Boolean = false;

    public function toString(): String {
        var str: String = "SpecProductAssignment: ";
        str += " (specID: " + specID + ")";
        str += " (productID: " + productID + ")";
        str += " (definesVariant: " + definesVariant + ")";
        return str;
    }

}

}
