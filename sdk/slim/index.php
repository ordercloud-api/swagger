<?php
/**
 * OrderCloud
 * @version 0.1
 */

require_once __DIR__ . '/vendor/autoload.php';

$app = new Slim\App();


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/addresses', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/addresses/{addressID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/addresses', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/addresses/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $addressID = $queryParams['addressID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $isShipping = $queryParams['isShipping'];    $isBilling = $queryParams['isBilling'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/addresses/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/adminusers', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/adminusers/{userID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/adminusers/{userID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/adminusers', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/adminusers/{userID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/adminusers/{userID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/approvalrules', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/approvalrules', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/categories', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteProductAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteProductAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/categories/{categoryID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/categories', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $parentID = $queryParams['parentID'];    $depth = $queryParams['depth'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/categories/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $categoryID = $queryParams['categoryID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * GET listChildren
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/categories/{parentID}/categories', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $depth = $queryParams['depth'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listChildren as a GET method ?');
            return $response;
            });


/**
 * GET listProductAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/categories/productassignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $categoryID = $queryParams['categoryID'];    $productID = $queryParams['productID'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listProductAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/categories/{categoryID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/categories/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * POST saveProductAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/categories/productassignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveProductAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/categories/{categoryID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/costcenters', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/costcenters/{costCenterID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/costcenters', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/costcenters/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $costCenterID = $queryParams['costCenterID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/costcenters/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/creditcards', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/creditcards/{creditCardID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/creditcards', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/creditcards/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $creditCardID = $queryParams['creditCardID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/creditcards/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * DELETE resetToDefault
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing resetToDefault as a DELETE method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/files/{fileID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/files', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * POST postFileData
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/files', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $filename = $queryParams['filename'];    
            
            
            $response->write('How about implementing postFileData as a POST method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/lineitems', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/lineitems', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchShippingAddress
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchShippingAddress as a PATCH method ?');
            return $response;
            });


/**
 * PUT setShippingAddress
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing setShippingAddress as a PUT method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST createAddress
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/me/addresses', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing createAddress as a POST method ?');
            return $response;
            });


/**
 * POST createCreditCard
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/me/creditcards', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing createCreditCard as a POST method ?');
            return $response;
            });


/**
 * DELETE deleteAddress
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/me/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteAddress as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteCreditCard
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/me/creditcards/{creditcardID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteCreditCard as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET getAddress
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getAddress as a GET method ?');
            return $response;
            });


/**
 * GET getCreditCard
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/creditcards/{creditcardID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getCreditCard as a GET method ?');
            return $response;
            });


/**
 * GET getOrder
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/orders/{orderID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getOrder as a GET method ?');
            return $response;
            });


/**
 * GET getProduct
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/products/{productID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getProduct as a GET method ?');
            return $response;
            });


/**
 * GET getPromotion
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/promotions/{promotionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getPromotion as a GET method ?');
            return $response;
            });


/**
 * GET getSpec
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/products/{productID}/specs/{specID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getSpec as a GET method ?');
            return $response;
            });


/**
 * GET listAddresses
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/addresses', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAddresses as a GET method ?');
            return $response;
            });


/**
 * GET listCategories
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/categories', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $depth = $queryParams['depth'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listCategories as a GET method ?');
            return $response;
            });


/**
 * GET listCostCenters
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/costcenters', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listCostCenters as a GET method ?');
            return $response;
            });


/**
 * GET listCreditCards
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/creditcards', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listCreditCards as a GET method ?');
            return $response;
            });


/**
 * GET listIncomingOrders
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/orders/incoming', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $from = $queryParams['from'];    $to = $queryParams['to'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listIncomingOrders as a GET method ?');
            return $response;
            });


/**
 * GET listOutgoingOrders
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/orders/outgoing', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $from = $queryParams['from'];    $to = $queryParams['to'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listOutgoingOrders as a GET method ?');
            return $response;
            });


/**
 * GET listProducts
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/products', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $categoryID = $queryParams['categoryID'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listProducts as a GET method ?');
            return $response;
            });


/**
 * GET listPromotions
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/promotions', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listPromotions as a GET method ?');
            return $response;
            });


/**
 * GET listSpecs
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/products/{productID}/specs', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listSpecs as a GET method ?');
            return $response;
            });


/**
 * GET listSubcategories
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/categories/{parentID}/categories', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $depth = $queryParams['depth'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listSubcategories as a GET method ?');
            return $response;
            });


/**
 * GET listUserGroups
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/me/usergroups', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listUserGroups as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/me', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchAddress
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/me/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchAddress as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchCreditCard
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/me/creditcards/{creditcardID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchCreditCard as a PATCH method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/me', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * PUT updateAddress
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/me/addresses/{addressID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing updateAddress as a PUT method ?');
            return $response;
            });


/**
 * PUT updateCreditCard
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/me/creditcards/{creditcardID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing updateCreditCard as a PUT method ?');
            return $response;
            });


/**
 * POST addPromotion
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing addPromotion as a POST method ?');
            return $response;
            });


/**
 * POST approve
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/approve', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $comments = $queryParams['comments'];    
            
            
            $response->write('How about implementing approve as a POST method ?');
            return $response;
            });


/**
 * POST cancel
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/cancel', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing cancel as a POST method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * POST decline
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/decline', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $comments = $queryParams['comments'];    
            
            
            $response->write('How about implementing decline as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET listApprovals
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/approvals', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listApprovals as a GET method ?');
            return $response;
            });


/**
 * GET listEligibleApprovers
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/eligibleapprovers', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listEligibleApprovers as a GET method ?');
            return $response;
            });


/**
 * GET listIncoming
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/orders/incoming', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $buyerID = $queryParams['buyerID'];    $from = $queryParams['from'];    $to = $queryParams['to'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listIncoming as a GET method ?');
            return $response;
            });


/**
 * GET listOutgoing
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/orders/outgoing', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $buyerID = $queryParams['buyerID'];    $from = $queryParams['from'];    $to = $queryParams['to'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listOutgoing as a GET method ?');
            return $response;
            });


/**
 * GET listPromotions
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/promotions', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listPromotions as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchBillingAddress
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/billto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchBillingAddress as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchShippingAddress
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/shipto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchShippingAddress as a PATCH method ?');
            return $response;
            });


/**
 * DELETE removePromotion
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing removePromotion as a DELETE method ?');
            return $response;
            });


/**
 * PUT setBillingAddress
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/billto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing setBillingAddress as a PUT method ?');
            return $response;
            });


/**
 * PUT setShippingAddress
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/shipto', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing setShippingAddress as a PUT method ?');
            return $response;
            });


/**
 * POST ship
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/ship', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing ship as a POST method ?');
            return $response;
            });


/**
 * POST submit
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/submit', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing submit as a POST method ?');
            return $response;
            });


/**
 * PUT transferTempUserOrder
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $tempUserToken = $queryParams['tempUserToken'];    
            
            
            $response->write('How about implementing transferTempUserOrder as a PUT method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * PUT resetPassword
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/password/reset/{verificationCode}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing resetPassword as a PUT method ?');
            return $response;
            });


/**
 * POST sendVerificationCode
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/password/reset', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing sendVerificationCode as a POST method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/payments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * POST createTransaction
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing createTransaction as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteTransaction
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteTransaction as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/payments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchTransaction
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchTransaction as a PATCH method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * PUT updateTransaction
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing updateTransaction as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/priceschedules', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/priceschedules/{priceScheduleID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deletePriceBreak
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/priceschedules/{priceScheduleID}/PriceBreaks', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $quantity = $queryParams['quantity'];    
            
            
            $response->write('How about implementing deletePriceBreak as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/priceschedules/{priceScheduleID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/priceschedules', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/priceschedules/{priceScheduleID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST savePriceBreak
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/priceschedules/{priceScheduleID}/PriceBreaks', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing savePriceBreak as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/priceschedules/{priceScheduleID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/products', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/products/{productID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/products/{productID}/assignments/{buyerID}', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * POST generateVariants
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/products/{productID}/variants/generate', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $overwriteExisting = $queryParams['overwriteExisting'];    
            
            
            $response->write('How about implementing generateVariants as a POST method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET getInventory
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}/inventory', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getInventory as a GET method ?');
            return $response;
            });


/**
 * GET getVariant
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}/variants/{variantID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getVariant as a GET method ?');
            return $response;
            });


/**
 * GET getVariantInventory
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}/variants/inventory/{variantID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getVariantInventory as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $productID = $queryParams['productID'];    $buyerID = $queryParams['buyerID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $priceScheduleID = $queryParams['priceScheduleID'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * GET listInventory
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/inventory', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listInventory as a GET method ?');
            return $response;
            });


/**
 * GET listVariantInventory
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}/variants/inventory', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listVariantInventory as a GET method ?');
            return $response;
            });


/**
 * GET listVariants
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/products/{productID}/variants', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listVariants as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/products/{productID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchVariant
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/products/{productID}/variants/{variantID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchVariant as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/products/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/products/{productID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * PUT updateInventory
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/products/{productID}/inventory/{inventory}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing updateInventory as a PUT method ?');
            return $response;
            });


/**
 * PUT updateVariant
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/products/{productID}/variants/{variantID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing updateVariant as a PUT method ?');
            return $response;
            });


/**
 * PUT updateVariantInventory
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/products/{productID}/variants/inventory/{variantID}/{inventory}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing updateVariantInventory as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/promotions', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/promotions/{promotionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/promotions/{promotionID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $buyerID = $queryParams['buyerID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/promotions/{promotionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/promotions', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/promotions/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $buyerID = $queryParams['buyerID'];    $promotionID = $queryParams['promotionID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/promotions/{promotionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/promotions/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/promotions/{promotionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/SecurityProfiles/{securityProfileID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/SecurityProfiles', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/shipments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/shipments/{shipmentID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteItem
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteItem as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/shipments/{shipmentID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/shipments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $orderID = $queryParams['orderID'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/shipments/{shipmentID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveItem
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/shipments/{shipmentID}/items', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveItem as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/shipments/{shipmentID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/specs', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * POST createOption
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/specs/{specID}/options', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing createOption as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/specs/{specID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteOption
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/specs/{specID}/options/{optionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteOption as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteProductAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/specs/{specID}/productassignments/{productID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteProductAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/specs/{specID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET getOption
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/specs/{specID}/options/{optionID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing getOption as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/specs', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listOptions
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/specs/{specID}/options', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listOptions as a GET method ?');
            return $response;
            });


/**
 * GET listProductAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/specs/productassignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $specID = $queryParams['specID'];    $productID = $queryParams['productID'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listProductAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/specs/{specID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PATCH patchOption
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/specs/{specID}/options/{optionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patchOption as a PATCH method ?');
            return $response;
            });


/**
 * POST saveProductAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/specs/productassignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveProductAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/specs/{specID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * PUT updateOption
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/specs/{specID}/options/{optionID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing updateOption as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/spendingaccounts', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    
            
            
            $response->write('How about implementing deleteAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/spendingaccounts', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/spendingaccounts/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $spendingAccountID = $queryParams['spendingAccountID'];    $userID = $queryParams['userID'];    $userGroupID = $queryParams['userGroupID'];    $level = $queryParams['level'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/spendingaccounts/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/users', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/users/{userID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/users/{userID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * POST getAccessToken
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/users/{userID}/accesstoken', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing getAccessToken as a POST method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/users', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userGroupID = $queryParams['userGroupID'];    $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/users/{userID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/users/{userID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });


/**
 * POST create
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/usergroups', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing create as a POST method ?');
            return $response;
            });


/**
 * DELETE delete
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing delete as a DELETE method ?');
            return $response;
            });


/**
 * DELETE deleteUserAssignment
 * Summary: 
 * Notes: 

 */
$app->DELETE('/v1/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing deleteUserAssignment as a DELETE method ?');
            return $response;
            });


