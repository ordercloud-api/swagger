#ifndef SamiPriceScheduleApi_H_
#define SamiPriceScheduleApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiPriceSchedule.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
#include "SamiPriceBreak.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiPriceScheduleApi {
public:
  SamiPriceScheduleApi();
  virtual ~SamiPriceScheduleApi();

  SamiObject* 
  createWithCompletion(SamiPriceSchedule* priceSchedule, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* priceScheduleID, void(* handler)(SamiError*));
  void 
  deletePriceBreakWithCompletion(String* priceScheduleID, Integer* quantity, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* priceScheduleID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* priceScheduleID, SamiPriceSchedule* priceSchedule, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  savePriceBreakWithCompletion(String* priceScheduleID, SamiPriceBreak* priceBreak, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* priceScheduleID, SamiPriceSchedule* priceSchedule, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiPriceScheduleApi_H_ */
