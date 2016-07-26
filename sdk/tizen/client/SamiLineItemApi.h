#ifndef SamiLineItemApi_H_
#define SamiLineItemApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiLineItem.h"
using Tizen::Base::Integer;
#include "SamiAddress.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiLineItemApi {
public:
  SamiLineItemApi();
  virtual ~SamiLineItemApi();

  SamiObject* 
  createWithCompletion(String* buyerID, String* orderID, SamiLineItem* lineItem, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* orderID, String* lineItemID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* orderID, String* lineItemID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* orderID, String* lineItemID, SamiLineItem* partialLineItem, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchShippingAddressWithCompletion(String* buyerID, String* orderID, String* lineItemID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  setShippingAddressWithCompletion(String* buyerID, String* orderID, String* lineItemID, SamiAddress* address, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* orderID, String* lineItemID, SamiLineItem* lineItem, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiLineItemApi_H_ */
