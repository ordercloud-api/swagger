package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Product (
  ID: Option[String],
Name: Option[String],
Description: Option[String],
QuantityMultiplier: Option[Integer],
ShipWeight: Option[Number],
Active: Option[Boolean],
Type: Option[String],
InventoryEnabled: Option[Boolean],
InventoryNotificationPoint: Option[Integer],
VariantLevelInventory: Option[Boolean],
xp: Option[Any],
AllowOrderExceedInventory: Option[Boolean],
InventoryVisible: Option[Boolean]
)
