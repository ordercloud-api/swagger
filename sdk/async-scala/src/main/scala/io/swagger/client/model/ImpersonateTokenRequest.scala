package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ImpersonateTokenRequest (
  ClientID: Option[String],
Claims: Option[List[ShipmentItem]]
)
