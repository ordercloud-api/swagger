package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Order (
  ID: Option[String],
Type: Option[String],
FromUserID: Option[String],
BillingAddressID: Option[String],
ShippingAddressID: Option[String],
Comments: Option[String],
ShippingCost: Option[Number],
TaxCost: Option[Number],
xp: Option[Any]
)
