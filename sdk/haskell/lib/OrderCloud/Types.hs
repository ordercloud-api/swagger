{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OrderCloud.Types (
    Address (..),
    AddressAssignment (..),
    ApprovalRule (..),
    Buyer (..),
    BuyerAddress (..),
    BuyerCreditCard (..),
    Category (..),
    CategoryAssignment (..),
    CategoryProductAssignment (..),
    CostCenter (..),
    CostCenterAssignment (..),
    CreditCard (..),
    CreditCardAssignment (..),
    EmailTemplate (..),
    ImpersonateTokenRequest (..),
    LineItem (..),
    Order (..),
    Partial&#x60;1 (..),
    PasswordReset (..),
    PasswordResetRequest (..),
    Payment (..),
    PaymentTransaction (..),
    PriceBreak (..),
    PriceSchedule (..),
    Product (..),
    ProductAssignment (..),
    Promotion (..),
    PromotionAssignment (..),
    Shipment (..),
    ShipmentItem (..),
    Spec (..),
    SpecOption (..),
    SpecProductAssignment (..),
    SpendingAccount (..),
    SpendingAccountAssignment (..),
    User (..),
    UserGroup (..),
    UserGroupAssignment (..),
    Variant (..),
    ) where

import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data Address = Address
    { addressID :: Text -- ^ 
    , addressCompanyName :: Text -- ^ 
    , addressFirstName :: Text -- ^ 
    , addressLastName :: Text -- ^ 
    , addressStreet1 :: Text -- ^ 
    , addressStreet2 :: Text -- ^ 
    , addressCity :: Text -- ^ 
    , addressState :: Text -- ^ 
    , addressZip :: Text -- ^ 
    , addressCountry :: Text -- ^ 
    , addressPhone :: Text -- ^ 
    , addressAddressName :: Text -- ^ 
    , addressXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Address where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "address")
instance ToJSON Address where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "address")

-- | 
data AddressAssignment = AddressAssignment
    { addressAssignmentAddressID :: Text -- ^ 
    , addressAssignmentUserID :: Text -- ^ 
    , addressAssignmentUserGroupID :: Text -- ^ 
    , addressAssignmentIsShipping :: Bool -- ^ 
    , addressAssignmentIsBilling :: Bool -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON AddressAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "addressAssignment")
instance ToJSON AddressAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "addressAssignment")

-- | 
data ApprovalRule = ApprovalRule
    { approvalRuleID :: Text -- ^ 
    , approvalRuleName :: Text -- ^ 
    , approvalRuleDescription :: Text -- ^ 
    , approvalRuleApprovingGroupID :: Text -- ^ 
    , approvalRuleRuleExpression :: Text -- ^ 
    , approvalRuleScope :: Text -- ^ 
    , approvalRuleScopeTimeUnit :: Text -- ^ 
    , approvalRuleScopeTimeNumber :: Int -- ^ 
    , approvalRuleScopeStartDate :: Date -- ^ 
    , approvalRuleExpireAfterTimeUnit :: Text -- ^ 
    , approvalRuleExpireAfterNumber :: Int -- ^ 
    , approvalRuleApproveOnExpire :: Bool -- ^ 
    , approvalRuleXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON ApprovalRule where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "approvalRule")
instance ToJSON ApprovalRule where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "approvalRule")

-- | 
data Buyer = Buyer
    { buyerID :: Text -- ^ 
    , buyerName :: Text -- ^ 
    , buyerActive :: Bool -- ^ 
    , buyerXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Buyer where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "buyer")
instance ToJSON Buyer where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "buyer")

-- | 
data BuyerAddress = BuyerAddress
    { buyerAddressShipping :: Bool -- ^ 
    , buyerAddressBilling :: Bool -- ^ 
    , buyerAddressCompanyName :: Text -- ^ 
    , buyerAddressFirstName :: Text -- ^ 
    , buyerAddressLastName :: Text -- ^ 
    , buyerAddressStreet1 :: Text -- ^ 
    , buyerAddressStreet2 :: Text -- ^ 
    , buyerAddressCity :: Text -- ^ 
    , buyerAddressState :: Text -- ^ 
    , buyerAddressZip :: Text -- ^ 
    , buyerAddressCountry :: Text -- ^ 
    , buyerAddressPhone :: Text -- ^ 
    , buyerAddressAddressName :: Text -- ^ 
    , buyerAddressXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON BuyerAddress where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "buyerAddress")
