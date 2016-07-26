package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Shipment
import io.swagger.client.model.ShipmentItem
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ShipmentApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      shipment: Shipment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Shipment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (shipment == null) throw new Exception("Missing required parameter 'shipment' when calling ShipmentApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(shipment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      shipmentID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteItem(buyerID: String,
      shipmentID: String,
      orderID: String,
      lineItemID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}/items/{orderID}/{lineItemID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString)
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
      shipmentID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(buyerID: String,
      orderID: Option[String] = None,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orderID != null) orderID.foreach { v => queryParams += "orderID" -> v.toString }

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
      shipmentID: String,
      shipment: Shipment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Shipment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (shipment == null) throw new Exception("Missing required parameter 'shipment' when calling ShipmentApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(shipment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveItem(buyerID: String,
      shipmentID: String,
      item: ShipmentItem)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[ShipmentItem]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}/items")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (item == null) throw new Exception("Missing required parameter 'item' when calling ShipmentApi->saveItem")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(item))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      shipmentID: String,
      shipment: Shipment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Shipment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/shipments/{shipmentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "shipmentID" + "\\}",shipmentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (shipment == null) throw new Exception("Missing required parameter 'shipment' when calling ShipmentApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(shipment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
