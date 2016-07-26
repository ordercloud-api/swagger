package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PasswordReset
import io.swagger.model.PasswordResetRequest

import java.util.*;

@Mixin(ApiUtils)
class PasswordResetApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def resetPassword ( String verificationCode, PasswordReset passwordReset, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/password/reset/{verificationCode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (verificationCode == null) {
            throw new RuntimeException("missing required params verificationCode")
        }
        // verify required params are set
        if (passwordReset == null) {
            throw new RuntimeException("missing required params passwordReset")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def sendVerificationCode ( PasswordResetRequest passwordResetRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/password/reset"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passwordResetRequest == null) {
            throw new RuntimeException("missing required params passwordResetRequest")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
