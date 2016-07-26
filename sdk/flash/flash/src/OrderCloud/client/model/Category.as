package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Category")]
    public class Category {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;
                [XmlElement(name="ListOrder")]
        public var listOrder: Number = NaN;
                [XmlElement(name="Active")]
        public var active: Boolean = false;
                [XmlElement(name="ParentID")]
        public var parentID: String = null;

    public function toString(): String {
        var str: String = "Category: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (description: " + description + ")";
        str += " (xp: " + xp + ")";
        str += " (listOrder: " + listOrder + ")";
        str += " (active: " + active + ")";
        str += " (parentID: " + parentID + ")";
        return str;
    }

}

}
