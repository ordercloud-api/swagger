package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.EmailTemplate

import java.util.*;

@Mixin(ApiUtils)
class EmailTemplateApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def get ( String buyerID, String emailTemplateType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (emailTemplateType == null) {
            throw new RuntimeException("missing required params emailTemplateType")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def patch ( String buyerID, String emailTemplateType, EmailTemplate emailTemplate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (emailTemplateType == null) {
            throw new RuntimeException("missing required params emailTemplateType")
        }
        // verify required params are set
        if (emailTemplate == null) {
            throw new RuntimeException("missing required params emailTemplate")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def resetToDefault ( String buyerID, String emailTemplateType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (emailTemplateType == null) {
            throw new RuntimeException("missing required params emailTemplateType")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def update ( String buyerID, String emailTemplateType, EmailTemplate emailTemplate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/buyers/{buyerID}/emailtemplates/{emailTemplateType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (buyerID == null) {
            throw new RuntimeException("missing required params buyerID")
        }
        // verify required params are set
        if (emailTemplateType == null) {
            throw new RuntimeException("missing required params emailTemplateType")
        }
        // verify required params are set
        if (emailTemplate == null) {
            throw new RuntimeException("missing required params emailTemplate")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
