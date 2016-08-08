//
// CategoryAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class CategoryAPI: APIBase {
    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func callGet(buyerID buyerID: String, categoryID: String, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        callGetWithRequestBuilder(buyerID: buyerID, categoryID: categoryID).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/categories/{categoryID}
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 

     - returns: RequestBuilder<AnyObject> 
     */
    public class func callGetWithRequestBuilder(buyerID buyerID: String, categoryID: String) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories/{categoryID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter category: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func create(buyerID buyerID: String, category: Category, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        createWithRequestBuilder(buyerID: buyerID, category: category).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - POST /buyers/{buyerID}/categories
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter category: (body)  

     - returns: RequestBuilder<AnyObject> 
     */
    public class func createWithRequestBuilder(buyerID buyerID: String, category: Category) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = category.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func delete(buyerID buyerID: String, categoryID: String, completion: ((error: ErrorType?) -> Void)) {
        deleteWithRequestBuilder(buyerID: buyerID, categoryID: categoryID).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /buyers/{buyerID}/categories/{categoryID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteWithRequestBuilder(buyerID buyerID: String, categoryID: String) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/{categoryID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter userID: (query) ID of the user. (optional)
     - parameter userGroupID: (query) ID of the user group. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteAssignment(buyerID buyerID: String, categoryID: String, userID: String? = nil, userGroupID: String? = nil, completion: ((error: ErrorType?) -> Void)) {
        deleteAssignmentWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, userID: userID, userGroupID: userGroupID).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /buyers/{buyerID}/categories/{categoryID}/assignments
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter userID: (query) ID of the user. (optional)
     - parameter userGroupID: (query) ID of the user group. (optional)

     - returns: RequestBuilder<Void> 
     */
    public class func deleteAssignmentWithRequestBuilder(buyerID buyerID: String, categoryID: String, userID: String? = nil, userGroupID: String? = nil) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/{categoryID}/assignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "userID": userID,
            "userGroupID": userGroupID
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter productID: (path) ID of the product. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteProductAssignment(buyerID buyerID: String, categoryID: String, productID: String, completion: ((error: ErrorType?) -> Void)) {
        deleteProductAssignmentWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, productID: productID).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter productID: (path) ID of the product. 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteProductAssignmentWithRequestBuilder(buyerID buyerID: String, categoryID: String, productID: String) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{productID}", withString: "\(productID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter parentID: (query) ID of the parent. (optional)
     - parameter depth: (query) Depth of the category. (optional)
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter searchOn: (query) Comma-delimited list of fields to search on. (optional)
     - parameter sortBy: (query) Comma-delimited list of fields to sort by. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func list(buyerID buyerID: String, parentID: String? = nil, depth: String? = nil, search: String? = nil, searchOn: String? = nil, sortBy: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listWithRequestBuilder(buyerID: buyerID, parentID: parentID, depth: depth, search: search, searchOn: searchOn, sortBy: sortBy, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/categories
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter parentID: (query) ID of the parent. (optional)
     - parameter depth: (query) Depth of the category. (optional)
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter searchOn: (query) Comma-delimited list of fields to search on. (optional)
     - parameter sortBy: (query) Comma-delimited list of fields to sort by. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listWithRequestBuilder(buyerID buyerID: String, parentID: String? = nil, depth: String? = nil, search: String? = nil, searchOn: String? = nil, sortBy: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "parentID": parentID,
            "depth": depth,
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
     - parameter categoryID: (query) ID of the category. (optional)
     - parameter userID: (query) ID of the user. (optional)
     - parameter userGroupID: (query) ID of the user group. (optional)
     - parameter level: (query) Level of the category. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func listAssignments(buyerID buyerID: String, categoryID: String? = nil, userID: String? = nil, userGroupID: String? = nil, level: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listAssignmentsWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, userID: userID, userGroupID: userGroupID, level: level, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/categories/assignments
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (query) ID of the category. (optional)
     - parameter userID: (query) ID of the user. (optional)
     - parameter userGroupID: (query) ID of the user group. (optional)
     - parameter level: (query) Level of the category. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listAssignmentsWithRequestBuilder(buyerID buyerID: String, categoryID: String? = nil, userID: String? = nil, userGroupID: String? = nil, level: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories/assignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "categoryID": categoryID,
            "userID": userID,
            "userGroupID": userGroupID,
            "level": level,
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
     - parameter parentID: (path) ID of the parent. 
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter depth: (query) Depth of the category. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func listChildren(buyerID buyerID: String, parentID: String, search: String? = nil, depth: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listChildrenWithRequestBuilder(buyerID: buyerID, parentID: parentID, search: search, depth: depth, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/categories/{parentID}/categories
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter parentID: (path) ID of the parent. 
     - parameter search: (query) Word or phrase to search for. (optional)
     - parameter depth: (query) Depth of the category. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listChildrenWithRequestBuilder(buyerID buyerID: String, parentID: String, search: String? = nil, depth: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories/{parentID}/categories"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{parentID}", withString: "\(parentID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "search": search,
            "depth": depth,
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
     - parameter categoryID: (query) ID of the category. (optional)
     - parameter productID: (query) ID of the product. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func listProductAssignments(buyerID buyerID: String, categoryID: String? = nil, productID: String? = nil, page: Int32? = nil, pageSize: Int32? = nil, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        listProductAssignmentsWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, productID: productID, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /buyers/{buyerID}/categories/productassignments
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (query) ID of the category. (optional)
     - parameter productID: (query) ID of the product. (optional)
     - parameter page: (query) Page of results to return. Default: 1 (optional)
     - parameter pageSize: (query) Number of results to return per page. Default: 20, max: 100. (optional)

     - returns: RequestBuilder<AnyObject> 
     */
    public class func listProductAssignmentsWithRequestBuilder(buyerID buyerID: String, categoryID: String? = nil, productID: String? = nil, page: Int32? = nil, pageSize: Int32? = nil) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories/productassignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "categoryID": categoryID,
            "productID": productID,
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
     - parameter categoryID: (path) ID of the category. 
     - parameter category: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func patch(buyerID buyerID: String, categoryID: String, category: Category, completion: ((error: ErrorType?) -> Void)) {
        patchWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, category: category).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - PATCH /buyers/{buyerID}/categories/{categoryID}
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter category: (body)  

     - returns: RequestBuilder<Void> 
     */
    public class func patchWithRequestBuilder(buyerID buyerID: String, categoryID: String, category: Category) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/{categoryID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = category.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryAssignment: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func saveAssignment(buyerID buyerID: String, categoryAssignment: CategoryAssignment, completion: ((error: ErrorType?) -> Void)) {
        saveAssignmentWithRequestBuilder(buyerID: buyerID, categoryAssignment: categoryAssignment).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - POST /buyers/{buyerID}/categories/assignments
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryAssignment: (body)  

     - returns: RequestBuilder<Void> 
     */
    public class func saveAssignmentWithRequestBuilder(buyerID buyerID: String, categoryAssignment: CategoryAssignment) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/assignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = categoryAssignment.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter productAssignment: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func saveProductAssignment(buyerID buyerID: String, productAssignment: CategoryProductAssignment, completion: ((error: ErrorType?) -> Void)) {
        saveProductAssignmentWithRequestBuilder(buyerID: buyerID, productAssignment: productAssignment).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - POST /buyers/{buyerID}/categories/productassignments
     - OAuth:
       - type: oauth2
       - name: auth
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter productAssignment: (body)  

     - returns: RequestBuilder<Void> 
     */
    public class func saveProductAssignmentWithRequestBuilder(buyerID buyerID: String, productAssignment: CategoryProductAssignment) -> RequestBuilder<Void> {
        var path = "/buyers/{buyerID}/categories/productassignments"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = productAssignment.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter category: (body)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func update(buyerID buyerID: String, categoryID: String, category: Category, completion: ((data: AnyObject?, error: ErrorType?) -> Void)) {
        updateWithRequestBuilder(buyerID: buyerID, categoryID: categoryID, category: category).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - PUT /buyers/{buyerID}/categories/{categoryID}
     - OAuth:
       - type: oauth2
       - name: auth
     - examples: [{example="{}", contentType=application/json}]
     
     - parameter buyerID: (path) ID of the buyer. 
     - parameter categoryID: (path) ID of the category. 
     - parameter category: (body)  

     - returns: RequestBuilder<AnyObject> 
     */
    public class func updateWithRequestBuilder(buyerID buyerID: String, categoryID: String, category: Category) -> RequestBuilder<AnyObject> {
        var path = "/buyers/{buyerID}/categories/{categoryID}"
        path = path.stringByReplacingOccurrencesOfString("{buyerID}", withString: "\(buyerID)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{categoryID}", withString: "\(categoryID)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = category.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<AnyObject>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}