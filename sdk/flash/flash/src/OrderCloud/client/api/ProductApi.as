package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.Product;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.Variant;
import OrderCloud.client.model.ProductAssignment;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ProductApi extends SwaggerApi {
    /**
    * Constructor for the ProductApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ProductApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_call_delete: String = "call_delete";
        public static const event_create: String = "create";
        public static const event_delete_assignment: String = "delete_assignment";
        public static const event_generate_variants: String = "generate_variants";
        public static const event_get: String = "get";
        public static const event_get_inventory: String = "get_inventory";
        public static const event_get_variant: String = "get_variant";
        public static const event_get_variant_inventory: String = "get_variant_inventory";
        public static const event_list: String = "list";
        public static const event_list_assignments: String = "list_assignments";
        public static const event_list_inventory: String = "list_inventory";
        public static const event_list_variant_inventory: String = "list_variant_inventory";
        public static const event_list_variants: String = "list_variants";
        public static const event_patch: String = "patch";
        public static const event_patch_variant: String = "patch_variant";
        public static const event_save_assignment: String = "save_assignment";
        public static const event_update: String = "update";
        public static const event_update_inventory: String = "update_inventory";
        public static const event_update_variant: String = "update_variant";
        public static const event_update_variant_inventory: String = "update_variant_inventory";


    /*
     * Returns void 
     */
    public function call_delete (productID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
    public function create (product: Product): String {
        // create path and map variables
        var path: String = "/products".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, product, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_assignment (buyerID: String, productID: String, userID: String, userGroupID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}/assignments/{buyerID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
    public function generate_variants (productID: String, overwriteExisting: Boolean): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/generate".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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

        if("null" != String(overwriteExisting))
            queryParams["overwriteExisting"] = toPathValue(overwriteExisting);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "generate_variants";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (productID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
    public function get_inventory (productID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}/inventory".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
        token.completionEventType = "get_inventory";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_variant (productID: String, variantID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/{variantID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "variantID" + "}", getApiInvoker().escapeString(variantID));

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
        token.completionEventType = "get_variant";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_variant_inventory (productID: String, variantID: String): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/inventory/{variantID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "variantID" + "}", getApiInvoker().escapeString(variantID));

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
        token.completionEventType = "get_variant_inventory";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/products".replace(/{format}/g,"xml");

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
    public function list_assignments (productID: String, buyerID: String, userID: String, userGroupID: String, level: String, priceScheduleID: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/products/assignments".replace(/{format}/g,"xml");

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
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(productID))
            queryParams["productID"] = toPathValue(productID);
if("null" != String(buyerID))
            queryParams["buyerID"] = toPathValue(buyerID);
if("null" != String(userID))
            queryParams["userID"] = toPathValue(userID);
if("null" != String(userGroupID))
            queryParams["userGroupID"] = toPathValue(userGroupID);
if("null" != String(level))
            queryParams["level"] = toPathValue(level);
if("null" != String(priceScheduleID))
            queryParams["priceScheduleID"] = toPathValue(priceScheduleID);
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
    public function list_inventory (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/products/inventory".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_inventory";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_variant_inventory (productID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/inventory".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
        token.completionEventType = "list_variant_inventory";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_variants (productID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
        token.completionEventType = "list_variants";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function patch (productID: String, product: Product): String {
        // create path and map variables
        var path: String = "/products/{productID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, product, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function patch_variant (productID: String, variantID: String, variant: Variant): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/{variantID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "variantID" + "}", getApiInvoker().escapeString(variantID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, variant, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_variant";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function save_assignment (productAssignment: ProductAssignment): String {
        // create path and map variables
        var path: String = "/products/assignments".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, productAssignment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "save_assignment";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (productID: String, product: Product): String {
        // create path and map variables
        var path: String = "/products/{productID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, product, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_inventory (productID: String, inventory: Number): String {
        // create path and map variables
        var path: String = "/products/{productID}/inventory/{inventory}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "inventory" + "}", getApiInvoker().escapeString(inventory));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_inventory";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_variant (productID: String, variantID: String, variant: Variant): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/{variantID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "variantID" + "}", getApiInvoker().escapeString(variantID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, variant, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_variant";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_variant_inventory (productID: String, variantID: String, inventory: Number): String {
        // create path and map variables
        var path: String = "/products/{productID}/variants/inventory/{variantID}/{inventory}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "variantID" + "}", getApiInvoker().escapeString(variantID)).replace("{" + "inventory" + "}", getApiInvoker().escapeString(inventory));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_variant_inventory";

        token.returnType = Object;
        return requestId;

    }
}
}
