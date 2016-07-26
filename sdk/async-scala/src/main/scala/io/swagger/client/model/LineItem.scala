package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineItem (
  ID: Option[String],
ProductID: Option[String],
Quantity: Option[Integer],
UnitPrice: Option[Number],
CostCenter: Option[String],
DateNeeded: Option[Date],
ShippingAccount: Option[String],
ShippingAddressID: Option[String],
ShipfromAddressID: Option[String],
ShipperID: Option[String],
Specs: Option[List[ShipmentItem]],
xp: Option[Any]
)