instance ToJSON BuyerAddress where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "buyerAddress")

-- | 
data BuyerCreditCard = BuyerCreditCard
    { buyerCreditCardToken :: Text -- ^ 
    , buyerCreditCardCardType :: Text -- ^ 
    , buyerCreditCardPartialAccountNumber :: Text -- ^ 
    , buyerCreditCardCardholderName :: Text -- ^ 
    , buyerCreditCardExpirationDate :: Date -- ^ 
    , buyerCreditCardXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON BuyerCreditCard where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "buyerCreditCard")
instance ToJSON BuyerCreditCard where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "buyerCreditCard")

-- | 
data Category = Category
    { categoryID :: Text -- ^ 
    , categoryName :: Text -- ^ 
    , categoryDescription :: Text -- ^ 
    , categoryXp :: Value -- ^ 
    , categoryListOrder :: Int -- ^ 
    , categoryActive :: Bool -- ^ 
    , categoryParentID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Category where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "category")
instance ToJSON Category where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "category")

-- | 
data CategoryAssignment = CategoryAssignment
    { categoryAssignmentCategoryID :: Text -- ^ 
    , categoryAssignmentUserID :: Text -- ^ 
    , categoryAssignmentUserGroupID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CategoryAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "categoryAssignment")
instance ToJSON CategoryAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "categoryAssignment")

-- | 
data CategoryProductAssignment = CategoryProductAssignment
    { categoryProductAssignmentCategoryID :: Text -- ^ 
    , categoryProductAssignmentProductID :: Text -- ^ 
    , categoryProductAssignmentListOrder :: Int -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CategoryProductAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "categoryProductAssignment")
instance ToJSON CategoryProductAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "categoryProductAssignment")

-- | 
data CostCenter = CostCenter
    { costCenterID :: Text -- ^ 
    , costCenterName :: Text -- ^ 
    , costCenterDescription :: Text -- ^ 
    , costCenterXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CostCenter where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "costCenter")
instance ToJSON CostCenter where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "costCenter")

-- | 
data CostCenterAssignment = CostCenterAssignment
    { costCenterAssignmentCostCenterID :: Text -- ^ 
    , costCenterAssignmentUserID :: Text -- ^ 
    , costCenterAssignmentUserGroupID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CostCenterAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "costCenterAssignment")
instance ToJSON CostCenterAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "costCenterAssignment")

-- | 
data CreditCard = CreditCard
    { creditCardID :: Text -- ^ 
    , creditCardToken :: Text -- ^ 
    , creditCardCardType :: Text -- ^ 
    , creditCardPartialAccountNumber :: Text -- ^ 
    , creditCardCardholderName :: Text -- ^ 
    , creditCardExpirationDate :: Date -- ^ 
    , creditCardXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CreditCard where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "creditCard")
instance ToJSON CreditCard where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "creditCard")

-- | 
data CreditCardAssignment = CreditCardAssignment
    { creditCardAssignmentCreditCardID :: Text -- ^ 
    , creditCardAssignmentUserID :: Text -- ^ 
    , creditCardAssignmentUserGroupID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON CreditCardAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "creditCardAssignment")
instance ToJSON CreditCardAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "creditCardAssignment")

-- | 
data EmailTemplate = EmailTemplate
    { emailTemplateSubject :: Text -- ^ 
    , emailTemplateBody :: Text -- ^ 
    , emailTemplateReplyEmail :: Text -- ^ 
    , emailTemplateSendMessageType :: Bool -- ^ 
    , emailTemplateEmailFormatType :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON EmailTemplate where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "emailTemplate")
instance ToJSON EmailTemplate where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "emailTemplate")

-- | 
data ImpersonateTokenRequest = ImpersonateTokenRequest
    { impersonateTokenRequestClientID :: Text -- ^ 
    , impersonateTokenRequestClaims :: [ShipmentItem] -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON ImpersonateTokenRequest where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "impersonateTokenRequest")
