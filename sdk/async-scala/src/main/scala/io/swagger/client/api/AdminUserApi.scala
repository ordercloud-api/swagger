package io.swagger.client.api

import io.swagger.client.model.User
import io.swagger.client.model.Any
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AdminUserApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(user: User)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[User]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/adminusers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling AdminUserApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(userID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/adminusers/{userID}")
        replaceAll ("\\{" + "userID" + "\\}",userID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(userID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/adminusers/{userID}")
        replaceAll ("\\{" + "userID" + "\\}",userID.toString))

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
    val path = (addFmt("/adminusers"))

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

  def patch(userID: String,
      user: User)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[User]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/adminusers/{userID}")
        replaceAll ("\\{" + "userID" + "\\}",userID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling AdminUserApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(userID: String,
      user: User)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[User]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/adminusers/{userID}")
        replaceAll ("\\{" + "userID" + "\\}",userID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling AdminUserApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
