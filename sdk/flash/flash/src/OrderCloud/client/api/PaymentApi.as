package OrderCloud.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import OrderCloud.client.model.Object;
import OrderCloud.client.model.Payment;
import OrderCloud.client.model.PaymentTransaction;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PaymentApi extends SwaggerApi {
    /**
    * Constructor for the PaymentApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PaymentApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_call_delete: String = "call_delete";
        public static const event_create: String = "create";
        public static const event_create_transaction: String = "create_transaction";
        public static const event_delete_transaction: String = "delete_transaction";
        public static const event_get: String = "get";
        public static const event_list: String = "list";
        public static const event_patch: String = "patch";
        public static const event_patch_transaction: String = "patch_transaction";
        public static const event_update: String = "update";
        public static const event_update_transaction: String = "update_transaction";


    /*
     * Returns void 
     */
    public function call_delete (buyerID: String, orderID: String, paymentID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID));

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
        token.completionEventType = "call_delete";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function create (buyerID: String, orderID: String, payment: Payment): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, payment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function create_transaction (buyerID: String, orderID: String, paymentID: String, transaction: PaymentTransaction): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, transaction, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_transaction";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_transaction (buyerID: String, orderID: String, paymentID: String, transactionID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID)).replace("{" + "transactionID" + "}", getApiInvoker().escapeString(transactionID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_transaction";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function get (buyerID: String, orderID: String, paymentID: String): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID));

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
    public function list (buyerID: String, orderID: String, search: String, searchOn: String, sortBy: String, page: Number, pageSize: Number): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID));

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
    public function patch (buyerID: String, orderID: String, paymentID: String, partialPayment: Payment): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, partialPayment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function patch_transaction (buyerID: String, orderID: String, paymentID: String, transactionID: String, partialTransaction: PaymentTransaction): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID)).replace("{" + "transactionID" + "}", getApiInvoker().escapeString(transactionID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, partialTransaction, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_transaction";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update (buyerID: String, orderID: String, paymentID: String, payment: Payment): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, payment, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update";

        token.returnType = Object;
        return requestId;

    }

    /*
     * Returns Object 
     */
    public function update_transaction (buyerID: String, orderID: String, paymentID: String, transactionID: String, transaction: PaymentTransaction): String {
        // create path and map variables
        var path: String = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}".replace(/{format}/g,"xml").replace("{" + "buyerID" + "}", getApiInvoker().escapeString(buyerID)).replace("{" + "orderID" + "}", getApiInvoker().escapeString(orderID)).replace("{" + "paymentID" + "}", getApiInvoker().escapeString(paymentID)).replace("{" + "transactionID" + "}", getApiInvoker().escapeString(transactionID));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, transaction, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_transaction";

        token.returnType = Object;
        return requestId;

    }
}
}
