package com.codedecocde.CRUDExample.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecocde.CRUDExample.custom.exception.BusinessException;
import com.codedecocde.CRUDExample.entity.Employee;
import com.codedecocde.CRUDExample.repository.EmployeeCrudRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeCrudRepository crudRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//validations outside otherwise overriden by catch block exceptions
		if (emp.getName().isEmpty() || emp.getName().length() == 0) {
			// Error code->we should not use Http status codes which are already in use
			// 1,2,3,4,5 series in use=>always prefer 6 series
			throw new BusinessException("601", "Please send proper name, Its blank");
		}
		
		try {
			Employee savedEmployee = crudRepo.save(emp);
			return savedEmployee;
		} catch (IllegalArgumentException e) {// if whole entity is null
			throw new BusinessException("602", "given employee is null " + e.getMessage());
		}catch(Exception e) {
			throw new BusinessException("603", "Something went wrong in service layer while saving employee" + e.getMessage());
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = null;
		try {
			empList = crudRepo.findAll();
			if(empList.isEmpty()) {
				throw new BusinessException("","");
			}
			return empList;
		}catch(Exception e) {
			if(empList.isEmpty()) {
				throw new BusinessException("604","Hey list is completely empty ");
			}
			throw new BusinessException("605", "Something went wrong in service layer while retrieving employees " + e.getMessage());
		}
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		try {
			Employee emp = crudRepo.findById(empId).get();
			return emp;
		}catch(IllegalArgumentException e) {
			throw new BusinessException("606", "given employee id is null, please send some id to be searched " + e.getMessage());
		}catch(NoSuchElementException e) {
			throw new BusinessException("607", "given employee id doesn't exist in DB " + e.getMessage());
		}
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		try {
			crudRepo.deleteById(empId);
		}catch(IllegalArgumentException e) {
			throw new BusinessException("608", "given employee id is null, please send some id to be deleted " + e.getMessage());
		}catch(NoSuchElementException e) {
			throw new BusinessException("609", "given employee id doesn't exist in DB " + e.getMessage());
		}
	}

}
