/*
 * SamiPaymentTransaction.h
 * 
 * 
 */

#ifndef SamiPaymentTransaction_H_
#define SamiPaymentTransaction_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiDate.h"
#include "SamiObject.h"
using Tizen::Base::Boolean;
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiPaymentTransaction: public SamiObject {
public:
    SamiPaymentTransaction();
    SamiPaymentTransaction(String* json);
    virtual ~SamiPaymentTransaction();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPaymentTransaction* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPType();
    void setPType(String* pType);
    SamiDate* getPDateExecuted();
    void setPDateExecuted(SamiDate* pDateExecuted);
    Long* getPAmount();
    void setPAmount(Long* pAmount);
    Boolean* getPSucceeded();
    void setPSucceeded(Boolean* pSucceeded);
    String* getPResultCode();
    void setPResultCode(String* pResultCode);
    String* getPResultMessage();
    void setPResultMessage(String* pResultMessage);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pType;
SamiDate* pDateExecuted;
Long* pAmount;
Boolean* pSucceeded;
String* pResultCode;
String* pResultMessage;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiPaymentTransaction_H_ */
