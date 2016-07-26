package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Shipment (
  ID: Option[String],
Shipper: Option[String],
DateShipped: Option[Date],
TrackingNumber: Option[String],
Cost: Option[Number],
Items: Option[List[ShipmentItem]],
xp: Option[Any]
)
