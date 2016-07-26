package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.SpendingAccount
import io.swagger.model.SpendingAccountAssignment

import java.util.*;

@Mixin(ApiUtils)
class SpendingAccountApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( String buyerID, SpendingAccount spendingAccount, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccount == null) {
            throw new RuntimeException("missing required params spendingAccount")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String buyerID, String spendingAccountID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccountID == null) {
            throw new RuntimeException("missing required params spendingAccountID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteAssignment ( String buyerID, String spendingAccountID, String userID, String userGroupID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccountID == null) {
            throw new RuntimeException("missing required params spendingAccountID")
        }

        if (!"null".equals(String.valueOf(userID)))
            queryParams.put("userID", String.valueOf(userID))
if (!"null".equals(String.valueOf(userGroupID)))
            queryParams.put("userGroupID", String.valueOf(userGroupID))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String buyerID, String spendingAccountID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccountID == null) {
            throw new RuntimeException("missing required params spendingAccountID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String buyerID, String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts"

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
    def listAssignments ( String buyerID, String spendingAccountID, String userID, String userGroupID, String level, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }

        if (!"null".equals(String.valueOf(spendingAccountID)))
            queryParams.put("spendingAccountID", String.valueOf(spendingAccountID))
if (!"null".equals(String.valueOf(userID)))
            queryParams.put("userID", String.valueOf(userID))
if (!"null".equals(String.valueOf(userGroupID)))
            queryParams.put("userGroupID", String.valueOf(userGroupID))
if (!"null".equals(String.valueOf(level)))
            queryParams.put("level", String.valueOf(level))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(pageSize)))
            queryParams.put("pageSize", String.valueOf(pageSize))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def patch ( String buyerID, String spendingAccountID, SpendingAccount spendingAccount, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccountID == null) {
            throw new RuntimeException("missing required params spendingAccountID")
        }
        // verify required params are set
        if (spendingAccount == null) {
            throw new RuntimeException("missing required params spendingAccount")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def saveAssignment ( String buyerID, SpendingAccountAssignment assignment, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/assignments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (assignment == null) {
            throw new RuntimeException("missing required params assignment")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def update ( String buyerID, String spendingAccountID, SpendingAccount spendingAccount, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/spendingaccounts/{spendingAccountID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (spendingAccountID == null) {
            throw new RuntimeException("missing required params spendingAccountID")
        }
        // verify required params are set
        if (spendingAccount == null) {
            throw new RuntimeException("missing required params spendingAccount")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