instance ToJSON ImpersonateTokenRequest where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "impersonateTokenRequest")

-- | 
data LineItem = LineItem
    { lineItemID :: Text -- ^ 
    , lineItemProductID :: Text -- ^ 
    , lineItemQuantity :: Int -- ^ 
    , lineItemUnitPrice :: Double -- ^ 
    , lineItemCostCenter :: Text -- ^ 
    , lineItemDateNeeded :: Date -- ^ 
    , lineItemShippingAccount :: Text -- ^ 
    , lineItemShippingAddressID :: Text -- ^ 
    , lineItemShipfromAddressID :: Text -- ^ 
    , lineItemShipperID :: Text -- ^ 
    , lineItemSpecs :: [ShipmentItem] -- ^ 
    , lineItemXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON LineItem where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "lineItem")
instance ToJSON LineItem where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "lineItem")

-- | 
data Order = Order
    { orderID :: Text -- ^ 
    , orderType :: Text -- ^ 
    , orderFromUserID :: Text -- ^ 
    , orderBillingAddressID :: Text -- ^ 
    , orderShippingAddressID :: Text -- ^ 
    , orderComments :: Text -- ^ 
    , orderShippingCost :: Double -- ^ 
    , orderTaxCost :: Double -- ^ 
    , orderXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Order where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "order")
instance ToJSON Order where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "order")

