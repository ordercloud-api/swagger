/*
 * SamiUser.h
 * 
 * 
 */

#ifndef SamiUser_H_
#define SamiUser_H_

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
using Tizen::Base::String;


namespace Swagger {

class SamiUser: public SamiObject {
public:
    SamiUser();
    SamiUser(String* json);
    virtual ~SamiUser();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiUser* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPUsername();
    void setPUsername(String* pUsername);
    String* getPPassword();
    void setPPassword(String* pPassword);
    String* getPFirstName();
    void setPFirstName(String* pFirstName);
    String* getPLastName();
    void setPLastName(String* pLastName);
    String* getPEmail();
    void setPEmail(String* pEmail);
    String* getPPhone();
    void setPPhone(String* pPhone);
    SamiDate* getPTermsAccepted();
    void setPTermsAccepted(SamiDate* pTermsAccepted);
    Boolean* getPActive();
    void setPActive(Boolean* pActive);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);
    String* getPSecurityProfileID();
    void setPSecurityProfileID(String* pSecurityProfileID);

private:
    String* pID;
String* pUsername;
String* pPassword;
String* pFirstName;
String* pLastName;
String* pEmail;
String* pPhone;
SamiDate* pTermsAccepted;
Boolean* pActive;
SamiObject* pXp;
String* pSecurityProfileID;
};

} /* namespace Swagger */

#endif /* SamiUser_H_ */
