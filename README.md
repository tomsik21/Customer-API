## References
https://spring.io/guides/tutorials/rest/
https://www.yawintutor.com/how-to-log-request-and-response-in-spring-boot


```
➜  customer-api git:(master) ✗ curl localhost:8080/customers                                                                                
[{"id":3,"firstName":"Dan","lastName":"Danin","vipCustomer":true,"rewards":30.0,"email":"DanD@email.com","phoneNumber":1231231234},{"id":4,"firstName":"Pat","lastName":"Star","vipCustomer":false,"rewards":45.0,"email":"PatS@email.com","phoneNumber":1231231235}]%                                                                                                  
➜  customer-api git:(master) ✗ curl localhost:8080/customers/4
{"id":4,"firstName":"Pat","lastName":"Star","vipCustomer":false,"rewards":45.0,"email":"PatS@email.com","phoneNumber":1231231235}%                                                  
➜  customer-api git:(master) ✗ curl localhost:8080/customers/3
{"id":3,"firstName":"Dan","lastName":"Danin","vipCustomer":true,"rewards":30.0,"email":"DanD@email.com","phoneNumber":1231231234}%       
```