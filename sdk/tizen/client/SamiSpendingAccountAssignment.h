/*
 * SamiSpendingAccountAssignment.h
 * 
 * 
 */

#ifndef SamiSpendingAccountAssignment_H_
#define SamiSpendingAccountAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Boolean;
using Tizen::Base::String;


namespace Swagger {

class SamiSpendingAccountAssignment: public SamiObject {
public:
    SamiSpendingAccountAssignment();
    SamiSpendingAccountAssignment(String* json);
    virtual ~SamiSpendingAccountAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiSpendingAccountAssignment* fromJson(String* obj);

    String* getPSpendingAccountID();
    void setPSpendingAccountID(String* pSpendingAccountID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);
    Boolean* getPAllowExceed();
    void setPAllowExceed(Boolean* pAllowExceed);

private:
    String* pSpendingAccountID;
String* pUserID;
String* pUserGroupID;
Boolean* pAllowExceed;
};

} /* namespace Swagger */

#endif /* SamiSpendingAccountAssignment_H_ */
