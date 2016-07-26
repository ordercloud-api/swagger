package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Buyer")]
    public class Buyer {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Active")]
        public var active: Boolean = false;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Buyer: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (active: " + active + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
