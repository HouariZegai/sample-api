# Sample HTTPS Secured REST API
This is a sample REST API that is secured using HTTPS. It is built using Spring Boot.

## Getting Started

## Create Docker Network
```shell
docker network create --drive bridge --subnet 122.122.122.0/24 backend
```

### Run Nginx Proxy Manager Container
```shell
docker-compose -f docker-compose-nginx.yml up -d
```

### Create Docker Image & Run Docker Container
```shell
docker-compose up -d
```