package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Promotion
import io.swagger.client.model.PromotionAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class PromotionApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(promo: Promotion)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Promotion]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/promotions"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (promo == null) throw new Exception("Missing required parameter 'promo' when calling PromotionApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(promo))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(promotionID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/promotions/{promotionID}")
        replaceAll ("\\{" + "promotionID" + "\\}",promotionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAssignment(promotionID: String,
      buyerID: String,
      userID: Option[String] = None,
      userGroupID: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/promotions/{promotionID}/assignments")
        replaceAll ("\\{" + "promotionID" + "\\}",promotionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (buyerID != null) queryParams += "buyerID" -> buyerID.toString

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(promotionID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/promotions/{promotionID}")
        replaceAll ("\\{" + "promotionID" + "\\}",promotionID.toString))

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
    val path = (addFmt("/promotions"))

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
      promotionID: Option[String] = None,
      userID: Option[String] = None,
      userGroupID: Option[String] = None,
      level: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/promotions/assignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (buyerID != null) queryParams += "buyerID" -> buyerID.toString

    if (promotionID != null) promotionID.foreach { v => queryParams += "promotionID" -> v.toString }

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

  def patch(promotionID: String,
      partialPromotion: Promotion)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Promotion]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/promotions/{promotionID}")
        replaceAll ("\\{" + "promotionID" + "\\}",promotionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (partialPromotion == null) throw new Exception("Missing required parameter 'partialPromotion' when calling PromotionApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(partialPromotion))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveAssignment(assignment: PromotionAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[PromotionAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/promotions/assignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (assignment == null) throw new Exception("Missing required parameter 'assignment' when calling PromotionApi->saveAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(assignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(promotionID: String,
      promo: Promotion)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Promotion]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/promotions/{promotionID}")
        replaceAll ("\\{" + "promotionID" + "\\}",promotionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (promo == null) throw new Exception("Missing required parameter 'promo' when calling PromotionApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(promo))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
