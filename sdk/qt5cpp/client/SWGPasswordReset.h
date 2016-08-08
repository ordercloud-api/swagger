/**
 * OrderCloud
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * SWGPasswordReset.h
 * 
 * 
 */

#ifndef SWGPasswordReset_H_
#define SWGPasswordReset_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGPasswordReset: public SWGObject {
public:
    SWGPasswordReset();
    SWGPasswordReset(QString* json);
    virtual ~SWGPasswordReset();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGPasswordReset* fromJson(QString &jsonString);

    QString* getClientID();
    void setClientID(QString* ClientID);
QString* getUsername();
    void setUsername(QString* Username);
QString* getPassword();
    void setPassword(QString* Password);

private:
    QString* ClientID;
QString* Username;
QString* Password;
};

} /* namespace Swagger */

#endif /* SWGPasswordReset_H_ */