Quiz-Service is one of the Microservice for the Quiz-App which request for the required questions to the question-service using Eureka Server and Feign Client, and then the request is received by Question-Service and then Id are returned according to the request and then they are sent to the front-end through REST-API.

1. Eureka server where Instances are Registered

![Image Alt](https://github.com/jacksonsamuval/API-Gateway/blob/6dab23f56e648a8ddcc7906da8911ba9a49b690c/Microservices/Eureka-client.png)

2. Get the quiz using the id created for specific user

![Image Alt](https://github.com/jacksonsamuval/API-Gateway/blob/6dab23f56e648a8ddcc7906da8911ba9a49b690c/Microservices/Get_Quiz_with_Id.png)

3. Get Score for the Quiz

![Image Alt](https://github.com/jacksonsamuval/API-Gateway/blob/6dab23f56e648a8ddcc7906da8911ba9a49b690c/Microservices/score.png)

Thank You.
