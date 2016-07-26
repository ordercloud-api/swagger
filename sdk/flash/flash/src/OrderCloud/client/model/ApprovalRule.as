package OrderCloud.client.model {

import OrderCloud.client.model.Object;

    [XmlRootNode(name="ApprovalRule")]
    public class ApprovalRule {
                [XmlElement(name="ID")]
        public var id: String = null;
                [XmlElement(name="Name")]
        public var name: String = null;
                [XmlElement(name="Description")]
        public var description: String = null;
                [XmlElement(name="ApprovingGroupID")]
        public var approvingGroupID: String = null;
                [XmlElement(name="RuleExpression")]
        public var ruleExpression: String = null;
                [XmlElement(name="Scope")]
        public var scope: String = null;
                [XmlElement(name="ScopeTimeUnit")]
        public var scopeTimeUnit: String = null;
                [XmlElement(name="ScopeTimeNumber")]
        public var scopeTimeNumber: Number = NaN;
                [XmlElement(name="ScopeStartDate")]
        public var scopeStartDate: Date = null;
                [XmlElement(name="ExpireAfterTimeUnit")]
        public var expireAfterTimeUnit: String = null;
                [XmlElement(name="ExpireAfterNumber")]
        public var expireAfterNumber: Number = NaN;
                [XmlElement(name="ApproveOnExpire")]
        public var approveOnExpire: Boolean = false;
                [XmlElement(name="xp")]
        public var xp: Object = NaN;

    public function toString(): String {
        var str: String = "ApprovalRule: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (description: " + description + ")";
        str += " (approvingGroupID: " + approvingGroupID + ")";
        str += " (ruleExpression: " + ruleExpression + ")";
        str += " (scope: " + scope + ")";
        str += " (scopeTimeUnit: " + scopeTimeUnit + ")";
        str += " (scopeTimeNumber: " + scopeTimeNumber + ")";
        str += " (scopeStartDate: " + scopeStartDate + ")";
        str += " (expireAfterTimeUnit: " + expireAfterTimeUnit + ")";
        str += " (expireAfterNumber: " + expireAfterNumber + ")";
        str += " (approveOnExpire: " + approveOnExpire + ")";
        str += " (xp: " + xp + ")";
        return str;
    }

}

}
