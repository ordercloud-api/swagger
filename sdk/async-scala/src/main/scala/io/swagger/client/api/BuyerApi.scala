package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Buyer
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class BuyerApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(company: Buyer)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Buyer]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (company == null) throw new Exception("Missing required parameter 'company' when calling BuyerApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(company))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(search: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (search != null) search.foreach { v => queryParams += "search" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      company: Buyer)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Buyer]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (company == null) throw new Exception("Missing required parameter 'company' when calling BuyerApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(company))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
