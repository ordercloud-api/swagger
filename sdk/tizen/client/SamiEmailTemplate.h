/*
 * SamiEmailTemplate.h
 * 
 * 
 */

#ifndef SamiEmailTemplate_H_
#define SamiEmailTemplate_H_

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

class SamiEmailTemplate: public SamiObject {
public:
    SamiEmailTemplate();
    SamiEmailTemplate(String* json);
    virtual ~SamiEmailTemplate();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiEmailTemplate* fromJson(String* obj);

    String* getPSubject();
    void setPSubject(String* pSubject);
    String* getPBody();
    void setPBody(String* pBody);
    String* getPReplyEmail();
    void setPReplyEmail(String* pReplyEmail);
    Boolean* getPSendMessageType();
    void setPSendMessageType(Boolean* pSendMessageType);
    String* getPEmailFormatType();
    void setPEmailFormatType(String* pEmailFormatType);

private:
    String* pSubject;
String* pBody;
String* pReplyEmail;
Boolean* pSendMessageType;
String* pEmailFormatType;
};

} /* namespace Swagger */

#endif /* SamiEmailTemplate_H_ */
