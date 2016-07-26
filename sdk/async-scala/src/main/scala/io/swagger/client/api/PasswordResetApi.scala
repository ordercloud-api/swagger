package io.swagger.client.api

import io.swagger.client.model.PasswordReset
import io.swagger.client.model.PasswordResetRequest
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class PasswordResetApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def resetPassword(verificationCode: String,
      passwordReset: PasswordReset)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[PasswordReset]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/password/reset/{verificationCode}")
        replaceAll ("\\{" + "verificationCode" + "\\}",verificationCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (passwordReset == null) throw new Exception("Missing required parameter 'passwordReset' when calling PasswordResetApi->resetPassword")



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(passwordReset))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def sendVerificationCode(passwordResetRequest: PasswordResetRequest)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[PasswordResetRequest]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/password/reset"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (passwordResetRequest == null) throw new Exception("Missing required parameter 'passwordResetRequest' when calling PasswordResetApi->sendVerificationCode")



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(passwordResetRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