/**
 * GET get
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing get as a GET method ?');
            return $response;
            });


/**
 * GET list
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/usergroups', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $search = $queryParams['search'];    $searchOn = $queryParams['searchOn'];    $sortBy = $queryParams['sortBy'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing list as a GET method ?');
            return $response;
            });


/**
 * GET listUserAssignments
 * Summary: 
 * Notes: 

 */
$app->GET('/v1/buyers/{buyerID}/usergroups/assignments', function($request, $response, $args) {
            
            $queryParams = $request->getQueryParams();
            $userGroupID = $queryParams['userGroupID'];    $userID = $queryParams['userID'];    $page = $queryParams['page'];    $pageSize = $queryParams['pageSize'];    
            
            
            $response->write('How about implementing listUserAssignments as a GET method ?');
            return $response;
            });


/**
 * PATCH patch
 * Summary: 
 * Notes: 

 */
$app->PATCH('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing patch as a PATCH method ?');
            return $response;
            });


/**
 * POST saveUserAssignment
 * Summary: 
 * Notes: 

 */
$app->POST('/v1/buyers/{buyerID}/usergroups/assignments', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing saveUserAssignment as a POST method ?');
            return $response;
            });


/**
 * PUT update
 * Summary: 
 * Notes: 

 */
$app->PUT('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function($request, $response, $args) {
            
            
            
            $body = $request->getParsedBody();
            $response->write('How about implementing update as a PUT method ?');
            return $response;
            });



$app->run();
