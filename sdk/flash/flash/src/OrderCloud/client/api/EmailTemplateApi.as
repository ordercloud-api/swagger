package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.EmailTemplate;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class EmailTemplateApi extends SwaggerApi {
    /**
    * Constructor for the EmailTemplateApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function EmailTemplateApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get: String = "get";
        public static const event_patch: String = "patch";
        public static const event_reset_to_default: String = "reset_to_default";
        public static const event_update: String = "update";


    /*
     * Returns Object 
     */
    public function get (buyerID: String, emailTemplateType: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "emailTemplateType" + "}", getApiInvoker().escapeString(emailTemplateType));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function patch (buyerID: String, emailTemplateType: String, emailTemplate: EmailTemplate): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "emailTemplateType" + "}", getApiInvoker().escapeString(emailTemplateType));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, emailTemplate, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function reset_to_default (buyerID: String, emailTemplateType: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "emailTemplateType" + "}", getApiInvoker().escapeString(emailTemplateType));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "reset_to_default";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function update (buyerID: String, emailTemplateType: String, emailTemplate: EmailTemplate): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "emailTemplateType" + "}", getApiInvoker().escapeString(emailTemplateType));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, emailTemplate, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = null ;
        return requestId;

    }
}
}
