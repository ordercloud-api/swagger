require 'json'


MyApp.add_route('POST', '/v1/products', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/products", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Product",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/products/{productID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/products/{productID}", 
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


MyApp.add_route('DELETE', '/v1/products/{productID}/assignments/{buyerID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "delete_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/products/{productID}/assignments/{buyerID}", 
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


MyApp.add_route('POST', '/v1/products/{productID}/variants/generate', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "generate_variants", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/generate", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "overwrite_existing",
      "description" => "Overwrite existing of the product.",
      "dataType" => "boolean",
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


MyApp.add_route('GET', '/v1/products/{productID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}", 
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


MyApp.add_route('GET', '/v1/products/{productID}/inventory', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "get_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/inventory", 
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


MyApp.add_route('GET', '/v1/products/{productID}/variants/{variantID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "get_variant", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/{variantID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "variant_id",
      "description" => "ID of the variant.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/products/{productID}/variants/inventory/{variantID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "get_variant_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/inventory/{variantID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "variant_id",
      "description" => "ID of the variant.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/products', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/products", 
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


MyApp.add_route('GET', '/v1/products/assignments', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "list_assignments", 
  "responseClass" => "object", 
  "endpoint" => "/products/assignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
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
      "description" => "Level of the product.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
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


MyApp.add_route('GET', '/v1/products/inventory', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "list_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/inventory", 
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


MyApp.add_route('GET', '/v1/products/{productID}/variants/inventory', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "list_variant_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/inventory", 
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


MyApp.add_route('GET', '/v1/products/{productID}/variants', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "list_variants", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants", 
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


MyApp.add_route('PATCH', '/v1/products/{productID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "void", 
  "endpoint" => "/products/{productID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Product",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/products/{productID}/variants/{variantID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "patch_variant", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/{variantID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "variant_id",
      "description" => "ID of the variant.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Variant",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/products/assignments', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "save_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/products/assignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ProductAssignment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/products/{productID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Product",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/products/{productID}/inventory/{inventory}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "update_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/inventory/{inventory}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "inventory",
      "description" => "Inventory of the product.",
      "dataType" => "int",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/products/{productID}/variants/{variantID}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "update_variant", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/{variantID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "variant_id",
      "description" => "ID of the variant.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Variant",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/products/{productID}/variants/inventory/{variantID}/{inventory}', {
  "resourcePath" => "/Product",
  "summary" => "",
  "nickname" => "update_variant_inventory", 
  "responseClass" => "object", 
  "endpoint" => "/products/{productID}/variants/inventory/{variantID}/{inventory}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "product_id",
      "description" => "ID of the product.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "variant_id",
      "description" => "ID of the variant.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "inventory",
      "description" => "Inventory of the product.",
      "dataType" => "int",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

