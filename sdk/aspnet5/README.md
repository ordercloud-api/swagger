# OrderCloud - ASP.NET Core 1.0 Server

A full ecommerce backend as a service.

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```

## Run in Docker

```
cd src/OrderCloud
docker build -t OrderCloud .
docker run -p 5000:5000 OrderCloud
```