-- | 
data Partial&#x60;1 = Partial&#x60;1
    { partial`1ID :: Text -- ^ 
    , partial`1Username :: Text -- ^ 
    , partial`1Password :: Text -- ^ 
    , partial`1FirstName :: Text -- ^ 
    , partial`1LastName :: Text -- ^ 
    , partial`1Email :: Text -- ^ 
    , partial`1Phone :: Text -- ^ 
    , partial`1TermsAccepted :: Date -- ^ 
    , partial`1Active :: Bool -- ^ 
    , partial`1Xp :: Value -- ^ 
    , partial`1SecurityProfileID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Partial&#x60;1 where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "partial&#x60;1")
instance ToJSON Partial&#x60;1 where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "partial&#x60;1")

-- | 
data PasswordReset = PasswordReset
    { passwordResetClientID :: Text -- ^ 
    , passwordResetUsername :: Text -- ^ 
    , passwordResetPassword :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PasswordReset where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "passwordReset")
instance ToJSON PasswordReset where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "passwordReset")

-- | 
data PasswordResetRequest = PasswordResetRequest
    { passwordResetRequestClientID :: Text -- ^ 
    , passwordResetRequestEmail :: Text -- ^ 
    , passwordResetRequestUsername :: Text -- ^ 
    , passwordResetRequestURL :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PasswordResetRequest where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "passwordResetRequest")
instance ToJSON PasswordResetRequest where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "passwordResetRequest")

-- | 
data Payment = Payment
    { paymentID :: Text -- ^ 
    , paymentType :: Text -- ^ 
    , paymentCreditCardID :: Text -- ^ 
    , paymentSpendingAccountID :: Text -- ^ 
    , paymentDescription :: Text -- ^ 
    , paymentAmount :: Double -- ^ 
    , paymentXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Payment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "payment")
instance ToJSON Payment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "payment")

-- | 
data PaymentTransaction = PaymentTransaction
    { paymentTransactionID :: Text -- ^ 
    , paymentTransactionType :: Text -- ^ 
    , paymentTransactionDateExecuted :: Date -- ^ 
    , paymentTransactionAmount :: Double -- ^ 
    , paymentTransactionSucceeded :: Bool -- ^ 
    , paymentTransactionResultCode :: Text -- ^ 
    , paymentTransactionResultMessage :: Text -- ^ 
    , paymentTransactionXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PaymentTransaction where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "paymentTransaction")
instance ToJSON PaymentTransaction where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "paymentTransaction")

-- | 
data PriceBreak = PriceBreak
    { priceBreakQuantity :: Int -- ^ 
    , priceBreakPrice :: Double -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PriceBreak where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "priceBreak")
instance ToJSON PriceBreak where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "priceBreak")

-- | 
data PriceSchedule = PriceSchedule
    { priceScheduleID :: Text -- ^ 
    , priceScheduleName :: Text -- ^ 
    , priceScheduleApplyTax :: Bool -- ^ 
    , priceScheduleApplyShipping :: Bool -- ^ 
    , priceScheduleMaxQuantity :: Int -- ^ 
    , priceScheduleUseCumulativeQuantity :: Bool -- ^ 
    , priceScheduleRestrictedQuantity :: Bool -- ^ 
    , priceScheduleOrderType :: Text -- ^ 
    , priceSchedulePriceBreaks :: [ShipmentItem] -- ^ 
    , priceScheduleXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PriceSchedule where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "priceSchedule")
instance ToJSON PriceSchedule where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "priceSchedule")

-- | 
data Product = Product
    { productID :: Text -- ^ 
    , productName :: Text -- ^ 
    , productDescription :: Text -- ^ 
    , productQuantityMultiplier :: Int -- ^ 
    , productShipWeight :: Double -- ^ 
    , productActive :: Bool -- ^ 
    , productType :: Text -- ^ 
    , productInventoryEnabled :: Bool -- ^ 
    , productInventoryNotificationPoint :: Int -- ^ 
    , productVariantLevelInventory :: Bool -- ^ 
    , productXp :: Value -- ^ 
    , productAllowOrderExceedInventory :: Bool -- ^ 
    , productInventoryVisible :: Bool -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Product where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "product")
instance ToJSON Product where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "product")

-- | 
data ProductAssignment = ProductAssignment
    { productAssignmentProductID :: Text -- ^ 
    , productAssignmentStandardPriceScheduleID :: Text -- ^ 
    , productAssignmentReplenishmentPriceScheduleID :: Text -- ^ 
    , productAssignmentUserID :: Text -- ^ 
    , productAssignmentUserGroupID :: Text -- ^ 
    , productAssignmentBuyerID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON ProductAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "productAssignment")
instance ToJSON ProductAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "productAssignment")

-- | 
data Promotion = Promotion
    { promotionID :: Text -- ^ 
    , promotionCode :: Text -- ^ 
    , promotionName :: Text -- ^ 
    , promotionUsagesRemaining :: Int -- ^ 
    , promotionDescription :: Text -- ^ 
    , promotionFinePrint :: Text -- ^ 
    , promotionStartDate :: Date -- ^ 
    , promotionExpirationDate :: Date -- ^ 
    , promotionEligibleExpression :: Text -- ^ 
    , promotionValueExpression :: Text -- ^ 
    , promotionCanCombine :: Bool -- ^ 
    , promotionXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Promotion where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "promotion")
instance ToJSON Promotion where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "promotion")

-- | 
data PromotionAssignment = PromotionAssignment
    { promotionAssignmentPromotionID :: Text -- ^ 
    , promotionAssignmentBuyerID :: Text -- ^ 
    , promotionAssignmentUserID :: Text -- ^ 
    , promotionAssignmentUserGroupID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON PromotionAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "promotionAssignment")
instance ToJSON PromotionAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "promotionAssignment")

-- | 
data Shipment = Shipment
    { shipmentID :: Text -- ^ 
    , shipmentShipper :: Text -- ^ 
    , shipmentDateShipped :: Date -- ^ 
    , shipmentTrackingNumber :: Text -- ^ 
    , shipmentCost :: Double -- ^ 
    , shipmentItems :: [ShipmentItem] -- ^ 
    , shipmentXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Shipment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "shipment")
instance ToJSON Shipment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "shipment")

-- | 
data ShipmentItem = ShipmentItem
    { shipmentItemOrderID :: Text -- ^ 
    , shipmentItemLineItemID :: Text -- ^ 
    , shipmentItemQuantityShipped :: Int -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON ShipmentItem where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "shipmentItem")
instance ToJSON ShipmentItem where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "shipmentItem")

-- | 
data Spec = Spec
    { specID :: Text -- ^ 
    , specListOrder :: Int -- ^ 
    , specName :: Text -- ^ 
    , specDefaultValue :: Text -- ^ 
    , specRequired :: Bool -- ^ 
    , specAllowOpenText :: Bool -- ^ 
    , specDefaultOptionID :: Text -- ^ 
    , specXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Spec where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "spec")
instance ToJSON Spec where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "spec")

-- | 
data SpecOption = SpecOption
    { specOptionID :: Text -- ^ 
    , specOptionValue :: Text -- ^ 
    , specOptionListOrder :: Int -- ^ 
    , specOptionIsOpenText :: Bool -- ^ 
    , specOptionPriceMarkupType :: Text -- ^ 
    , specOptionPriceMarkup :: Double -- ^ 
    , specOptionXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON SpecOption where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "specOption")
instance ToJSON SpecOption where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "specOption")

-- | 
data SpecProductAssignment = SpecProductAssignment
    { specProductAssignmentSpecID :: Text -- ^ 
    , specProductAssignmentProductID :: Text -- ^ 
    , specProductAssignmentDefinesVariant :: Bool -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON SpecProductAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "specProductAssignment")
instance ToJSON SpecProductAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "specProductAssignment")

-- | 
data SpendingAccount = SpendingAccount
    { spendingAccountID :: Text -- ^ 
    , spendingAccountName :: Text -- ^ 
    , spendingAccountBalance :: Double -- ^ 
    , spendingAccountAllowAsPaymentMethod :: Bool -- ^ 
    , spendingAccountRedemptionCode :: Text -- ^ 
    , spendingAccountStartDate :: Date -- ^ 
    , spendingAccountEndDate :: Date -- ^ 
    , spendingAccountXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON SpendingAccount where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "spendingAccount")
instance ToJSON SpendingAccount where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "spendingAccount")

-- | 
data SpendingAccountAssignment = SpendingAccountAssignment
    { spendingAccountAssignmentSpendingAccountID :: Text -- ^ 
    , spendingAccountAssignmentUserID :: Text -- ^ 
    , spendingAccountAssignmentUserGroupID :: Text -- ^ 
    , spendingAccountAssignmentAllowExceed :: Bool -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON SpendingAccountAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "spendingAccountAssignment")
instance ToJSON SpendingAccountAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "spendingAccountAssignment")

-- | 
data User = User
    { userID :: Text -- ^ 
    , userUsername :: Text -- ^ 
    , userPassword :: Text -- ^ 
    , userFirstName :: Text -- ^ 
    , userLastName :: Text -- ^ 
    , userEmail :: Text -- ^ 
    , userPhone :: Text -- ^ 
    , userTermsAccepted :: Date -- ^ 
    , userActive :: Bool -- ^ 
    , userXp :: Value -- ^ 
    , userSecurityProfileID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON User where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "user")
instance ToJSON User where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "user")

-- | 
data UserGroup = UserGroup
    { userGroupID :: Text -- ^ 
    , userGroupName :: Text -- ^ 
    , userGroupDescription :: Text -- ^ 
    , userGroupXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON UserGroup where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "userGroup")
instance ToJSON UserGroup where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "userGroup")

-- | 
data UserGroupAssignment = UserGroupAssignment
    { userGroupAssignmentUserGroupID :: Text -- ^ 
    , userGroupAssignmentUserID :: Text -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON UserGroupAssignment where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "userGroupAssignment")
instance ToJSON UserGroupAssignment where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "userGroupAssignment")

-- | 
data Variant = Variant
    { variantID :: Text -- ^ 
    , variantName :: Text -- ^ 
    , variantDescription :: Text -- ^ 
    , variantActive :: Bool -- ^ 
    , variantXp :: Value -- ^ 
    } deriving (Show, Eq, Generic)

instance FromJSON Variant where
  parseJSON  = genericParseJSON  (removeFieldLabelPrefix True "variant")
instance ToJSON Variant where
  toJSON     = genericToJSON     (removeFieldLabelPrefix False "variant")

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { fieldLabelModifier = fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars = [("#", "'Hash"), ("!", "'Exclamation"), ("&", "'Ampersand"), ("@", "'At"), ("$", "'Dollar"), ("%", "'Percent"), ("*", "'Star"), ("+", "'Plus"), ("-", "'Dash"), (":", "'Colon"), ("^", "'Caret"), ("|", "'Pipe"), (">", "'GreaterThan"), ("=", "'Equal"), ("<", "'LessThan")]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer = if forParsing then flip T.replace else T.replace


