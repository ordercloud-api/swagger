require 'json'


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/payments', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "create", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments", 
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
      "dataType" => "Payment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "create_transaction", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PaymentTransaction",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "delete", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "delete_transaction", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "transaction_id",
      "description" => "ID of the transaction.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/buyers/{buyerID}/orders/{orderID}/payments', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "list", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments", 
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


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Payment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "patch_transaction", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "transaction_id",
      "description" => "ID of the transaction.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PaymentTransaction",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Payment",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}', {
  "resourcePath" => "/Payment",
  "summary" => "",
  "nickname" => "update_transaction", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}", 
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
      "name" => "payment_id",
      "description" => "ID of the payment.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "transaction_id",
      "description" => "ID of the transaction.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PaymentTransaction",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

