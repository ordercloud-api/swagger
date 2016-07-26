package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.UserGroup
import io.swagger.client.model.UserGroupAssignment
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class UserGroupApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def create(buyerID: String,
      group: UserGroup)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[UserGroup]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (group == null) throw new Exception("Missing required parameter 'group' when calling UserGroupApi->create")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(group))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def delete(buyerID: String,
      userGroupID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/{userGroupID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "userGroupID" + "\\}",userGroupID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteUserAssignment(buyerID: String,
      userGroupID: String,
      userID: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/{userGroupID}/assignments/{userID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "userGroupID" + "\\}",userGroupID.toString)
        replaceAll ("\\{" + "userID" + "\\}",userID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def get(buyerID: String,
      userGroupID: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/{userGroupID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "userGroupID" + "\\}",userGroupID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def list(buyerID: String,
      search: Option[String] = None,
      searchOn: Option[String] = None,
      sortBy: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

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

  def listUserAssignments(buyerID: String,
      userGroupID: Option[String] = None,
      userID: Option[String] = None,
      page: Option[Integer] = None,
      pageSize: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userGroupID != null) userGroupID.foreach { v => queryParams += "userGroupID" -> v.toString }

    if (userID != null) userID.foreach { v => queryParams += "userID" -> v.toString }

    if (page != null) page.foreach { v => queryParams += "page" -> v.toString }

    if (pageSize != null) pageSize.foreach { v => queryParams += "pageSize" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      userGroupID: String,
      group: UserGroup)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[UserGroup]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/{userGroupID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "userGroupID" + "\\}",userGroupID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (group == null) throw new Exception("Missing required parameter 'group' when calling UserGroupApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(group))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def saveUserAssignment(buyerID: String,
      userGroupAssignment: UserGroupAssignment)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[UserGroupAssignment]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/assignments")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (userGroupAssignment == null) throw new Exception("Missing required parameter 'userGroupAssignment' when calling UserGroupApi->saveUserAssignment")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(userGroupAssignment))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      userGroupID: String,
      group: UserGroup)(implicit reader: ClientResponseReader[Any], writer: RequestWriter[UserGroup]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/usergroups/{userGroupID}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "userGroupID" + "\\}",userGroupID.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (group == null) throw new Exception("Missing required parameter 'group' when calling UserGroupApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(group))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
