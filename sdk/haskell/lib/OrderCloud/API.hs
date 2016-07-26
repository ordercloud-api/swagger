{-# LANGUAGE DataKinds, TypeFamilies, TypeOperators, FlexibleInstances, OverloadedStrings, ViewPatterns #-}
{-# LANGUAGE RecordWildCards, GeneralizedNewtypeDeriving, DeriveTraversable, FlexibleContexts, DeriveGeneric #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports -fcontext-stack=526 #-}
module OrderCloud.API (
  -- * Client and Server
  ServerConfig(..),
  OrderCloudBackend,
  createOrderCloudClient,
  runOrderCloudServer,
  runOrderCloudClient,
  runOrderCloudClientWithManager,
  OrderCloudClient,
  -- ** Servant
  OrderCloudAPI,
  ) where

import OrderCloud.Types

import Data.Aeson (Value)
import Data.Coerce (coerce)
import Servant.API
import Servant (serve, ServantErr)
import Web.HttpApiData
import qualified Network.Wai.Handler.Warp as Warp
import qualified Data.Text as T
import Data.Text (Text)
import Servant.Common.BaseUrl(BaseUrl(..))
import Servant.Client (ServantError, client, Scheme(Http))
import Data.Proxy (Proxy(..))
import Control.Monad.IO.Class
import Data.Function ((&))
import GHC.Exts (IsString(..))
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Monoid ((<>))
import Servant.API.Verbs (Verb, StdMethod(..))
import Control.Monad.Except (ExceptT)
import Network.HTTP.Client (Manager, newManager, defaultManagerSettings)
import Network.HTTP.Types.Method (methodOptions)

instance ReflectMethod 'OPTIONS where
  reflectMethod _ = methodOptions




-- For the form data code generation.
lookupEither :: FromHttpApiData b => Text -> [(Text, Text)] -> Either Text b
lookupEither key assocs =
  case lookup key assocs of
    Nothing -> Left $ "Could not find parameter " <> key <> " in form data"
    Just value -> parseQueryParam value

-- | Servant type-level API, generated from the Swagger spec for OrderCloud.
type OrderCloudAPI
    =    "buyers" :> Capture "buyerID" Text :> "addresses" :> ReqBody '[JSON] Address :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> Capture "addressID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> Capture "addressID" Text :> "assignments" :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> Capture "addressID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> "assignments" :> QueryParam "addressID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "isShipping" Bool :> QueryParam "isBilling" Bool :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> Capture "addressID" Text :> ReqBody '[JSON] Address :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> "assignments" :> ReqBody '[JSON] AddressAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "addresses" :> Capture "addressID" Text :> ReqBody '[JSON] Address :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "adminusers" :> ReqBody '[JSON] User :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "adminusers" :> Capture "userID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "adminusers" :> Capture "userID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "adminusers" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "adminusers" :> Capture "userID" Text :> ReqBody '[JSON] User :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "adminusers" :> Capture "userID" Text :> ReqBody '[JSON] User :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> ReqBody '[JSON] ApprovalRule :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> Capture "approvalRuleID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> Capture "approvalRuleID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> Capture "approvalRuleID" Text :> ReqBody '[JSON] ApprovalRule :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "approvalrules" :> Capture "approvalRuleID" Text :> ReqBody '[JSON] ApprovalRule :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> ReqBody '[JSON] Buyer :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> QueryParam "search" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> ReqBody '[JSON] Buyer :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> ReqBody '[JSON] Category :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> "assignments" :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> "productassignments" :> Capture "productID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteProductAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> QueryParam "parentID" Text :> QueryParam "depth" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> "assignments" :> QueryParam "categoryID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "parentID" Text :> "categories" :> QueryParam "search" Text :> QueryParam "depth" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listChildren' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> "productassignments" :> QueryParam "categoryID" Text :> QueryParam "productID" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listProductAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> ReqBody '[JSON] Category :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> "assignments" :> ReqBody '[JSON] CategoryAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> "productassignments" :> ReqBody '[JSON] CategoryProductAssignment :> Verb 'POST 200 '[JSON] () -- 'saveProductAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "categories" :> Capture "categoryID" Text :> ReqBody '[JSON] Category :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> ReqBody '[JSON] CostCenter :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> Capture "costCenterID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> Capture "costCenterID" Text :> "assignments" :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> Capture "costCenterID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> "assignments" :> QueryParam "costCenterID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> Capture "costCenterID" Text :> ReqBody '[JSON] CostCenter :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> "assignments" :> ReqBody '[JSON] CostCenterAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "costcenters" :> Capture "costCenterID" Text :> ReqBody '[JSON] CostCenter :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> ReqBody '[JSON] CreditCard :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> Capture "creditCardID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> Capture "creditCardID" Text :> "assignments" :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> Capture "creditCardID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> "assignments" :> QueryParam "creditCardID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> Capture "creditCardID" Text :> ReqBody '[JSON] CreditCard :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> "assignments" :> ReqBody '[JSON] CreditCardAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "creditcards" :> Capture "creditCardID" Text :> ReqBody '[JSON] CreditCard :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "emailtemplates" :> Capture "emailTemplateType" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "emailtemplates" :> Capture "emailTemplateType" Text :> ReqBody '[JSON] EmailTemplate :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "emailtemplates" :> Capture "emailTemplateType" Text :> Verb 'DELETE 200 '[JSON] () -- 'resetToDefault' route
    :<|> "buyers" :> Capture "buyerID" Text :> "emailtemplates" :> Capture "emailTemplateType" Text :> ReqBody '[JSON] EmailTemplate :> Verb 'PUT 200 '[JSON] () -- 'update' route
    :<|> "files" :> Capture "fileID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "files" :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "files" :> QueryParam "filename" Text :> Verb 'POST 200 '[JSON] Value -- 'postFileData' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> ReqBody '[JSON] LineItem :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> ReqBody '[JSON] LineItem :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> "shipto" :> ReqBody '[JSON] Address :> Verb 'PATCH 200 '[JSON] Value -- 'patchShippingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> "shipto" :> ReqBody '[JSON] Address :> Verb 'PUT 200 '[JSON] Value -- 'setShippingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "lineitems" :> Capture "lineItemID" Text :> ReqBody '[JSON] LineItem :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "me" :> "addresses" :> ReqBody '[JSON] BuyerAddress :> Verb 'POST 200 '[JSON] Value -- 'createAddress' route
    :<|> "me" :> "creditcards" :> ReqBody '[JSON] BuyerCreditCard :> Verb 'POST 200 '[JSON] Value -- 'createCreditCard' route
    :<|> "me" :> "addresses" :> Capture "addressID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAddress' route
    :<|> "me" :> "creditcards" :> Capture "creditcardID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteCreditCard' route
    :<|> "me" :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "me" :> "addresses" :> Capture "addressID" Text :> Verb 'GET 200 '[JSON] Value -- 'getAddress' route
    :<|> "me" :> "creditcards" :> Capture "creditcardID" Text :> Verb 'GET 200 '[JSON] Value -- 'getCreditCard' route
    :<|> "me" :> "orders" :> Capture "orderID" Text :> Verb 'GET 200 '[JSON] Value -- 'getOrder' route
    :<|> "me" :> "products" :> Capture "productID" Text :> Verb 'GET 200 '[JSON] Value -- 'getProduct' route
    :<|> "me" :> "promotions" :> Capture "promotionID" Text :> Verb 'GET 200 '[JSON] Value -- 'getPromotion' route
    :<|> "me" :> "products" :> Capture "productID" Text :> "specs" :> Capture "specID" Text :> Verb 'GET 200 '[JSON] Value -- 'getSpec' route
    :<|> "me" :> "addresses" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAddresses' route
    :<|> "me" :> "categories" :> QueryParam "depth" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listCategories' route
    :<|> "me" :> "costcenters" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listCostCenters' route
    :<|> "me" :> "creditcards" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listCreditCards' route
    :<|> "me" :> "orders" :> "incoming" :> QueryParam "from" Text :> QueryParam "to" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listIncomingOrders' route
    :<|> "me" :> "orders" :> "outgoing" :> QueryParam "from" Text :> QueryParam "to" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listOutgoingOrders' route
    :<|> "me" :> "products" :> QueryParam "categoryID" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listProducts' route
    :<|> "me" :> "promotions" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listPromotions' route
    :<|> "me" :> "products" :> Capture "productID" Text :> "specs" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listSpecs' route
    :<|> "me" :> "categories" :> Capture "parentID" Text :> "categories" :> QueryParam "depth" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listSubcategories' route
    :<|> "me" :> "usergroups" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listUserGroups' route
    :<|> "me" :> ReqBody '[JSON] User :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "me" :> "addresses" :> Capture "addressID" Text :> ReqBody '[JSON] BuyerAddress :> Verb 'PATCH 200 '[JSON] () -- 'patchAddress' route
    :<|> "me" :> "creditcards" :> Capture "creditcardID" Text :> ReqBody '[JSON] BuyerCreditCard :> Verb 'PATCH 200 '[JSON] () -- 'patchCreditCard' route
    :<|> "me" :> ReqBody '[JSON] User :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "me" :> "addresses" :> Capture "addressID" Text :> ReqBody '[JSON] BuyerAddress :> Verb 'PUT 200 '[JSON] Value -- 'updateAddress' route
    :<|> "me" :> "creditcards" :> Capture "creditcardID" Text :> ReqBody '[JSON] BuyerCreditCard :> Verb 'PUT 200 '[JSON] Value -- 'updateCreditCard' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "promotions" :> Capture "promoCode" Text :> Verb 'POST 200 '[JSON] Value -- 'addPromotion' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "approve" :> QueryParam "comments" Text :> Verb 'POST 200 '[JSON] Value -- 'approve' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "cancel" :> Verb 'POST 200 '[JSON] Value -- 'cancel' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> ReqBody '[JSON] Order :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "decline" :> QueryParam "comments" Text :> Verb 'POST 200 '[JSON] Value -- 'decline' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "approvals" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listApprovals' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "eligibleapprovers" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listEligibleApprovers' route
    :<|> "orders" :> "incoming" :> QueryParam "buyerID" Text :> QueryParam "from" Text :> QueryParam "to" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listIncoming' route
    :<|> "orders" :> "outgoing" :> QueryParam "buyerID" Text :> QueryParam "from" Text :> QueryParam "to" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listOutgoing' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "promotions" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listPromotions' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> ReqBody '[JSON] Order :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "billto" :> ReqBody '[JSON] Address :> Verb 'PATCH 200 '[JSON] Value -- 'patchBillingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "shipto" :> ReqBody '[JSON] Address :> Verb 'PATCH 200 '[JSON] Value -- 'patchShippingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "promotions" :> Capture "promoCode" Text :> Verb 'DELETE 200 '[JSON] Value -- 'removePromotion' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "billto" :> ReqBody '[JSON] Address :> Verb 'PUT 200 '[JSON] Value -- 'setBillingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "shipto" :> ReqBody '[JSON] Address :> Verb 'PUT 200 '[JSON] Value -- 'setShippingAddress' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "ship" :> ReqBody '[JSON] Shipment :> Verb 'POST 200 '[JSON] Value -- 'ship' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "submit" :> Verb 'POST 200 '[JSON] Value -- 'submit' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> QueryParam "tempUserToken" Text :> Verb 'PUT 200 '[JSON] () -- 'transferTempUserOrder' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> ReqBody '[JSON] Order :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "password" :> "reset" :> Capture "verificationCode" Text :> ReqBody '[JSON] PasswordReset :> Verb 'PUT 200 '[JSON] () -- 'resetPassword' route
    :<|> "password" :> "reset" :> ReqBody '[JSON] PasswordResetRequest :> Verb 'POST 200 '[JSON] () -- 'sendVerificationCode' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> ReqBody '[JSON] Payment :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> "transactions" :> ReqBody '[JSON] PaymentTransaction :> Verb 'POST 200 '[JSON] Value -- 'createTransaction' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> "transactions" :> Capture "transactionID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteTransaction' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> ReqBody '[JSON] Payment :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> "transactions" :> Capture "transactionID" Text :> ReqBody '[JSON] PaymentTransaction :> Verb 'PATCH 200 '[JSON] Value -- 'patchTransaction' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> ReqBody '[JSON] Payment :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "orders" :> Capture "orderID" Text :> "payments" :> Capture "paymentID" Text :> "transactions" :> Capture "transactionID" Text :> ReqBody '[JSON] PaymentTransaction :> Verb 'PUT 200 '[JSON] Value -- 'updateTransaction' route
    :<|> "priceschedules" :> ReqBody '[JSON] PriceSchedule :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> "PriceBreaks" :> QueryParam "quantity" Int :> Verb 'DELETE 200 '[JSON] () -- 'deletePriceBreak' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "priceschedules" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> ReqBody '[JSON] PriceSchedule :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> "PriceBreaks" :> ReqBody '[JSON] PriceBreak :> Verb 'POST 200 '[JSON] Value -- 'savePriceBreak' route
    :<|> "priceschedules" :> Capture "priceScheduleID" Text :> ReqBody '[JSON] PriceSchedule :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "products" :> ReqBody '[JSON] Product :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "products" :> Capture "productID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "products" :> Capture "productID" Text :> "assignments" :> Capture "buyerID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> "generate" :> QueryParam "overwriteExisting" Bool :> Verb 'POST 200 '[JSON] Value -- 'generateVariants' route
    :<|> "products" :> Capture "productID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "products" :> Capture "productID" Text :> "inventory" :> Verb 'GET 200 '[JSON] Value -- 'getInventory' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> Capture "variantID" Text :> Verb 'GET 200 '[JSON] Value -- 'getVariant' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> "inventory" :> Capture "variantID" Text :> Verb 'GET 200 '[JSON] Value -- 'getVariantInventory' route
    :<|> "products" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "products" :> "assignments" :> QueryParam "productID" Text :> QueryParam "buyerID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "priceScheduleID" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "products" :> "inventory" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listInventory' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> "inventory" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listVariantInventory' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listVariants' route
    :<|> "products" :> Capture "productID" Text :> ReqBody '[JSON] Product :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> Capture "variantID" Text :> ReqBody '[JSON] Variant :> Verb 'PATCH 200 '[JSON] Value -- 'patchVariant' route
    :<|> "products" :> "assignments" :> ReqBody '[JSON] ProductAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "products" :> Capture "productID" Text :> ReqBody '[JSON] Product :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "products" :> Capture "productID" Text :> "inventory" :> Capture "inventory" Int :> Verb 'PUT 200 '[JSON] Value -- 'updateInventory' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> Capture "variantID" Text :> ReqBody '[JSON] Variant :> Verb 'PUT 200 '[JSON] Value -- 'updateVariant' route
    :<|> "products" :> Capture "productID" Text :> "variants" :> "inventory" :> Capture "variantID" Text :> Capture "inventory" Int :> Verb 'PUT 200 '[JSON] Value -- 'updateVariantInventory' route
    :<|> "promotions" :> ReqBody '[JSON] Promotion :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "promotions" :> Capture "promotionID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "promotions" :> Capture "promotionID" Text :> "assignments" :> QueryParam "buyerID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "promotions" :> Capture "promotionID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "promotions" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "promotions" :> "assignments" :> QueryParam "buyerID" Text :> QueryParam "promotionID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "promotions" :> Capture "promotionID" Text :> ReqBody '[JSON] Promotion :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "promotions" :> "assignments" :> ReqBody '[JSON] PromotionAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "promotions" :> Capture "promotionID" Text :> ReqBody '[JSON] Promotion :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "SecurityProfiles" :> Capture "securityProfileID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "SecurityProfiles" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> ReqBody '[JSON] Shipment :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> "items" :> Capture "orderID" Text :> Capture "lineItemID" Text :> Verb 'DELETE 200 '[JSON] Value -- 'deleteItem' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> QueryParam "orderID" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> ReqBody '[JSON] Shipment :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> "items" :> ReqBody '[JSON] ShipmentItem :> Verb 'POST 200 '[JSON] Value -- 'saveItem' route
    :<|> "buyers" :> Capture "buyerID" Text :> "shipments" :> Capture "shipmentID" Text :> ReqBody '[JSON] Shipment :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "specs" :> ReqBody '[JSON] Spec :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> ReqBody '[JSON] SpecOption :> Verb 'POST 200 '[JSON] Value -- 'createOption' route
    :<|> "specs" :> Capture "specID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> Capture "optionID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteOption' route
    :<|> "specs" :> Capture "specID" Text :> "productassignments" :> Capture "productID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteProductAssignment' route
    :<|> "specs" :> Capture "specID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> Capture "optionID" Text :> Verb 'GET 200 '[JSON] Value -- 'getOption' route
    :<|> "specs" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listOptions' route
    :<|> "specs" :> "productassignments" :> QueryParam "specID" Text :> QueryParam "productID" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listProductAssignments' route
    :<|> "specs" :> Capture "specID" Text :> ReqBody '[JSON] Spec :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> Capture "optionID" Text :> ReqBody '[JSON] SpecOption :> Verb 'PATCH 200 '[JSON] Value -- 'patchOption' route
    :<|> "specs" :> "productassignments" :> ReqBody '[JSON] SpecProductAssignment :> Verb 'POST 200 '[JSON] () -- 'saveProductAssignment' route
    :<|> "specs" :> Capture "specID" Text :> ReqBody '[JSON] Spec :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "specs" :> Capture "specID" Text :> "options" :> Capture "optionID" Text :> ReqBody '[JSON] SpecOption :> Verb 'PUT 200 '[JSON] Value -- 'updateOption' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> ReqBody '[JSON] SpendingAccount :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> Capture "spendingAccountID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> Capture "spendingAccountID" Text :> "assignments" :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> Capture "spendingAccountID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> "assignments" :> QueryParam "spendingAccountID" Text :> QueryParam "userID" Text :> QueryParam "userGroupID" Text :> QueryParam "level" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> Capture "spendingAccountID" Text :> ReqBody '[JSON] SpendingAccount :> Verb 'PATCH 200 '[JSON] Value -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> "assignments" :> ReqBody '[JSON] SpendingAccountAssignment :> Verb 'POST 200 '[JSON] () -- 'saveAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "spendingaccounts" :> Capture "spendingAccountID" Text :> ReqBody '[JSON] SpendingAccount :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> ReqBody '[JSON] User :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> Capture "userID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> Capture "userID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> Capture "userID" Text :> "accesstoken" :> ReqBody '[JSON] ImpersonateTokenRequest :> Verb 'POST 200 '[JSON] Value -- 'getAccessToken' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> QueryParam "userGroupID" Text :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> Capture "userID" Text :> ReqBody '[JSON] User :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "users" :> Capture "userID" Text :> ReqBody '[JSON] User :> Verb 'PUT 200 '[JSON] Value -- 'update' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> ReqBody '[JSON] UserGroup :> Verb 'POST 200 '[JSON] Value -- 'create' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> Capture "userGroupID" Text :> Verb 'DELETE 200 '[JSON] () -- 'delete' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> Capture "userGroupID" Text :> "assignments" :> Capture "userID" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteUserAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> Capture "userGroupID" Text :> Verb 'GET 200 '[JSON] Value -- 'get' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> QueryParam "search" Text :> QueryParam "searchOn" Text :> QueryParam "sortBy" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'list' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> "assignments" :> QueryParam "userGroupID" Text :> QueryParam "userID" Text :> QueryParam "page" Int :> QueryParam "pageSize" Int :> Verb 'GET 200 '[JSON] Value -- 'listUserAssignments' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> Capture "userGroupID" Text :> ReqBody '[JSON] UserGroup :> Verb 'PATCH 200 '[JSON] () -- 'patch' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> "assignments" :> ReqBody '[JSON] UserGroupAssignment :> Verb 'POST 200 '[JSON] () -- 'saveUserAssignment' route
    :<|> "buyers" :> Capture "buyerID" Text :> "usergroups" :> Capture "userGroupID" Text :> ReqBody '[JSON] UserGroup :> Verb 'PUT 200 '[JSON] Value -- 'update' route

-- | Server or client configuration, specifying the host and port to query or serve on.
data ServerConfig = ServerConfig {
    configHost :: String,  -- ^ Hostname to serve on, e.g. "127.0.0.1"
    configPort :: Int      -- ^ Port to serve on, e.g. 8080
  } deriving (Eq, Ord, Show, Read)

-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList { fromQueryList :: [a] }
  deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat = CommaSeparated -- ^ CSV format for multiple parameters.
                      | SpaceSeparated -- ^ Also called "SSV"
                      | TabSeparated -- ^ Also called "TSV"
                      | PipeSeparated -- ^ `value1|value2|value2`
                      | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
    parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
    parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
    parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
    parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
    parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
    toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
    toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
    toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
    toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
    toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Backend for OrderCloud.
-- The backend can be used both for the client and the server. The client generated from the OrderCloud Swagger spec
-- is a backend that executes actions by sending HTTP requests (see @createOrderCloudClient@). Alternatively, provided
-- a backend, the API can be served using @runOrderCloudServer@.
data OrderCloudBackend m = OrderCloudBackend {
    create :: Text -> Address -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Address -> m Value{- ^  -},
    saveAssignment :: Text -> AddressAssignment -> m (){- ^  -},
    update :: Text -> Text -> Address -> m Value{- ^  -},
    create :: User -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> User -> m (){- ^  -},
    update :: Text -> User -> m Value{- ^  -},
    create :: Text -> ApprovalRule -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> ApprovalRule -> m Value{- ^  -},
    update :: Text -> Text -> ApprovalRule -> m Value{- ^  -},
    create :: Buyer -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    update :: Text -> Buyer -> m Value{- ^  -},
    create :: Text -> Category -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    deleteProductAssignment :: Text -> Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listChildren :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listProductAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Category -> m (){- ^  -},
    saveAssignment :: Text -> CategoryAssignment -> m (){- ^  -},
    saveProductAssignment :: Text -> CategoryProductAssignment -> m (){- ^  -},
    update :: Text -> Text -> Category -> m Value{- ^  -},
    create :: Text -> CostCenter -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> CostCenter -> m Value{- ^  -},
    saveAssignment :: Text -> CostCenterAssignment -> m (){- ^  -},
    update :: Text -> Text -> CostCenter -> m Value{- ^  -},
    create :: Text -> CreditCard -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> CreditCard -> m Value{- ^  -},
    saveAssignment :: Text -> CreditCardAssignment -> m (){- ^  -},
    update :: Text -> Text -> CreditCard -> m Value{- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    patch :: Text -> Text -> EmailTemplate -> m (){- ^  -},
    resetToDefault :: Text -> Text -> m (){- ^  -},
    update :: Text -> Text -> EmailTemplate -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Int -> Maybe Int -> m Value{- ^  -},
    postFileData :: Maybe Text -> m Value{- ^  -},
    create :: Text -> Text -> LineItem -> m Value{- ^  -},
    delete :: Text -> Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> Text -> m Value{- ^  -},
    list :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Text -> LineItem -> m Value{- ^  -},
    patchShippingAddress :: Text -> Text -> Text -> Address -> m Value{- ^  -},
    setShippingAddress :: Text -> Text -> Text -> Address -> m Value{- ^  -},
    update :: Text -> Text -> Text -> LineItem -> m Value{- ^  -},
    createAddress :: BuyerAddress -> m Value{- ^  -},
    createCreditCard :: BuyerCreditCard -> m Value{- ^  -},
    deleteAddress :: Text -> m (){- ^  -},
    deleteCreditCard :: Text -> m (){- ^  -},
    get :: m Value{- ^  -},
    getAddress :: Text -> m Value{- ^  -},
    getCreditCard :: Text -> m Value{- ^  -},
    getOrder :: Text -> m Value{- ^  -},
    getProduct :: Text -> m Value{- ^  -},
    getPromotion :: Text -> m Value{- ^  -},
    getSpec :: Text -> Text -> m Value{- ^  -},
    listAddresses :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listCategories :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listCostCenters :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listCreditCards :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listIncomingOrders :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listOutgoingOrders :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listProducts :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listPromotions :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listSpecs :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listSubcategories :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listUserGroups :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: User -> m Value{- ^  -},
    patchAddress :: Text -> BuyerAddress -> m (){- ^  -},
    patchCreditCard :: Text -> BuyerCreditCard -> m (){- ^  -},
    update :: User -> m Value{- ^  -},
    updateAddress :: Text -> BuyerAddress -> m Value{- ^  -},
    updateCreditCard :: Text -> BuyerCreditCard -> m Value{- ^  -},
    addPromotion :: Text -> Text -> Text -> m Value{- ^  -},
    approve :: Text -> Text -> Maybe Text -> m Value{- ^  -},
    cancel :: Text -> Text -> m Value{- ^  -},
    create :: Text -> Order -> m Value{- ^  -},
    decline :: Text -> Text -> Maybe Text -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    listApprovals :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listEligibleApprovers :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listIncoming :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listOutgoing :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listPromotions :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Order -> m Value{- ^  -},
    patchBillingAddress :: Text -> Text -> Address -> m Value{- ^  -},
    patchShippingAddress :: Text -> Text -> Address -> m Value{- ^  -},
    removePromotion :: Text -> Text -> Text -> m Value{- ^  -},
    setBillingAddress :: Text -> Text -> Address -> m Value{- ^  -},
    setShippingAddress :: Text -> Text -> Address -> m Value{- ^  -},
    ship :: Text -> Text -> Shipment -> m Value{- ^  -},
    submit :: Text -> Text -> m Value{- ^  -},
    transferTempUserOrder :: Text -> Maybe Text -> m (){- ^  -},
    update :: Text -> Text -> Order -> m Value{- ^  -},
    resetPassword :: Text -> PasswordReset -> m (){- ^  -},
    sendVerificationCode :: PasswordResetRequest -> m (){- ^  -},
    create :: Text -> Text -> Payment -> m Value{- ^  -},
    createTransaction :: Text -> Text -> Text -> PaymentTransaction -> m Value{- ^  -},
    delete :: Text -> Text -> Text -> m (){- ^  -},
    deleteTransaction :: Text -> Text -> Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> Text -> m Value{- ^  -},
    list :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Text -> Payment -> m Value{- ^  -},
    patchTransaction :: Text -> Text -> Text -> Text -> PaymentTransaction -> m Value{- ^  -},
    update :: Text -> Text -> Text -> Payment -> m Value{- ^  -},
    updateTransaction :: Text -> Text -> Text -> Text -> PaymentTransaction -> m Value{- ^  -},
    create :: PriceSchedule -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    deletePriceBreak :: Text -> Maybe Int -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> PriceSchedule -> m Value{- ^  -},
    savePriceBreak :: Text -> PriceBreak -> m Value{- ^  -},
    update :: Text -> PriceSchedule -> m Value{- ^  -},
    create :: Product -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    generateVariants :: Text -> Maybe Bool -> m Value{- ^  -},
    get :: Text -> m Value{- ^  -},
    getInventory :: Text -> m Value{- ^  -},
    getVariant :: Text -> Text -> m Value{- ^  -},
    getVariantInventory :: Text -> Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listInventory :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listVariantInventory :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listVariants :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Product -> m (){- ^  -},
    patchVariant :: Text -> Text -> Variant -> m Value{- ^  -},
    saveAssignment :: ProductAssignment -> m (){- ^  -},
    update :: Text -> Product -> m Value{- ^  -},
    updateInventory :: Text -> Int -> m Value{- ^  -},
    updateVariant :: Text -> Text -> Variant -> m Value{- ^  -},
    updateVariantInventory :: Text -> Text -> Int -> m Value{- ^  -},
    create :: Promotion -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    deleteAssignment :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Promotion -> m Value{- ^  -},
    saveAssignment :: PromotionAssignment -> m (){- ^  -},
    update :: Text -> Promotion -> m Value{- ^  -},
    get :: Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    create :: Text -> Shipment -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteItem :: Text -> Text -> Text -> Text -> m Value{- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> Shipment -> m Value{- ^  -},
    saveItem :: Text -> Text -> ShipmentItem -> m Value{- ^  -},
    update :: Text -> Text -> Shipment -> m Value{- ^  -},
    create :: Spec -> m Value{- ^  -},
    createOption :: Text -> SpecOption -> m Value{- ^  -},
    delete :: Text -> m (){- ^  -},
    deleteOption :: Text -> Text -> m (){- ^  -},
    deleteProductAssignment :: Text -> Text -> m (){- ^  -},
    get :: Text -> m Value{- ^  -},
    getOption :: Text -> Text -> m Value{- ^  -},
    list :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listOptions :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listProductAssignments :: Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Spec -> m Value{- ^  -},
    patchOption :: Text -> Text -> SpecOption -> m Value{- ^  -},
    saveProductAssignment :: SpecProductAssignment -> m (){- ^  -},
    update :: Text -> Spec -> m Value{- ^  -},
    updateOption :: Text -> Text -> SpecOption -> m Value{- ^  -},
    create :: Text -> SpendingAccount -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteAssignment :: Text -> Text -> Maybe Text -> Maybe Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> SpendingAccount -> m Value{- ^  -},
    saveAssignment :: Text -> SpendingAccountAssignment -> m (){- ^  -},
    update :: Text -> Text -> SpendingAccount -> m Value{- ^  -},
    create :: Text -> User -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    getAccessToken :: Text -> Text -> ImpersonateTokenRequest -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> User -> m (){- ^  -},
    update :: Text -> Text -> User -> m Value{- ^  -},
    create :: Text -> UserGroup -> m Value{- ^  -},
    delete :: Text -> Text -> m (){- ^  -},
    deleteUserAssignment :: Text -> Text -> Text -> m (){- ^  -},
    get :: Text -> Text -> m Value{- ^  -},
    list :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    listUserAssignments :: Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m Value{- ^  -},
    patch :: Text -> Text -> UserGroup -> m (){- ^  -},
    saveUserAssignment :: Text -> UserGroupAssignment -> m (){- ^  -},
    update :: Text -> Text -> UserGroup -> m Value{- ^  -}
  }

newtype OrderCloudClient a = OrderCloudClient { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a }
    deriving Functor

instance Applicative OrderCloudClient where
    pure x = OrderCloudClient (\_ _ -> pure x)
    (OrderCloudClient f) <*> (OrderCloudClient x) = OrderCloudClient (\manager url -> f manager url <*> x manager url)

instance Monad OrderCloudClient where
    (OrderCloudClient a) >>= f = OrderCloudClient (\manager url -> do
        value <- a manager url
        runClient (f value) manager url)

instance MonadIO OrderCloudClient where
    liftIO io = OrderCloudClient (\_ _ -> liftIO io)

createOrderCloudClient :: OrderCloudBackend OrderCloudClient
createOrderCloudClient = OrderCloudBackend{..}
  where
    ((coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> deleteProductAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> listChildren) :<|>
     (coerce -> listProductAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> saveProductAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> get) :<|>
     (coerce -> patch) :<|>
     (coerce -> resetToDefault) :<|>
     (coerce -> update) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> postFileData) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchShippingAddress) :<|>
     (coerce -> setShippingAddress) :<|>
     (coerce -> update) :<|>
     (coerce -> createAddress) :<|>
     (coerce -> createCreditCard) :<|>
     (coerce -> deleteAddress) :<|>
     (coerce -> deleteCreditCard) :<|>
     (coerce -> get) :<|>
     (coerce -> getAddress) :<|>
     (coerce -> getCreditCard) :<|>
     (coerce -> getOrder) :<|>
     (coerce -> getProduct) :<|>
     (coerce -> getPromotion) :<|>
     (coerce -> getSpec) :<|>
     (coerce -> listAddresses) :<|>
     (coerce -> listCategories) :<|>
     (coerce -> listCostCenters) :<|>
     (coerce -> listCreditCards) :<|>
     (coerce -> listIncomingOrders) :<|>
     (coerce -> listOutgoingOrders) :<|>
     (coerce -> listProducts) :<|>
     (coerce -> listPromotions) :<|>
     (coerce -> listSpecs) :<|>
     (coerce -> listSubcategories) :<|>
     (coerce -> listUserGroups) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchAddress) :<|>
     (coerce -> patchCreditCard) :<|>
     (coerce -> update) :<|>
     (coerce -> updateAddress) :<|>
     (coerce -> updateCreditCard) :<|>
     (coerce -> addPromotion) :<|>
     (coerce -> approve) :<|>
     (coerce -> cancel) :<|>
     (coerce -> create) :<|>
     (coerce -> decline) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> listApprovals) :<|>
     (coerce -> listEligibleApprovers) :<|>
     (coerce -> listIncoming) :<|>
     (coerce -> listOutgoing) :<|>
     (coerce -> listPromotions) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchBillingAddress) :<|>
     (coerce -> patchShippingAddress) :<|>
     (coerce -> removePromotion) :<|>
     (coerce -> setBillingAddress) :<|>
     (coerce -> setShippingAddress) :<|>
     (coerce -> ship) :<|>
     (coerce -> submit) :<|>
     (coerce -> transferTempUserOrder) :<|>
     (coerce -> update) :<|>
     (coerce -> resetPassword) :<|>
     (coerce -> sendVerificationCode) :<|>
     (coerce -> create) :<|>
     (coerce -> createTransaction) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteTransaction) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchTransaction) :<|>
     (coerce -> update) :<|>
     (coerce -> updateTransaction) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deletePriceBreak) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> savePriceBreak) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> generateVariants) :<|>
     (coerce -> get) :<|>
     (coerce -> getInventory) :<|>
     (coerce -> getVariant) :<|>
     (coerce -> getVariantInventory) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> listInventory) :<|>
     (coerce -> listVariantInventory) :<|>
     (coerce -> listVariants) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchVariant) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> updateInventory) :<|>
     (coerce -> updateVariant) :<|>
     (coerce -> updateVariantInventory) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteItem) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveItem) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> createOption) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteOption) :<|>
     (coerce -> deleteProductAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> getOption) :<|>
     (coerce -> list) :<|>
     (coerce -> listOptions) :<|>
     (coerce -> listProductAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> patchOption) :<|>
     (coerce -> saveProductAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> updateOption) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveAssignment) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> get) :<|>
     (coerce -> getAccessToken) :<|>
     (coerce -> list) :<|>
     (coerce -> patch) :<|>
     (coerce -> update) :<|>
     (coerce -> create) :<|>
     (coerce -> delete) :<|>
     (coerce -> deleteUserAssignment) :<|>
     (coerce -> get) :<|>
     (coerce -> list) :<|>
     (coerce -> listUserAssignments) :<|>
     (coerce -> patch) :<|>
     (coerce -> saveUserAssignment) :<|>
     (coerce -> update)) = client (Proxy :: Proxy OrderCloudAPI)

