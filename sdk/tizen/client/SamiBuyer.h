/*
 * SamiBuyer.h
 * 
 * 
 */

#ifndef SamiBuyer_H_
#define SamiBuyer_H_

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

class SamiBuyer: public SamiObject {
public:
    SamiBuyer();
    SamiBuyer(String* json);
    virtual ~SamiBuyer();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiBuyer* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    Boolean* getPActive();
    void setPActive(Boolean* pActive);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
Boolean* pActive;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiBuyer_H_ */
