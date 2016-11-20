param(
	[Parameter(Mandatory=$true)]
	[string]$Environment
)

if ($Environment -eq "prod") {
	$branch = "master"
}
elseif ($Environment -eq "qa") {
	$branch = "dev"
}

$output = "C:\projects\swagger\output"
$gitUrl = "https://github.com/cobrien451"
$languages = @(
    "PHP",
    "Ruby",
    "CSharp",
    "JavaScript",
    "Swift",
    "Java",
    "Python"
)

git clone -q https://github.com/swagger-api/swagger-codegen C:/projects/swagger-codegen

foreach($language in $languages) {
    git clone -q --branch=$branch $gitUrl/OrderCloud-$language-SDK.git $output\OrderCloud-$language-SDK
}