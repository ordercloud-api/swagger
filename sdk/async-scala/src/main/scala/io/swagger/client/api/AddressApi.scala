package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Address
import io.swagger.client.model.AddressAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AddressApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling AddressApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      addressID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/{addressID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "addressID" + "\\}",addressID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAssignment(buyerID: String,
      addressID: String,
      userID: Option[String] = None,
      userGroupID: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/{addressID}/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "addressID" + "\\}",addressID.toString))

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
      addressID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/{addressID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "addressID" + "\\}",addressID.toString))

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
    val path = (addFmt("/buyers/{buyerID}/addresses")
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
      addressID: Option[String] = None,
      userID: Option[String] = None,
      userGroupID: Option[String] = None,
      level: Option[String] = None,
      isShipping: Option[Boolean] = None,
      isBilling: Option[Boolean] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (addressID != null) addressID.foreach { v => queryParams += "addressID" -> v.toString }

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }

    if (level != null) level.foreach { v => queryParams += "level" -> v.toString }

    if (isShipping != null) isShipping.foreach { v => queryParams += "isShipping" -> v.toString }

    if (isBilling != null) isBilling.foreach { v => queryParams += "isBilling" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      addressID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/{addressID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "addressID" + "\\}",addressID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling AddressApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveAssignment(buyerID: String,
      assignment: AddressAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[AddressAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (assignment == null) throw new Exception("Missing required parameter 'assignment' when calling AddressApi->saveAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(assignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      addressID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/addresses/{addressID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "addressID" + "\\}",addressID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling AddressApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
