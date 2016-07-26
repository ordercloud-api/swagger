package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Buyer

import java.util.*;

@Mixin(ApiUtils)
class BuyerApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( Buyer company, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (company == null) {
            throw new RuntimeException("missing required params company")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String buyerID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String buyerID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String search, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(search)))
            queryParams.put("search", String.valueOf(search))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def update ( String buyerID, Buyer company, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (company == null) {
            throw new RuntimeException("missing required params company")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
