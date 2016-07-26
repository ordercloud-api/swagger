package OrderCloud.client.model {

import io.swagger.common.ListWrapper;

    public class EmailTemplateList implements ListWrapper {
        // This declaration below of _EmailTemplate_obj_class is to force flash compiler to include this class
        private var _emailTemplate_obj_class: OrderCloud.client.model.EmailTemplate = null;
        [XmlElements(name="emailTemplate", type="OrderCloud.client.model.EmailTemplate")]
        public var emailTemplate: Array = new Array();

        public function getList(): Array{
            return emailTemplate;
        }

}

}
