package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CreditCard (
  ID: Option[String],
Token: Option[String],
CardType: Option[String],
PartialAccountNumber: Option[String],
CardholderName: Option[String],
ExpirationDate: Option[Date],
xp: Option[Any]
)
