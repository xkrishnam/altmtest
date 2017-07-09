Application :
---------------
Made using spring boot with hibernate .Maven is used for building and spring boot plugin for running app.
Tested using Chrome's postman and CURL.


end points :
------------

1... http://localhost:8080/testapp/api/user  
     Post to create new user : set content type to application/json and send user in json form as follows in request body (not as form data) 
{
"name":"krishna",
"age" :19,
"email":"krishna@mishra.com"
}


2... http://localhost:8080/testapp/api/user  GET to fetch all users

3... http://localhost:8080/testapp/api/auth  GET to retrive auth token (JWT style token) from header send     
     "X-Authorozation" in header with "Bearer kjshs78687sfhsdsiudy7<token>"



chrome's postman collection link : https://www.getpostman.com/collections/1db7a8f346fc958b27c6

DATABASE :
-----------
Embedded H2 DB is used which will get refresh on every application startup.Connecting other database will require changes in application.properties file only.

Embedded H2 can be browsed on browser on address http://localhost:8080/testapp/console   no password required.

use jdbc:h2:mem:testdb in JDBC URL field in H2's console.


Git:
-----
