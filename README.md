# Customer REST API

Test project

## Problem

Create a restful micro service which will query and create users 

Task performed; accepts customer id; performs necessary data storing; returns ok or error
;returns all customers.
Write service in Java; Use data store of your choice but make sure it can later be easily replaced with an alternative data store.

## Prerequisites

Make sure to have:

* Java 8 (https://sdkman.io/usage)
* Apache Maven 3.8.6 [installed](https://maven.apache.org/download.cgi)
* Docker (https://docs.docker.com/get-docker/)
* Run the MySQL database as a container (https://hub.docker.com/_/mysql/)


### Test Examples

http://localhost:8080/demo/all
http://localhost:8080/demo/1



## Running and usage

### From IDE:
1. Import as Maven Project
2. Run Maven Install
3. Run SpringBootApplication (It will start at port 8080 on your host: [http://localhost:8080])

### From CommandLine:

Follow one of the following items:
http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html

## Usage

Typical UseCase. In POSTMAN for example.

1.Submit __POST request  like:
curl http://localhost:8080/demo/add -d name=jsmith -d email=John.smith@gmail.com

Got immediate acknowledge response:
"Saved"

2. After few seconds less then 100 hit __GET request like:
localhost:8080/demo/2

Got in process response. 

{
    "id": 2,
    "name": "jsmith",
    "email": "John.smith@gmail.com"
}

3. After 100 seconds hit __GET request again like:
http://localhost:8080/demo/all

Got in process response.

{
    "id": 1,
    "name": "bill,
    "email": "williams@salesforce.com"
},
{
    "id": 2,
    "name": "jsmith",
    "email": "John.smith@gmail.com"
}

## Docker compose

Example config using Docker compose

```yml
version: '3.4'
services:
  db:
    image: mysql
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: 'password'  
  
    ports:
    - "3306:3306"
```

Start the mysql container using Docker compose:

```
docker-compose up -d
```

Once mysql docker container is up and running, bash into the current shell:

```
docker container ps

docker exec -it [container_id] bash
```

Create database:

```
mysql> create database if not exists db_example;
mysql> use db_example;
mysql> grant all on db_example.* to 'root'@'%'; 
```

Shut down the mysql container:

```
docker-compose down -v
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/) - Spring Boot, Core, REST, Test 
* [JUnit](https://spring.io/) - Testing framework

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## Authors

* **Usha Erramilli** - *Initial work* - [Erramiu](https://github.com/uerramilli/)
