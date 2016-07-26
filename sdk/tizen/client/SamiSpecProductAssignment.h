/*
 * SamiSpecProductAssignment.h
 * 
 * 
 */

#ifndef SamiSpecProductAssignment_H_
#define SamiSpecProductAssignment_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Boolean;
using Tizen::Base::String;


namespace Swagger {

class SamiSpecProductAssignment: public SamiObject {
public:
    SamiSpecProductAssignment();
    SamiSpecProductAssignment(String* json);
    virtual ~SamiSpecProductAssignment();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiSpecProductAssignment* fromJson(String* obj);

    String* getPSpecID();
    void setPSpecID(String* pSpecID);
    String* getPProductID();
    void setPProductID(String* pProductID);
    Boolean* getPDefinesVariant();
    void setPDefinesVariant(Boolean* pDefinesVariant);

private:
    String* pSpecID;
String* pProductID;
Boolean* pDefinesVariant;
};

} /* namespace Swagger */

#endif /* SamiSpecProductAssignment_H_ */
