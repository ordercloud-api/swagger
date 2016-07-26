#ifndef SamiPromotionApi_H_
#define SamiPromotionApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
#include "SamiPromotion.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
#include "SamiPromotionAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiPromotionApi {
public:
  SamiPromotionApi();
  virtual ~SamiPromotionApi();

  SamiObject* 
  createWithCompletion(SamiPromotion* promo, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* promotionID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* promotionID, String* buyerID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* promotionID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* promotionID, String* userID, String* userGroupID, String* level, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* promotionID, SamiPromotion* partialPromotion, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(SamiPromotionAssignment* assignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* promotionID, SamiPromotion* promo, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiPromotionApi_H_ */
