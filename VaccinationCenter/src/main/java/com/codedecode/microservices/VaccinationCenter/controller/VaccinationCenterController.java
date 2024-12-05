package com.codedecode.microservices.VaccinationCenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import com.codedecode.microservices.VaccinationCenter.entity.VaccinationCenter;
import com.codedecode.microservices.VaccinationCenter.model.Citizen;
import com.codedecode.microservices.VaccinationCenter.model.RequiredResponse;
import com.codedecode.microservices.VaccinationCenter.repo.CenterRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
	
	@Autowired
	private CenterRepo centerRepo;
	
	//defined in main application
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(path="/add")
	public ResponseEntity<VaccinationCenter> addVaccinationCenter(@RequestBody VaccinationCenter vaccineCenter) {
		VaccinationCenter center = centerRepo.save(vaccineCenter);
		return new ResponseEntity<>(center, HttpStatus.OK);
	}
	
	@GetMapping(path="/id/{id}")
	//@HystrixCommand(fallbackMethod="handleCitizenDowntime") //CITIZEN-SERVICE can go down->so added @HystrixCommand=>default time out is 1sec. if we do not get response within 1 sec, fallback called
	@CircuitBreaker(name="myFallBackMechanism",fallbackMethod="handleCitizenDowntime")
	public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id) {
		RequiredResponse response = new RequiredResponse();
		
		//ist get vaccination center detail 
		//then get all citizens registered to vaccination center
		VaccinationCenter center = centerRepo.findById(id).get();
		response.setCenter(center);
		
		//then get all citizens registered to vaccination center
		//localhost:9898 not required to give=> as our port can be dynamic
		//Eureka server needs load balanced rest Template to make the below url work=>put @LoadBalanced on restTemplate
		
		//To make a GET request, you can use the getForObject() or getForEntity() methods. 
		//The getForObject() method returns the response body as an object, while the getForEntity() 
		//method returns the entire response, including the headers and status code.
		//https://medium.com/hprog99/a-guide-to-the-resttemplate-in-spring-483aee112ae9 (very good blog about REST Template)
		List<Citizen> citizens = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+id, List.class);
		response.setCitizens(citizens);
		
		return new ResponseEntity<RequiredResponse>(response, HttpStatus.OK);
	}
	
	//This method is called only if CITIZEN-SERVICE is down
	//atleast i will be able to get VACCINATION-CENTER-SERVICE details rather than 500 internal server
	public ResponseEntity<RequiredResponse> handleCitizenDowntime(@PathVariable Integer id, Throwable t) {
		RequiredResponse response = new RequiredResponse();
		VaccinationCenter center = centerRepo.findById(id).get();
		response.setCenter(center);
		return new ResponseEntity<RequiredResponse>(response, HttpStatus.OK);
	}
}
