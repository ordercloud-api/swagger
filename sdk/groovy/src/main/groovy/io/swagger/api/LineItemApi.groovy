package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.LineItem
import io.swagger.model.Address

import java.util.*;

@Mixin(ApiUtils)
class LineItemApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( String buyerID, String orderID, LineItem lineItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems"

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
        if (lineItem == null) {
            throw new RuntimeException("missing required params lineItem")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String buyerID, String orderID, String lineItemID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String buyerID, String orderID, String lineItemID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String buyerID, String orderID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems"

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
    def patch ( String buyerID, String orderID, String lineItemID, LineItem partialLineItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }
        // verify required params are set
        if (partialLineItem == null) {
            throw new RuntimeException("missing required params partialLineItem")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def patchShippingAddress ( String buyerID, String orderID, String lineItemID, Address address, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def setShippingAddress ( String buyerID, String orderID, String lineItemID, Address address, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def update ( String buyerID, String orderID, String lineItemID, LineItem lineItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}"

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
        if (lineItemID == null) {
            throw new RuntimeException("missing required params lineItemID")
        }
        // verify required params are set
        if (lineItem == null) {
            throw new RuntimeException("missing required params lineItem")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
