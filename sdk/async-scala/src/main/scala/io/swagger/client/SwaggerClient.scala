package io.swagger.client

import io.swagger.client.api._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val address = new AddressApi(client, config)
  
  val adminUser = new AdminUserApi(client, config)
  
  val approvalRule = new ApprovalRuleApi(client, config)
  
  val buyer = new BuyerApi(client, config)
  
  val category = new CategoryApi(client, config)
  
  val costCenter = new CostCenterApi(client, config)
  
  val creditCard = new CreditCardApi(client, config)
  
  val emailTemplate = new EmailTemplateApi(client, config)
  
  val file = new FileApi(client, config)
  
  val lineItem = new LineItemApi(client, config)
  
  val me = new MeApi(client, config)
  
  val order = new OrderApi(client, config)
  
  val passwordReset = new PasswordResetApi(client, config)
  
  val payment = new PaymentApi(client, config)
  
  val priceSchedule = new PriceScheduleApi(client, config)
  
  val product = new ProductApi(client, config)
  
  val promotion = new PromotionApi(client, config)
  
  val securityProfile = new SecurityProfileApi(client, config)
  
  val shipment = new ShipmentApi(client, config)
  
  val spec = new SpecApi(client, config)
  
  val spendingAccount = new SpendingAccountApi(client, config)
  
  val user = new UserApi(client, config)
  
  val userGroup = new UserGroupApi(client, config)
  

  def close() {
    client.close()
  }
}