-- | Run requests in the OrderCloudClient monad.
runOrderCloudClient :: ServerConfig -> OrderCloudClient a -> ExceptT ServantError IO a
runOrderCloudClient clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runOrderCloudClientWithManager manager clientConfig cl

-- | Run requests in the OrderCloudClient monad using a custom manager.
runOrderCloudClientWithManager :: Manager -> ServerConfig -> OrderCloudClient a -> ExceptT ServantError IO a
runOrderCloudClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the OrderCloud server at the provided host and port.
runOrderCloudServer :: MonadIO m => ServerConfig -> OrderCloudBackend (ExceptT ServantErr IO)  -> m ()
runOrderCloudServer ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy OrderCloudAPI) (serverFromBackend backend)

  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend OrderCloudBackend{..} =
      (coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce list :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce deleteProductAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce listChildren :<|>
       coerce listProductAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce saveProductAssignment :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce get :<|>
       coerce patch :<|>
       coerce resetToDefault :<|>
       coerce update :<|>
       coerce get :<|>
       coerce list :<|>
       coerce postFileData :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce patchShippingAddress :<|>
       coerce setShippingAddress :<|>
       coerce update :<|>
       coerce createAddress :<|>
       coerce createCreditCard :<|>
       coerce deleteAddress :<|>
       coerce deleteCreditCard :<|>
       coerce get :<|>
       coerce getAddress :<|>
       coerce getCreditCard :<|>
       coerce getOrder :<|>
       coerce getProduct :<|>
       coerce getPromotion :<|>
       coerce getSpec :<|>
       coerce listAddresses :<|>
       coerce listCategories :<|>
       coerce listCostCenters :<|>
       coerce listCreditCards :<|>
       coerce listIncomingOrders :<|>
       coerce listOutgoingOrders :<|>
       coerce listProducts :<|>
       coerce listPromotions :<|>
       coerce listSpecs :<|>
       coerce listSubcategories :<|>
       coerce listUserGroups :<|>
       coerce patch :<|>
       coerce patchAddress :<|>
       coerce patchCreditCard :<|>
       coerce update :<|>
       coerce updateAddress :<|>
       coerce updateCreditCard :<|>
       coerce addPromotion :<|>
       coerce approve :<|>
       coerce cancel :<|>
       coerce create :<|>
       coerce decline :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce listApprovals :<|>
       coerce listEligibleApprovers :<|>
       coerce listIncoming :<|>
       coerce listOutgoing :<|>
       coerce listPromotions :<|>
       coerce patch :<|>
       coerce patchBillingAddress :<|>
       coerce patchShippingAddress :<|>
       coerce removePromotion :<|>
       coerce setBillingAddress :<|>
       coerce setShippingAddress :<|>
       coerce ship :<|>
       coerce submit :<|>
       coerce transferTempUserOrder :<|>
       coerce update :<|>
       coerce resetPassword :<|>
       coerce sendVerificationCode :<|>
       coerce create :<|>
       coerce createTransaction :<|>
       coerce delete :<|>
       coerce deleteTransaction :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce patchTransaction :<|>
       coerce update :<|>
       coerce updateTransaction :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deletePriceBreak :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce savePriceBreak :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce generateVariants :<|>
       coerce get :<|>
       coerce getInventory :<|>
       coerce getVariant :<|>
       coerce getVariantInventory :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce listInventory :<|>
       coerce listVariantInventory :<|>
       coerce listVariants :<|>
       coerce patch :<|>
       coerce patchVariant :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce updateInventory :<|>
       coerce updateVariant :<|>
       coerce updateVariantInventory :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce get :<|>
       coerce list :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteItem :<|>
       coerce get :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce saveItem :<|>
       coerce update :<|>
       coerce create :<|>
       coerce createOption :<|>
       coerce delete :<|>
       coerce deleteOption :<|>
       coerce deleteProductAssignment :<|>
       coerce get :<|>
       coerce getOption :<|>
       coerce list :<|>
       coerce listOptions :<|>
       coerce listProductAssignments :<|>
       coerce patch :<|>
       coerce patchOption :<|>
       coerce saveProductAssignment :<|>
       coerce update :<|>
       coerce updateOption :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listAssignments :<|>
       coerce patch :<|>
       coerce saveAssignment :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce get :<|>
       coerce getAccessToken :<|>
       coerce list :<|>
       coerce patch :<|>
       coerce update :<|>
       coerce create :<|>
       coerce delete :<|>
       coerce deleteUserAssignment :<|>
       coerce get :<|>
       coerce list :<|>
       coerce listUserAssignments :<|>
       coerce patch :<|>
       coerce saveUserAssignment :<|>
       coerce update)
