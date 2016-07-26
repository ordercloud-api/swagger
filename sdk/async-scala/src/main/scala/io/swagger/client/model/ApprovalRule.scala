package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ApprovalRule (
  ID: Option[String],
Name: Option[String],
Description: Option[String],
ApprovingGroupID: Option[String],
RuleExpression: Option[String],
Scope: Option[String],
ScopeTimeUnit: Option[String],
ScopeTimeNumber: Option[Integer],
ScopeStartDate: Option[Date],
ExpireAfterTimeUnit: Option[String],
ExpireAfterNumber: Option[Integer],
ApproveOnExpire: Option[Boolean],
xp: Option[Any]
)
