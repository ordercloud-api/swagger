#ifndef SamiPaymentApi_H_
#define SamiPaymentApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiPayment.h"
#include "SamiObject.h"
using Tizen::Base::String;
#include "SamiPaymentTransaction.h"
using Tizen::Base::Integer;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiPaymentApi {
public:
  SamiPaymentApi();
  virtual ~SamiPaymentApi();

  SamiObject* 
  createWithCompletion(String* buyerID, String* orderID, SamiPayment* payment, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  createTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPaymentTransaction* transaction, void (* handler)(SamiObject*, SamiError*));
  void 
  deleteWithCompletion(String* buyerID, String* orderID, String* paymentID, void(* handler)(SamiError*));
  void 
  deleteTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, void(* handler)(SamiError*));
  SamiObject* 
  getWithCompletion(String* buyerID, String* orderID, String* paymentID, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  listWithCompletion(String* buyerID, String* orderID, String* search, String* searchOn, String* sortBy, Integer* page, Integer* pageSize, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPayment* partialPayment, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  patchTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, SamiPaymentTransaction* partialTransaction, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateWithCompletion(String* buyerID, String* orderID, String* paymentID, SamiPayment* payment, void (* handler)(SamiObject*, SamiError*));
  SamiObject* 
  updateTransactionWithCompletion(String* buyerID, String* orderID, String* paymentID, String* transactionID, SamiPaymentTransaction* transaction, void (* handler)(SamiObject*, SamiError*));
  static String getBasePath() {
    return L"https://api.ordercloud.io/v1";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiPaymentApi_H_ */
