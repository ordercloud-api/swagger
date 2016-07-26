/*
 * SamiPasswordResetRequest.h
 * 
 * 
 */

#ifndef SamiPasswordResetRequest_H_
#define SamiPasswordResetRequest_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiPasswordResetRequest: public SamiObject {
public:
    SamiPasswordResetRequest();
    SamiPasswordResetRequest(String* json);
    virtual ~SamiPasswordResetRequest();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPasswordResetRequest* fromJson(String* obj);

    String* getPClientID();
    void setPClientID(String* pClientID);
    String* getPEmail();
    void setPEmail(String* pEmail);
    String* getPUsername();
    void setPUsername(String* pUsername);
    String* getPURL();
    void setPURL(String* pURL);

private:
    String* pClientID;
String* pEmail;
String* pUsername;
String* pURL;
};

} /* namespace Swagger */

#endif /* SamiPasswordResetRequest_H_ */
