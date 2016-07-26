package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.Promotion;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.PromotionAssignment;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PromotionApi extends SwaggerApi {
    /**
    * Constructor for the PromotionApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PromotionApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_call_delete: String = "call_delete";
        public static const event_create: String = "create";
        public static const event_delete_assignment: String = "delete_assignment";
        public static const event_get: String = "get";
        public static const event_list: String = "list";
        public static const event_list_assignments: String = "list_assignments";
        public static const event_patch: String = "patch";
        public static const event_save_assignment: String = "save_assignment";
        public static const event_update: String = "update";


    /*
     * Returns void 
     */
    public function call_delete (promotionID: String): String {
        // create path and map variables
        var path: String = "/promotions/{promotionID}".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "call_delete";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function create (promo: Promotion): String {
        // create path and map variables
        var path: String = "/promotions".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, promo, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_assignment (promotionID: String, buyerID: String, userID: String, userGroupID: String): String {
        // create path and map variables
        var path: String = "/promotions/{promotionID}/assignments".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(buyerID))
            queryParams["buyerID"] = toPathValue(buyerID);
if("null" != String(userID))
            queryParams["userID"] = toPathValue(userID);
if("null" != String(userGroupID))
            queryParams["userGroupID"] = toPathValue(userGroupID);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_assignment";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (promotionID: String): String {
        // create path and map variables
        var path: String = "/promotions/{promotionID}".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
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
     * Returns Object 
     */
    public function list (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/promotions".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(search))
            queryParams["search"] = toPathValue(search);
if("null" != String(searchOn))
            queryParams["searchOn"] = toPathValue(searchOn);
if("null" != String(sortBy))
            queryParams["sortBy"] = toPathValue(sortBy);
if("null" != String(page))
            queryParams["page"] = toPathValue(page);
if("null" != String(pageSize))
            queryParams["pageSize"] = toPathValue(pageSize);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_assignments (buyerID: String, promotionID: String, userID: String, userGroupID: String, level: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/promotions/assignments".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(buyerID))
            queryParams["buyerID"] = toPathValue(buyerID);
if("null" != String(promotionID))
            queryParams["promotionID"] = toPathValue(promotionID);
if("null" != String(userID))
            queryParams["userID"] = toPathValue(userID);
if("null" != String(userGroupID))
            queryParams["userGroupID"] = toPathValue(userGroupID);
if("null" != String(level))
            queryParams["level"] = toPathValue(level);
if("null" != String(page))
            queryParams["page"] = toPathValue(page);
if("null" != String(pageSize))
            queryParams["pageSize"] = toPathValue(pageSize);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list_assignments";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function patch (promotionID: String, partialPromotion: Promotion): String {
        // create path and map variables
        var path: String = "/promotions/{promotionID}".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, partialPromotion, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function save_assignment (assignment: PromotionAssignment): String {
        // create path and map variables
        var path: String = "/promotions/assignments".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, assignment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "save_assignment";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (promotionID: String, promo: Promotion): String {
        // create path and map variables
        var path: String = "/promotions/{promotionID}".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, promo, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }
}
}
