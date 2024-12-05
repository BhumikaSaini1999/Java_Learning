package com.codedecode.microservices.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codedecode.microservices.entity.Citizen;
import com.codedecode.microservices.repo.CitizenRepo;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo repo;
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("hello",HttpStatus.OK);
	}
	
	//-> here id is vaccinationCeneterId->which will give me all the citizens registered with that vaccination center
	@GetMapping(path="/id/{id}")
	public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id) {
		
		List<Citizen> listOfCitizens = repo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(listOfCitizens, HttpStatus.OK);
	}
	
	@PostMapping(path="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
		
		Citizen citizen = repo.save(newCitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}
}
