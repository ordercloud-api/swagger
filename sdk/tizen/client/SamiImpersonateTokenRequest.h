/*
 * SamiImpersonateTokenRequest.h
 * 
 * 
 */

#ifndef SamiImpersonateTokenRequest_H_
#define SamiImpersonateTokenRequest_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiShipmentItem.h"
using Tizen::Base::Collection::IList;
using Tizen::Base::String;


namespace Swagger {

class SamiImpersonateTokenRequest: public SamiObject {
public:
    SamiImpersonateTokenRequest();
    SamiImpersonateTokenRequest(String* json);
    virtual ~SamiImpersonateTokenRequest();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiImpersonateTokenRequest* fromJson(String* obj);

    String* getPClientID();
    void setPClientID(String* pClientID);
    IList* getPClaims();
    void setPClaims(IList* pClaims);

private:
    String* pClientID;
IList* pClaims;
};

} /* namespace Swagger */

#endif /* SamiImpersonateTokenRequest_H_ */
