package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Category
import io.swagger.client.model.CategoryAssignment
import io.swagger.client.model.CategoryProductAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CategoryApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      category: Category)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Category]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (category == null) throw new Exception("Missing required parameter 'category' when calling CategoryApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(category))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      categoryID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAssignment(buyerID: String,
      categoryID: String,
      userID: Option[String] = None,
      userGroupID: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString))

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

  def deleteProductAssignment(buyerID: String,
      categoryID: String,
      productID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString)
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      categoryID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(buyerID: String,
      parentID: Option[String] = None,
      depth: Option[String] = None,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (parentID != null) parentID.foreach { v => queryParams += "parentID" -> v.toString }

    if (depth != null) depth.foreach { v => queryParams += "depth" -> v.toString }

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
      categoryID: Option[String] = None,
      userID: Option[String] = None,
      userGroupID: Option[String] = None,
      level: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (categoryID != null) categoryID.foreach { v => queryParams += "categoryID" -> v.toString }

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

  def listChildren(buyerID: String,
      parentID: String,
      search: Option[String] = None,
      depth: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{parentID}/categories")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "parentID" + "\\}",parentID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (search != null) search.foreach { v => queryParams += "search" -> v.toString }

    if (depth != null) depth.foreach { v => queryParams += "depth" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listProductAssignments(buyerID: String,
      categoryID: Option[String] = None,
      productID: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/productassignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (categoryID != null) categoryID.foreach { v => queryParams += "categoryID" -> v.toString }

    if (productID != null) productID.foreach { v => queryParams += "productID" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      categoryID: String,
      category: Category)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Category]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (category == null) throw new Exception("Missing required parameter 'category' when calling CategoryApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(category))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveAssignment(buyerID: String,
      categoryAssignment: CategoryAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CategoryAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (categoryAssignment == null) throw new Exception("Missing required parameter 'categoryAssignment' when calling CategoryApi->saveAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(categoryAssignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveProductAssignment(buyerID: String,
      productAssignment: CategoryProductAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CategoryProductAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/productassignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (productAssignment == null) throw new Exception("Missing required parameter 'productAssignment' when calling CategoryApi->saveProductAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(productAssignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      categoryID: String,
      category: Category)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Category]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/categories/{categoryID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "categoryID" + "\\}",categoryID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (category == null) throw new Exception("Missing required parameter 'category' when calling CategoryApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(category))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
