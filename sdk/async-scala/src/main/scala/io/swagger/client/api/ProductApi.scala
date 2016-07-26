package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Product
import io.swagger.client.model.Variant
import io.swagger.client.model.ProductAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ProductApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(product: Product)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Product]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (product == null) throw new Exception("Missing required parameter 'product' when calling ProductApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(product))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(productID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAssignment(buyerID: String,
      productID: String,
      userID: Option[String] = None,
      userGroupID: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/assignments/{buyerID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

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

  def generateVariants(productID: String,
      overwriteExisting: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/generate")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (overwriteExisting != null) overwriteExisting.foreach { v => queryParams += "overwriteExisting" -> v.toString }



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(productID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getInventory(productID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/inventory")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVariant(productID: String,
      variantID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/{variantID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "variantID" + "\\}",variantID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVariantInventory(productID: String,
      variantID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/inventory/{variantID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "variantID" + "\\}",variantID.toString))

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
    val path = (addFmt("/products"))

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

  def listAssignments(productID: Option[String] = None,
      buyerID: Option[String] = None,
      userID: Option[String] = None,
      userGroupID: Option[String] = None,
      level: Option[String] = None,
      priceScheduleID: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/assignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (productID != null) productID.foreach { v => queryParams += "productID" -> v.toString }

    if (buyerID != null) buyerID.foreach { v => queryParams += "buyerID" -> v.toString }

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }

    if (level != null) level.foreach { v => queryParams += "level" -> v.toString }

    if (priceScheduleID != null) priceScheduleID.foreach { v => queryParams += "priceScheduleID" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listInventory(search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/inventory"))

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

  def listVariantInventory(productID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/inventory")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

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

  def listVariants(productID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

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

  def patch(productID: String,
      product: Product)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Product]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (product == null) throw new Exception("Missing required parameter 'product' when calling ProductApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(product))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchVariant(productID: String,
      variantID: String,
      variant: Variant)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Variant]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/{variantID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "variantID" + "\\}",variantID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (variant == null) throw new Exception("Missing required parameter 'variant' when calling ProductApi->patchVariant")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(variant))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveAssignment(productAssignment: ProductAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ProductAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/products/assignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (productAssignment == null) throw new Exception("Missing required parameter 'productAssignment' when calling ProductApi->saveAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(productAssignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(productID: String,
      product: Product)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Product]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (product == null) throw new Exception("Missing required parameter 'product' when calling ProductApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(product))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateInventory(productID: String,
      inventory: Integer)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/inventory/{inventory}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "inventory" + "\\}",inventory.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateVariant(productID: String,
      variantID: String,
      variant: Variant)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Variant]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/{variantID}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "variantID" + "\\}",variantID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (variant == null) throw new Exception("Missing required parameter 'variant' when calling ProductApi->updateVariant")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(variant))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateVariantInventory(productID: String,
      variantID: String,
      inventory: Integer)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/products/{productID}/variants/inventory/{variantID}/{inventory}")
        replaceAll ("\\{" + "productID" + "\\}",productID.toString)
        replaceAll ("\\{" + "variantID" + "\\}",variantID.toString)
        replaceAll ("\\{" + "inventory" + "\\}",inventory.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
