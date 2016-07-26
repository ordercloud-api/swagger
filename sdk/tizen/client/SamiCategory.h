/*
 * SamiCategory.h
 * 
 * 
 */

#ifndef SamiCategory_H_
#define SamiCategory_H_

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

class SamiCategory: public SamiObject {
public:
    SamiCategory();
    SamiCategory(String* json);
    virtual ~SamiCategory();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCategory* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPName();
    void setPName(String* pName);
    String* getPDescription();
    void setPDescription(String* pDescription);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);
    Integer* getPListOrder();
    void setPListOrder(Integer* pListOrder);
    Boolean* getPActive();
    void setPActive(Boolean* pActive);
    String* getPParentID();
    void setPParentID(String* pParentID);

private:
    String* pID;
String* pName;
String* pDescription;
SamiObject* pXp;
Integer* pListOrder;
Boolean* pActive;
String* pParentID;
};

} /* namespace Swagger */

#endif /* SamiCategory_H_ */
