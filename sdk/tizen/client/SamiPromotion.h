/*
 * SamiPromotion.h
 * 
 * 
 */

#ifndef SamiPromotion_H_
#define SamiPromotion_H_

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
using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiPromotion: public SamiObject {
public:
    SamiPromotion();
    SamiPromotion(String* json);
    virtual ~SamiPromotion();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPromotion* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPCode();
    void setPCode(String* pCode);
    String* getPName();
    void setPName(String* pName);
    Integer* getPUsagesRemaining();
    void setPUsagesRemaining(Integer* pUsagesRemaining);
    String* getPDescription();
    void setPDescription(String* pDescription);
    String* getPFinePrint();
    void setPFinePrint(String* pFinePrint);
    SamiDate* getPStartDate();
    void setPStartDate(SamiDate* pStartDate);
    SamiDate* getPExpirationDate();
    void setPExpirationDate(SamiDate* pExpirationDate);
    String* getPEligibleExpression();
    void setPEligibleExpression(String* pEligibleExpression);
    String* getPValueExpression();
    void setPValueExpression(String* pValueExpression);
    Boolean* getPCanCombine();
    void setPCanCombine(Boolean* pCanCombine);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pCode;
String* pName;
Integer* pUsagesRemaining;
String* pDescription;
String* pFinePrint;
SamiDate* pStartDate;
SamiDate* pExpirationDate;
String* pEligibleExpression;
String* pValueExpression;
Boolean* pCanCombine;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiPromotion_H_ */
