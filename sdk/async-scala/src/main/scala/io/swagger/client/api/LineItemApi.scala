package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.LineItem
import io.swagger.client.model.Address
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class LineItemApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      orderID: String,
      lineItem: LineItem)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[LineItem]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (lineItem == null) throw new Exception("Missing required parameter 'lineItem' when calling LineItemApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(lineItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      orderID: String,
      lineItemID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      orderID: String,
      lineItemID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(buyerID: String,
      orderID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

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
      orderID: String,
      lineItemID: String,
      partialLineItem: LineItem)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[LineItem]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialLineItem == null) throw new Exception("Missing required parameter 'partialLineItem' when calling LineItemApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialLineItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchShippingAddress(buyerID: String,
      orderID: String,
      lineItemID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling LineItemApi->patchShippingAddress")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setShippingAddress(buyerID: String,
      orderID: String,
      lineItemID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}/shipto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling LineItemApi->setShippingAddress")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      orderID: String,
      lineItemID: String,
      lineItem: LineItem)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[LineItem]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/lineitems/{lineItemID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "lineItemID" + "\\}",lineItemID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (lineItem == null) throw new Exception("Missing required parameter 'lineItem' when calling LineItemApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(lineItem))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
