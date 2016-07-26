package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Partial1")]
    public class Partial1 {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Username")]
        public var username: String = null;
                [XmlElement(name="Password")]
        public var password: String = null;
                [XmlElement(name="FirstName")]
        public var firstName: String = null;
                [XmlElement(name="LastName")]
        public var lastName: String = null;
                [XmlElement(name="Email")]
        public var email: String = null;
                [XmlElement(name="Phone")]
        public var phone: String = null;
                [XmlElement(name="TermsAccepted")]
        public var termsAccepted: Date = null;
                [XmlElement(name="Active")]
        public var active: Boolean = false;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;
                [XmlElement(name="SecurityProfileID")]
        public var securityProfileID: String = null;

    public function toString(): String {
        var str: String = "Partial1: ";
        str += " (id: " + id + ")";
        str += " (username: " + username + ")";
        str += " (password: " + password + ")";
        str += " (firstName: " + firstName + ")";
        str += " (lastName: " + lastName + ")";
        str += " (email: " + email + ")";
        str += " (phone: " + phone + ")";
        str += " (termsAccepted: " + termsAccepted + ")";
        str += " (active: " + active + ")";
        str += " (xp: " + xp + ")";
        str += " (securityProfileID: " + securityProfileID + ")";
        return str;
    }

}

}
