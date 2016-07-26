package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Order
import io.swagger.client.model.Address
import io.swagger.client.model.Shipment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class OrderApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addPromotion(buyerID: String,
      orderID: String,
      promoCode: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "promoCode" + "\\}",promoCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def approve(buyerID: String,
      orderID: String,
      comments: Option[String] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/approve")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (comments != null) comments.foreach { v => queryParams += "comments" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def cancel(buyerID: String,
      orderID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/cancel")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def create(buyerID: String,
      order: Order)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Order]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (order == null) throw new Exception("Missing required parameter 'order' when calling OrderApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(order))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def decline(buyerID: String,
      orderID: String,
      comments: Option[String] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/decline")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (comments != null) comments.foreach { v => queryParams += "comments" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      orderID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      orderID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listApprovals(buyerID: String,
      orderID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/approvals")
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

  def listEligibleApprovers(buyerID: String,
      orderID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/eligibleapprovers")
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

  def listIncoming(buyerID: Option[String] = None,
      from: Option[String] = None,
      to: Option[String] = None,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/orders/incoming"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (buyerID != null) buyerID.foreach { v => queryParams += "buyerID" -> v.toString }

    if (from != null) from.foreach { v => queryParams += "from" -> v.toString }

    if (to != null) to.foreach { v => queryParams += "to" -> v.toString }

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

  def listOutgoing(buyerID: Option[String] = None,
      from: Option[String] = None,
      to: Option[String] = None,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/orders/outgoing"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (buyerID != null) buyerID.foreach { v => queryParams += "buyerID" -> v.toString }

    if (from != null) from.foreach { v => queryParams += "from" -> v.toString }

    if (to != null) to.foreach { v => queryParams += "to" -> v.toString }

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

  def listPromotions(buyerID: String,
      orderID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/promotions")
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
      partialOrder: Order)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Order]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialOrder == null) throw new Exception("Missing required parameter 'partialOrder' when calling OrderApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialOrder))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchBillingAddress(buyerID: String,
      orderID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/billto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling OrderApi->patchBillingAddress")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchShippingAddress(buyerID: String,
      orderID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/shipto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling OrderApi->patchShippingAddress")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def removePromotion(buyerID: String,
      orderID: String,
      promoCode: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/promotions/{promoCode}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "promoCode" + "\\}",promoCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setBillingAddress(buyerID: String,
      orderID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/billto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling OrderApi->setBillingAddress")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setShippingAddress(buyerID: String,
      orderID: String,
      address: Address)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Address]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/shipto")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (address == null) throw new Exception("Missing required parameter 'address' when calling OrderApi->setShippingAddress")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def ship(buyerID: String,
      orderID: String,
      shipment: Shipment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Shipment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/ship")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (shipment == null) throw new Exception("Missing required parameter 'shipment' when calling OrderApi->ship")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(shipment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def submit(buyerID: String,
      orderID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/submit")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transferTempUserOrder(buyerID: String,
      tempUserToken: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (tempUserToken != null) queryParams += "tempUserToken" -> tempUserToken.toString



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      orderID: String,
      order: Order)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Order]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (order == null) throw new Exception("Missing required parameter 'order' when calling OrderApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(order))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
