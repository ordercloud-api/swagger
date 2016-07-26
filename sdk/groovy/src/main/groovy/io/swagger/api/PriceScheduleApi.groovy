package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PriceSchedule
import io.swagger.model.PriceBreak

import java.util.*;

@Mixin(ApiUtils)
class PriceScheduleApi {
    String basePath = "https://api.ordercloud.io/v1"
    String versionPath = "/api/v1"

    def create ( PriceSchedule priceSchedule, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceSchedule == null) {
            throw new RuntimeException("missing required params priceSchedule")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def delete ( String priceScheduleID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deletePriceBreak ( String priceScheduleID, Integer quantity, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}/PriceBreaks"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }
        // verify required params are set
        if (quantity == null) {
            throw new RuntimeException("missing required params quantity")
        }

        if (!"null".equals(String.valueOf(quantity)))
            queryParams.put("quantity", String.valueOf(quantity))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def get ( String priceScheduleID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )
                    
    }
    def list ( String search, String searchOn, String sortBy, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules"

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
    def patch ( String priceScheduleID, PriceSchedule priceSchedule, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }
        // verify required params are set
        if (priceSchedule == null) {
            throw new RuntimeException("missing required params priceSchedule")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Object.class )
                    
    }
    def savePriceBreak ( String priceScheduleID, PriceBreak priceBreak, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}/PriceBreaks"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }
        // verify required params are set
        if (priceBreak == null) {
            throw new RuntimeException("missing required params priceBreak")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )
                    
    }
    def update ( String priceScheduleID, PriceSchedule priceSchedule, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/priceschedules/{priceScheduleID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (priceScheduleID == null) {
            throw new RuntimeException("missing required params priceScheduleID")
        }
        // verify required params are set
        if (priceSchedule == null) {
            throw new RuntimeException("missing required params priceSchedule")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Object.class )
                    
    }
}
