package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Category (
  ID: Option[String],
Name: Option[String],
Description: Option[String],
xp: Option[Any],
ListOrder: Option[Integer],
Active: Option[Boolean],
ParentID: Option[String]
)
