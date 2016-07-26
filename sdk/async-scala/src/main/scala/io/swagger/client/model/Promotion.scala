package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Promotion (
  ID: Option[String],
Code: Option[String],
Name: Option[String],
UsagesRemaining: Option[Integer],
Description: Option[String],
FinePrint: Option[String],
StartDate: Option[Date],
ExpirationDate: Option[Date],
EligibleExpression: Option[String],
ValueExpression: Option[String],
CanCombine: Option[Boolean],
xp: Option[Any]
)
