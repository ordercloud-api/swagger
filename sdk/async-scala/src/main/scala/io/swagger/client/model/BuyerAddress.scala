package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class BuyerAddress (
  Shipping: Option[Boolean],
Billing: Option[Boolean],
CompanyName: Option[String],
FirstName: Option[String],
LastName: Option[String],
Street1: Option[String],
Street2: Option[String],
City: Option[String],
State: Option[String],
Zip: Option[String],
Country: Option[String],
Phone: Option[String],
AddressName: Option[String],
xp: Option[Any]
)
