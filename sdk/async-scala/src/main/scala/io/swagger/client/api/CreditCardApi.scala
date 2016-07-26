package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.CreditCard
import io.swagger.client.model.CreditCardAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CreditCardApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      card: CreditCard)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[CreditCard]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (card == null) throw new Exception("Missing required parameter 'card' when calling CreditCardApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(card))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      creditCardID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/{creditCardID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "creditCardID" + "\\}",creditCardID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAssignment(buyerID: String,
      creditCardID: String,
      userID: Option[String] = None,
      userGroupID: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/{creditCardID}/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "creditCardID" + "\\}",creditCardID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      creditCardID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/{creditCardID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "creditCardID" + "\\}",creditCardID.toString))

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
    val path = (addFmt("/buyers/{buyerID}/creditcards")
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

  def listAssignments(buyerID: String,
      creditCardID: Option[String] = None,
      userID: Option[String] = None,
      userGroupID: Option[String] = None,
      level: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (creditCardID != null) creditCardID.foreach { v => queryParams += "creditCardID" -> v.toString }

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }

    if (level != null) level.foreach { v => queryParams += "level" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      creditCardID: String,
      card: CreditCard)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[CreditCard]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/{creditCardID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "creditCardID" + "\\}",creditCardID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (card == null) throw new Exception("Missing required parameter 'card' when calling CreditCardApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(card))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveAssignment(buyerID: String,
      assignment: CreditCardAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CreditCardAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (assignment == null) throw new Exception("Missing required parameter 'assignment' when calling CreditCardApi->saveAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(assignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      creditCardID: String,
      card: CreditCard)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[CreditCard]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/creditcards/{creditCardID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "creditCardID" + "\\}",creditCardID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (card == null) throw new Exception("Missing required parameter 'card' when calling CreditCardApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(card))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
