package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ProductAssignment (
  ProductID: Option[String],
StandardPriceScheduleID: Option[String],
ReplenishmentPriceScheduleID: Option[String],
UserID: Option[String],
UserGroupID: Option[String],
BuyerID: Option[String]
)
