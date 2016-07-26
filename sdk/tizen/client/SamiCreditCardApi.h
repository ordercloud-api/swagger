#ifndef SamiCreditCardApi_H_
#define SamiCreditCardApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiCreditCard.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;
#include "SamiCreditCardAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiCreditCardApi {
public:
  SamiCreditCardApi();
  virtual ~SamiCreditCardApi();

  SamiObject* 
  createWithCompletion(String* buyerID, SamiCreditCard* card, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* creditCardID, void(* handler)(SamiError*));
  void 
  deleteAssignmentWithCompletion(String* buyerID, String* creditCardID, String* userID, String* userGroupID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* creditCardID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listAssignmentsWithCompletion(String* buyerID, String* creditCardID, String* userID, String* userGroupID, String* level, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* creditCardID, SamiCreditCard* card, void (* handler)(SamiObject*, SamiError*));
  void 
  saveAssignmentWithCompletion(String* buyerID, SamiCreditCardAssignment* assignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* creditCardID, SamiCreditCard* card, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiCreditCardApi_H_ */
