#ifndef SamiMeApi_H_
#define SamiMeApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
#include "SamiBuyerAddress.h"
#include "SamiBuyerCreditCard.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
#include "SamiUser.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiMeApi {
public:
  SamiMeApi();
  virtual ~SamiMeApi();

  SamiObject* 
  createAddressWithCompletion(SamiBuyerAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  createCreditCardWithCompletion(SamiBuyerCreditCard* creditCard, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteAddressWithCompletion(String* addressID, void(* handler)(SamiError*));
  void 
  deleteCreditCardWithCompletion(String* creditcardID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion( void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getAddressWithCompletion(String* addressID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getCreditCardWithCompletion(String* creditcardID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getOrderWithCompletion(String* orderID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getProductWithCompletion(String* productID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getPromotionWithCompletion(String* promotionID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getSpecWithCompletion(String* productID, String* specID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAddressesWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listCategoriesWithCompletion(String* depth, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listCostCentersWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listCreditCardsWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listIncomingOrdersWithCompletion(String* from, String* to, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listOutgoingOrdersWithCompletion(String* from, String* to, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listProductsWithCompletion(String* categoryID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listPromotionsWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listSpecsWithCompletion(String* productID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listSubcategoriesWithCompletion(String* parentID, String* depth, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listUserGroupsWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  void 
  patchAddressWithCompletion(String* addressID, SamiBuyerAddress* address, void(* handler)(SamiError*));
  void 
  patchCreditCardWithCompletion(String* creditcardID, SamiBuyerCreditCard* creditCard, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(SamiUser* user, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateAddressWithCompletion(String* addressID, SamiBuyerAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateCreditCardWithCompletion(String* creditcardID, SamiBuyerCreditCard* creditCard, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiMeApi_H_ */
