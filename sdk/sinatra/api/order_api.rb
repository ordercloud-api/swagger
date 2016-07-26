require 'json'


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "add_promotion", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "promo_code",
      "description" => "Promo code of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/approve', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "approve", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/approve", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "comments",
      "description" => "Comments to be saved with the order approval.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/cancel', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "cancel", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/cancel", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Order",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/decline', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "decline", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/decline", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "comments",
      "description" => "Comments to be saved with the order denial.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/orders/{orderID}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}/approvals', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "list_approvals", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/approvals", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "search",
      "description" => "Word or phrase to search for.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search_on",
      "description" => "Comma-delimited list of fields to search on.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "sort_by",
      "description" => "Comma-delimited list of fields to sort by.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page",
      "description" => "Page of results to return. Default: 1",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page_size",
      "description" => "Number of results to return per page. Default: 20, max: 100.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}/eligibleapprovers', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "list_eligible_approvers", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/eligibleapprovers", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "search",
      "description" => "Word or phrase to search for.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search_on",
      "description" => "Comma-delimited list of fields to search on.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "sort_by",
      "description" => "Comma-delimited list of fields to sort by.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page",
      "description" => "Page of results to return. Default: 1",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page_size",
      "description" => "Number of results to return per page. Default: 20, max: 100.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/orders/incoming', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "list_incoming", 
  "responseClass" => "object", 
  "endpoint" => "/orders/incoming", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "from",
      "description" => "Lower bound of date range that the order was submitted.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "to",
      "description" => "Upper bound of date range that the order was submitted.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search",
      "description" => "Word or phrase to search for.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search_on",
      "description" => "Comma-delimited list of fields to search on.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "sort_by",
      "description" => "Comma-delimited list of fields to sort by.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page",
      "description" => "Page of results to return. Default: 1",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page_size",
      "description" => "Number of results to return per page. Default: 20, max: 100.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/orders/outgoing', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "list_outgoing", 
  "responseClass" => "object", 
  "endpoint" => "/orders/outgoing", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "from",
      "description" => "Lower bound of date range that the order was created.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "to",
      "description" => "Upper bound of date range that the order was created.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search",
      "description" => "Word or phrase to search for.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search_on",
      "description" => "Comma-delimited list of fields to search on.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "sort_by",
      "description" => "Comma-delimited list of fields to sort by.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page",
      "description" => "Page of results to return. Default: 1",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page_size",
      "description" => "Number of results to return per page. Default: 20, max: 100.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}/promotions', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "list_promotions", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/promotions", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "search",
      "description" => "Word or phrase to search for.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "search_on",
      "description" => "Comma-delimited list of fields to search on.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "sort_by",
      "description" => "Comma-delimited list of fields to sort by.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page",
      "description" => "Page of results to return. Default: 1",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "page_size",
      "description" => "Number of results to return per page. Default: 20, max: 100.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/orders/{orderID}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Order",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/orders/{orderID}/billto', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "patch_billing_address", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/billto", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Address",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/orders/{orderID}/shipto', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "patch_shipping_address", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/shipto", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Address",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "remove_promotion", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "promo_code",
      "description" => "Promo code of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders/{orderID}/billto', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "set_billing_address", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/billto", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Address",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders/{orderID}/shipto', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "set_shipping_address", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/shipto", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Address",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/ship', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "ship", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/ship", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Shipment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/submit', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "submit", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/submit", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "transfer_temp_user_order", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/orders", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "temp_user_token",
      "description" => "Temp user token of the order.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders/{orderID}', {
  "resourcePath" => "/Order",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "order_id",
      "description" => "ID of the order.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Order",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

