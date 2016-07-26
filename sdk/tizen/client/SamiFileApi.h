#ifndef SamiFileApi_H_
#define SamiFileApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiObject.h"
using Tizen::Base::String;
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiFileApi {
public:
  SamiFileApi();
  virtual ~SamiFileApi();

  SamiObject* 
  getWithCompletion(String* fileID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  postFileDataWithCompletion(String* filename, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiFileApi_H_ */
