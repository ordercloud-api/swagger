package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Payment
import io.swagger.client.model.PaymentTransaction
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class PaymentApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      orderID: String,
      payment: Payment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Payment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (payment == null) throw new Exception("Missing required parameter 'payment' when calling PaymentApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(payment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createTransaction(buyerID: String,
      orderID: String,
      paymentID: String,
      transaction: PaymentTransaction)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PaymentTransaction]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (transaction == null) throw new Exception("Missing required parameter 'transaction' when calling PaymentApi->createTransaction")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(transaction))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      orderID: String,
      paymentID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteTransaction(buyerID: String,
      orderID: String,
      paymentID: String,
      transactionID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString)
        replaceAll ("\\{" + "transactionID" + "\\}",transactionID.toString))

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
      paymentID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString))

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
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments")
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
      paymentID: String,
      partialPayment: Payment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Payment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialPayment == null) throw new Exception("Missing required parameter 'partialPayment' when calling PaymentApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialPayment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchTransaction(buyerID: String,
      orderID: String,
      paymentID: String,
      transactionID: String,
      partialTransaction: PaymentTransaction)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PaymentTransaction]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString)
        replaceAll ("\\{" + "transactionID" + "\\}",transactionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialTransaction == null) throw new Exception("Missing required parameter 'partialTransaction' when calling PaymentApi->patchTransaction")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialTransaction))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      orderID: String,
      paymentID: String,
      payment: Payment)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Payment]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (payment == null) throw new Exception("Missing required parameter 'payment' when calling PaymentApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(payment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateTransaction(buyerID: String,
      orderID: String,
      paymentID: String,
      transactionID: String,
      transaction: PaymentTransaction)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PaymentTransaction]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/orders/{orderID}/payments/{paymentID}/transactions/{transactionID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "orderID" + "\\}",orderID.toString)
        replaceAll ("\\{" + "paymentID" + "\\}",paymentID.toString)
        replaceAll ("\\{" + "transactionID" + "\\}",transactionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (transaction == null) throw new Exception("Missing required parameter 'transaction' when calling PaymentApi->updateTransaction")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(transaction))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
