package OrderCloud

import (
	"net/http"
	"fmt"
	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/v1/",
		Index,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/addresses",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/addresses/{addressID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/addresses/{addressID}/assignments",
		DeleteAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/addresses/{addressID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/addresses",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/buyers/{buyerID}/addresses/assignments",
		ListAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/addresses/{addressID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/buyers/{buyerID}/addresses/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/addresses/{addressID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/adminusers",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/adminusers/{userID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/adminusers/{userID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/adminusers",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/adminusers/{userID}",
		Patch,
	},

	Route{
		"Update",
		"PUT",
		"/v1/adminusers/{userID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/approvalrules",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/approvalrules",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}",
		Patch,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/approvalrules/{approvalRuleID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers",
		List,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/categories",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/categories/{categoryID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/categories/{categoryID}/assignments",
		DeleteAssignment,
	},

	Route{
		"DeleteProductAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}",
		DeleteProductAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/categories/{categoryID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/categories",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/buyers/{buyerID}/categories/assignments",
		ListAssignments,
	},

	Route{
		"ListChildren",
		"GET",
		"/v1/buyers/{buyerID}/categories/{parentID}/categories",
		ListChildren,
	},

	Route{
		"ListProductAssignments",
		"GET",
		"/v1/buyers/{buyerID}/categories/productassignments",
		ListProductAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/categories/{categoryID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/buyers/{buyerID}/categories/assignments",
		SaveAssignment,
	},

	Route{
		"SaveProductAssignment",
		"POST",
		"/v1/buyers/{buyerID}/categories/productassignments",
		SaveProductAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/categories/{categoryID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/costcenters",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/costcenters/{costCenterID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/costcenters/{costCenterID}/assignments",
		DeleteAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/costcenters/{costCenterID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/costcenters",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/buyers/{buyerID}/costcenters/assignments",
		ListAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/costcenters/{costCenterID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/buyers/{buyerID}/costcenters/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/costcenters/{costCenterID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/creditcards",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/creditcards/{creditCardID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/creditcards/{creditCardID}/assignments",
		DeleteAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/creditcards/{creditCardID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/creditcards",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/buyers/{buyerID}/creditcards/assignments",
		ListAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/creditcards/{creditCardID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/buyers/{buyerID}/creditcards/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/creditcards/{creditCardID}",
		Update,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
		Get,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
		Patch,
	},

	Route{
		"ResetToDefault",
		"DELETE",
		"/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
		ResetToDefault,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/emailtemplates/{emailTemplateType}",
		Update,
	},

	Route{
		"Get",
		"GET",
		"/v1/files/{fileID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/files",
		List,
	},

	Route{
		"PostFileData",
		"POST",
		"/v1/files",
		PostFileData,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
		Patch,
	},

	Route{
		"PatchShippingAddress",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto",
		PatchShippingAddress,
	},

	Route{
		"SetShippingAddress",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto",
		SetShippingAddress,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}",
		Update,
	},

	Route{
		"CreateAddress",
		"POST",
		"/v1/me/addresses",
		CreateAddress,
	},

	Route{
		"CreateCreditCard",
		"POST",
		"/v1/me/creditcards",
		CreateCreditCard,
	},

	Route{
		"DeleteAddress",
		"DELETE",
		"/v1/me/addresses/{addressID}",
		DeleteAddress,
	},

	Route{
		"DeleteCreditCard",
		"DELETE",
		"/v1/me/creditcards/{creditcardID}",
		DeleteCreditCard,
	},

	Route{
		"Get",
		"GET",
		"/v1/me",
		Get,
	},

	Route{
		"GetAddress",
		"GET",
		"/v1/me/addresses/{addressID}",
		GetAddress,
	},

	Route{
		"GetCreditCard",
		"GET",
		"/v1/me/creditcards/{creditcardID}",
		GetCreditCard,
	},

	Route{
		"GetOrder",
		"GET",
		"/v1/me/orders/{orderID}",
		GetOrder,
	},

	Route{
		"GetProduct",
		"GET",
		"/v1/me/products/{productID}",
		GetProduct,
	},

	Route{
		"GetPromotion",
		"GET",
		"/v1/me/promotions/{promotionID}",
		GetPromotion,
	},

	Route{
		"GetSpec",
		"GET",
		"/v1/me/products/{productID}/specs/{specID}",
		GetSpec,
	},

	Route{
		"ListAddresses",
		"GET",
		"/v1/me/addresses",
		ListAddresses,
	},

	Route{
		"ListCategories",
		"GET",
		"/v1/me/categories",
		ListCategories,
	},

	Route{
		"ListCostCenters",
		"GET",
		"/v1/me/costcenters",
		ListCostCenters,
	},

	Route{
		"ListCreditCards",
		"GET",
		"/v1/me/creditcards",
		ListCreditCards,
	},

	Route{
		"ListIncomingOrders",
		"GET",
		"/v1/me/orders/incoming",
		ListIncomingOrders,
	},

	Route{
		"ListOutgoingOrders",
		"GET",
		"/v1/me/orders/outgoing",
		ListOutgoingOrders,
	},

	Route{
		"ListProducts",
		"GET",
		"/v1/me/products",
		ListProducts,
	},

	Route{
		"ListPromotions",
		"GET",
		"/v1/me/promotions",
		ListPromotions,
	},

	Route{
		"ListSpecs",
		"GET",
		"/v1/me/products/{productID}/specs",
		ListSpecs,
	},

	Route{
		"ListSubcategories",
		"GET",
		"/v1/me/categories/{parentID}/categories",
		ListSubcategories,
	},

	Route{
		"ListUserGroups",
		"GET",
		"/v1/me/usergroups",
		ListUserGroups,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/me",
		Patch,
	},

	Route{
		"PatchAddress",
		"PATCH",
		"/v1/me/addresses/{addressID}",
		PatchAddress,
	},

	Route{
		"PatchCreditCard",
		"PATCH",
		"/v1/me/creditcards/{creditcardID}",
		PatchCreditCard,
	},

	Route{
		"Update",
		"PUT",
		"/v1/me",
		Update,
	},

	Route{
		"UpdateAddress",
		"PUT",
		"/v1/me/addresses/{addressID}",
		UpdateAddress,
	},

	Route{
		"UpdateCreditCard",
		"PUT",
		"/v1/me/creditcards/{creditcardID}",
		UpdateCreditCard,
	},

	Route{
		"AddPromotion",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}",
		AddPromotion,
	},

	Route{
		"Approve",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/approve",
		Approve,
	},

	Route{
		"Cancel",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/cancel",
		Cancel,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/orders",
		Create,
	},

	Route{
		"Decline",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/decline",
		Decline,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/orders/{orderID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}",
		Get,
	},

	Route{
		"ListApprovals",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/approvals",
		ListApprovals,
	},

	Route{
		"ListEligibleApprovers",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/eligibleapprovers",
		ListEligibleApprovers,
	},

	Route{
		"ListIncoming",
		"GET",
		"/v1/orders/incoming",
		ListIncoming,
	},

	Route{
		"ListOutgoing",
		"GET",
		"/v1/orders/outgoing",
		ListOutgoing,
	},

	Route{
		"ListPromotions",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/promotions",
		ListPromotions,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}",
		Patch,
	},

	Route{
		"PatchBillingAddress",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/billto",
		PatchBillingAddress,
	},

	Route{
		"PatchShippingAddress",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/shipto",
		PatchShippingAddress,
	},

	Route{
		"RemovePromotion",
		"DELETE",
		"/v1/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}",
		RemovePromotion,
	},

	Route{
		"SetBillingAddress",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/billto",
		SetBillingAddress,
	},

	Route{
		"SetShippingAddress",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/shipto",
		SetShippingAddress,
	},

	Route{
		"Ship",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/ship",
		Ship,
	},

	Route{
		"Submit",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/submit",
		Submit,
	},

	Route{
		"TransferTempUserOrder",
		"PUT",
		"/v1/buyers/{buyerID}/orders",
		TransferTempUserOrder,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}",
		Update,
	},

	Route{
		"ResetPassword",
		"PUT",
		"/v1/password/reset/{verificationCode}",
		ResetPassword,
	},

	Route{
		"SendVerificationCode",
		"POST",
		"/v1/password/reset",
		SendVerificationCode,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments",
		Create,
	},

	Route{
		"CreateTransaction",
		"POST",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions",
		CreateTransaction,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
		Delete,
	},

	Route{
		"DeleteTransaction",
		"DELETE",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
		DeleteTransaction,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
		Patch,
	},

	Route{
		"PatchTransaction",
		"PATCH",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
		PatchTransaction,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}",
		Update,
	},

	Route{
		"UpdateTransaction",
		"PUT",
		"/v1/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}",
		UpdateTransaction,
	},

	Route{
		"Create",
		"POST",
		"/v1/priceschedules",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/priceschedules/{priceScheduleID}",
		Delete,
	},

	Route{
		"DeletePriceBreak",
		"DELETE",
		"/v1/priceschedules/{priceScheduleID}/PriceBreaks",
		DeletePriceBreak,
	},

	Route{
		"Get",
		"GET",
		"/v1/priceschedules/{priceScheduleID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/priceschedules",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/priceschedules/{priceScheduleID}",
		Patch,
	},

	Route{
		"SavePriceBreak",
		"POST",
		"/v1/priceschedules/{priceScheduleID}/PriceBreaks",
		SavePriceBreak,
	},

	Route{
		"Update",
		"PUT",
		"/v1/priceschedules/{priceScheduleID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/products",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/products/{productID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/products/{productID}/assignments/{buyerID}",
		DeleteAssignment,
	},

	Route{
		"GenerateVariants",
		"POST",
		"/v1/products/{productID}/variants/generate",
		GenerateVariants,
	},

	Route{
		"Get",
		"GET",
		"/v1/products/{productID}",
		Get,
	},

	Route{
		"GetInventory",
		"GET",
		"/v1/products/{productID}/inventory",
		GetInventory,
	},

	Route{
		"GetVariant",
		"GET",
		"/v1/products/{productID}/variants/{variantID}",
		GetVariant,
	},

	Route{
		"GetVariantInventory",
		"GET",
		"/v1/products/{productID}/variants/inventory/{variantID}",
		GetVariantInventory,
	},

	Route{
		"List",
		"GET",
		"/v1/products",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/products/assignments",
		ListAssignments,
	},

	Route{
		"ListInventory",
		"GET",
		"/v1/products/inventory",
		ListInventory,
	},

	Route{
		"ListVariantInventory",
		"GET",
		"/v1/products/{productID}/variants/inventory",
		ListVariantInventory,
	},

	Route{
		"ListVariants",
		"GET",
		"/v1/products/{productID}/variants",
		ListVariants,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/products/{productID}",
		Patch,
	},

	Route{
		"PatchVariant",
		"PATCH",
		"/v1/products/{productID}/variants/{variantID}",
		PatchVariant,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/products/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/products/{productID}",
		Update,
	},

	Route{
		"UpdateInventory",
		"PUT",
		"/v1/products/{productID}/inventory/{inventory}",
		UpdateInventory,
	},

	Route{
		"UpdateVariant",
		"PUT",
		"/v1/products/{productID}/variants/{variantID}",
		UpdateVariant,
	},

	Route{
		"UpdateVariantInventory",
		"PUT",
		"/v1/products/{productID}/variants/inventory/{variantID}/{inventory}",
		UpdateVariantInventory,
	},

	Route{
		"Create",
		"POST",
		"/v1/promotions",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/promotions/{promotionID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/promotions/{promotionID}/assignments",
		DeleteAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/promotions/{promotionID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/promotions",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/promotions/assignments",
		ListAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/promotions/{promotionID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/promotions/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/promotions/{promotionID}",
		Update,
	},

	Route{
		"Get",
		"GET",
		"/v1/SecurityProfiles/{securityProfileID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/SecurityProfiles",
		List,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/shipments",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}",
		Delete,
	},

	Route{
		"DeleteItem",
		"DELETE",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}",
		DeleteItem,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/shipments",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}",
		Patch,
	},

	Route{
		"SaveItem",
		"POST",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}/items",
		SaveItem,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/shipments/{shipmentID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/specs",
		Create,
	},

	Route{
		"CreateOption",
		"POST",
		"/v1/specs/{specID}/options",
		CreateOption,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/specs/{specID}",
		Delete,
	},

	Route{
		"DeleteOption",
		"DELETE",
		"/v1/specs/{specID}/options/{optionID}",
		DeleteOption,
	},

	Route{
		"DeleteProductAssignment",
		"DELETE",
		"/v1/specs/{specID}/productassignments/{productID}",
		DeleteProductAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/specs/{specID}",
		Get,
	},

	Route{
		"GetOption",
		"GET",
		"/v1/specs/{specID}/options/{optionID}",
		GetOption,
	},

	Route{
		"List",
		"GET",
		"/v1/specs",
		List,
	},

	Route{
		"ListOptions",
		"GET",
		"/v1/specs/{specID}/options",
		ListOptions,
	},

	Route{
		"ListProductAssignments",
		"GET",
		"/v1/specs/productassignments",
		ListProductAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/specs/{specID}",
		Patch,
	},

	Route{
		"PatchOption",
		"PATCH",
		"/v1/specs/{specID}/options/{optionID}",
		PatchOption,
	},

	Route{
		"SaveProductAssignment",
		"POST",
		"/v1/specs/productassignments",
		SaveProductAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/specs/{specID}",
		Update,
	},

	Route{
		"UpdateOption",
		"PUT",
		"/v1/specs/{specID}/options/{optionID}",
		UpdateOption,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/spendingaccounts",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
		Delete,
	},

	Route{
		"DeleteAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}/assignments",
		DeleteAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/spendingaccounts",
		List,
	},

	Route{
		"ListAssignments",
		"GET",
		"/v1/buyers/{buyerID}/spendingaccounts/assignments",
		ListAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
		Patch,
	},

	Route{
		"SaveAssignment",
		"POST",
		"/v1/buyers/{buyerID}/spendingaccounts/assignments",
		SaveAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/spendingaccounts/{spendingAccountID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/users",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/users/{userID}",
		Delete,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/users/{userID}",
		Get,
	},

	Route{
		"GetAccessToken",
		"POST",
		"/v1/buyers/{buyerID}/users/{userID}/accesstoken",
		GetAccessToken,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/users",
		List,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/users/{userID}",
		Patch,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/users/{userID}",
		Update,
	},

	Route{
		"Create",
		"POST",
		"/v1/buyers/{buyerID}/usergroups",
		Create,
	},

	Route{
		"Delete",
		"DELETE",
		"/v1/buyers/{buyerID}/usergroups/{userGroupID}",
		Delete,
	},

	Route{
		"DeleteUserAssignment",
		"DELETE",
		"/v1/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}",
		DeleteUserAssignment,
	},

	Route{
		"Get",
		"GET",
		"/v1/buyers/{buyerID}/usergroups/{userGroupID}",
		Get,
	},

	Route{
		"List",
		"GET",
		"/v1/buyers/{buyerID}/usergroups",
		List,
	},

	Route{
		"ListUserAssignments",
		"GET",
		"/v1/buyers/{buyerID}/usergroups/assignments",
		ListUserAssignments,
	},

	Route{
		"Patch",
		"PATCH",
		"/v1/buyers/{buyerID}/usergroups/{userGroupID}",
		Patch,
	},

	Route{
		"SaveUserAssignment",
		"POST",
		"/v1/buyers/{buyerID}/usergroups/assignments",
		SaveUserAssignment,
	},

	Route{
		"Update",
		"PUT",
		"/v1/buyers/{buyerID}/usergroups/{userGroupID}",
		Update,
	},

}