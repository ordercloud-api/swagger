package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.Spec
import io.swagger.client.model.SpecOption
import io.swagger.client.model.SpecProductAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class SpecApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(spec: Spec)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Spec]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (spec == null) throw new Exception("Missing required parameter 'spec' when calling SpecApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(spec))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createOption(specID: String,
      option: SpecOption)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[SpecOption]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (option == null) throw new Exception("Missing required parameter 'option' when calling SpecApi->createOption")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(option))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(specID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteOption(specID: String,
      optionID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options/{optionID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString)
        replaceAll ("\\{" + "optionID" + "\\}",optionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteProductAssignment(specID: String,
      productID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/productassignments/{productID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString)
        replaceAll ("\\{" + "productID" + "\\}",productID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(specID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getOption(specID: String,
      optionID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options/{optionID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString)
        replaceAll ("\\{" + "optionID" + "\\}",optionID.toString))

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
    val path = (addFmt("/specs"))

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

  def listOptions(specID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

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

  def listProductAssignments(specID: Option[String] = None,
      productID: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/productassignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (specID != null) specID.foreach { v => queryParams += "specID" -> v.toString }

    if (productID != null) productID.foreach { v => queryParams += "productID" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(specID: String,
      spec: Spec)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Spec]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (spec == null) throw new Exception("Missing required parameter 'spec' when calling SpecApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(spec))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchOption(specID: String,
      optionID: String,
      option: SpecOption)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[SpecOption]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options/{optionID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString)
        replaceAll ("\\{" + "optionID" + "\\}",optionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (option == null) throw new Exception("Missing required parameter 'option' when calling SpecApi->patchOption")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(option))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveProductAssignment(productAssignment: SpecProductAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[SpecProductAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/specs/productassignments"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (productAssignment == null) throw new Exception("Missing required parameter 'productAssignment' when calling SpecApi->saveProductAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(productAssignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(specID: String,
      spec: Spec)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[Spec]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (spec == null) throw new Exception("Missing required parameter 'spec' when calling SpecApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(spec))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateOption(specID: String,
      optionID: String,
      option: SpecOption)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[SpecOption]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/specs/{specID}/options/{optionID}")
        replaceAll ("\\{" + "specID" + "\\}",specID.toString)
        replaceAll ("\\{" + "optionID" + "\\}",optionID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (option == null) throw new Exception("Missing required parameter 'option' when calling SpecApi->updateOption")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(option))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
