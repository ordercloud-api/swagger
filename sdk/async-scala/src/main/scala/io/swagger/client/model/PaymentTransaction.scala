package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PaymentTransaction (
  ID: Option[String],
Type: Option[String],
DateExecuted: Option[Date],
Amount: Option[Number],
Succeeded: Option[Boolean],
ResultCode: Option[String],
ResultMessage: Option[String],
xp: Option[Any]
)
