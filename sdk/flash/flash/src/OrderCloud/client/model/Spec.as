package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Spec")]
    public class Spec {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="ListOrder")]
        public var listOrder: Number = NaN;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="DefaultValue")]
        public var defaultValue: String = null;
                [XmlElement(name="Required")]
        public var required: Boolean = false;
                [XmlElement(name="AllowOpenText")]
        public var allowOpenText: Boolean = false;
                [XmlElement(name="DefaultOptionID")]
        public var defaultOptionID: String = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Spec: ";
        str += " (id: " + id + ")";
        str += " (listOrder: " + listOrder + ")";
        str += " (name: " + name + ")";
        str += " (defaultValue: " + defaultValue + ")";
        str += " (required: " + required + ")";
        str += " (allowOpenText: " + allowOpenText + ")";
        str += " (defaultOptionID: " + defaultOptionID + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
