package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="CostCenter")]
    public class CostCenter {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "CostCenter: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (description: " + description + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
