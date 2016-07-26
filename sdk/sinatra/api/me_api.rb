require 'json'


MyApp.add_route('POST', '/v1/me/addresses', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "create_address", 
  "responseClass" => "object", 
  "endpoint" => "/me/addresses", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerAddress",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/me/creditcards', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "create_credit_card", 
  "responseClass" => "object", 
  "endpoint" => "/me/creditcards", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerCreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/me/addresses/{addressID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "delete_address", 
  "responseClass" => "void", 
  "endpoint" => "/me/addresses/{addressID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "address_id",
      "description" => "ID of the address.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/me/creditcards/{creditcardID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "delete_credit_card", 
  "responseClass" => "void", 
  "endpoint" => "/me/creditcards/{creditcardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "creditcard_id",
      "description" => "ID of the creditcard.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/me", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/addresses/{addressID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_address", 
  "responseClass" => "object", 
  "endpoint" => "/me/addresses/{addressID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "address_id",
      "description" => "ID of the address.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/creditcards/{creditcardID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_credit_card", 
  "responseClass" => "object", 
  "endpoint" => "/me/creditcards/{creditcardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "creditcard_id",
      "description" => "ID of the creditcard.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/orders/{orderID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_order", 
  "responseClass" => "object", 
  "endpoint" => "/me/orders/{orderID}", 
  "notes" => "",
  "parameters" => [
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


MyApp.add_route('GET', '/v1/me/products/{productID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_product", 
  "responseClass" => "object", 
  "endpoint" => "/me/products/{productID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/promotions/{promotionID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_promotion", 
  "responseClass" => "object", 
  "endpoint" => "/me/promotions/{promotionID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "promotion_id",
      "description" => "ID of the promotion.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/products/{productID}/specs/{specID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "get_spec", 
  "responseClass" => "object", 
  "endpoint" => "/me/products/{productID}/specs/{specID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/addresses', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_addresses", 
  "responseClass" => "object", 
  "endpoint" => "/me/addresses", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/categories', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_categories", 
  "responseClass" => "object", 
  "endpoint" => "/me/categories", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "depth",
      "description" => "Depth of the category.",
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


MyApp.add_route('GET', '/v1/me/costcenters', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_cost_centers", 
  "responseClass" => "object", 
  "endpoint" => "/me/costcenters", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/creditcards', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_credit_cards", 
  "responseClass" => "object", 
  "endpoint" => "/me/creditcards", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/orders/incoming', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_incoming_orders", 
  "responseClass" => "object", 
  "endpoint" => "/me/orders/incoming", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "from",
      "description" => "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "to",
      "description" => "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).",
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


MyApp.add_route('GET', '/v1/me/orders/outgoing', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_outgoing_orders", 
  "responseClass" => "object", 
  "endpoint" => "/me/orders/outgoing", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "from",
      "description" => "Lower bound of date range that the order was created (if outgoing) or submitted (if incoming).",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "to",
      "description" => "Upper bound of date range that the order was created (if outgoing) or submitted (if incoming).",
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


MyApp.add_route('GET', '/v1/me/products', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_products", 
  "responseClass" => "object", 
  "endpoint" => "/me/products", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "category_id",
      "description" => "ID of the category.",
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


MyApp.add_route('GET', '/v1/me/promotions', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_promotions", 
  "responseClass" => "object", 
  "endpoint" => "/me/promotions", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/products/{productID}/specs', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_specs", 
  "responseClass" => "object", 
  "endpoint" => "/me/products/{productID}/specs", 
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
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/categories/{parentID}/categories', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_subcategories", 
  "responseClass" => "object", 
  "endpoint" => "/me/categories/{parentID}/categories", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "depth",
      "description" => "Depth of the category.",
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
    {
      "name" => "parent_id",
      "description" => "ID of the parent.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/me/usergroups', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "list_user_groups", 
  "responseClass" => "object", 
  "endpoint" => "/me/usergroups", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/me', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/me", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "User",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/me/addresses/{addressID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "patch_address", 
  "responseClass" => "void", 
  "endpoint" => "/me/addresses/{addressID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "address_id",
      "description" => "ID of the address.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerAddress",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/me/creditcards/{creditcardID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "patch_credit_card", 
  "responseClass" => "void", 
  "endpoint" => "/me/creditcards/{creditcardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "creditcard_id",
      "description" => "ID of the creditcard.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerCreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/me', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/me", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "User",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/me/addresses/{addressID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "update_address", 
  "responseClass" => "object", 
  "endpoint" => "/me/addresses/{addressID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "address_id",
      "description" => "ID of the address.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerAddress",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/me/creditcards/{creditcardID}', {
  "resourcePath" => "/Me",
  "summary" => "",
  "nickname" => "update_credit_card", 
  "responseClass" => "object", 
  "endpoint" => "/me/creditcards/{creditcardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "creditcard_id",
      "description" => "ID of the creditcard.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "BuyerCreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

