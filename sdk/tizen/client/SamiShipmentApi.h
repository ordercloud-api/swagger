#ifndef SamiShipmentApi_H_
#define SamiShipmentApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiShipment.h"
using Tizen::Base::Integer;
#include "SamiShipmentItem.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiShipmentApi {
public:
  SamiShipmentApi();
  virtual ~SamiShipmentApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiShipment* shipment, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* shipmentID, void(* handler)(SamiError*));
  SamiObject* 
  deleteItemWithCompletion(String* buyerID, String* shipmentID, String* orderID, String* lineItemID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* shipmentID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* shipmentID, SamiShipment* shipment, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  saveItemWithCompletion(String* buyerID, String* shipmentID, SamiShipmentItem* item, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* shipmentID, SamiShipment* shipment, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiShipmentApi_H_ */
