param(
    [Parameter(Mandatory=$true)]
    [string]$Environment
)

if ($Environment -eq "prod") {
    $swaggerUrl = "https://api.ordercloud.io/v1"
}
elseif ($Environment -eq "qa") {
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
    $lowercaseLanguage = $language.ToLower()
    java -jar ../swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i "$swaggerUrl/swagger" -l $lowercaseLanguage -o "output/OrderCloud-$language-SDK" -t templates/$lowercaseLanguage
}
