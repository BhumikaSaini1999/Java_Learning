package com.codedecode.microservices.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//1)Every Eureka server behaves internally as Eureka client also.
//Eureka server tries to register itself with another Eureka server.

//2)because there may be a chance, your Eureka server which tries to give you 
//information about all the microservices registered with your server, can go down.
//what if your Eureka server goes down?->Then you won't be able to search
//any of the url for your any of the services

//3)That's why its always a good deal to create multiple copies of these Eureka servers
//and you can have one main Eureka server having urls with different Eureka server
//which will help you to relocate to any of the microservice.

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
