package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Spec
import io.swagger.model.SpecOption
import io.swagger.model.SpecProductAssignment

import java.util.*;

@Mixin(ApiUtils)
class SpecApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( Spec spec, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (spec == null) {
            throw new RuntimeException("missing required params spec")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def createOption ( String specID, SpecOption option, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (option == null) {
            throw new RuntimeException("missing required params option")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String specID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteOption ( String specID, String optionID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options/{optionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (optionID == null) {
            throw new RuntimeException("missing required params optionID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteProductAssignment ( String specID, String productID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/productassignments/{productID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (productID == null) {
            throw new RuntimeException("missing required params productID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String specID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def getOption ( String specID, String optionID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options/{optionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (optionID == null) {
            throw new RuntimeException("missing required params optionID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs"

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
    def listOptions ( String specID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
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
    def listProductAssignments ( String specID, String productID, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/productassignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(specID)))
            queryParams.put("specID", String.valueOf(specID))
if (!"null".equals(String.valueOf(productID)))
            queryParams.put("productID", String.valueOf(productID))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def patch ( String specID, Spec spec, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (spec == null) {
            throw new RuntimeException("missing required params spec")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def patchOption ( String specID, String optionID, SpecOption option, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options/{optionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (optionID == null) {
            throw new RuntimeException("missing required params optionID")
        }
        // verify required params are set
        if (option == null) {
            throw new RuntimeException("missing required params option")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def saveProductAssignment ( SpecProductAssignment productAssignment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/productassignments"

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
    def update ( String specID, Spec spec, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (spec == null) {
            throw new RuntimeException("missing required params spec")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
    def updateOption ( String specID, String optionID, SpecOption option, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/specs/{specID}/options/{optionID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (specID == null) {
            throw new RuntimeException("missing required params specID")
        }
        // verify required params are set
        if (optionID == null) {
            throw new RuntimeException("missing required params optionID")
        }
        // verify required params are set
        if (option == null) {
            throw new RuntimeException("missing required params option")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
