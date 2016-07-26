require 'json'


MyApp.add_route('POST', '/v1/adminusers', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/adminusers", 
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


MyApp.add_route('DELETE', '/v1/adminusers/{userID}', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/adminusers/{userID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/adminusers/{userID}', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/adminusers/{userID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/adminusers', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/adminusers", 
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


MyApp.add_route('PATCH', '/v1/adminusers/{userID}', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "void", 
  "endpoint" => "/adminusers/{userID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "path",
    },
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


MyApp.add_route('PUT', '/v1/adminusers/{userID}', {
  "resourcePath" => "/AdminUser",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/adminusers/{userID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "user_id",
      "description" => "ID of the user.",
      "dataType" => "string",
      "paramType" => "path",
    },
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

