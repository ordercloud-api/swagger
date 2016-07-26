#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SamiObject.h"

#include "SamiAddress.h"
#include "SamiAddressAssignment.h"
#include "SamiApprovalRule.h"
#include "SamiBuyer.h"
#include "SamiBuyerAddress.h"
#include "SamiBuyerCreditCard.h"
#include "SamiCategory.h"
#include "SamiCategoryAssignment.h"
#include "SamiCategoryProductAssignment.h"
#include "SamiCostCenter.h"
#include "SamiCostCenterAssignment.h"
#include "SamiCreditCard.h"
#include "SamiCreditCardAssignment.h"
#include "SamiEmailTemplate.h"
#include "SamiImpersonateTokenRequest.h"
#include "SamiLineItem.h"
#include "SamiOrder.h"
#include "SamiPartial&#x60;1.h"
#include "SamiPasswordReset.h"
#include "SamiPasswordResetRequest.h"
#include "SamiPayment.h"
#include "SamiPaymentTransaction.h"
#include "SamiPriceBreak.h"
#include "SamiPriceSchedule.h"
#include "SamiProduct.h"
#include "SamiProductAssignment.h"
#include "SamiPromotion.h"
#include "SamiPromotionAssignment.h"
#include "SamiShipment.h"
#include "SamiShipmentItem.h"
#include "SamiSpec.h"
#include "SamiSpecOption.h"
#include "SamiSpecProductAssignment.h"
#include "SamiSpendingAccount.h"
#include "SamiSpendingAccountAssignment.h"
#include "SamiUser.h"
#include "SamiUserGroup.h"
#include "SamiUserGroupAssignment.h"
#include "SamiVariant.h"

namespace Swagger {
  void*
  create(String type) {
    if(type.Equals(L"SamiAddress", true)) {
      return new SamiAddress();
    }
    if(type.Equals(L"SamiAddressAssignment", true)) {
      return new SamiAddressAssignment();
    }
    if(type.Equals(L"SamiApprovalRule", true)) {
      return new SamiApprovalRule();
    }
    if(type.Equals(L"SamiBuyer", true)) {
      return new SamiBuyer();
    }
    if(type.Equals(L"SamiBuyerAddress", true)) {
      return new SamiBuyerAddress();
    }
    if(type.Equals(L"SamiBuyerCreditCard", true)) {
      return new SamiBuyerCreditCard();
    }
    if(type.Equals(L"SamiCategory", true)) {
      return new SamiCategory();
    }
    if(type.Equals(L"SamiCategoryAssignment", true)) {
      return new SamiCategoryAssignment();
    }
    if(type.Equals(L"SamiCategoryProductAssignment", true)) {
      return new SamiCategoryProductAssignment();
    }
    if(type.Equals(L"SamiCostCenter", true)) {
      return new SamiCostCenter();
    }
    if(type.Equals(L"SamiCostCenterAssignment", true)) {
      return new SamiCostCenterAssignment();
    }
    if(type.Equals(L"SamiCreditCard", true)) {
      return new SamiCreditCard();
    }
    if(type.Equals(L"SamiCreditCardAssignment", true)) {
      return new SamiCreditCardAssignment();
    }
    if(type.Equals(L"SamiEmailTemplate", true)) {
      return new SamiEmailTemplate();
    }
    if(type.Equals(L"SamiImpersonateTokenRequest", true)) {
      return new SamiImpersonateTokenRequest();
    }
    if(type.Equals(L"SamiLineItem", true)) {
      return new SamiLineItem();
    }
    if(type.Equals(L"SamiOrder", true)) {
      return new SamiOrder();
    }
    if(type.Equals(L"SamiPartial&#x60;1", true)) {
      return new SamiPartial&#x60;1();
    }
    if(type.Equals(L"SamiPasswordReset", true)) {
      return new SamiPasswordReset();
    }
    if(type.Equals(L"SamiPasswordResetRequest", true)) {
      return new SamiPasswordResetRequest();
    }
    if(type.Equals(L"SamiPayment", true)) {
      return new SamiPayment();
    }
    if(type.Equals(L"SamiPaymentTransaction", true)) {
      return new SamiPaymentTransaction();
    }
    if(type.Equals(L"SamiPriceBreak", true)) {
      return new SamiPriceBreak();
    }
    if(type.Equals(L"SamiPriceSchedule", true)) {
      return new SamiPriceSchedule();
    }
    if(type.Equals(L"SamiProduct", true)) {
      return new SamiProduct();
    }
    if(type.Equals(L"SamiProductAssignment", true)) {
      return new SamiProductAssignment();
    }
    if(type.Equals(L"SamiPromotion", true)) {
      return new SamiPromotion();
    }
    if(type.Equals(L"SamiPromotionAssignment", true)) {
      return new SamiPromotionAssignment();
    }
    if(type.Equals(L"SamiShipment", true)) {
      return new SamiShipment();
    }
    if(type.Equals(L"SamiShipmentItem", true)) {
      return new SamiShipmentItem();
    }
    if(type.Equals(L"SamiSpec", true)) {
      return new SamiSpec();
    }
    if(type.Equals(L"SamiSpecOption", true)) {
      return new SamiSpecOption();
    }
    if(type.Equals(L"SamiSpecProductAssignment", true)) {
      return new SamiSpecProductAssignment();
    }
    if(type.Equals(L"SamiSpendingAccount", true)) {
      return new SamiSpendingAccount();
    }
    if(type.Equals(L"SamiSpendingAccountAssignment", true)) {
      return new SamiSpendingAccountAssignment();
    }
    if(type.Equals(L"SamiUser", true)) {
      return new SamiUser();
    }
    if(type.Equals(L"SamiUserGroup", true)) {
      return new SamiUserGroup();
    }
    if(type.Equals(L"SamiUserGroupAssignment", true)) {
      return new SamiUserGroupAssignment();
    }
    if(type.Equals(L"SamiVariant", true)) {
      return new SamiVariant();
    }
    
    if(type.Equals(L"String", true)) {
      return new String();
    }
    if(type.Equals(L"Integer", true)) {
      return new Integer();
    }
    if(type.Equals(L"Long", true)) {
      return new Long();
    }
    if(type.Equals(L"DateTime", true)) {
      return new DateTime();
    }
    return null;
  }
} /* namespace Swagger */

#endif /* ModelFactory_H_ */
