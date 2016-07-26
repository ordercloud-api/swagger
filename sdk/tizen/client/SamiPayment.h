/*
 * SamiPayment.h
 * 
 * 
 */

#ifndef SamiPayment_H_
#define SamiPayment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiPayment: public SamiObject {
public:
    SamiPayment();
    SamiPayment(String* json);
    virtual ~SamiPayment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPayment* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPType();
    void setPType(String* pType);
    String* getPCreditCardID();
    void setPCreditCardID(String* pCreditCardID);
    String* getPSpendingAccountID();
    void setPSpendingAccountID(String* pSpendingAccountID);
    String* getPDescription();
    void setPDescription(String* pDescription);
    Long* getPAmount();
    void setPAmount(Long* pAmount);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pType;
String* pCreditCardID;
String* pSpendingAccountID;
String* pDescription;
Long* pAmount;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiPayment_H_ */
