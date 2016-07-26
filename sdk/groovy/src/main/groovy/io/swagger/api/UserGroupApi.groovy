package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.UserGroup
import io.swagger.model.UserGroupAssignment

import java.util.*;

@Mixin(ApiUtils)
class UserGroupApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( String buyerID, UserGroup group, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (group == null) {
            throw new RuntimeException("missing required params group")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String buyerID, String userGroupID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/{userGroupID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupID == null) {
            throw new RuntimeException("missing required params userGroupID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteUserAssignment ( String buyerID, String userGroupID, String userID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupID == null) {
            throw new RuntimeException("missing required params userGroupID")
        }
        // verify required params are set
        if (userID == null) {
            throw new RuntimeException("missing required params userID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String buyerID, String userGroupID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/{userGroupID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupID == null) {
            throw new RuntimeException("missing required params userGroupID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
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
    def listUserAssignments ( String buyerID, String userGroupID, String userID, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }

        if (!"null".equals(String.valueOf(userGroupID)))
            queryParams.put("userGroupID", String.valueOf(userGroupID))
if (!"null".equals(String.valueOf(userID)))
            queryParams.put("userID", String.valueOf(userID))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def patch ( String buyerID, String userGroupID, UserGroup group, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/{userGroupID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupID == null) {
            throw new RuntimeException("missing required params userGroupID")
        }
        // verify required params are set
        if (group == null) {
            throw new RuntimeException("missing required params group")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def saveUserAssignment ( String buyerID, UserGroupAssignment userGroupAssignment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupAssignment == null) {
            throw new RuntimeException("missing required params userGroupAssignment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def update ( String buyerID, String userGroupID, UserGroup group, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/usergroups/{userGroupID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (userGroupID == null) {
            throw new RuntimeException("missing required params userGroupID")
        }
        // verify required params are set
        if (group == null) {
            throw new RuntimeException("missing required params group")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
