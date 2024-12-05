package com.codedecocde.CRUDExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecocde.CRUDExample.custom.exception.EmptyInputException;
import com.codedecocde.CRUDExample.entity.Employee;
import com.codedecocde.CRUDExample.repository.EmployeeCrudRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeCrudRepository crudRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if (emp.getName() == null || emp.getName().trim().isEmpty() || emp.getName().length() == 0) {
			throw new EmptyInputException("601", "Input fields are empty");
		}

		Employee savedEmployee = crudRepo.save(emp);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = crudRepo.findAll();
		return empList;
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		Employee emp = crudRepo.findById(empId).get();
		return emp;
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		crudRepo.deleteById(empId);
	}

}
