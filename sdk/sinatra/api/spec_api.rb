require 'json'


MyApp.add_route('POST', '/v1/specs', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/specs", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Spec",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/specs/{specID}/options', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "create_option", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}/options", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SpecOption",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/specs/{specID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/specs/{specID}", 
  "notes" => "",
  "parameters" => [
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


MyApp.add_route('DELETE', '/v1/specs/{specID}/options/{optionID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "delete_option", 
  "responseClass" => "void", 
  "endpoint" => "/specs/{specID}/options/{optionID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "option_id",
      "description" => "ID of the option.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/specs/{specID}/productassignments/{productID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "delete_product_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/specs/{specID}/productassignments/{productID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
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


MyApp.add_route('GET', '/v1/specs/{specID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}", 
  "notes" => "",
  "parameters" => [
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


MyApp.add_route('GET', '/v1/specs/{specID}/options/{optionID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "get_option", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}/options/{optionID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "option_id",
      "description" => "ID of the option.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/specs', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/specs", 
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


MyApp.add_route('GET', '/v1/specs/{specID}/options', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "list_options", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}/options", 
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


MyApp.add_route('GET', '/v1/specs/productassignments', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "list_product_assignments", 
  "responseClass" => "object", 
  "endpoint" => "/specs/productassignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/specs/{specID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Spec",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/specs/{specID}/options/{optionID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "patch_option", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}/options/{optionID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "option_id",
      "description" => "ID of the option.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SpecOption",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/specs/productassignments', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "save_product_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/specs/productassignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SpecProductAssignment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/specs/{specID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Spec",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/specs/{specID}/options/{optionID}', {
  "resourcePath" => "/Spec",
  "summary" => "",
  "nickname" => "update_option", 
  "responseClass" => "object", 
  "endpoint" => "/specs/{specID}/options/{optionID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "spec_id",
      "description" => "ID of the spec.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "option_id",
      "description" => "ID of the option.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SpecOption",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

