package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class AddressAssignment (
  AddressID: Option[String],
UserID: Option[String],
UserGroupID: Option[String],
IsShipping: Option[Boolean],
IsBilling: Option[Boolean]
)
