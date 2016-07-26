package OrderCloud.client.model {

import OrderCloud.client.model.ShipmentItem;

    [XmlRootNode(name="ImpersonateTokenRequest")]
    public class ImpersonateTokenRequest {
                [XmlElement(name="ClientID")]
        public var clientID: String = null;
                // This declaration below of _claims_obj_class is to force flash compiler to include this class
        private var _claims_obj_class: Array = null;
        [XmlElementWrapper(name="Claims")]
        [XmlElements(name="claims", type="Array")]
                public var claims: Array = new Array();

    public function toString(): String {
        var str: String = "ImpersonateTokenRequest: ";
        str += " (clientID: " + clientID + ")";
        str += " (claims: " + claims + ")";
        return str;
    }

}

}
