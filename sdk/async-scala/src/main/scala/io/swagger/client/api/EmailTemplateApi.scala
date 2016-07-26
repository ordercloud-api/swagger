package io.swagger.client.api

import io.swagger.client.model.Any
import io.swagger.client.model.EmailTemplate
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class EmailTemplateApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def get(buyerID: String,
      emailTemplateType: String)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "emailTemplateType" + "\\}",emailTemplateType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patch(buyerID: String,
      emailTemplateType: String,
      emailTemplate: EmailTemplate)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[EmailTemplate]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "emailTemplateType" + "\\}",emailTemplateType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (emailTemplate == null) throw new Exception("Missing required parameter 'emailTemplate' when calling EmailTemplateApi->patch")



    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(emailTemplate))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def resetToDefault(buyerID: String,
      emailTemplateType: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "emailTemplateType" + "\\}",emailTemplateType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def update(buyerID: String,
      emailTemplateType: String,
      emailTemplate: EmailTemplate)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[EmailTemplate]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/buyers/{buyerID}/emailtemplates/{emailTemplateType}")
        replaceAll ("\\{" + "buyerID" + "\\}",buyerID.toString)
        replaceAll ("\\{" + "emailTemplateType" + "\\}",emailTemplateType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (emailTemplate == null) throw new Exception("Missing required parameter 'emailTemplate' when calling EmailTemplateApi->update")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(emailTemplate))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
