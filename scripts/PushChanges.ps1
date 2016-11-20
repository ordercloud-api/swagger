param(
    [Parameter(Mandatory=$true)]
    [string]$Environment,

    [Parameter(Mandatory=$true)]
    [string]$GitHub
)

$languages = @(
    "PHP",
    "Ruby",
    "CSharp",
    "JavaScript",
    "Swift",
    "Java",
    "Python"
)

git config --global github.token $GitHub

foreach($language in $languages) {
    cd "C:\projects\OrderCloud-$language-SDK"
    git status
    git commit -a -m "Commit for $env:APPVEYOR_BUILD_VERSION"
    git push
}