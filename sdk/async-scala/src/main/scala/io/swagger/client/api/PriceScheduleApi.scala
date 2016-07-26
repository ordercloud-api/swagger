package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.PriceSchedule
import io.swagger.client.model.PriceBreak
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class PriceScheduleApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(priceSchedule: PriceSchedule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PriceSchedule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (priceSchedule == null) throw new Exception("Missing required parameter 'priceSchedule' when calling PriceScheduleApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(priceSchedule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(priceScheduleID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deletePriceBreak(priceScheduleID: String,
      quantity: Integer)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}/PriceBreaks")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (quantity != null) queryParams += "quantity" -> quantity.toString



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(priceScheduleID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules"))

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

  def patch(priceScheduleID: String,
      priceSchedule: PriceSchedule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PriceSchedule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (priceSchedule == null) throw new Exception("Missing required parameter 'priceSchedule' when calling PriceScheduleApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(priceSchedule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def savePriceBreak(priceScheduleID: String,
      priceBreak: PriceBreak)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PriceBreak]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}/PriceBreaks")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (priceBreak == null) throw new Exception("Missing required parameter 'priceBreak' when calling PriceScheduleApi->savePriceBreak")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(priceBreak))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(priceScheduleID: String,
      priceSchedule: PriceSchedule)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[PriceSchedule]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/priceschedules/{priceScheduleID}")
        replaceAll ("\\{" + "priceScheduleID" + "\\}",priceScheduleID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (priceSchedule == null) throw new Exception("Missing required parameter 'priceSchedule' when calling PriceScheduleApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(priceSchedule))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
