FROM microsoft/dotnet:latest

ENV DOTNET_CLI_TELEMETRY_OPTOUT 1

RUN mkdir -p /app/OrderCloud
COPY . /app/OrderCloud
WORKDIR /app/OrderCloud

EXPOSE 5000/tcp

RUN ["dotnet", "restore"]
ENTRYPOINT ["dotnet", "run", "-p", "project.json", "web"]
