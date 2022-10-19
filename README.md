# Spring Security
 This application help us to know how to implement token and role base authentication mechanism using spring security, jwt and mysql database. 
 In this application, we are going to build a real time application to perform jwt token and role based authentication mechanism.
 
 
 Postman:
 #POST 
 localhost:9090/createNewRole
  -{
    "roleName" : "User",
    "roleDescription": "Default role for newly created user"
}


localhost:9090/authenticate
  -{
    "userName" : "leilish",
    "userPassword": "leila358"
}



-GET
localhost:9090/forUser
Headers 
  -Authorization - Bearer (then the Token generated )
