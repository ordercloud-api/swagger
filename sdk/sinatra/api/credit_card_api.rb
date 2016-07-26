require 'json'


MyApp.add_route('POST', '/v1/buyers/{buyerID}/creditcards', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards", 
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
      "dataType" => "CreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/creditcards/{creditCardID}', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/creditcards/{creditCardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/creditcards/{creditCardID}/assignments', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "delete_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/creditcards/{creditCardID}/assignments", 
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
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/creditcards/{creditCardID}', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards/{creditCardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/creditcards', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards", 
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
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/creditcards/assignments', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "list_assignments", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards/assignments", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
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
      "description" => "Level of the credit card.",
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


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/creditcards/{creditCardID}', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards/{creditCardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/creditcards/assignments', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "save_assignment", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/creditcards/assignments", 
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
      "dataType" => "CreditCardAssignment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/creditcards/{creditCardID}', {
  "resourcePath" => "/CreditCard",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/creditcards/{creditCardID}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "credit_card_id",
      "description" => "ID of the credit card.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreditCard",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

