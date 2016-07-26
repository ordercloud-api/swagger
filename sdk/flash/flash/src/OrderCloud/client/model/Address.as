package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="Address")]
    public class Address {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="CompanyName")]
        public var companyName: String = null;
                [XmlElement(name="FirstName")]
        public var firstName: String = null;
                [XmlElement(name="LastName")]
        public var lastName: String = null;
                [XmlElement(name="Street1")]
        public var street1: String = null;
                [XmlElement(name="Street2")]
        public var street2: String = null;
                [XmlElement(name="City")]
        public var city: String = null;
                [XmlElement(name="State")]
        public var state: String = null;
                [XmlElement(name="Zip")]
        public var zip: String = null;
                [XmlElement(name="Country")]
        public var country: String = null;
                [XmlElement(name="Phone")]
        public var phone: String = null;
                [XmlElement(name="AddressName")]
        public var addressName: String = null;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "Address: ";
        str += " (id: " + id + ")";
        str += " (companyName: " + companyName + ")";
        str += " (firstName: " + firstName + ")";
        str += " (lastName: " + lastName + ")";
        str += " (street1: " + street1 + ")";
        str += " (street2: " + street2 + ")";
        str += " (city: " + city + ")";
        str += " (state: " + state + ")";
        str += " (zip: " + zip + ")";
        str += " (country: " + country + ")";
        str += " (phone: " + phone + ")";
        str += " (addressName: " + addressName + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
