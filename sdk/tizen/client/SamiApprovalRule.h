/*
 * SamiApprovalRule.h
 * 
 * 
 */

#ifndef SamiApprovalRule_H_
#define SamiApprovalRule_H_

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

class SamiApprovalRule: public SamiObject {
public:
    SamiApprovalRule();
    SamiApprovalRule(String* json);
    virtual ~SamiApprovalRule();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiApprovalRule* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    String* getPDescription();
    void setPDescription(String* pDescription);
    String* getPApprovingGroupID();
    void setPApprovingGroupID(String* pApprovingGroupID);
    String* getPRuleExpression();
    void setPRuleExpression(String* pRuleExpression);
    String* getPScope();
    void setPScope(String* pScope);
    String* getPScopeTimeUnit();
    void setPScopeTimeUnit(String* pScopeTimeUnit);
    Integer* getPScopeTimeNumber();
    void setPScopeTimeNumber(Integer* pScopeTimeNumber);
    SamiDate* getPScopeStartDate();
    void setPScopeStartDate(SamiDate* pScopeStartDate);
    String* getPExpireAfterTimeUnit();
    void setPExpireAfterTimeUnit(String* pExpireAfterTimeUnit);
    Integer* getPExpireAfterNumber();
    void setPExpireAfterNumber(Integer* pExpireAfterNumber);
    Boolean* getPApproveOnExpire();
    void setPApproveOnExpire(Boolean* pApproveOnExpire);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
String* pDescription;
String* pApprovingGroupID;
String* pRuleExpression;
String* pScope;
String* pScopeTimeUnit;
Integer* pScopeTimeNumber;
SamiDate* pScopeStartDate;
String* pExpireAfterTimeUnit;
Integer* pExpireAfterNumber;
Boolean* pApproveOnExpire;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiApprovalRule_H_ */
