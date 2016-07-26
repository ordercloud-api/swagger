package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SpendingAccount (
  ID: Option[String],
Name: Option[String],
Balance: Option[Number],
AllowAsPaymentMethod: Option[Boolean],
RedemptionCode: Option[String],
StartDate: Option[Date],
EndDate: Option[Date],
xp: Option[Any]
)
