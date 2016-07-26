#ifndef SamiSpecApi_H_
#define SamiSpecApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
#include "SamiSpec.h"
using Tizen::Base::String;
#include "SamiSpecOption.h"
using Tizen::Base::Integer;
#include "SamiSpecProductAssignment.h"

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiSpecApi {
public:
  SamiSpecApi();
  virtual ~SamiSpecApi();

  SamiObject* 
  createWithCompletion(SamiSpec* spec, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  createOptionWithCompletion(String* specID, SamiSpecOption* option, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* specID, void(* handler)(SamiError*));
  void 
  deleteOptionWithCompletion(String* specID, String* optionID, void(* handler)(SamiError*));
  void 
  deleteProductAssignmentWithCompletion(String* specID, String* productID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* specID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  getOptionWithCompletion(String* specID, String* optionID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listOptionsWithCompletion(String* specID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listProductAssignmentsWithCompletion(String* specID, String* productID, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* specID, SamiSpec* spec, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchOptionWithCompletion(String* specID, String* optionID, SamiSpecOption* option, void (* handler)(SamiObject*, SamiError*));
  void 
  saveProductAssignmentWithCompletion(SamiSpecProductAssignment* productAssignment, void(* handler)(SamiError*));
  SamiObject* 
  updateWithCompletion(String* specID, SamiSpec* spec, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateOptionWithCompletion(String* specID, String* optionID, SamiSpecOption* option, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiSpecApi_H_ */
