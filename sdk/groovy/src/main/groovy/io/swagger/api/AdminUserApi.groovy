package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.User

import java.util.*;

@Mixin(ApiUtils)
class AdminUserApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String userID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers/{userID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userID == null) {
            throw new RuntimeException("missing required params userID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String userID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers/{userID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userID == null) {
            throw new RuntimeException("missing required params userID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers"

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
    def patch ( String userID, User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers/{userID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userID == null) {
            throw new RuntimeException("missing required params userID")
        }
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def update ( String userID, User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/adminusers/{userID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userID == null) {
            throw new RuntimeException("missing required params userID")
        }
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}