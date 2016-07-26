require 'json'


MyApp.add_route('GET', '/v1/files/{fileID}', {
  "resourcePath" => "/File",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/files/{fileID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "ID of the file.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files', {
  "resourcePath" => "/File",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/files", 
  "notes" => "",
  "parameters" => [
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


MyApp.add_route('POST', '/v1/files', {
  "resourcePath" => "/File",
  "summary" => "",
  "nickname" => "post_file_data", 
  "responseClass" => "object", 
  "endpoint" => "/files", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filename",
      "description" => "Filename of the file.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

