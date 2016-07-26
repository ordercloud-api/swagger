package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Product
import io.swagger.model.Variant
import io.swagger.model.ProductAssignment

import java.util.*;

@Mixin(ApiUtils)
class ProductApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( Product product, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (product == null) {
            throw new RuntimeException("missing required params product")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String productID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteAssignment ( String buyerID, String productID, String userID, String userGroupID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/assignments/{buyerID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }

        if (!"null".equals(String.valueOf(userID)))
            queryParams.put("userID", String.valueOf(userID))
if (!"null".equals(String.valueOf(userGroupID)))
            queryParams.put("userGroupID", String.valueOf(userGroupID))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def generateVariants ( String productID, Boolean overwriteExisting, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/generate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }

        if (!"null".equals(String.valueOf(overwriteExisting)))
            queryParams.put("overwriteExisting", String.valueOf(overwriteExisting))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def get ( String productID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}"

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
    def getInventory ( String productID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/inventory"

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
    def getVariant ( String productID, String variantID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/{variantID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (variantID == null) {
            throw new RuntimeException("missing required params variantID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getVariantInventory ( String productID, String variantID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/inventory/{variantID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (variantID == null) {
            throw new RuntimeException("missing required params variantID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products"

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
    def listAssignments ( String productID, String buyerID, String userID, String userGroupID, String level, String priceScheduleID, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(productID)))
            queryParams.put("productID", String.valueOf(productID))
if (!"null".equals(String.valueOf(buyerID)))
            queryParams.put("buyerID", String.valueOf(buyerID))
if (!"null".equals(String.valueOf(userID)))
            queryParams.put("userID", String.valueOf(userID))
if (!"null".equals(String.valueOf(userGroupID)))
            queryParams.put("userGroupID", String.valueOf(userGroupID))
if (!"null".equals(String.valueOf(level)))
            queryParams.put("level", String.valueOf(level))
if (!"null".equals(String.valueOf(priceScheduleID)))
            queryParams.put("priceScheduleID", String.valueOf(priceScheduleID))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def listInventory ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/inventory"

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
    def listVariantInventory ( String productID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/inventory"

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
    def listVariants ( String productID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants"

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
    def patch ( String productID, Product product, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (product == null) {
            throw new RuntimeException("missing required params product")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def patchVariant ( String productID, String variantID, Variant variant, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/{variantID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (variantID == null) {
            throw new RuntimeException("missing required params variantID")
        }
        // verify required params are set
        if (variant == null) {
            throw new RuntimeException("missing required params variant")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def saveAssignment ( ProductAssignment productAssignment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productAssignment == null) {
            throw new RuntimeException("missing required params productAssignment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def update ( String productID, Product product, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (product == null) {
            throw new RuntimeException("missing required params product")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateInventory ( String productID, Integer inventory, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/inventory/{inventory}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (inventory == null) {
            throw new RuntimeException("missing required params inventory")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateVariant ( String productID, String variantID, Variant variant, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/{variantID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (variantID == null) {
            throw new RuntimeException("missing required params variantID")
        }
        // verify required params are set
        if (variant == null) {
            throw new RuntimeException("missing required params variant")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateVariantInventory ( String productID, String variantID, Integer inventory, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/products/{productID}/variants/inventory/{variantID}/{inventory}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }
        // verify required params are set
        if (variantID == null) {
            throw new RuntimeException("missing required params variantID")
        }
        // verify required params are set
        if (inventory == null) {
            throw new RuntimeException("missing required params inventory")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
