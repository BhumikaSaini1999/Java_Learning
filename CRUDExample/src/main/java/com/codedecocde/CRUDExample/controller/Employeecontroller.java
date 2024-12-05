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
import com.codedecocde.CRUDExample.repository.EmployeeCrudRepository;
import com.codedecocde.CRUDExample.service.EmployeeServiceInterface;
import com.codedecocde.CRUDExample.custom.exception.BusinessException;
import com.codedecocde.CRUDExample.custom.exception.ControllerException;
import com.codedecocde.CRUDExample.entity.Employee;

@RestController
@RequestMapping("/code")
public class Employeecontroller {

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;

	@GetMapping("/all")
	public ResponseEntity<?> getAllEmployees() {
		List<Employee> employees = null;
		try {
			employees = employeeServiceInterface.getAllEmployees();
			return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
		}catch(BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {
		try {
			Employee savedEmployee = employeeServiceInterface.addEmployee(emp);
			return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
		} catch (BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ControllerException ce = new ControllerException("611", "Something went wrong in Controller for addEmployee");
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/emp/{empId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long empId) {
		try {
			Employee emp = employeeServiceInterface.getEmployeeById(empId);
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		} catch (BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ControllerException ce = new ControllerException("612", "Something went wrong in Controller for getEmployeeById");
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable Long empId) {
		try {
			employeeServiceInterface.deleteEmployeeById(empId);
			return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		} catch (BusinessException e) {
			ControllerException ce = new ControllerException(e.getErrorCode(), e.getErrorMessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ControllerException ce = new ControllerException("613", "Something went wrong in Controller for deleteEmployeeById");
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
		Employee savedEmployee = employeeServiceInterface.addEmployee(emp);
		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
	}
}
