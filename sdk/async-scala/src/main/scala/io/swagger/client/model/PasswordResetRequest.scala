package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PasswordResetRequest (
  ClientID: Option[String],
Email: Option[String],
Username: Option[String],
URL: Option[String]
)
