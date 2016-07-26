require 'json'


MyApp.add_route('POST', '/v1/buyers/{buyerID}/categories', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories", 
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
      "dataType" => "Category",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/categories/{categoryID}', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/categories/{categoryID}/assignments', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "delete_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}/assignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "user_group_id",
      "description" => "ID of the user group.",
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
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "delete_product_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
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


MyApp.add_route('GET', '/v1/buyers/{buyerID}/categories/{categoryID}', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/categories', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "parent_id",
      "description" => "ID of the parent.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
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


MyApp.add_route('GET', '/v1/buyers/{buyerID}/categories/assignments', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "list_assignments", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories/assignments", 
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
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "user_group_id",
      "description" => "ID of the user group.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "level",
      "description" => "Level of the category.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/categories/{parentID}/categories', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "list_children", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories/{parentID}/categories", 
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
      "name" => "depth",
      "description" => "Depth of the category.",
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


MyApp.add_route('GET', '/v1/buyers/{buyerID}/categories/productassignments', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "list_product_assignments", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories/productassignments", 
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
      "name" => "product_id",
      "description" => "ID of the product.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/categories/{categoryID}', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Category",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/categories/assignments', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "save_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/assignments", 
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
      "dataType" => "CategoryAssignment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/categories/productassignments', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "save_product_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/categories/productassignments", 
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
      "dataType" => "CategoryProductAssignment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/categories/{categoryID}', {
  "resourcePath" => "/Category",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/categories/{categoryID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "category_id",
      "description" => "ID of the category.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Category",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

