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


#include "SWGPromotionAssignment.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGPromotionAssignment::SWGPromotionAssignment(QString* json) {
    init();
    this->fromJson(*json);
}

SWGPromotionAssignment::SWGPromotionAssignment() {
    init();
}

SWGPromotionAssignment::~SWGPromotionAssignment() {
    this->cleanup();
}

void
SWGPromotionAssignment::init() {
    PromotionID = new QString("");
BuyerID = new QString("");
UserID = new QString("");
UserGroupID = new QString("");
}

void
SWGPromotionAssignment::cleanup() {
    if(PromotionID != NULL) {
        delete PromotionID;
    }
if(BuyerID != NULL) {
        delete BuyerID;
    }
if(UserID != NULL) {
        delete UserID;
    }
if(UserGroupID != NULL) {
        delete UserGroupID;
    }
}

SWGPromotionAssignment*
SWGPromotionAssignment::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGPromotionAssignment::fromJsonObject(QJsonObject &pJson) {
    setValue(&PromotionID, pJson["PromotionID"], "QString", "QString");
setValue(&BuyerID, pJson["BuyerID"], "QString", "QString");
setValue(&UserID, pJson["UserID"], "QString", "QString");
setValue(&UserGroupID, pJson["UserGroupID"], "QString", "QString");
}

QString
SWGPromotionAssignment::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGPromotionAssignment::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("PromotionID"), PromotionID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("BuyerID"), BuyerID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("UserID"), UserID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("UserGroupID"), UserGroupID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGPromotionAssignment::getPromotionID() {
    return PromotionID;
}
void
SWGPromotionAssignment::setPromotionID(QString* PromotionID) {
    this->PromotionID = PromotionID;
}

QString*
SWGPromotionAssignment::getBuyerID() {
    return BuyerID;
}
void
SWGPromotionAssignment::setBuyerID(QString* BuyerID) {
    this->BuyerID = BuyerID;
}

QString*
SWGPromotionAssignment::getUserID() {
    return UserID;
}
void
SWGPromotionAssignment::setUserID(QString* UserID) {
    this->UserID = UserID;
}

QString*
SWGPromotionAssignment::getUserGroupID() {
    return UserGroupID;
}
void
SWGPromotionAssignment::setUserGroupID(QString* UserGroupID) {
    this->UserGroupID = UserGroupID;
}



} /* namespace Swagger */
