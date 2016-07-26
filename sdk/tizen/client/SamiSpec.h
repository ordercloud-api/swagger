/*
 * SamiSpec.h
 * 
 * 
 */

#ifndef SamiSpec_H_
#define SamiSpec_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiObject.h"
using Tizen::Base::Boolean;
using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiSpec: public SamiObject {
public:
    SamiSpec();
    SamiSpec(String* json);
    virtual ~SamiSpec();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiSpec* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    Integer* getPListOrder();
    void setPListOrder(Integer* pListOrder);
    String* getPName();
    void setPName(String* pName);
    String* getPDefaultValue();
    void setPDefaultValue(String* pDefaultValue);
    Boolean* getPRequired();
    void setPRequired(Boolean* pRequired);
    Boolean* getPAllowOpenText();
    void setPAllowOpenText(Boolean* pAllowOpenText);
    String* getPDefaultOptionID();
    void setPDefaultOptionID(String* pDefaultOptionID);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
Integer* pListOrder;
String* pName;
String* pDefaultValue;
Boolean* pRequired;
Boolean* pAllowOpenText;
String* pDefaultOptionID;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiSpec_H_ */
