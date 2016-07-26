package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SpecOption (
  ID: Option[String],
Value: Option[String],
ListOrder: Option[Integer],
IsOpenText: Option[Boolean],
PriceMarkupType: Option[String],
PriceMarkup: Option[Number],
xp: Option[Any]
)
