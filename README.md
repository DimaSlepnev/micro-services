micro-services
My first microservices

Here I tried to implement microserive architecture. We have school and student service with some business logic. Also I created gateway, config and discovery services.
Student and School services are registered in discovery Eureka. In config-server microservices I created configurations for all other services and saved all in one place. 
With help of gateway service we can sent REST request to our Student and School services on port 8222.
Also I implemented FeignClient in Scool service to sent GET requset to Student service
