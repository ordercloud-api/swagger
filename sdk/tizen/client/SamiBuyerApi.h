#ifndef SamiBuyerApi_H_
#define SamiBuyerApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiBuyer.h"
#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiBuyerApi {
public:
  SamiBuyerApi();
  virtual ~SamiBuyerApi();

  SamiObject* 
  createWithCompletion(SamiBuyer* company, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* search, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, SamiBuyer* company, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiBuyerApi_H_ */
