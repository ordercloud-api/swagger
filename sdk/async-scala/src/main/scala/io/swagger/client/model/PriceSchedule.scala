package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PriceSchedule (
  ID: Option[String],
Name: Option[String],
ApplyTax: Option[Boolean],
ApplyShipping: Option[Boolean],
MaxQuantity: Option[Integer],
UseCumulativeQuantity: Option[Boolean],
RestrictedQuantity: Option[Boolean],
OrderType: Option[String],
PriceBreaks: Option[List[ShipmentItem]],
xp: Option[Any]
)
