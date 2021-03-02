package com.cg.empmgt.service;
import java.util.List;

import com.cg.empmgt.dao.*;
import com.cg.empmgt.entities.Employee;
import com.cg.empmgt.exceptions.*;

public class EmployeeServiceImp implements IEmployeeService{
	private IEmployeeDao dao=new EmployeeDaoImp();

	@Override
	public Employee addEmployee(String name, String department) {
		Employee employee = new Employee(name,department); 
		validateName(name);
		validateDept(department);
		dao.add(employee);
		return employee;
	}

	@Override
	public Employee findById(int id) {
		validateId(id);
		Employee employee=dao.findById(id);
		return employee;		
	}
	@Override
	public void removeById(int id) {
		validateId(id);
		dao.removeById(id);
	}
	
	@Override
	public List<Employee> findAll() {
		List<Employee>employees=dao.findAll();
		return employees;
	}
	void validateId(int id){
		if(id <0){
			throw new InvalidIdException("id should not be negative");
		}
	}
	void validateName(String name){
		if(name==null || name.isEmpty() || name.trim().isEmpty()){
			throw new InvalidNameException("name can't be null or empty");
		}
	}
	void validateDept(String department){
		if(department==null||department.isEmpty()){
         throw new InvalidDeptException("department can't be null or empty");
		}
	}

    
}
