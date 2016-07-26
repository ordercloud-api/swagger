package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.ApprovalRule
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ApprovalRuleApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      approvalRule: ApprovalRule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[ApprovalRule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (approvalRule == null) throw new Exception("Missing required parameter 'approvalRule' when calling ApprovalRuleApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(approvalRule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      approvalRuleID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "approvalRuleID" + "\\}",approvalRuleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      approvalRuleID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "approvalRuleID" + "\\}",approvalRuleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(buyerID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (search != null) search.foreach { v => queryParams += "search" -> v.toString }

    if (searchOn != null) searchOn.foreach { v => queryParams += "searchOn" -> v.toString }

    if (sortBy != null) sortBy.foreach { v => queryParams += "sortBy" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      approvalRuleID: String,
      partialApprovalRule: ApprovalRule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[ApprovalRule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "approvalRuleID" + "\\}",approvalRuleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialApprovalRule == null) throw new Exception("Missing required parameter 'partialApprovalRule' when calling ApprovalRuleApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialApprovalRule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      approvalRuleID: String,
      approvalRule: ApprovalRule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[ApprovalRule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/approvalrules/{approvalRuleID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "approvalRuleID" + "\\}",approvalRuleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (approvalRule == null) throw new Exception("Missing required parameter 'approvalRule' when calling ApprovalRuleApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(approvalRule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
