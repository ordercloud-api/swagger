require 'json'


MyApp.add_route('PUT', '/v1/password/reset/{verificationCode}', {
  "resourcePath" => "/PasswordReset",
  "summary" => "",
  "nickname" => "reset_password", 
  "responseClass" => "void", 
  "endpoint" => "/password/reset/{verificationCode}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "verification_code",
      "description" => "Verification code of the forgotten password.",
      "dataType" => "string",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PasswordReset",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/password/reset', {
  "resourcePath" => "/PasswordReset",
  "summary" => "",
  "nickname" => "send_verification_code", 
  "responseClass" => "void", 
  "endpoint" => "/password/reset", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "PasswordResetRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

