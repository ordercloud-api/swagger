/**
 * OrderCloud
 * A full ecommerce backend as a service.
 *
 * OpenAPI spec version: 0.1
 * Contact: ordercloud@four51.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wordnik.client.api

import com.wordnik.client.model.Category
import com.wordnik.client.model.CategoryAssignment
import com.wordnik.client.model.CategoryProductAssignment

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class CategoryApi (implicit val swagger: Swagger) extends ScalatraServlet
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CategoryApi"
  override protected val applicationName: Option[String] = Some("/v1/Category")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val createOperation = (apiOperation[Object]("create")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), bodyParam[Category]("category").description(""))
  )

  post("/buyers/{buyerID}/categories",operation(createOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
          val category = parsedBody.extract[Category]

    println("category: " + category)
  }

  

  val deleteOperation = (apiOperation[Unit]("delete")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""))
  )

  delete("/buyers/{buyerID}/categories/{categoryID}",operation(deleteOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
  }

  

  val deleteAssignmentOperation = (apiOperation[Unit]("deleteAssignment")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""), queryParam[String]("userID").description("").optional, queryParam[String]("userGroupID").description("").optional)
  )

  delete("/buyers/{buyerID}/categories/{categoryID}/assignments",operation(deleteAssignmentOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
    
    
                val userID = params.getAs[String]("userID")

    println("userID: " + userID)
    
    
                val userGroupID = params.getAs[String]("userGroupID")

    println("userGroupID: " + userGroupID)
  }

  

  val deleteProductAssignmentOperation = (apiOperation[Unit]("deleteProductAssignment")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""), pathParam[String]("productID").description(""))
  )

  delete("/buyers/{buyerID}/categories/{categoryID}/productassignments/{productID}",operation(deleteProductAssignmentOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
    
    
      val productID = params.getOrElse("productID", halt(400))
    
    println("productID: " + productID)
  }

  

  val getOperation = (apiOperation[Object]("get")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""))
  )

  get("/buyers/{buyerID}/categories/{categoryID}",operation(getOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
  }

  

  val listOperation = (apiOperation[Object]("list")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), queryParam[String]("parentID").description("").optional, queryParam[String]("depth").description("").optional, queryParam[String]("search").description("").optional, queryParam[String]("searchOn").description("").optional, queryParam[String]("sortBy").description("").optional, queryParam[Int]("page").description("").optional, queryParam[Int]("pageSize").description("").optional)
  )

  get("/buyers/{buyerID}/categories",operation(listOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
                val parentID = params.getAs[String]("parentID")

    println("parentID: " + parentID)
    
    
                val depth = params.getAs[String]("depth")

    println("depth: " + depth)
    
    
                val search = params.getAs[String]("search")

    println("search: " + search)
    
    
                val searchOn = params.getAs[String]("searchOn")

    println("searchOn: " + searchOn)
    
    
                val sortBy = params.getAs[String]("sortBy")

    println("sortBy: " + sortBy)
    
    
                val page = params.getAs[Int]("page")

    println("page: " + page)
    
    
                val pageSize = params.getAs[Int]("pageSize")

    println("pageSize: " + pageSize)
  }

  

  val listAssignmentsOperation = (apiOperation[Object]("listAssignments")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), queryParam[String]("categoryID").description("").optional, queryParam[String]("userID").description("").optional, queryParam[String]("userGroupID").description("").optional, queryParam[String]("level").description("").optional, queryParam[Int]("page").description("").optional, queryParam[Int]("pageSize").description("").optional)
  )

  get("/buyers/{buyerID}/categories/assignments",operation(listAssignmentsOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
                val categoryID = params.getAs[String]("categoryID")

    println("categoryID: " + categoryID)
    
    
                val userID = params.getAs[String]("userID")

    println("userID: " + userID)
    
    
                val userGroupID = params.getAs[String]("userGroupID")

    println("userGroupID: " + userGroupID)
    
    
                val level = params.getAs[String]("level")

    println("level: " + level)
    
    
                val page = params.getAs[Int]("page")

    println("page: " + page)
    
    
                val pageSize = params.getAs[Int]("pageSize")

    println("pageSize: " + pageSize)
  }

  

  val listChildrenOperation = (apiOperation[Object]("listChildren")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("parentID").description(""), queryParam[String]("search").description("").optional, queryParam[String]("depth").description("").optional, queryParam[Int]("page").description("").optional, queryParam[Int]("pageSize").description("").optional)
  )

  get("/buyers/{buyerID}/categories/{parentID}/categories",operation(listChildrenOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val parentID = params.getOrElse("parentID", halt(400))
    
    println("parentID: " + parentID)
    
    
                val search = params.getAs[String]("search")

    println("search: " + search)
    
    
                val depth = params.getAs[String]("depth")

    println("depth: " + depth)
    
    
                val page = params.getAs[Int]("page")

    println("page: " + page)
    
    
                val pageSize = params.getAs[Int]("pageSize")

    println("pageSize: " + pageSize)
  }

  

  val listProductAssignmentsOperation = (apiOperation[Object]("listProductAssignments")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), queryParam[String]("categoryID").description("").optional, queryParam[String]("productID").description("").optional, queryParam[Int]("page").description("").optional, queryParam[Int]("pageSize").description("").optional)
  )

  get("/buyers/{buyerID}/categories/productassignments",operation(listProductAssignmentsOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
                val categoryID = params.getAs[String]("categoryID")

    println("categoryID: " + categoryID)
    
    
                val productID = params.getAs[String]("productID")

    println("productID: " + productID)
    
    
                val page = params.getAs[Int]("page")

    println("page: " + page)
    
    
                val pageSize = params.getAs[Int]("pageSize")

    println("pageSize: " + pageSize)
  }

  

  val patchOperation = (apiOperation[Unit]("patch")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""), bodyParam[Category]("category").description(""))
  )

  patch("/buyers/{buyerID}/categories/{categoryID}",operation(patchOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
    
    
          val category = parsedBody.extract[Category]

    println("category: " + category)
  }

  

  val saveAssignmentOperation = (apiOperation[Unit]("saveAssignment")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), bodyParam[CategoryAssignment]("categoryAssignment").description(""))
  )

  post("/buyers/{buyerID}/categories/assignments",operation(saveAssignmentOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
          val categoryAssignment = parsedBody.extract[CategoryAssignment]

    println("categoryAssignment: " + categoryAssignment)
  }

  

  val saveProductAssignmentOperation = (apiOperation[Unit]("saveProductAssignment")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), bodyParam[CategoryProductAssignment]("productAssignment").description(""))
  )

  post("/buyers/{buyerID}/categories/productassignments",operation(saveProductAssignmentOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
          val productAssignment = parsedBody.extract[CategoryProductAssignment]

    println("productAssignment: " + productAssignment)
  }

  

  val updateOperation = (apiOperation[Object]("update")
      summary ""
      parameters(pathParam[String]("buyerID").description(""), pathParam[String]("categoryID").description(""), bodyParam[Category]("category").description(""))
  )

  put("/buyers/{buyerID}/categories/{categoryID}",operation(updateOperation)) {
    
    
      val buyerID = params.getOrElse("buyerID", halt(400))
    
    println("buyerID: " + buyerID)
    
    
      val categoryID = params.getOrElse("categoryID", halt(400))
    
    println("categoryID: " + categoryID)
    
    
          val category = parsedBody.extract[Category]

    println("category: " + category)
  }

}