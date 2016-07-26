/*
 * SamiCostCenter.h
 * 
 * 
 */

#ifndef SamiCostCenter_H_
#define SamiCostCenter_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::String;


namespace Swagger {

class SamiCostCenter: public SamiObject {
public:
    SamiCostCenter();
    SamiCostCenter(String* json);
    virtual ~SamiCostCenter();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCostCenter* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    String* getPDescription();
    void setPDescription(String* pDescription);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pName;
String* pDescription;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiCostCenter_H_ */
