package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.UserGroup;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.UserGroupAssignment;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class UserGroupApi extends SwaggerApi {
    /**
    * Constructor for the UserGroupApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function UserGroupApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_call_delete: String = "call_delete";
        public static const event_create: String = "create";
        public static const event_delete_user_assignment: String = "delete_user_assignment";
        public static const event_get: String = "get";
        public static const event_list: String = "list";
        public static const event_list_user_assignments: String = "list_user_assignments";
        public static const event_patch: String = "patch";
        public static const event_save_user_assignment: String = "save_user_assignment";
        public static const event_update: String = "update";


    /*
     * Returns void 
     */
    public function call_delete (buyerID: String, userGroupID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/{userGroupID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "userGroupID" + "}", getApiInvoker().escapeString(userGroupID));

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
        token.completionEventType = "call_delete";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function create (buyerID: String, group: UserGroup): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, group, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_user_assignment (buyerID: String, userGroupID: String, userID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "userGroupID" + "}", getApiInvoker().escapeString(userGroupID)).replace("{" + "userID" + "}", getApiInvoker().escapeString(userID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_user_assignment";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (buyerID: String, userGroupID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/{userGroupID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "userGroupID" + "}", getApiInvoker().escapeString(userGroupID));

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
     * Returns Object 
     */
    public function list (buyerID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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
    public function list_user_assignments (buyerID: String, userGroupID: String, userID: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/assignments".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID));

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

        if("null" != String(userGroupID))
            queryParams["userGroupID"] = toPathValue(userGroupID);
if("null" != String(userID))
            queryParams["userID"] = toPathValue(userID);
if("null" != String(page))
            queryParams["page"] = toPathValue(page);
if("null" != String(pageSize))
            queryParams["pageSize"] = toPathValue(pageSize);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list_user_assignments";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function patch (buyerID: String, userGroupID: String, group: UserGroup): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/{userGroupID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "userGroupID" + "}", getApiInvoker().escapeString(userGroupID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, group, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function save_user_assignment (buyerID: String, userGroupAssignment: UserGroupAssignment): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/assignments".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, userGroupAssignment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "save_user_assignment";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (buyerID: String, userGroupID: String, group: UserGroup): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/usergroups/{userGroupID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "userGroupID" + "}", getApiInvoker().escapeString(userGroupID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, group, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }
}
}
