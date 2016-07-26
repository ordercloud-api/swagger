/*
 * SamiPasswordReset.h
 * 
 * 
 */

#ifndef SamiPasswordReset_H_
#define SamiPasswordReset_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::String;


namespace Swagger {

class SamiPasswordReset: public SamiObject {
public:
    SamiPasswordReset();
    SamiPasswordReset(String* json);
    virtual ~SamiPasswordReset();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiPasswordReset* fromJson(String* obj);

    String* getPClientID();
    void setPClientID(String* pClientID);
    String* getPUsername();
    void setPUsername(String* pUsername);
    String* getPPassword();
    void setPPassword(String* pPassword);

private:
    String* pClientID;
String* pUsername;
String* pPassword;
};

} /* namespace Swagger */

#endif /* SamiPasswordReset_H_ */
