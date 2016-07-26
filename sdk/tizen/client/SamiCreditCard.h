/*
 * SamiCreditCard.h
 * 
 * 
 */

#ifndef SamiCreditCard_H_
#define SamiCreditCard_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiDate.h"
#include "SamiObject.h"
using Tizen::Base::String;


namespace Swagger {

class SamiCreditCard: public SamiObject {
public:
    SamiCreditCard();
    SamiCreditCard(String* json);
    virtual ~SamiCreditCard();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCreditCard* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPToken();
    void setPToken(String* pToken);
    String* getPCardType();
    void setPCardType(String* pCardType);
    String* getPPartialAccountNumber();
    void setPPartialAccountNumber(String* pPartialAccountNumber);
    String* getPCardholderName();
    void setPCardholderName(String* pCardholderName);
    SamiDate* getPExpirationDate();
    void setPExpirationDate(SamiDate* pExpirationDate);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pToken;
String* pCardType;
String* pPartialAccountNumber;
String* pCardholderName;
SamiDate* pExpirationDate;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiCreditCard_H_ */
