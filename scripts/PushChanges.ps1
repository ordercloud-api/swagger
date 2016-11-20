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
git config --global user.name "AppVeyor Automation"
git config --global user.email "appveyor@four51.com"

foreach($language in $languages) {
    cd "$env:APPVEYOR_BUILD_FOLDER\output\OrderCloud-$language-SDK"
    git status
    git commit -a -m "Commit for $env:APPVEYOR_BUILD_VERSION"
    git push
}