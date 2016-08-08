//
// UserGroupAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class UserGroupAPI: APIBase {
    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func callGet(buyerID buyerID: String, userGroupID: String, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        callGetWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/usergroups/{userGroupID}
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 

     - returns: RequestBuilder<AnyObject> 
     */
    public class func callGetWithRequestBuilder(buyerID buyerID: String, userGroupID: String) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/usergroups/{userGroupID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userGroupID}", withString: "\(userGroupID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter group: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func create(buyerID buyerID: String, group: UserGroup, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        createWithRequestBuilder(buyerID: buyerID, group: group).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - POST /buyers/{buyerID}/usergroups
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter group: (body)  

     - returns: RequestBuilder<AnyObject> 
     */
    public class func createWithRequestBuilder(buyerID buyerID: String, group: UserGroup) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/usergroups"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = group.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func delete(buyerID buyerID: String, userGroupID: String, completion: ((error: ErrorType?) -> Void)) {
        deleteWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /buyers/{buyerID}/usergroups/{userGroupID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteWithRequestBuilder(buyerID buyerID: String, userGroupID: String) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/usergroups/{userGroupID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userGroupID}", withString: "\(userGroupID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter userID: (path) ID of the user. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteUserAssignment(buyerID buyerID: String, userGroupID: String, userID: String, completion: ((error: ErrorType?) -> Void)) {
        deleteUserAssignmentWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID, userID: userID).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter userID: (path) ID of the user. 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteUserAssignmentWithRequestBuilder(buyerID buyerID: String, userGroupID: String, userID: String) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userGroupID}", withString: "\(userGroupID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userID}", withString: "\(userID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter searchOn: (query) Comma-delimited list of fields to search on. (optional)
     - parameter sortBy: (query) Comma-delimited list of fields to sort by. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func list(buyerID buyerID: String, search: String? = nil, searchOn: String? = nil, sortBy: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listWithRequestBuilder(buyerID: buyerID, search: search, searchOn: searchOn, sortBy: sortBy, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/usergroups
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter searchOn: (query) Comma-delimited list of fields to search on. (optional)
     - parameter sortBy: (query) Comma-delimited list of fields to sort by. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listWithRequestBuilder(buyerID buyerID: String, search: String? = nil, searchOn: String? = nil, sortBy: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/usergroups"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "search": search,
            "searchOn": searchOn,
            "sortBy": sortBy,
            "page": page?.encodeToJSON(),
            "pageSize": pageSize?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (query) ID of the user group. (optional)
     - parameter userID: (query) ID of the user. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func listUserAssignments(buyerID buyerID: String, userGroupID: String? = nil, userID: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listUserAssignmentsWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID, userID: userID, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/usergroups/assignments
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (query) ID of the user group. (optional)
     - parameter userID: (query) ID of the user. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listUserAssignmentsWithRequestBuilder(buyerID buyerID: String, userGroupID: String? = nil, userID: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/usergroups/assignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "userGroupID": userGroupID,
            "userID": userID,
            "page": page?.encodeToJSON(),
            "pageSize": pageSize?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter group: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func patch(buyerID buyerID: String, userGroupID: String, group: UserGroup, completion: ((error: ErrorType?) -> Void)) {
        patchWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID, group: group).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - PATCH /buyers/{buyerID}/usergroups/{userGroupID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter group: (body)  

     - returns: RequestBuilder<Void> 
     */
    public class func patchWithRequestBuilder(buyerID buyerID: String, userGroupID: String, group: UserGroup) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/usergroups/{userGroupID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userGroupID}", withString: "\(userGroupID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = group.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupAssignment: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func saveUserAssignment(buyerID buyerID: String, userGroupAssignment: UserGroupAssignment, completion: ((error: ErrorType?) -> Void)) {
        saveUserAssignmentWithRequestBuilder(buyerID: buyerID, userGroupAssignment: userGroupAssignment).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - POST /buyers/{buyerID}/usergroups/assignments
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupAssignment: (body)  

     - returns: RequestBuilder<Void> 
     */
    public class func saveUserAssignmentWithRequestBuilder(buyerID buyerID: String, userGroupAssignment: UserGroupAssignment) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/usergroups/assignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = userGroupAssignment.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter group: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func update(buyerID buyerID: String, userGroupID: String, group: UserGroup, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        updateWithRequestBuilder(buyerID: buyerID, userGroupID: userGroupID, group: group).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - PUT /buyers/{buyerID}/usergroups/{userGroupID}
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter userGroupID: (path) ID of the user group. 
     - parameter group: (body)  

     - returns: RequestBuilder<AnyObject> 
     */
    public class func updateWithRequestBuilder(buyerID buyerID: String, userGroupID: String, group: UserGroup) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/usergroups/{userGroupID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{userGroupID}", withString: "\(userGroupID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = group.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}