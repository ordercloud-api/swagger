package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.BuyerAddress;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.BuyerCreditCard;
import OrderCloud.client.model.User;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class MeApi extends SwaggerApi {
    /**
    * Constructor for the MeApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function MeApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_address: String = "create_address";
        public static const event_create_credit_card: String = "create_credit_card";
        public static const event_delete_address: String = "delete_address";
        public static const event_delete_credit_card: String = "delete_credit_card";
        public static const event_get: String = "get";
        public static const event_get_address: String = "get_address";
        public static const event_get_credit_card: String = "get_credit_card";
        public static const event_get_order: String = "get_order";
        public static const event_get_product: String = "get_product";
        public static const event_get_promotion: String = "get_promotion";
        public static const event_get_spec: String = "get_spec";
        public static const event_list_addresses: String = "list_addresses";
        public static const event_list_categories: String = "list_categories";
        public static const event_list_cost_centers: String = "list_cost_centers";
        public static const event_list_credit_cards: String = "list_credit_cards";
        public static const event_list_incoming_orders: String = "list_incoming_orders";
        public static const event_list_outgoing_orders: String = "list_outgoing_orders";
        public static const event_list_products: String = "list_products";
        public static const event_list_promotions: String = "list_promotions";
        public static const event_list_specs: String = "list_specs";
        public static const event_list_subcategories: String = "list_subcategories";
        public static const event_list_user_groups: String = "list_user_groups";
        public static const event_patch: String = "patch";
        public static const event_patch_address: String = "patch_address";
        public static const event_patch_credit_card: String = "patch_credit_card";
        public static const event_update: String = "update";
        public static const event_update_address: String = "update_address";
        public static const event_update_credit_card: String = "update_credit_card";


    /*
     * Returns Object 
     */
    public function create_address (address: BuyerAddress): String {
        // create path and map variables
        var path: String = "/me/addresses".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, address, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_address";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function create_credit_card (creditCard: BuyerCreditCard): String {
        // create path and map variables
        var path: String = "/me/creditcards".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, creditCard, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_credit_card";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_address (addressID: String): String {
        // create path and map variables
        var path: String = "/me/addresses/{addressID}".replace(/{format}/g,"xml").replace("{" + "addressID" + "}", getApiInvoker().escapeString(addressID));

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
        token.completionEventType = "delete_address";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_credit_card (creditcardID: String): String {
        // create path and map variables
        var path: String = "/me/creditcards/{creditcardID}".replace(/{format}/g,"xml").replace("{" + "creditcardID" + "}", getApiInvoker().escapeString(creditcardID));

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
        token.completionEventType = "delete_credit_card";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (): String {
        // create path and map variables
        var path: String = "/me".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
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
    public function get_address (addressID: String): String {
        // create path and map variables
        var path: String = "/me/addresses/{addressID}".replace(/{format}/g,"xml").replace("{" + "addressID" + "}", getApiInvoker().escapeString(addressID));

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
        token.completionEventType = "get_address";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_credit_card (creditcardID: String): String {
        // create path and map variables
        var path: String = "/me/creditcards/{creditcardID}".replace(/{format}/g,"xml").replace("{" + "creditcardID" + "}", getApiInvoker().escapeString(creditcardID));

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
        token.completionEventType = "get_credit_card";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_order (orderID: String): String {
        // create path and map variables
        var path: String = "/me/orders/{orderID}".replace(/{format}/g,"xml").replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID));

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
        token.completionEventType = "get_order";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_product (productID: String): String {
        // create path and map variables
        var path: String = "/me/products/{productID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
        token.completionEventType = "get_product";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_promotion (promotionID: String): String {
        // create path and map variables
        var path: String = "/me/promotions/{promotionID}".replace(/{format}/g,"xml").replace("{" + "promotionID" + "}", getApiInvoker().escapeString(promotionID));

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
        token.completionEventType = "get_promotion";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get_spec (productID: String, specID: String): String {
        // create path and map variables
        var path: String = "/me/products/{productID}/specs/{specID}".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID)).replace("{" + "specID" + "}", getApiInvoker().escapeString(specID));

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
        token.completionEventType = "get_spec";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_addresses (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/addresses".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_addresses";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_categories (depth: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/categories".replace(/{format}/g,"xml");

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

        if("null" != String(depth))
            queryParams["depth"] = toPathValue(depth);
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
        token.completionEventType = "list_categories";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_cost_centers (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/costcenters".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_cost_centers";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_credit_cards (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/creditcards".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_credit_cards";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_incoming_orders (from: String, to: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/orders/incoming".replace(/{format}/g,"xml");

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

        if("null" != String(from))
            queryParams["from"] = toPathValue(from);
if("null" != String(to))
            queryParams["to"] = toPathValue(to);
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
        token.completionEventType = "list_incoming_orders";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_outgoing_orders (from: String, to: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/orders/outgoing".replace(/{format}/g,"xml");

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

        if("null" != String(from))
            queryParams["from"] = toPathValue(from);
if("null" != String(to))
            queryParams["to"] = toPathValue(to);
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
        token.completionEventType = "list_outgoing_orders";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_products (categoryID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/products".replace(/{format}/g,"xml");

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

        if("null" != String(categoryID))
            queryParams["categoryID"] = toPathValue(categoryID);
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
        token.completionEventType = "list_products";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_promotions (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/promotions".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_promotions";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_specs (productID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/products/{productID}/specs".replace(/{format}/g,"xml").replace("{" + "productID" + "}", getApiInvoker().escapeString(productID));

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
        token.completionEventType = "list_specs";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_subcategories (parentID: String, depth: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/categories/{parentID}/categories".replace(/{format}/g,"xml").replace("{" + "parentID" + "}", getApiInvoker().escapeString(parentID));

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

        if("null" != String(depth))
            queryParams["depth"] = toPathValue(depth);
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
        token.completionEventType = "list_subcategories";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function list_user_groups (search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/me/usergroups".replace(/{format}/g,"xml");

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
        token.completionEventType = "list_user_groups";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function patch (user: User): String {
        // create path and map variables
        var path: String = "/me".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, user, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function patch_address (addressID: String, address: BuyerAddress): String {
        // create path and map variables
        var path: String = "/me/addresses/{addressID}".replace(/{format}/g,"xml").replace("{" + "addressID" + "}", getApiInvoker().escapeString(addressID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, address, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_address";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function patch_credit_card (creditcardID: String, creditCard: BuyerCreditCard): String {
        // create path and map variables
        var path: String = "/me/creditcards/{creditcardID}".replace(/{format}/g,"xml").replace("{" + "creditcardID" + "}", getApiInvoker().escapeString(creditcardID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, creditCard, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_credit_card";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (user: User): String {
        // create path and map variables
        var path: String = "/me".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, user, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_address (addressID: String, address: BuyerAddress): String {
        // create path and map variables
        var path: String = "/me/addresses/{addressID}".replace(/{format}/g,"xml").replace("{" + "addressID" + "}", getApiInvoker().escapeString(addressID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, address, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_address";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_credit_card (creditcardID: String, creditCard: BuyerCreditCard): String {
        // create path and map variables
        var path: String = "/me/creditcards/{creditcardID}".replace(/{format}/g,"xml").replace("{" + "creditcardID" + "}", getApiInvoker().escapeString(creditcardID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, creditCard, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_credit_card";

        token.returnType = Object;
        return requestId;

    }
}
}
