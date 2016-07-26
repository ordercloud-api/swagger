package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BuyerAddress
import io.swagger.model.BuyerCreditCard
import io.swagger.model.User

import java.util.*;

@Mixin(ApiUtils)
class MeApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def createAddress ( BuyerAddress address, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def createCreditCard ( BuyerCreditCard creditCard, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (creditCard == null) {
            throw new RuntimeException("missing required params creditCard")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def deleteAddress ( String addressID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses/{addressID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (addressID == null) {
            throw new RuntimeException("missing required params addressID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteCreditCard ( String creditcardID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards/{creditcardID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (creditcardID == null) {
            throw new RuntimeException("missing required params creditcardID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getAddress ( String addressID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses/{addressID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (addressID == null) {
            throw new RuntimeException("missing required params addressID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getCreditCard ( String creditcardID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards/{creditcardID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (creditcardID == null) {
            throw new RuntimeException("missing required params creditcardID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getOrder ( String orderID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/orders/{orderID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getProduct ( String productID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/products/{productID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getPromotion ( String promotionID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/promotions/{promotionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (promotionID == null) {
            throw new RuntimeException("missing required params promotionID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getSpec ( String productID, String specID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/products/{productID}/specs/{specID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def listAddresses ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

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
    def listCategories ( String depth, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/categories"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(depth)))
            queryParams.put("depth", String.valueOf(depth))
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
    def listCostCenters ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/costcenters"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

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
    def listCreditCards ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

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
    def listIncomingOrders ( String from, String to, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/orders/incoming"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
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
    def listOutgoingOrders ( String from, String to, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/orders/outgoing"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
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
    def listProducts ( String categoryID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/products"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(categoryID)))
            queryParams.put("categoryID", String.valueOf(categoryID))
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
    def listPromotions ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/promotions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

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
    def listSpecs ( String productID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/products/{productID}/specs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
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
    def listSubcategories ( String parentID, String depth, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/categories/{parentID}/categories"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (parentID == null) {
            throw new RuntimeException("missing required params parentID")
        }

        if (!"null".equals(String.valueOf(depth)))
            queryParams.put("depth", String.valueOf(depth))
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
    def listUserGroups ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/usergroups"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

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
    def patch ( User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def patchAddress ( String addressID, BuyerAddress address, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses/{addressID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (addressID == null) {
            throw new RuntimeException("missing required params addressID")
        }
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def patchCreditCard ( String creditcardID, BuyerCreditCard creditCard, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards/{creditcardID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (creditcardID == null) {
            throw new RuntimeException("missing required params creditcardID")
        }
        // verify required params are set
        if (creditCard == null) {
            throw new RuntimeException("missing required params creditCard")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def update ( User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateAddress ( String addressID, BuyerAddress address, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/addresses/{addressID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (addressID == null) {
            throw new RuntimeException("missing required params addressID")
        }
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateCreditCard ( String creditcardID, BuyerCreditCard creditCard, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/me/creditcards/{creditcardID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (creditcardID == null) {
            throw new RuntimeException("missing required params creditcardID")
        }
        // verify required params are set
        if (creditCard == null) {
            throw new RuntimeException("missing required params creditCard")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
