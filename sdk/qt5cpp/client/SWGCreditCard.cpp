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


#include "SWGCreditCard.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCreditCard::SWGCreditCard(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCreditCard::SWGCreditCard() {
    init();
}

SWGCreditCard::~SWGCreditCard() {
    this->cleanup();
}

void
SWGCreditCard::init() {
    ID = new QString("");
Token = new QString("");
CardType = new QString("");
PartialAccountNumber = new QString("");
CardholderName = new QString("");
ExpirationDate = NULL;
xp = NULL;
}

void
SWGCreditCard::cleanup() {
    if(ID != NULL) {
        delete ID;
    }
if(Token != NULL) {
        delete Token;
    }
if(CardType != NULL) {
        delete CardType;
    }
if(PartialAccountNumber != NULL) {
        delete PartialAccountNumber;
    }
if(CardholderName != NULL) {
        delete CardholderName;
    }
if(ExpirationDate != NULL) {
        delete ExpirationDate;
    }
if(xp != NULL) {
        delete xp;
    }
}

SWGCreditCard*
SWGCreditCard::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCreditCard::fromJsonObject(QJsonObject &pJson) {
    setValue(&ID, pJson["ID"], "QString", "QString");
setValue(&Token, pJson["Token"], "QString", "QString");
setValue(&CardType, pJson["CardType"], "QString", "QString");
setValue(&PartialAccountNumber, pJson["PartialAccountNumber"], "QString", "QString");
setValue(&CardholderName, pJson["CardholderName"], "QString", "QString");
setValue(&ExpirationDate, pJson["ExpirationDate"], "QDate", "QDate");
setValue(&xp, pJson["xp"], "SWGObject", "SWGObject");
}

QString
SWGCreditCard::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCreditCard::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("ID"), ID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("Token"), Token, obj, QString("QString"));
    
        

    
    toJsonValue(QString("CardType"), CardType, obj, QString("QString"));
    
        

    
    toJsonValue(QString("PartialAccountNumber"), PartialAccountNumber, obj, QString("QString"));
    
        

    
    toJsonValue(QString("CardholderName"), CardholderName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("ExpirationDate"), ExpirationDate, obj, QString("QDate"));
    
        

    
    toJsonValue(QString("xp"), xp, obj, QString("SWGObject"));
    
        

    return obj;
}

QString*
SWGCreditCard::getID() {
    return ID;
}
void
SWGCreditCard::setID(QString* ID) {
    this->ID = ID;
}

QString*
SWGCreditCard::getToken() {
    return Token;
}
void
SWGCreditCard::setToken(QString* Token) {
    this->Token = Token;
}

QString*
SWGCreditCard::getCardType() {
    return CardType;
}
void
SWGCreditCard::setCardType(QString* CardType) {
    this->CardType = CardType;
}

QString*
SWGCreditCard::getPartialAccountNumber() {
    return PartialAccountNumber;
}
void
SWGCreditCard::setPartialAccountNumber(QString* PartialAccountNumber) {
    this->PartialAccountNumber = PartialAccountNumber;
}

QString*
SWGCreditCard::getCardholderName() {
    return CardholderName;
}
void
SWGCreditCard::setCardholderName(QString* CardholderName) {
    this->CardholderName = CardholderName;
}

QDate*
SWGCreditCard::getExpirationDate() {
    return ExpirationDate;
}
void
SWGCreditCard::setExpirationDate(QDate* ExpirationDate) {
    this->ExpirationDate = ExpirationDate;
}

SWGObject*
SWGCreditCard::getXp() {
    return xp;
}
void
SWGCreditCard::setXp(SWGObject* xp) {
    this->xp = xp;
}



} /* namespace Swagger */
