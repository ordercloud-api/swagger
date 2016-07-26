/*
 * SamiSpecOption.h
 * 
 * 
 */

#ifndef SamiSpecOption_H_
#define SamiSpecOption_H_

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
using Tizen::Base::Long;
using Tizen::Base::String;


namespace Swagger {

class SamiSpecOption: public SamiObject {
public:
    SamiSpecOption();
    SamiSpecOption(String* json);
    virtual ~SamiSpecOption();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiSpecOption* fromJson(String* obj);

    String* getPID();
    void setPID(String* pID);
    String* getPValue();
    void setPValue(String* pValue);
    Integer* getPListOrder();
    void setPListOrder(Integer* pListOrder);
    Boolean* getPIsOpenText();
    void setPIsOpenText(Boolean* pIsOpenText);
    String* getPPriceMarkupType();
    void setPPriceMarkupType(String* pPriceMarkupType);
    Long* getPPriceMarkup();
    void setPPriceMarkup(Long* pPriceMarkup);
    SamiObject* getPXp();
    void setPXp(SamiObject* pXp);

private:
    String* pID;
String* pValue;
Integer* pListOrder;
Boolean* pIsOpenText;
String* pPriceMarkupType;
Long* pPriceMarkup;
SamiObject* pXp;
};

} /* namespace Swagger */

#endif /* SamiSpecOption_H_ */
