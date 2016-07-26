/*
 * SamiSpendingAccount.h
 * 
 * 
 */

#ifndef SamiSpendingAccount_H_
#define SamiSpendingAccount_H_

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

class SamiSpendingAccount: public SamiObject {
public:
    SamiSpendingAccount();
    SamiSpendingAccount(String* json);
    virtual ~SamiSpendingAccount();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiSpendingAccount* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    Long* getPBalance();
    void setPBalance(Long* pBalance);
    Boolean* getPAllowAsPaymentMethod();
    void setPAllowAsPaymentMethod(Boolean* pAllowAsPaymentMethod);
    String* getPRedemptionCode();
    void setPRedemptionCode(String* pRedemptionCode);
    SamiDate* getPStartDate();
    void setPStartDate(SamiDate* pStartDate);
    SamiDate* getPEndDate();
    void setPEndDate(SamiDate* pEndDate);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
Long* pBalance;
Boolean* pAllowAsPaymentMethod;
String* pRedemptionCode;
SamiDate* pStartDate;
SamiDate* pEndDate;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiSpendingAccount_H_ */
