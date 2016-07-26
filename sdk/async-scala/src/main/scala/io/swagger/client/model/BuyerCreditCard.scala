package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class BuyerCreditCard (
  Token: Option[String],
CardType: Option[String],
PartialAccountNumber: Option[String],
CardholderName: Option[String],
ExpirationDate: Option[Date],
xp: Option[Any]
)
