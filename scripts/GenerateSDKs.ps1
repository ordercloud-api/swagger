param(
    [Parameter(Mandatory=$true)]
    [string]$Envrionment
)

if ($Envrionment -eq "prod") {
    $swaggerUrl = "https://api.ordercloud.io/v1"
}
elseif ($Envrionment -eq "qa") {
    $swaggerUrl = "https://qaapi.ordercloud.io/v1"
}

$languages = @(
    "CSharp",
    "PHP",
    "Python",
    "Ruby",
    "Swift"
)

foreach ($language in $languages) {
    java -jar ../swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i $swaggerUrl/swagger -l $language.ToLower() -o "./output/OrderCloud-$language-SDK" -t templates/$language.ToLower()
}
