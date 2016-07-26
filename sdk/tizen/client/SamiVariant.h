/*
 * SamiVariant.h
 * 
 * 
 */

#ifndef SamiVariant_H_
#define SamiVariant_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Boolean;
using Tizen::Base::String;


namespace Swagger {

class SamiVariant: public SamiObject {
public:
    SamiVariant();
    SamiVariant(String* json);
    virtual ~SamiVariant();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiVariant* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    String* getPDescription();
    void setPDescription(String* pDescription);
    Boolean* getPActive();
    void setPActive(Boolean* pActive);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
String* pDescription;
Boolean* pActive;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiVariant_H_ */
