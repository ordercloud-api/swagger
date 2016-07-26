require 'json'


MyApp.add_route('POST', '/v1/buyers/{buyerID}/shipments', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments", 
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
      "dataType" => "Shipment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/shipments/{shipmentID}', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "delete_item", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
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
      "name" => "line_item_id",
      "description" => "ID of the line item.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/shipments/{shipmentID}', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/shipments', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "order_id",
      "description" => "ID of the order.",
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


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/shipments/{shipmentID}', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
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


MyApp.add_route('POST', '/v1/buyers/{buyerID}/shipments/{shipmentID}/items', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "save_item", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}/items", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ShipmentItem",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/shipments/{shipmentID}', {
  "resourcePath" => "/Shipment",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/shipments/{shipmentID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "shipment_id",
      "description" => "ID of the shipment.",
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

