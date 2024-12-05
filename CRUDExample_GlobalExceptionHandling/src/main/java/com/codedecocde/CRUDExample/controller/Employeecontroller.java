package com.codedecocde.CRUDExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecocde.CRUDExample.entity.Employee;
import com.codedecocde.CRUDExample.service.EmployeeServiceInterface;

//if you have common types of exceptions being thrown in multiple classes, we can use
//global exception handling

@RestController
@RequestMapping("/code")
public class Employeecontroller {

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;

	@GetMapping("/all")
	public ResponseEntity<?> getAllEmployees() {
		List<Employee> employees = employeeServiceInterface.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {
		Employee savedEmployee = null;
		savedEmployee = employeeServiceInterface.addEmployee(emp);
		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/emp/{empId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long empId) {
		Employee emp = employeeServiceInterface.getEmployeeById(empId);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable Long empId) {
		employeeServiceInterface.deleteEmployeeById(empId);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
		Employee savedEmployee = employeeServiceInterface.addEmployee(emp);
		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
	}
}
