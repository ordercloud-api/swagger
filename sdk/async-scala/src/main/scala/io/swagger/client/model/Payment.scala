package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Payment (
  ID: Option[String],
Type: Option[String],
CreditCardID: Option[String],
SpendingAccountID: Option[String],
Description: Option[String],
Amount: Option[Number],
xp: Option[Any]
)
