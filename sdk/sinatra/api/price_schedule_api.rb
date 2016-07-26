require 'json'


MyApp.add_route('POST', '/v1/priceschedules', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PriceSchedule",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/priceschedules/{priceScheduleID}', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/priceschedules/{priceScheduleID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/priceschedules/{priceScheduleID}/PriceBreaks', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "delete_price_break", 
  "responseClass" => "void", 
  "endpoint" => "/priceschedules/{priceScheduleID}/PriceBreaks", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "quantity",
      "description" => "Quantity of the price schedule.",
      "dataType" => "int",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/priceschedules/{priceScheduleID}', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules/{priceScheduleID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/priceschedules', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules", 
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


MyApp.add_route('PATCH', '/v1/priceschedules/{priceScheduleID}', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules/{priceScheduleID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PriceSchedule",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/priceschedules/{priceScheduleID}/PriceBreaks', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "save_price_break", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules/{priceScheduleID}/PriceBreaks", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PriceBreak",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/priceschedules/{priceScheduleID}', {
  "resourcePath" => "/PriceSchedule",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/priceschedules/{priceScheduleID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "price_schedule_id",
      "description" => "ID of the price schedule.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PriceSchedule",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

