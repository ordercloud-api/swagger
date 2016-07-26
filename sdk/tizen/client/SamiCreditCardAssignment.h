/*
 * SamiCreditCardAssignment.h
 * 
 * 
 */

#ifndef SamiCreditCardAssignment_H_
#define SamiCreditCardAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiCreditCardAssignment: public SamiObject {
public:
    SamiCreditCardAssignment();
    SamiCreditCardAssignment(String* json);
    virtual ~SamiCreditCardAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCreditCardAssignment* fromJson(String* obj);

    String* getPCreditCardID();
    void setPCreditCardID(String* pCreditCardID);
    String* getPUserID();
    void setPUserID(String* pUserID);
    String* getPUserGroupID();
    void setPUserGroupID(String* pUserGroupID);

private:
    String* pCreditCardID;
String* pUserID;
String* pUserGroupID;
};

} /* namespace Swagger */

#endif /* SamiCreditCardAssignment_H_ */
