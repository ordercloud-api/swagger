/*
 * SamiCategoryProductAssignment.h
 * 
 * 
 */

#ifndef SamiCategoryProductAssignment_H_
#define SamiCategoryProductAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiCategoryProductAssignment: public SamiObject {
public:
    SamiCategoryProductAssignment();
    SamiCategoryProductAssignment(String* json);
    virtual ~SamiCategoryProductAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiCategoryProductAssignment* fromJson(String* obj);

    String* getPCategoryID();
    void setPCategoryID(String* pCategoryID);
    String* getPProductID();
    void setPProductID(String* pProductID);
    Integer* getPListOrder();
    void setPListOrder(Integer* pListOrder);

private:
    String* pCategoryID;
String* pProductID;
Integer* pListOrder;
};

} /* namespace Swagger */

#endif /* SamiCategoryProductAssignment_H_ */
