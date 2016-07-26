# OrderCloud.EmailTemplateApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](EmailTemplateApi.md#get) | **GET** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**patch**](EmailTemplateApi.md#patch) | **PATCH** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**resetToDefault**](EmailTemplateApi.md#resetToDefault) | **DELETE** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
[**update**](EmailTemplateApi.md#update) | **PUT** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 


<a name="get"></a>
# **get**
> Object get(buyerID, emailTemplateType)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.EmailTemplateApi();

var buyerID = "buyerID_example"; // String | ID of the buyer.

var emailTemplateType = "emailTemplateType_example"; // String | Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.get(buyerID, emailTemplateType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | 
 **emailTemplateType** | **String**| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patch"></a>
# **patch**
> patch(buyerID, emailTemplateType, emailTemplate)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.EmailTemplateApi();

var buyerID = "buyerID_example"; // String | ID of the buyer.

var emailTemplateType = "emailTemplateType_example"; // String | Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.

var emailTemplate = new OrderCloud.EmailTemplate(); // EmailTemplate | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.patch(buyerID, emailTemplateType, emailTemplate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | 
 **emailTemplateType** | **String**| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 
 **emailTemplate** | [**EmailTemplate**](EmailTemplate.md)|  | 

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="resetToDefault"></a>
# **resetToDefault**
> resetToDefault(buyerID, emailTemplateType)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.EmailTemplateApi();

var buyerID = "buyerID_example"; // String | ID of the buyer.

var emailTemplateType = "emailTemplateType_example"; // String | Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.resetToDefault(buyerID, emailTemplateType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | 
 **emailTemplateType** | **String**| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> update(buyerID, emailTemplateType, emailTemplate)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.EmailTemplateApi();

var buyerID = "buyerID_example"; // String | ID of the buyer.

var emailTemplateType = "emailTemplateType_example"; // String | Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode.

var emailTemplate = new OrderCloud.EmailTemplate(); // EmailTemplate | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.update(buyerID, emailTemplateType, emailTemplate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerID** | **String**| ID of the buyer. | 
 **emailTemplateType** | **String**| Email template type of the email template. Possible values: OrderSubmittedForApproval, CustomerOrderSubmitted, OrderToApprove, OrderDeclined, OrderApproved, PriceRequestSubmitted, CustomerOrderShipped, ProductRequiresAttachment, InventoryPointReached, LineItemExceedsInventory, PriceRequestResponse, CustomerOrderUpdated, OrderCanceled, PriceRequestCanceled, NewOrderReceived, ApprovalNotification, EmailLoginVerificationCode. | 
 **emailTemplate** | [**EmailTemplate**](EmailTemplate.md)|  | 

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

