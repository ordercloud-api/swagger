package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Payment
import io.swagger.model.PaymentTransaction

import java.util.*;

@Mixin(ApiUtils)
class PaymentApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( String buyerID, String orderID, Payment payment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (payment == null) {
            throw new RuntimeException("missing required params payment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def createTransaction ( String buyerID, String orderID, String paymentID, PaymentTransaction transaction, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (transaction == null) {
            throw new RuntimeException("missing required params transaction")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String buyerID, String orderID, String paymentID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteTransaction ( String buyerID, String orderID, String paymentID, String transactionID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (transactionID == null) {
            throw new RuntimeException("missing required params transactionID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String buyerID, String orderID, String paymentID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }

        if (!"null".equals(String.valueOf(search)))
            queryParams.put("search", String.valueOf(search))
if (!"null".equals(String.valueOf(searchOn)))
            queryParams.put("searchOn", String.valueOf(searchOn))
if (!"null".equals(String.valueOf(sortBy)))
            queryParams.put("sortBy", String.valueOf(sortBy))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def patch ( String buyerID, String orderID, String paymentID, Payment partialPayment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (partialPayment == null) {
            throw new RuntimeException("missing required params partialPayment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def patchTransaction ( String buyerID, String orderID, String paymentID, String transactionID, PaymentTransaction partialTransaction, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (transactionID == null) {
            throw new RuntimeException("missing required params transactionID")
        }
        // verify required params are set
        if (partialTransaction == null) {
            throw new RuntimeException("missing required params partialTransaction")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def update ( String buyerID, String orderID, String paymentID, Payment payment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (payment == null) {
            throw new RuntimeException("missing required params payment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateTransaction ( String buyerID, String orderID, String paymentID, String transactionID, PaymentTransaction transaction, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }
        // verify required params are set
        if (paymentID == null) {
            throw new RuntimeException("missing required params paymentID")
        }
        // verify required params are set
        if (transactionID == null) {
            throw new RuntimeException("missing required params transactionID")
        }
        // verify required params are set
        if (transaction == null) {
            throw new RuntimeException("missing required params transaction")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
