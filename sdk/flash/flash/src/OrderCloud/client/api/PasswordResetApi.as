package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.PasswordReset;
import OrderCloud.client.model.PasswordResetRequest;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PasswordResetApi extends SwaggerApi {
    /**
    * Constructor for the PasswordResetApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PasswordResetApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_reset_password: String = "reset_password";
        public static const event_send_verification_code: String = "send_verification_code";


    /*
     * Returns void 
     */
    public function reset_password (verificationCode: String, passwordReset: PasswordReset): String {
        // create path and map variables
        var path: String = "/password/reset/{verificationCode}".replace(/{format}/g,"xml").replace("{" + "verificationCode" + "}", getApiInvoker().escapeString(verificationCode));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, passwordReset, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "reset_password";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function send_verification_code (passwordResetRequest: PasswordResetRequest): String {
        // create path and map variables
        var path: String = "/password/reset".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, passwordResetRequest, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "send_verification_code";

        token.returnType = null ;
        return requestId;

    }
}
}
