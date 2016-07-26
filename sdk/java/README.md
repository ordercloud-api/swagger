# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AddressApi;

import java.io.File;
import java.util.*;

public class AddressApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: auth
        OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
        auth.setAccessToken("YOUR ACCESS TOKEN");

        AddressApi apiInstance = new AddressApi();
        String buyerID = "buyerID_example"; // String | ID of the buyer.
        Address address = new Address(); // Address | 
        try {
            Object result = apiInstance.create(buyerID, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#create");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ordercloud.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressApi* | [**create**](docs/AddressApi.md#create) | **POST** /buyers/{buyerID}/addresses | 
*AddressApi* | [**delete**](docs/AddressApi.md#delete) | **DELETE** /buyers/{buyerID}/addresses/{addressID} | 
*AddressApi* | [**deleteAssignment**](docs/AddressApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/addresses/{addressID}/assignments | 
*AddressApi* | [**get**](docs/AddressApi.md#get) | **GET** /buyers/{buyerID}/addresses/{addressID} | 
*AddressApi* | [**list**](docs/AddressApi.md#list) | **GET** /buyers/{buyerID}/addresses | 
*AddressApi* | [**listAssignments**](docs/AddressApi.md#listAssignments) | **GET** /buyers/{buyerID}/addresses/assignments | 
*AddressApi* | [**patch**](docs/AddressApi.md#patch) | **PATCH** /buyers/{buyerID}/addresses/{addressID} | 
*AddressApi* | [**saveAssignment**](docs/AddressApi.md#saveAssignment) | **POST** /buyers/{buyerID}/addresses/assignments | 
*AddressApi* | [**update**](docs/AddressApi.md#update) | **PUT** /buyers/{buyerID}/addresses/{addressID} | 
*AdminUserApi* | [**create**](docs/AdminUserApi.md#create) | **POST** /adminusers | 
*AdminUserApi* | [**delete**](docs/AdminUserApi.md#delete) | **DELETE** /adminusers/{userID} | 
*AdminUserApi* | [**get**](docs/AdminUserApi.md#get) | **GET** /adminusers/{userID} | 
*AdminUserApi* | [**list**](docs/AdminUserApi.md#list) | **GET** /adminusers | 
*AdminUserApi* | [**patch**](docs/AdminUserApi.md#patch) | **PATCH** /adminusers/{userID} | 
*AdminUserApi* | [**update**](docs/AdminUserApi.md#update) | **PUT** /adminusers/{userID} | 
*ApprovalRuleApi* | [**create**](docs/ApprovalRuleApi.md#create) | **POST** /buyers/{buyerID}/approvalrules | 
*ApprovalRuleApi* | [**delete**](docs/ApprovalRuleApi.md#delete) | **DELETE** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
*ApprovalRuleApi* | [**get**](docs/ApprovalRuleApi.md#get) | **GET** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
*ApprovalRuleApi* | [**list**](docs/ApprovalRuleApi.md#list) | **GET** /buyers/{buyerID}/approvalrules | 
*ApprovalRuleApi* | [**patch**](docs/ApprovalRuleApi.md#patch) | **PATCH** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
*ApprovalRuleApi* | [**update**](docs/ApprovalRuleApi.md#update) | **PUT** /buyers/{buyerID}/approvalrules/{approvalRuleID} | 
*BuyerApi* | [**create**](docs/BuyerApi.md#create) | **POST** /buyers | 
*BuyerApi* | [**delete**](docs/BuyerApi.md#delete) | **DELETE** /buyers/{buyerID} | 
*BuyerApi* | [**get**](docs/BuyerApi.md#get) | **GET** /buyers/{buyerID} | 
*BuyerApi* | [**list**](docs/BuyerApi.md#list) | **GET** /buyers | 
*BuyerApi* | [**update**](docs/BuyerApi.md#update) | **PUT** /buyers/{buyerID} | 
*CategoryApi* | [**create**](docs/CategoryApi.md#create) | **POST** /buyers/{buyerID}/categories | 
*CategoryApi* | [**delete**](docs/CategoryApi.md#delete) | **DELETE** /buyers/{buyerID}/categories/{categoryID} | 
*CategoryApi* | [**deleteAssignment**](docs/CategoryApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/assignments | 
*CategoryApi* | [**deleteProductAssignment**](docs/CategoryApi.md#deleteProductAssignment) | **DELETE** /buyers/{buyerID}/categories/{categoryID}/productassignments/{productID} | 
*CategoryApi* | [**get**](docs/CategoryApi.md#get) | **GET** /buyers/{buyerID}/categories/{categoryID} | 
*CategoryApi* | [**list**](docs/CategoryApi.md#list) | **GET** /buyers/{buyerID}/categories | 
*CategoryApi* | [**listAssignments**](docs/CategoryApi.md#listAssignments) | **GET** /buyers/{buyerID}/categories/assignments | 
*CategoryApi* | [**listChildren**](docs/CategoryApi.md#listChildren) | **GET** /buyers/{buyerID}/categories/{parentID}/categories | 
*CategoryApi* | [**listProductAssignments**](docs/CategoryApi.md#listProductAssignments) | **GET** /buyers/{buyerID}/categories/productassignments | 
*CategoryApi* | [**patch**](docs/CategoryApi.md#patch) | **PATCH** /buyers/{buyerID}/categories/{categoryID} | 
*CategoryApi* | [**saveAssignment**](docs/CategoryApi.md#saveAssignment) | **POST** /buyers/{buyerID}/categories/assignments | 
*CategoryApi* | [**saveProductAssignment**](docs/CategoryApi.md#saveProductAssignment) | **POST** /buyers/{buyerID}/categories/productassignments | 
*CategoryApi* | [**update**](docs/CategoryApi.md#update) | **PUT** /buyers/{buyerID}/categories/{categoryID} | 
*CostCenterApi* | [**create**](docs/CostCenterApi.md#create) | **POST** /buyers/{buyerID}/costcenters | 
*CostCenterApi* | [**delete**](docs/CostCenterApi.md#delete) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID} | 
*CostCenterApi* | [**deleteAssignment**](docs/CostCenterApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/costcenters/{costCenterID}/assignments | 
*CostCenterApi* | [**get**](docs/CostCenterApi.md#get) | **GET** /buyers/{buyerID}/costcenters/{costCenterID} | 
*CostCenterApi* | [**list**](docs/CostCenterApi.md#list) | **GET** /buyers/{buyerID}/costcenters | 
*CostCenterApi* | [**listAssignments**](docs/CostCenterApi.md#listAssignments) | **GET** /buyers/{buyerID}/costcenters/assignments | 
*CostCenterApi* | [**patch**](docs/CostCenterApi.md#patch) | **PATCH** /buyers/{buyerID}/costcenters/{costCenterID} | 
*CostCenterApi* | [**saveAssignment**](docs/CostCenterApi.md#saveAssignment) | **POST** /buyers/{buyerID}/costcenters/assignments | 
*CostCenterApi* | [**update**](docs/CostCenterApi.md#update) | **PUT** /buyers/{buyerID}/costcenters/{costCenterID} | 
*CreditCardApi* | [**create**](docs/CreditCardApi.md#create) | **POST** /buyers/{buyerID}/creditcards | 
*CreditCardApi* | [**delete**](docs/CreditCardApi.md#delete) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID} | 
*CreditCardApi* | [**deleteAssignment**](docs/CreditCardApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/creditcards/{creditCardID}/assignments | 
*CreditCardApi* | [**get**](docs/CreditCardApi.md#get) | **GET** /buyers/{buyerID}/creditcards/{creditCardID} | 
*CreditCardApi* | [**list**](docs/CreditCardApi.md#list) | **GET** /buyers/{buyerID}/creditcards | 
*CreditCardApi* | [**listAssignments**](docs/CreditCardApi.md#listAssignments) | **GET** /buyers/{buyerID}/creditcards/assignments | 
*CreditCardApi* | [**patch**](docs/CreditCardApi.md#patch) | **PATCH** /buyers/{buyerID}/creditcards/{creditCardID} | 
*CreditCardApi* | [**saveAssignment**](docs/CreditCardApi.md#saveAssignment) | **POST** /buyers/{buyerID}/creditcards/assignments | 
*CreditCardApi* | [**update**](docs/CreditCardApi.md#update) | **PUT** /buyers/{buyerID}/creditcards/{creditCardID} | 
*EmailTemplateApi* | [**get**](docs/EmailTemplateApi.md#get) | **GET** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
*EmailTemplateApi* | [**patch**](docs/EmailTemplateApi.md#patch) | **PATCH** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
*EmailTemplateApi* | [**resetToDefault**](docs/EmailTemplateApi.md#resetToDefault) | **DELETE** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
*EmailTemplateApi* | [**update**](docs/EmailTemplateApi.md#update) | **PUT** /buyers/{buyerID}/emailtemplates/{emailTemplateType} | 
*FileApi* | [**get**](docs/FileApi.md#get) | **GET** /files/{fileID} | 
*FileApi* | [**list**](docs/FileApi.md#list) | **GET** /files | 
*FileApi* | [**postFileData**](docs/FileApi.md#postFileData) | **POST** /files | 
*LineItemApi* | [**create**](docs/LineItemApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/lineitems | 
*LineItemApi* | [**delete**](docs/LineItemApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
*LineItemApi* | [**get**](docs/LineItemApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
*LineItemApi* | [**list**](docs/LineItemApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/lineitems | 
*LineItemApi* | [**patch**](docs/LineItemApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
*LineItemApi* | [**patchShippingAddress**](docs/LineItemApi.md#patchShippingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
*LineItemApi* | [**setShippingAddress**](docs/LineItemApi.md#setShippingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto | 
*LineItemApi* | [**update**](docs/LineItemApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID} | 
*MeApi* | [**createAddress**](docs/MeApi.md#createAddress) | **POST** /me/addresses | 
*MeApi* | [**createCreditCard**](docs/MeApi.md#createCreditCard) | **POST** /me/creditcards | 
*MeApi* | [**deleteAddress**](docs/MeApi.md#deleteAddress) | **DELETE** /me/addresses/{addressID} | 
*MeApi* | [**deleteCreditCard**](docs/MeApi.md#deleteCreditCard) | **DELETE** /me/creditcards/{creditcardID} | 
*MeApi* | [**get**](docs/MeApi.md#get) | **GET** /me | 
*MeApi* | [**getAddress**](docs/MeApi.md#getAddress) | **GET** /me/addresses/{addressID} | 
*MeApi* | [**getCreditCard**](docs/MeApi.md#getCreditCard) | **GET** /me/creditcards/{creditcardID} | 
*MeApi* | [**getOrder**](docs/MeApi.md#getOrder) | **GET** /me/orders/{orderID} | 
*MeApi* | [**getProduct**](docs/MeApi.md#getProduct) | **GET** /me/products/{productID} | 
*MeApi* | [**getPromotion**](docs/MeApi.md#getPromotion) | **GET** /me/promotions/{promotionID} | 
*MeApi* | [**getSpec**](docs/MeApi.md#getSpec) | **GET** /me/products/{productID}/specs/{specID} | 
*MeApi* | [**listAddresses**](docs/MeApi.md#listAddresses) | **GET** /me/addresses | 
*MeApi* | [**listCategories**](docs/MeApi.md#listCategories) | **GET** /me/categories | 
*MeApi* | [**listCostCenters**](docs/MeApi.md#listCostCenters) | **GET** /me/costcenters | 
*MeApi* | [**listCreditCards**](docs/MeApi.md#listCreditCards) | **GET** /me/creditcards | 
*MeApi* | [**listIncomingOrders**](docs/MeApi.md#listIncomingOrders) | **GET** /me/orders/incoming | 
*MeApi* | [**listOutgoingOrders**](docs/MeApi.md#listOutgoingOrders) | **GET** /me/orders/outgoing | 
*MeApi* | [**listProducts**](docs/MeApi.md#listProducts) | **GET** /me/products | 
*MeApi* | [**listPromotions**](docs/MeApi.md#listPromotions) | **GET** /me/promotions | 
*MeApi* | [**listSpecs**](docs/MeApi.md#listSpecs) | **GET** /me/products/{productID}/specs | 
*MeApi* | [**listSubcategories**](docs/MeApi.md#listSubcategories) | **GET** /me/categories/{parentID}/categories | 
*MeApi* | [**listUserGroups**](docs/MeApi.md#listUserGroups) | **GET** /me/usergroups | 
*MeApi* | [**patch**](docs/MeApi.md#patch) | **PATCH** /me | 
*MeApi* | [**patchAddress**](docs/MeApi.md#patchAddress) | **PATCH** /me/addresses/{addressID} | 
*MeApi* | [**patchCreditCard**](docs/MeApi.md#patchCreditCard) | **PATCH** /me/creditcards/{creditcardID} | 
*MeApi* | [**update**](docs/MeApi.md#update) | **PUT** /me | 
*MeApi* | [**updateAddress**](docs/MeApi.md#updateAddress) | **PUT** /me/addresses/{addressID} | 
*MeApi* | [**updateCreditCard**](docs/MeApi.md#updateCreditCard) | **PUT** /me/creditcards/{creditcardID} | 
*OrderApi* | [**addPromotion**](docs/OrderApi.md#addPromotion) | **POST** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
*OrderApi* | [**approve**](docs/OrderApi.md#approve) | **POST** /buyers/{buyerID}/orders/{orderID}/approve | 
*OrderApi* | [**cancel**](docs/OrderApi.md#cancel) | **POST** /buyers/{buyerID}/orders/{orderID}/cancel | 
*OrderApi* | [**create**](docs/OrderApi.md#create) | **POST** /buyers/{buyerID}/orders | 
*OrderApi* | [**decline**](docs/OrderApi.md#decline) | **POST** /buyers/{buyerID}/orders/{orderID}/decline | 
*OrderApi* | [**delete**](docs/OrderApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID} | 
*OrderApi* | [**get**](docs/OrderApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID} | 
*OrderApi* | [**listApprovals**](docs/OrderApi.md#listApprovals) | **GET** /buyers/{buyerID}/orders/{orderID}/approvals | 
*OrderApi* | [**listEligibleApprovers**](docs/OrderApi.md#listEligibleApprovers) | **GET** /buyers/{buyerID}/orders/{orderID}/eligibleapprovers | 
*OrderApi* | [**listIncoming**](docs/OrderApi.md#listIncoming) | **GET** /orders/incoming | 
*OrderApi* | [**listOutgoing**](docs/OrderApi.md#listOutgoing) | **GET** /orders/outgoing | 
*OrderApi* | [**listPromotions**](docs/OrderApi.md#listPromotions) | **GET** /buyers/{buyerID}/orders/{orderID}/promotions | 
*OrderApi* | [**patch**](docs/OrderApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID} | 
*OrderApi* | [**patchBillingAddress**](docs/OrderApi.md#patchBillingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/billto | 
*OrderApi* | [**patchShippingAddress**](docs/OrderApi.md#patchShippingAddress) | **PATCH** /buyers/{buyerID}/orders/{orderID}/shipto | 
*OrderApi* | [**removePromotion**](docs/OrderApi.md#removePromotion) | **DELETE** /buyers/{buyerID}/orders/{orderID}/promotions/{promoCode} | 
*OrderApi* | [**setBillingAddress**](docs/OrderApi.md#setBillingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/billto | 
*OrderApi* | [**setShippingAddress**](docs/OrderApi.md#setShippingAddress) | **PUT** /buyers/{buyerID}/orders/{orderID}/shipto | 
*OrderApi* | [**ship**](docs/OrderApi.md#ship) | **POST** /buyers/{buyerID}/orders/{orderID}/ship | 
*OrderApi* | [**submit**](docs/OrderApi.md#submit) | **POST** /buyers/{buyerID}/orders/{orderID}/submit | 
*OrderApi* | [**transferTempUserOrder**](docs/OrderApi.md#transferTempUserOrder) | **PUT** /buyers/{buyerID}/orders | 
*OrderApi* | [**update**](docs/OrderApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID} | 
*PasswordResetApi* | [**resetPassword**](docs/PasswordResetApi.md#resetPassword) | **PUT** /password/reset/{verificationCode} | 
*PasswordResetApi* | [**sendVerificationCode**](docs/PasswordResetApi.md#sendVerificationCode) | **POST** /password/reset | 
*PaymentApi* | [**create**](docs/PaymentApi.md#create) | **POST** /buyers/{buyerID}/orders/{orderID}/payments | 
*PaymentApi* | [**createTransaction**](docs/PaymentApi.md#createTransaction) | **POST** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions | 
*PaymentApi* | [**delete**](docs/PaymentApi.md#delete) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
*PaymentApi* | [**deleteTransaction**](docs/PaymentApi.md#deleteTransaction) | **DELETE** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
*PaymentApi* | [**get**](docs/PaymentApi.md#get) | **GET** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
*PaymentApi* | [**list**](docs/PaymentApi.md#list) | **GET** /buyers/{buyerID}/orders/{orderID}/payments | 
*PaymentApi* | [**patch**](docs/PaymentApi.md#patch) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
*PaymentApi* | [**patchTransaction**](docs/PaymentApi.md#patchTransaction) | **PATCH** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
*PaymentApi* | [**update**](docs/PaymentApi.md#update) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID} | 
*PaymentApi* | [**updateTransaction**](docs/PaymentApi.md#updateTransaction) | **PUT** /buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID} | 
*PriceScheduleApi* | [**create**](docs/PriceScheduleApi.md#create) | **POST** /priceschedules | 
*PriceScheduleApi* | [**delete**](docs/PriceScheduleApi.md#delete) | **DELETE** /priceschedules/{priceScheduleID} | 
*PriceScheduleApi* | [**deletePriceBreak**](docs/PriceScheduleApi.md#deletePriceBreak) | **DELETE** /priceschedules/{priceScheduleID}/PriceBreaks | 
*PriceScheduleApi* | [**get**](docs/PriceScheduleApi.md#get) | **GET** /priceschedules/{priceScheduleID} | 
*PriceScheduleApi* | [**list**](docs/PriceScheduleApi.md#list) | **GET** /priceschedules | 
*PriceScheduleApi* | [**patch**](docs/PriceScheduleApi.md#patch) | **PATCH** /priceschedules/{priceScheduleID} | 
*PriceScheduleApi* | [**savePriceBreak**](docs/PriceScheduleApi.md#savePriceBreak) | **POST** /priceschedules/{priceScheduleID}/PriceBreaks | 
*PriceScheduleApi* | [**update**](docs/PriceScheduleApi.md#update) | **PUT** /priceschedules/{priceScheduleID} | 
*ProductApi* | [**create**](docs/ProductApi.md#create) | **POST** /products | 
*ProductApi* | [**delete**](docs/ProductApi.md#delete) | **DELETE** /products/{productID} | 
*ProductApi* | [**deleteAssignment**](docs/ProductApi.md#deleteAssignment) | **DELETE** /products/{productID}/assignments/{buyerID} | 
*ProductApi* | [**generateVariants**](docs/ProductApi.md#generateVariants) | **POST** /products/{productID}/variants/generate | 
*ProductApi* | [**get**](docs/ProductApi.md#get) | **GET** /products/{productID} | 
*ProductApi* | [**getInventory**](docs/ProductApi.md#getInventory) | **GET** /products/{productID}/inventory | 
*ProductApi* | [**getVariant**](docs/ProductApi.md#getVariant) | **GET** /products/{productID}/variants/{variantID} | 
*ProductApi* | [**getVariantInventory**](docs/ProductApi.md#getVariantInventory) | **GET** /products/{productID}/variants/inventory/{variantID} | 
*ProductApi* | [**list**](docs/ProductApi.md#list) | **GET** /products | 
*ProductApi* | [**listAssignments**](docs/ProductApi.md#listAssignments) | **GET** /products/assignments | 
*ProductApi* | [**listInventory**](docs/ProductApi.md#listInventory) | **GET** /products/inventory | 
*ProductApi* | [**listVariantInventory**](docs/ProductApi.md#listVariantInventory) | **GET** /products/{productID}/variants/inventory | 
*ProductApi* | [**listVariants**](docs/ProductApi.md#listVariants) | **GET** /products/{productID}/variants | 
*ProductApi* | [**patch**](docs/ProductApi.md#patch) | **PATCH** /products/{productID} | 
*ProductApi* | [**patchVariant**](docs/ProductApi.md#patchVariant) | **PATCH** /products/{productID}/variants/{variantID} | 
*ProductApi* | [**saveAssignment**](docs/ProductApi.md#saveAssignment) | **POST** /products/assignments | 
*ProductApi* | [**update**](docs/ProductApi.md#update) | **PUT** /products/{productID} | 
*ProductApi* | [**updateInventory**](docs/ProductApi.md#updateInventory) | **PUT** /products/{productID}/inventory/{inventory} | 
*ProductApi* | [**updateVariant**](docs/ProductApi.md#updateVariant) | **PUT** /products/{productID}/variants/{variantID} | 
*ProductApi* | [**updateVariantInventory**](docs/ProductApi.md#updateVariantInventory) | **PUT** /products/{productID}/variants/inventory/{variantID}/{inventory} | 
*PromotionApi* | [**create**](docs/PromotionApi.md#create) | **POST** /promotions | 
*PromotionApi* | [**delete**](docs/PromotionApi.md#delete) | **DELETE** /promotions/{promotionID} | 
*PromotionApi* | [**deleteAssignment**](docs/PromotionApi.md#deleteAssignment) | **DELETE** /promotions/{promotionID}/assignments | 
*PromotionApi* | [**get**](docs/PromotionApi.md#get) | **GET** /promotions/{promotionID} | 
*PromotionApi* | [**list**](docs/PromotionApi.md#list) | **GET** /promotions | 
*PromotionApi* | [**listAssignments**](docs/PromotionApi.md#listAssignments) | **GET** /promotions/assignments | 
*PromotionApi* | [**patch**](docs/PromotionApi.md#patch) | **PATCH** /promotions/{promotionID} | 
*PromotionApi* | [**saveAssignment**](docs/PromotionApi.md#saveAssignment) | **POST** /promotions/assignments | 
*PromotionApi* | [**update**](docs/PromotionApi.md#update) | **PUT** /promotions/{promotionID} | 
*SecurityProfileApi* | [**get**](docs/SecurityProfileApi.md#get) | **GET** /SecurityProfiles/{securityProfileID} | 
*SecurityProfileApi* | [**list**](docs/SecurityProfileApi.md#list) | **GET** /SecurityProfiles | 
*ShipmentApi* | [**create**](docs/ShipmentApi.md#create) | **POST** /buyers/{buyerID}/shipments | 
*ShipmentApi* | [**delete**](docs/ShipmentApi.md#delete) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID} | 
*ShipmentApi* | [**deleteItem**](docs/ShipmentApi.md#deleteItem) | **DELETE** /buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID} | 
*ShipmentApi* | [**get**](docs/ShipmentApi.md#get) | **GET** /buyers/{buyerID}/shipments/{shipmentID} | 
*ShipmentApi* | [**list**](docs/ShipmentApi.md#list) | **GET** /buyers/{buyerID}/shipments | 
*ShipmentApi* | [**patch**](docs/ShipmentApi.md#patch) | **PATCH** /buyers/{buyerID}/shipments/{shipmentID} | 
*ShipmentApi* | [**saveItem**](docs/ShipmentApi.md#saveItem) | **POST** /buyers/{buyerID}/shipments/{shipmentID}/items | 
*ShipmentApi* | [**update**](docs/ShipmentApi.md#update) | **PUT** /buyers/{buyerID}/shipments/{shipmentID} | 
*SpecApi* | [**create**](docs/SpecApi.md#create) | **POST** /specs | 
*SpecApi* | [**createOption**](docs/SpecApi.md#createOption) | **POST** /specs/{specID}/options | 
*SpecApi* | [**delete**](docs/SpecApi.md#delete) | **DELETE** /specs/{specID} | 
*SpecApi* | [**deleteOption**](docs/SpecApi.md#deleteOption) | **DELETE** /specs/{specID}/options/{optionID} | 
*SpecApi* | [**deleteProductAssignment**](docs/SpecApi.md#deleteProductAssignment) | **DELETE** /specs/{specID}/productassignments/{productID} | 
*SpecApi* | [**get**](docs/SpecApi.md#get) | **GET** /specs/{specID} | 
*SpecApi* | [**getOption**](docs/SpecApi.md#getOption) | **GET** /specs/{specID}/options/{optionID} | 
*SpecApi* | [**list**](docs/SpecApi.md#list) | **GET** /specs | 
*SpecApi* | [**listOptions**](docs/SpecApi.md#listOptions) | **GET** /specs/{specID}/options | 
*SpecApi* | [**listProductAssignments**](docs/SpecApi.md#listProductAssignments) | **GET** /specs/productassignments | 
*SpecApi* | [**patch**](docs/SpecApi.md#patch) | **PATCH** /specs/{specID} | 
*SpecApi* | [**patchOption**](docs/SpecApi.md#patchOption) | **PATCH** /specs/{specID}/options/{optionID} | 
*SpecApi* | [**saveProductAssignment**](docs/SpecApi.md#saveProductAssignment) | **POST** /specs/productassignments | 
*SpecApi* | [**update**](docs/SpecApi.md#update) | **PUT** /specs/{specID} | 
*SpecApi* | [**updateOption**](docs/SpecApi.md#updateOption) | **PUT** /specs/{specID}/options/{optionID} | 
*SpendingAccountApi* | [**create**](docs/SpendingAccountApi.md#create) | **POST** /buyers/{buyerID}/spendingaccounts | 
*SpendingAccountApi* | [**delete**](docs/SpendingAccountApi.md#delete) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
*SpendingAccountApi* | [**deleteAssignment**](docs/SpendingAccountApi.md#deleteAssignment) | **DELETE** /buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments | 
*SpendingAccountApi* | [**get**](docs/SpendingAccountApi.md#get) | **GET** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
*SpendingAccountApi* | [**list**](docs/SpendingAccountApi.md#list) | **GET** /buyers/{buyerID}/spendingaccounts | 
*SpendingAccountApi* | [**listAssignments**](docs/SpendingAccountApi.md#listAssignments) | **GET** /buyers/{buyerID}/spendingaccounts/assignments | 
*SpendingAccountApi* | [**patch**](docs/SpendingAccountApi.md#patch) | **PATCH** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
*SpendingAccountApi* | [**saveAssignment**](docs/SpendingAccountApi.md#saveAssignment) | **POST** /buyers/{buyerID}/spendingaccounts/assignments | 
*SpendingAccountApi* | [**update**](docs/SpendingAccountApi.md#update) | **PUT** /buyers/{buyerID}/spendingaccounts/{spendingAccountID} | 
*UserApi* | [**create**](docs/UserApi.md#create) | **POST** /buyers/{buyerID}/users | 
*UserApi* | [**delete**](docs/UserApi.md#delete) | **DELETE** /buyers/{buyerID}/users/{userID} | 
*UserApi* | [**get**](docs/UserApi.md#get) | **GET** /buyers/{buyerID}/users/{userID} | 
*UserApi* | [**getAccessToken**](docs/UserApi.md#getAccessToken) | **POST** /buyers/{buyerID}/users/{userID}/accesstoken | 
*UserApi* | [**list**](docs/UserApi.md#list) | **GET** /buyers/{buyerID}/users | 
*UserApi* | [**patch**](docs/UserApi.md#patch) | **PATCH** /buyers/{buyerID}/users/{userID} | 
*UserApi* | [**update**](docs/UserApi.md#update) | **PUT** /buyers/{buyerID}/users/{userID} | 
*UserGroupApi* | [**create**](docs/UserGroupApi.md#create) | **POST** /buyers/{buyerID}/usergroups | 
*UserGroupApi* | [**delete**](docs/UserGroupApi.md#delete) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID} | 
*UserGroupApi* | [**deleteUserAssignment**](docs/UserGroupApi.md#deleteUserAssignment) | **DELETE** /buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID} | 
*UserGroupApi* | [**get**](docs/UserGroupApi.md#get) | **GET** /buyers/{buyerID}/usergroups/{userGroupID} | 
*UserGroupApi* | [**list**](docs/UserGroupApi.md#list) | **GET** /buyers/{buyerID}/usergroups | 
*UserGroupApi* | [**listUserAssignments**](docs/UserGroupApi.md#listUserAssignments) | **GET** /buyers/{buyerID}/usergroups/assignments | 
*UserGroupApi* | [**patch**](docs/UserGroupApi.md#patch) | **PATCH** /buyers/{buyerID}/usergroups/{userGroupID} | 
*UserGroupApi* | [**saveUserAssignment**](docs/UserGroupApi.md#saveUserAssignment) | **POST** /buyers/{buyerID}/usergroups/assignments | 
*UserGroupApi* | [**update**](docs/UserGroupApi.md#update) | **PUT** /buyers/{buyerID}/usergroups/{userGroupID} | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [AddressAssignment](docs/AddressAssignment.md)
 - [ApprovalRule](docs/ApprovalRule.md)
 - [Buyer](docs/Buyer.md)
 - [BuyerAddress](docs/BuyerAddress.md)
 - [BuyerCreditCard](docs/BuyerCreditCard.md)
 - [Category](docs/Category.md)
 - [CategoryAssignment](docs/CategoryAssignment.md)
 - [CategoryProductAssignment](docs/CategoryProductAssignment.md)
 - [CostCenter](docs/CostCenter.md)
 - [CostCenterAssignment](docs/CostCenterAssignment.md)
 - [CreditCard](docs/CreditCard.md)
 - [CreditCardAssignment](docs/CreditCardAssignment.md)
 - [EmailTemplate](docs/EmailTemplate.md)
 - [ImpersonateTokenRequest](docs/ImpersonateTokenRequest.md)
 - [LineItem](docs/LineItem.md)
 - [Order](docs/Order.md)
 - [Partial1](docs/Partial1.md)
 - [PasswordReset](docs/PasswordReset.md)
 - [PasswordResetRequest](docs/PasswordResetRequest.md)
 - [Payment](docs/Payment.md)
 - [PaymentTransaction](docs/PaymentTransaction.md)
 - [PriceBreak](docs/PriceBreak.md)
 - [PriceSchedule](docs/PriceSchedule.md)
 - [Product](docs/Product.md)
 - [ProductAssignment](docs/ProductAssignment.md)
 - [Promotion](docs/Promotion.md)
 - [PromotionAssignment](docs/PromotionAssignment.md)
 - [Shipment](docs/Shipment.md)
 - [ShipmentItem](docs/ShipmentItem.md)
 - [Spec](docs/Spec.md)
 - [SpecOption](docs/SpecOption.md)
 - [SpecProductAssignment](docs/SpecProductAssignment.md)
 - [SpendingAccount](docs/SpendingAccount.md)
 - [SpendingAccountAssignment](docs/SpendingAccountAssignment.md)
 - [User](docs/User.md)
 - [UserGroup](docs/UserGroup.md)
 - [UserGroupAssignment](docs/UserGroupAssignment.md)
 - [Variant](docs/Variant.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: OAuth
- **Flow**: password
- **Authorizatoin URL**: 
- **Scopes**: 
  - FullAccess: Full access of the security profile.
  - ProductAdmin: Product admin of the security profile.
  - ProductReader: Product reader of the security profile.
  - InventoryAdmin: Inventory admin of the security profile.
  - ProductAssignmentAdmin: Product assignment admin of the security profile.
  - BuyerAdmin: Buyer admin of the security profile.
  - BuyerReader: Buyer reader of the security profile.
  - CategoryAdmin: Category admin of the security profile.
  - CategoryReader: Category reader of the security profile.
  - AddressAdmin: Address admin of the security profile.
  - AddressReader: Address reader of the security profile.
  - CostCenterAdmin: Cost center admin of the security profile.
  - CostCenterReader: Cost center reader of the security profile.
  - PromotionAdmin: Promotion admin of the security profile.
  - PromotionReader: Promotion reader of the security profile.
  - CreditCardAdmin: Credit card admin of the security profile.
  - CreditCardReader: Credit card reader of the security profile.
  - EmailTemplateAdmin: Email template admin of the security profile.
  - EmailTemplateReader: Email template reader of the security profile.
  - PriceScheduleAdmin: Price schedule admin of the security profile.
  - PriceScheduleReader: Price schedule reader of the security profile.
  - SpendingAccountAdmin: Spending account admin of the security profile.
  - SpendingAccountReader: Spending account reader of the security profile.
  - BuyerUserAdmin: Buyer user admin of the security profile.
  - BuyerUserReader: Buyer user reader of the security profile.
  - UserGroupAdmin: User group admin of the security profile.
  - UserGroupReader: User group reader of the security profile.
  - ApprovalRuleAdmin: Approval rule admin of the security profile.
  - ApprovalRuleReader: Approval rule reader of the security profile.
  - PermissionAdmin: Permission admin of the security profile.
  - OrderAdmin: Order admin of the security profile.
  - OrderReader: Order reader of the security profile.
  - UnsubmittedOrderReader: Unsubmitted order reader of the security profile.
  - MeAdmin: Me admin of the security profile.
  - MeXpAdmin: Me xp admin of the security profile.
  - MeAddressAdmin: Me address admin of the security profile.
  - MeCreditCardAdmin: Me credit card admin of the security profile.
  - OverrideUnitPrice: Override unit price of the security profile.
  - OverrideShipping: Override shipping of the security profile.
  - OverrideTax: Override tax of the security profile.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

ordercloud@four51.com

