# OrderCloud.PriceScheduleApi

All URIs are relative to *https://api.ordercloud.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callDelete**](PriceScheduleApi.md#callDelete) | **DELETE** /priceschedules/{priceScheduleID} | 
[**create**](PriceScheduleApi.md#create) | **POST** /priceschedules | 
[**deletePriceBreak**](PriceScheduleApi.md#deletePriceBreak) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**get**](PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
[**list**](PriceScheduleApi.md#list) | **GET** /priceschedules | 
[**patch**](PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
[**savePriceBreak**](PriceScheduleApi.md#savePriceBreak) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
[**update**](PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 


<a name="callDelete"></a>
# **callDelete**
> callDelete(priceScheduleID)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.callDelete(priceScheduleID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="create"></a>
# **create**
> Object create(priceSchedule)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceSchedule = new OrderCloud.PriceSchedule(); // PriceSchedule | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.create(priceSchedule, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePriceBreak"></a>
# **deletePriceBreak**
> deletePriceBreak(priceScheduleID, quantity)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.

var quantity = 56; // Integer | Quantity of the price schedule.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePriceBreak(priceScheduleID, quantity, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 
 **quantity** | **Integer**| Quantity of the price schedule. | 

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> Object get(priceScheduleID)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.get(priceScheduleID, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="list"></a>
# **list**
> Object list(opts)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var opts = { 
  'search': "search_example", // String | Word or phrase to search for.
  'searchOn': "searchOn_example", // String | Comma-delimited list of fields to search on.
  'sortBy': "sortBy_example", // String | Comma-delimited list of fields to sort by.
  'page': 56, // Integer | Page of results to return. Default: 1
  'pageSize': 56 // Integer | Number of results to return per page. Default: 20, max: 100.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.list(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| Word or phrase to search for. | [optional] 
 **searchOn** | **String**| Comma-delimited list of fields to search on. | [optional] 
 **sortBy** | **String**| Comma-delimited list of fields to sort by. | [optional] 
 **page** | **Integer**| Page of results to return. Default: 1 | [optional] 
 **pageSize** | **Integer**| Number of results to return per page. Default: 20, max: 100. | [optional] 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patch"></a>
# **patch**
> Object patch(priceScheduleID, priceSchedule)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.

var priceSchedule = new OrderCloud.PriceSchedule(); // PriceSchedule | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.patch(priceScheduleID, priceSchedule, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="savePriceBreak"></a>
# **savePriceBreak**
> Object savePriceBreak(priceScheduleID, priceBreak)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.

var priceBreak = new OrderCloud.PriceBreak(); // PriceBreak | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.savePriceBreak(priceScheduleID, priceBreak, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 
 **priceBreak** | [**PriceBreak**](PriceBreak.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(priceScheduleID, priceSchedule)



### Example
```javascript
var OrderCloud = require('order_cloud');
var defaultClient = OrderCloud.ApiClient.default;

// Configure OAuth2 access token for authorization: auth
var auth = defaultClient.authentications['auth'];
auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new OrderCloud.PriceScheduleApi();

var priceScheduleID = "priceScheduleID_example"; // String | ID of the price schedule.

var priceSchedule = new OrderCloud.PriceSchedule(); // PriceSchedule | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.update(priceScheduleID, priceSchedule, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceScheduleID** | **String**| ID of the price schedule. | 
 **priceSchedule** | [**PriceSchedule**](PriceSchedule.md)|  | 

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

