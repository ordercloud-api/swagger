package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.PriceSchedule;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.PriceBreak;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PriceScheduleApi extends SwaggerApi {
    /**
    * Constructor for the PriceScheduleApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PriceScheduleApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_call_delete: String = "call_delete";
        public static const event_create: String = "create";
        public static const event_delete_price_break: String = "delete_price_break";
        public static const event_get: String = "get";
        public static const event_list: String = "list";
        public static const event_patch: String = "patch";
        public static const event_save_price_break: String = "save_price_break";
        public static const event_update: String = "update";


    /*
     * Returns void 
     */
    public function call_delete (priceScheduleID: String): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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
    public function create (priceSchedule: PriceSchedule): String {
        // create path and map variables
        var path: String = "/priceschedules".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, priceSchedule, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_price_break (priceScheduleID: String, quantity: Number): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}/PriceBreaks".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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

        if("null" != String(quantity))
            queryParams["quantity"] = toPathValue(quantity);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_price_break";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (priceScheduleID: String): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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
        var path: String = "/priceschedules".replace(/{format}/g,"xml");

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
    public function patch (priceScheduleID: String, priceSchedule: PriceSchedule): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, priceSchedule, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function save_price_break (priceScheduleID: String, priceBreak: PriceBreak): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}/PriceBreaks".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, priceBreak, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "save_price_break";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (priceScheduleID: String, priceSchedule: PriceSchedule): String {
        // create path and map variables
        var path: String = "/priceschedules/{priceScheduleID}".replace(/{format}/g,"xml").replace("{" + "priceScheduleID" + "}", getApiInvoker().escapeString(priceScheduleID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, priceSchedule, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }
}
}
