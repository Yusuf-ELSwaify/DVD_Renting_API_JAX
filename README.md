# DVD RENTING API
### Overview

Provide user-friendly ```REST``` and ```SOAP``` APIs to access and manipulate the data in ```Sakila``` sample
database for ensuring a smooth user and developer experience.

> The purpose of this project is to build an API (REST - SOAP) for the Sakila Sample Database in MySQL. The goal of the API is to provide a simple and easy-to-use interface for accessing and managing the data stored in the Sakila database. The API will allow users to perform CRUD (Create, Read, Update, Delete) operations on various tables in the database, such as customer, film, inventory, actor, and more.
> 
>[Sakila Documentation](https://dev.mysql.com/doc/sakila/en/)

## Technologies Used:
- Java 17
- Apache Tomcat 10 - Version 10.1.7
- Apache Maven 3.8.6
- JAX-RS(Jersey)
- JAX-WS(Metro)
- MapStruct
- Jakarta persistence API (Hibernate)
- MYSQL
- Postman
- Lombok



## Let's Start
Download the Sakila database
1. You can download the Sakila sample database from
   [Sakila Database](https://downloads.mysql.com/docs/sakila-db.zip)
  
2. Execute sakila-schema.sql to create the database structure and execute sakila-data.sql to insert the data into the database, by using the following command:
```bash
   mysql> SOURCE C:/temp/sakila-db/sakila-schema.sql;
   mysql> SOURCE C:/temp/sakila-db/sakila-data.sql;
```
4. Clone project
```bash
git clone https://github.com/Yusuf-ELSwaify/DVD_Renting_API_JAX.git
```
5. To run the project run command
```cmd
mvn clean install tomcat7:deploy
```

- In pom.xml, change username and password and port number.
- In persistence.xml, change username and password for your database.
- Run the tomcat server.

#### Get all entities of table paginated

```http
  GET /movies/api/rest/{entity}?limit=5&from=5
```

#### Get single entity by id

```http
  GET /movies/api/rest/{entity}/{id}
```

#### Add an entity to table

```http
  POST /movies/api/rest/{entity}
  
  The entity that should be added in JSON format

```

#### Update an entity

```http
  POST /movies/api/rest/{entity}
  
  The entity that should be added in JSON format

```
#### Delete an entity

```http
  DELETE /movies/api/rest/{entity}/{id}
```


## SOAP API Reference

- The SOAP API provides a Web Service for all the entites which containg CRUD operations on the entity and the bussiness logic of the entity if any.
- The services follow this pattern.

You can use postman to use this API or bulid your client application and then import wsdl.


## Another Features

* Get actor films.
* Search for film by category
* View all available films in stores.
* Get where film available (Store, Inventory).
* Get film with rental
* Get sales of category
* Get store customers

## Documentation
 > [DVD_Renting API](https://documenter.getpostman.com/view/14365292/2s9YC2zYrj)
