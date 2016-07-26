require 'json'


MyApp.add_route('GET', '/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', {
  "resourcePath" => "/EmailTemplate",
  "summary" => "",
  "nickname" => "get", 
  "responseClass" => "object", 
  "endpoint" => "/buyers/{buyerID}/emailtemplates/{emailTemplateType}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "email_template_type",
      "description" => "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', {
  "resourcePath" => "/EmailTemplate",
  "summary" => "",
  "nickname" => "patch", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/emailtemplates/{emailTemplateType}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "email_template_type",
      "description" => "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "EmailTemplate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', {
  "resourcePath" => "/EmailTemplate",
  "summary" => "",
  "nickname" => "reset_to_default", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/emailtemplates/{emailTemplateType}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "email_template_type",
      "description" => "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",
      "dataType" => "string",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}', {
  "resourcePath" => "/EmailTemplate",
  "summary" => "",
  "nickname" => "update", 
  "responseClass" => "void", 
  "endpoint" => "/buyers/{buyerID}/emailtemplates/{emailTemplateType}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "buyer_id",
      "description" => "ID of the buyer.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "email_template_type",
      "description" => "Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "EmailTemplate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

