package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ShipmentItem (
  OrderID: Option[String],
LineItemID: Option[String],
QuantityShipped: Option[Integer]
)
