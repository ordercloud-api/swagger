#ifndef SamiOrderApi_H_
#define SamiOrderApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiOrder.h"
using Tizen::Base::Integer;
#include "SamiAddress.h"
#include "SamiShipment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiOrderApi {
public:
  SamiOrderApi();
  virtual ~SamiOrderApi();

  SamiObject* 
  addPromotionWithCompletion(String* buyerID, String* orderID, String* promoCode, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  approveWithCompletion(String* buyerID, String* orderID, String* comments, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  cancelWithCompletion(String* buyerID, String* orderID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  createWithCompletion(String* buyerID, SamiOrder* order, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  declineWithCompletion(String* buyerID, String* orderID, String* comments, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* orderID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* orderID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listApprovalsWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listEligibleApproversWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listIncomingWithCompletion(String* buyerID, String* from, String* to, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listOutgoingWithCompletion(String* buyerID, String* from, String* to, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listPromotionsWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* orderID, SamiOrder* partialOrder, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchBillingAddressWithCompletion(String* buyerID, String* orderID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchShippingAddressWithCompletion(String* buyerID, String* orderID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  removePromotionWithCompletion(String* buyerID, String* orderID, String* promoCode, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  setBillingAddressWithCompletion(String* buyerID, String* orderID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  setShippingAddressWithCompletion(String* buyerID, String* orderID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  shipWithCompletion(String* buyerID, String* orderID, SamiShipment* shipment, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  submitWithCompletion(String* buyerID, String* orderID, void (* handler)(SamiObject*, SamiError*));
  void 
  transferTempUserOrderWithCompletion(String* buyerID, String* tempUserToken, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* orderID, SamiOrder* order, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiOrderApi_H_ */
