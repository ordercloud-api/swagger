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


#include "SWGShipmentItem.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGShipmentItem::SWGShipmentItem(QString* json) {
    init();
    this->fromJson(*json);
}

SWGShipmentItem::SWGShipmentItem() {
    init();
}

SWGShipmentItem::~SWGShipmentItem() {
    this->cleanup();
}

void
SWGShipmentItem::init() {
    OrderID = new QString("");
LineItemID = new QString("");
QuantityShipped = NULL;
}

void
SWGShipmentItem::cleanup() {
    if(OrderID != NULL) {
        delete OrderID;
    }
if(LineItemID != NULL) {
        delete LineItemID;
    }

}

SWGShipmentItem*
SWGShipmentItem::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGShipmentItem::fromJsonObject(QJsonObject &pJson) {
    setValue(&OrderID, pJson["OrderID"], "QString", "QString");
setValue(&LineItemID, pJson["LineItemID"], "QString", "QString");
setValue(&QuantityShipped, pJson["QuantityShipped"], "qint32", "");
}

QString
SWGShipmentItem::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGShipmentItem::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("OrderID"), OrderID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("LineItemID"), LineItemID, obj, QString("QString"));
    
        
obj->insert("QuantityShipped", QJsonValue(QuantityShipped));

    return obj;
}

QString*
SWGShipmentItem::getOrderID() {
    return OrderID;
}
void
SWGShipmentItem::setOrderID(QString* OrderID) {
    this->OrderID = OrderID;
}

QString*
SWGShipmentItem::getLineItemID() {
    return LineItemID;
}
void
SWGShipmentItem::setLineItemID(QString* LineItemID) {
    this->LineItemID = LineItemID;
}

qint32
SWGShipmentItem::getQuantityShipped() {
    return QuantityShipped;
}
void
SWGShipmentItem::setQuantityShipped(qint32 QuantityShipped) {
    this->QuantityShipped = QuantityShipped;
}



} /* namespace Swagger */
