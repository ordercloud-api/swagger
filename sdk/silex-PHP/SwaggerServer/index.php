<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->POST('/v1/buyers/{buyerID}/addresses', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/addresses/{addressID}', function(Application $app, Request $request, $buyer_id, $address_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/addresses/{addressID}/assignments', function(Application $app, Request $request, $buyer_id, $address_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/addresses/{addressID}', function(Application $app, Request $request, $buyer_id, $address_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/addresses', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/addresses/assignments', function(Application $app, Request $request, $buyer_id) {
            $address_id = $request->get('address_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $is_shipping = $request->get('is_shipping');    $is_billing = $request->get('is_billing');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/addresses/{addressID}', function(Application $app, Request $request, $buyer_id, $address_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/addresses/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/addresses/{addressID}', function(Application $app, Request $request, $buyer_id, $address_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/adminusers', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/adminusers/{userID}', function(Application $app, Request $request, $user_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/adminusers/{userID}', function(Application $app, Request $request, $user_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/adminusers', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/adminusers/{userID}', function(Application $app, Request $request, $user_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PUT('/v1/adminusers/{userID}', function(Application $app, Request $request, $user_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/approvalrules', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function(Application $app, Request $request, $buyer_id, $approval_rule_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function(Application $app, Request $request, $buyer_id, $approval_rule_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/approvalrules', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function(Application $app, Request $request, $buyer_id, $approval_rule_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}', function(Application $app, Request $request, $buyer_id, $approval_rule_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers', function(Application $app, Request $request) {
            $search = $request->get('search');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PUT('/v1/buyers/{buyerID}', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/categories', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}', function(Application $app, Request $request, $buyer_id, $category_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}/assignments', function(Application $app, Request $request, $buyer_id, $category_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}', function(Application $app, Request $request, $buyer_id, $category_id, $product_id) {
            
            
            return new Response('How about implementing deleteProductAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/categories/{categoryID}', function(Application $app, Request $request, $buyer_id, $category_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/categories', function(Application $app, Request $request, $buyer_id) {
            $parent_id = $request->get('parent_id');    $depth = $request->get('depth');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/categories/assignments', function(Application $app, Request $request, $buyer_id) {
            $category_id = $request->get('category_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/categories/{parentID}/categories', function(Application $app, Request $request, $buyer_id, $parent_id) {
            $search = $request->get('search');    $depth = $request->get('depth');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listChildren as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/categories/productassignments', function(Application $app, Request $request, $buyer_id) {
            $category_id = $request->get('category_id');    $product_id = $request->get('product_id');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listProductAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/categories/{categoryID}', function(Application $app, Request $request, $buyer_id, $category_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/categories/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/categories/productassignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveProductAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/categories/{categoryID}', function(Application $app, Request $request, $buyer_id, $category_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/costcenters', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function(Application $app, Request $request, $buyer_id, $cost_center_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/costcenters/{costCenterID}/assignments', function(Application $app, Request $request, $buyer_id, $cost_center_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function(Application $app, Request $request, $buyer_id, $cost_center_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/costcenters', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/costcenters/assignments', function(Application $app, Request $request, $buyer_id) {
            $cost_center_id = $request->get('cost_center_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function(Application $app, Request $request, $buyer_id, $cost_center_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/costcenters/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/costcenters/{costCenterID}', function(Application $app, Request $request, $buyer_id, $cost_center_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/creditcards', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function(Application $app, Request $request, $buyer_id, $credit_card_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/creditcards/{creditCardID}/assignments', function(Application $app, Request $request, $buyer_id, $credit_card_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function(Application $app, Request $request, $buyer_id, $credit_card_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/creditcards', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/creditcards/assignments', function(Application $app, Request $request, $buyer_id) {
            $credit_card_id = $request->get('credit_card_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function(Application $app, Request $request, $buyer_id, $credit_card_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/creditcards/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/creditcards/{creditCardID}', function(Application $app, Request $request, $buyer_id, $credit_card_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->GET('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function(Application $app, Request $request, $buyer_id, $email_template_type) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function(Application $app, Request $request, $buyer_id, $email_template_type) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function(Application $app, Request $request, $buyer_id, $email_template_type) {
            
            
            return new Response('How about implementing resetToDefault as a DELETE method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', function(Application $app, Request $request, $buyer_id, $email_template_type) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->GET('/v1/files/{fileID}', function(Application $app, Request $request, $file_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/files', function(Application $app, Request $request) {
            $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->POST('/v1/files', function(Application $app, Request $request) {
            $filename = $request->get('filename');    
            
            return new Response('How about implementing postFileData as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/lineitems', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/lineitems', function(Application $app, Request $request, $buyer_id, $order_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing patchShippingAddress as a PATCH method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing setShippingAddress as a PUT method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}', function(Application $app, Request $request, $buyer_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/me/addresses', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing createAddress as a POST method ?');
            });


$app->POST('/v1/me/creditcards', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing createCreditCard as a POST method ?');
            });


$app->DELETE('/v1/me/addresses/{addressID}', function(Application $app, Request $request, $address_id) {
            
            
            return new Response('How about implementing deleteAddress as a DELETE method ?');
            });


$app->DELETE('/v1/me/creditcards/{creditcardID}', function(Application $app, Request $request, $creditcard_id) {
            
            
            return new Response('How about implementing deleteCreditCard as a DELETE method ?');
            });


$app->GET('/v1/me', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/me/addresses/{addressID}', function(Application $app, Request $request, $address_id) {
            
            
            return new Response('How about implementing getAddress as a GET method ?');
            });


$app->GET('/v1/me/creditcards/{creditcardID}', function(Application $app, Request $request, $creditcard_id) {
            
            
            return new Response('How about implementing getCreditCard as a GET method ?');
            });


$app->GET('/v1/me/orders/{orderID}', function(Application $app, Request $request, $order_id) {
            
            
            return new Response('How about implementing getOrder as a GET method ?');
            });


$app->GET('/v1/me/products/{productID}', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing getProduct as a GET method ?');
            });


$app->GET('/v1/me/promotions/{promotionID}', function(Application $app, Request $request, $promotion_id) {
            
            
            return new Response('How about implementing getPromotion as a GET method ?');
            });


$app->GET('/v1/me/products/{productID}/specs/{specID}', function(Application $app, Request $request, $product_id, $spec_id) {
            
            
            return new Response('How about implementing getSpec as a GET method ?');
            });


$app->GET('/v1/me/addresses', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAddresses as a GET method ?');
            });


$app->GET('/v1/me/categories', function(Application $app, Request $request) {
            $depth = $request->get('depth');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listCategories as a GET method ?');
            });


$app->GET('/v1/me/costcenters', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listCostCenters as a GET method ?');
            });


$app->GET('/v1/me/creditcards', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listCreditCards as a GET method ?');
            });


$app->GET('/v1/me/orders/incoming', function(Application $app, Request $request) {
            $from = $request->get('from');    $to = $request->get('to');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listIncomingOrders as a GET method ?');
            });


$app->GET('/v1/me/orders/outgoing', function(Application $app, Request $request) {
            $from = $request->get('from');    $to = $request->get('to');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listOutgoingOrders as a GET method ?');
            });


$app->GET('/v1/me/products', function(Application $app, Request $request) {
            $category_id = $request->get('category_id');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listProducts as a GET method ?');
            });


$app->GET('/v1/me/promotions', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listPromotions as a GET method ?');
            });


$app->GET('/v1/me/products/{productID}/specs', function(Application $app, Request $request, $product_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listSpecs as a GET method ?');
            });


$app->GET('/v1/me/categories/{parentID}/categories', function(Application $app, Request $request, $parent_id) {
            $depth = $request->get('depth');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listSubcategories as a GET method ?');
            });


$app->GET('/v1/me/usergroups', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listUserGroups as a GET method ?');
            });


$app->PATCH('/v1/me', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/me/addresses/{addressID}', function(Application $app, Request $request, $address_id) {
            
            
            return new Response('How about implementing patchAddress as a PATCH method ?');
            });


$app->PATCH('/v1/me/creditcards/{creditcardID}', function(Application $app, Request $request, $creditcard_id) {
            
            
            return new Response('How about implementing patchCreditCard as a PATCH method ?');
            });


$app->PUT('/v1/me', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->PUT('/v1/me/addresses/{addressID}', function(Application $app, Request $request, $address_id) {
            
            
            return new Response('How about implementing updateAddress as a PUT method ?');
            });


$app->PUT('/v1/me/creditcards/{creditcardID}', function(Application $app, Request $request, $creditcard_id) {
            
            
            return new Response('How about implementing updateCreditCard as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', function(Application $app, Request $request, $buyer_id, $order_id, $promo_code) {
            
            
            return new Response('How about implementing addPromotion as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/approve', function(Application $app, Request $request, $buyer_id, $order_id) {
            $comments = $request->get('comments');    
            
            return new Response('How about implementing approve as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/cancel', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing cancel as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/decline', function(Application $app, Request $request, $buyer_id, $order_id) {
            $comments = $request->get('comments');    
            
            return new Response('How about implementing decline as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/approvals', function(Application $app, Request $request, $buyer_id, $order_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listApprovals as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/eligibleapprovers', function(Application $app, Request $request, $buyer_id, $order_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listEligibleApprovers as a GET method ?');
            });


$app->GET('/v1/orders/incoming', function(Application $app, Request $request) {
            $buyer_id = $request->get('buyer_id');    $from = $request->get('from');    $to = $request->get('to');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listIncoming as a GET method ?');
            });


$app->GET('/v1/orders/outgoing', function(Application $app, Request $request) {
            $buyer_id = $request->get('buyer_id');    $from = $request->get('from');    $to = $request->get('to');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listOutgoing as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/promotions', function(Application $app, Request $request, $buyer_id, $order_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listPromotions as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/billto', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing patchBillingAddress as a PATCH method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/shipto', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing patchShippingAddress as a PATCH method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', function(Application $app, Request $request, $buyer_id, $order_id, $promo_code) {
            
            
            return new Response('How about implementing removePromotion as a DELETE method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/billto', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing setBillingAddress as a PUT method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/shipto', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing setShippingAddress as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/ship', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing ship as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/submit', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing submit as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders', function(Application $app, Request $request, $buyer_id) {
            $temp_user_token = $request->get('temp_user_token');    
            
            return new Response('How about implementing transferTempUserOrder as a PUT method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->PUT('/v1/password/reset/{verificationCode}', function(Application $app, Request $request, $verification_code) {
            
            
            return new Response('How about implementing resetPassword as a PUT method ?');
            });


$app->POST('/v1/password/reset', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing sendVerificationCode as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/payments', function(Application $app, Request $request, $buyer_id, $order_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->POST('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id) {
            
            
            return new Response('How about implementing createTransaction as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id, $transaction_id) {
            
            
            return new Response('How about implementing deleteTransaction as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/orders/{orderID}/payments', function(Application $app, Request $request, $buyer_id, $order_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id, $transaction_id) {
            
            
            return new Response('How about implementing patchTransaction as a PATCH method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', function(Application $app, Request $request, $buyer_id, $order_id, $payment_id, $transaction_id) {
            
            
            return new Response('How about implementing updateTransaction as a PUT method ?');
            });


$app->POST('/v1/priceschedules', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/priceschedules/{priceScheduleID}', function(Application $app, Request $request, $price_schedule_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/priceschedules/{priceScheduleID}/PriceBreaks', function(Application $app, Request $request, $price_schedule_id) {
            $quantity = $request->get('quantity');    
            
            return new Response('How about implementing deletePriceBreak as a DELETE method ?');
            });


$app->GET('/v1/priceschedules/{priceScheduleID}', function(Application $app, Request $request, $price_schedule_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/priceschedules', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/priceschedules/{priceScheduleID}', function(Application $app, Request $request, $price_schedule_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/priceschedules/{priceScheduleID}/PriceBreaks', function(Application $app, Request $request, $price_schedule_id) {
            
            
            return new Response('How about implementing savePriceBreak as a POST method ?');
            });


$app->PUT('/v1/priceschedules/{priceScheduleID}', function(Application $app, Request $request, $price_schedule_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/products', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/products/{productID}', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/products/{productID}/assignments/{buyerID}', function(Application $app, Request $request, $buyer_id, $product_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->POST('/v1/products/{productID}/variants/generate', function(Application $app, Request $request, $product_id) {
            $overwrite_existing = $request->get('overwrite_existing');    
            
            return new Response('How about implementing generateVariants as a POST method ?');
            });


$app->GET('/v1/products/{productID}', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/products/{productID}/inventory', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing getInventory as a GET method ?');
            });


$app->GET('/v1/products/{productID}/variants/{variantID}', function(Application $app, Request $request, $product_id, $variant_id) {
            
            
            return new Response('How about implementing getVariant as a GET method ?');
            });


$app->GET('/v1/products/{productID}/variants/inventory/{variantID}', function(Application $app, Request $request, $product_id, $variant_id) {
            
            
            return new Response('How about implementing getVariantInventory as a GET method ?');
            });


$app->GET('/v1/products', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/products/assignments', function(Application $app, Request $request) {
            $product_id = $request->get('product_id');    $buyer_id = $request->get('buyer_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $price_schedule_id = $request->get('price_schedule_id');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->GET('/v1/products/inventory', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listInventory as a GET method ?');
            });


$app->GET('/v1/products/{productID}/variants/inventory', function(Application $app, Request $request, $product_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listVariantInventory as a GET method ?');
            });


$app->GET('/v1/products/{productID}/variants', function(Application $app, Request $request, $product_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listVariants as a GET method ?');
            });


$app->PATCH('/v1/products/{productID}', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/products/{productID}/variants/{variantID}', function(Application $app, Request $request, $product_id, $variant_id) {
            
            
            return new Response('How about implementing patchVariant as a PATCH method ?');
            });


$app->POST('/v1/products/assignments', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/products/{productID}', function(Application $app, Request $request, $product_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->PUT('/v1/products/{productID}/inventory/{inventory}', function(Application $app, Request $request, $product_id, $inventory) {
            
            
            return new Response('How about implementing updateInventory as a PUT method ?');
            });


$app->PUT('/v1/products/{productID}/variants/{variantID}', function(Application $app, Request $request, $product_id, $variant_id) {
            
            
            return new Response('How about implementing updateVariant as a PUT method ?');
            });


$app->PUT('/v1/products/{productID}/variants/inventory/{variantID}/{inventory}', function(Application $app, Request $request, $product_id, $variant_id, $inventory) {
            
            
            return new Response('How about implementing updateVariantInventory as a PUT method ?');
            });


$app->POST('/v1/promotions', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/promotions/{promotionID}', function(Application $app, Request $request, $promotion_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/promotions/{promotionID}/assignments', function(Application $app, Request $request, $promotion_id) {
            $buyer_id = $request->get('buyer_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->GET('/v1/promotions/{promotionID}', function(Application $app, Request $request, $promotion_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/promotions', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/promotions/assignments', function(Application $app, Request $request) {
            $buyer_id = $request->get('buyer_id');    $promotion_id = $request->get('promotion_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->PATCH('/v1/promotions/{promotionID}', function(Application $app, Request $request, $promotion_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/promotions/assignments', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/promotions/{promotionID}', function(Application $app, Request $request, $promotion_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->GET('/v1/SecurityProfiles/{securityProfileID}', function(Application $app, Request $request, $security_profile_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/SecurityProfiles', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->POST('/v1/buyers/{buyerID}/shipments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/shipments/{shipmentID}', function(Application $app, Request $request, $buyer_id, $shipment_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}', function(Application $app, Request $request, $buyer_id, $shipment_id, $order_id, $line_item_id) {
            
            
            return new Response('How about implementing deleteItem as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/shipments/{shipmentID}', function(Application $app, Request $request, $buyer_id, $shipment_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/shipments', function(Application $app, Request $request, $buyer_id) {
            $order_id = $request->get('order_id');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/shipments/{shipmentID}', function(Application $app, Request $request, $buyer_id, $shipment_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/shipments/{shipmentID}/items', function(Application $app, Request $request, $buyer_id, $shipment_id) {
            
            
            return new Response('How about implementing saveItem as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/shipments/{shipmentID}', function(Application $app, Request $request, $buyer_id, $shipment_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/specs', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->POST('/v1/specs/{specID}/options', function(Application $app, Request $request, $spec_id) {
            
            
            return new Response('How about implementing createOption as a POST method ?');
            });


$app->DELETE('/v1/specs/{specID}', function(Application $app, Request $request, $spec_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/specs/{specID}/options/{optionID}', function(Application $app, Request $request, $spec_id, $option_id) {
            
            
            return new Response('How about implementing deleteOption as a DELETE method ?');
            });


$app->DELETE('/v1/specs/{specID}/productassignments/{productID}', function(Application $app, Request $request, $spec_id, $product_id) {
            
            
            return new Response('How about implementing deleteProductAssignment as a DELETE method ?');
            });


$app->GET('/v1/specs/{specID}', function(Application $app, Request $request, $spec_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/specs/{specID}/options/{optionID}', function(Application $app, Request $request, $spec_id, $option_id) {
            
            
            return new Response('How about implementing getOption as a GET method ?');
            });


$app->GET('/v1/specs', function(Application $app, Request $request) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/specs/{specID}/options', function(Application $app, Request $request, $spec_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listOptions as a GET method ?');
            });


$app->GET('/v1/specs/productassignments', function(Application $app, Request $request) {
            $spec_id = $request->get('spec_id');    $product_id = $request->get('product_id');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listProductAssignments as a GET method ?');
            });


$app->PATCH('/v1/specs/{specID}', function(Application $app, Request $request, $spec_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PATCH('/v1/specs/{specID}/options/{optionID}', function(Application $app, Request $request, $spec_id, $option_id) {
            
            
            return new Response('How about implementing patchOption as a PATCH method ?');
            });


$app->POST('/v1/specs/productassignments', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing saveProductAssignment as a POST method ?');
            });


$app->PUT('/v1/specs/{specID}', function(Application $app, Request $request, $spec_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->PUT('/v1/specs/{specID}/options/{optionID}', function(Application $app, Request $request, $spec_id, $option_id) {
            
            
            return new Response('How about implementing updateOption as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/spendingaccounts', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function(Application $app, Request $request, $buyer_id, $spending_account_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments', function(Application $app, Request $request, $buyer_id, $spending_account_id) {
            $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    
            
            return new Response('How about implementing deleteAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function(Application $app, Request $request, $buyer_id, $spending_account_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/spendingaccounts', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/spendingaccounts/assignments', function(Application $app, Request $request, $buyer_id) {
            $spending_account_id = $request->get('spending_account_id');    $user_id = $request->get('user_id');    $user_group_id = $request->get('user_group_id');    $level = $request->get('level');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function(Application $app, Request $request, $buyer_id, $spending_account_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/spendingaccounts/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}', function(Application $app, Request $request, $buyer_id, $spending_account_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/users', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/users/{userID}', function(Application $app, Request $request, $buyer_id, $user_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/users/{userID}', function(Application $app, Request $request, $buyer_id, $user_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->POST('/v1/buyers/{buyerID}/users/{userID}/accesstoken', function(Application $app, Request $request, $buyer_id, $user_id) {
            
            
            return new Response('How about implementing getAccessToken as a POST method ?');
            });


$app->GET('/v1/buyers/{buyerID}/users', function(Application $app, Request $request, $buyer_id) {
            $user_group_id = $request->get('user_group_id');    $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/users/{userID}', function(Application $app, Request $request, $buyer_id, $user_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/users/{userID}', function(Application $app, Request $request, $buyer_id, $user_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->POST('/v1/buyers/{buyerID}/usergroups', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing create as a POST method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function(Application $app, Request $request, $buyer_id, $user_group_id) {
            
            
            return new Response('How about implementing delete as a DELETE method ?');
            });


$app->DELETE('/v1/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}', function(Application $app, Request $request, $buyer_id, $user_group_id, $user_id) {
            
            
            return new Response('How about implementing deleteUserAssignment as a DELETE method ?');
            });


$app->GET('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function(Application $app, Request $request, $buyer_id, $user_group_id) {
            
            
            return new Response('How about implementing get as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/usergroups', function(Application $app, Request $request, $buyer_id) {
            $search = $request->get('search');    $search_on = $request->get('search_on');    $sort_by = $request->get('sort_by');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing list as a GET method ?');
            });


$app->GET('/v1/buyers/{buyerID}/usergroups/assignments', function(Application $app, Request $request, $buyer_id) {
            $user_group_id = $request->get('user_group_id');    $user_id = $request->get('user_id');    $page = $request->get('page');    $page_size = $request->get('page_size');    
            
            return new Response('How about implementing listUserAssignments as a GET method ?');
            });


$app->PATCH('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function(Application $app, Request $request, $buyer_id, $user_group_id) {
            
            
            return new Response('How about implementing patch as a PATCH method ?');
            });


$app->POST('/v1/buyers/{buyerID}/usergroups/assignments', function(Application $app, Request $request, $buyer_id) {
            
            
            return new Response('How about implementing saveUserAssignment as a POST method ?');
            });


$app->PUT('/v1/buyers/{buyerID}/usergroups/{userGroupID}', function(Application $app, Request $request, $buyer_id, $user_group_id) {
            
            
            return new Response('How about implementing update as a PUT method ?');
            });


$app->run();
