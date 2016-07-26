package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Product")]
    public class Product {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="QuantityMultiplier")]
        public var quantityMultiplier: Number = NaN;
                [XmlElement(name="ShipWeight")]
        public var shipWeight: Number = NaN;
                [XmlElement(name="Active")]
        public var active: Boolean = false;
                [XmlElement(name="Type")]
        public var type: String = null;
                [XmlElement(name="InventoryEnabled")]
        public var inventoryEnabled: Boolean = false;
                [XmlElement(name="InventoryNotificationPoint")]
        public var inventoryNotificationPoint: Number = NaN;
                [XmlElement(name="VariantLevelInventory")]
        public var variantLevelInventory: Boolean = false;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;
                [XmlElement(name="AllowOrderExceedInventory")]
        public var allowOrderExceedInventory: Boolean = false;
                [XmlElement(name="InventoryVisible")]
        public var inventoryVisible: Boolean = false;

    public function toString(): String {
        var str: String = "Product: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (description: " + description + ")";
        str += " (quantityMultiplier: " + quantityMultiplier + ")";
        str += " (shipWeight: " + shipWeight + ")";
        str += " (active: " + active + ")";
        str += " (type: " + type + ")";
        str += " (inventoryEnabled: " + inventoryEnabled + ")";
        str += " (inventoryNotificationPoint: " + inventoryNotificationPoint + ")";
        str += " (variantLevelInventory: " + variantLevelInventory + ")";
        str += " (xp: " + xp + ")";
        str += " (allowOrderExceedInventory: " + allowOrderExceedInventory + ")";
        str += " (inventoryVisible: " + inventoryVisible + ")";
        return str;
    }

}

}
