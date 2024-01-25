**Installation**

step-1 
Green button on top of the file structure -> Go to Option Download as Zip

step-2
Extract the original Repo from the zipped file

step-3
Set the proper JDK Setup, and download all the dependency





**Application Related Setup**

Application.propertities file
```
#url
spring.datasource.url=jdbc:postgresql://localhost:5432/mydb

#username
spring.datasource.username=postgres
spring.datasource.password=Hardwork@365
spring.jpa.hibernate.ddl-auto=update



#console print
spring.jpa.properties.hibernate.show_sql = true
spring.jpa.properties.hibernate.format_sql=true

springdoc.swagger-ui.enabled=true
```
**Changes to be done**

`spring.datasource.username=postgres`

username -> Your userName on postgreSQL server

`spring.datasource.password=Hardwork@365`

password -> Your password on postgreSQL server


**Configuring DataSource**

`spring.datasource.url=jdbc:postgresql://localhost:5432/mydb`

Here, 5432 -> My Database Port Number,changes to be done according to the portNumber of the local postgreSQL port number


mydb is the database name, created on my own postgreSQL Database Server

**Steps to Create Database**

Create a database named mydb in own local Database server
Use the exact same name in the url



**Application Level should be done at this time**
Further Steps
After the Application is up and running 
Go the url -> http://localhost:8080/swagger-ui/index.html
[Swagger](http://localhost:8080/swagger-ui/index.html)

You will be to see The webpage like the below image, execute the get method to verify the result

<img width="1506" alt="image" src="https://github.com/RAHULBARIK/rate-limiter/assets/49528465/f83fef8e-d484-445e-a330-9061c974a35d">

And Check the Database Table to check the entry of the function name along with its timeStamp, looks something like below

<img width="1014" alt="image" src="https://github.com/RAHULBARIK/rate-limiter/assets/49528465/c075e61f-1b00-46ce-9e9b-b08e58c8ddcd">


**Integerated Open-API Spec 3.1.0 in the application and generated the Yaml file**

<img width="862" alt="image" src="https://github.com/RAHULBARIK/rate-limiter/assets/49528465/d7fae588-3ad7-45a9-9198-fb3de8ebd7cf">

<img width="1512" alt="image" src="https://github.com/RAHULBARIK/rate-limiter/assets/49528465/c068069a-7e9c-4e54-a30f-86e9977b859c">

**Yaml generated doc file by the http://localhost:8080/healthCheckApi-docs ** 
```
  openapi: 3.0.1
info:
  title: Health Check API with function logging Documentation
  description: This Application monitors the health of the application and logs how
    many times the healthCheck function is invoked
  contact:
    name: Ravi
    url: https://www.fairdeal.market/
    email: ravi@fairdeal.market
  license:
    name: FairDeal 2.0
    url: https://www.fairdeal.market/
  version: v1.0
externalDocs:
  description: Spring Boot Health Check Api documentation
  url: https://www.fairdeal.market/
servers:
- url: http://localhost:8080
  description: Generated server url
tags:
- name: Health Check APIs for Monitoring Health
  description: "Create User, Update User, Get User, Get All Users, Delete User"
paths:
  /health:
    get:
      tags:
      - Health Check APIs for Monitoring Health
      summary: Check the health of the Application
      description: Check health API is used to retrieve current Health status of the
        Application
      operationId: healthCheck
      responses:
        "200":
          description: "HTTP Status 200 ,Application is up and running"
          content:
            '*/*':
              schema:
                type: string
components: {}
```







