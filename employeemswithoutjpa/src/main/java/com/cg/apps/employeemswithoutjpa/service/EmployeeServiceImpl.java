package com.cg.apps.employeemswithoutjpa.service;

import java.util.List;

import com.cg.apps.employeemswithoutjpa.entities.Employee;
import com.cg.apps.employeemswithoutjpa.exceptions.InvalidIdException;
import com.cg.apps.employeemswithoutjpa.exceptions.InvalidScoreException;
import com.cg.apps.employeemswithoutjpa.dao.IEmployeeDao;
import com.cg.apps.employeemswithoutjpa.dao.EmployeeDaoImpl;
import com.cg.apps.employeemswithoutjpa.exceptions.InvalidEmployeeNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public Employee addEmployee(String name, int score) {
		validateName(name);
		validateScore(score);
		Employee employee=new Employee(name,score);
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
	public List<Employee> findAll() {
		List<Employee>employees=dao.findAll();
		return employees;
	}

	@Override
	public Employee updateName(int id, String name){
		validateName(name);
		Employee employee=findById(id);
		employee.setName(name);
		employee=dao.update(employee);
		return employee;
	}

	@Override
	public void deleteById(int id) {
       dao.deleteById(id);
	}

	void validateScore(int score){
		if(score<0){
         throw new InvalidScoreException("score can't be negative");
		}
	}

   void validateName(String name){
		if(name==null || name.isEmpty() || name.trim().isEmpty()){
			throw new InvalidEmployeeNameException("name can't be null or empty");
		}
	}

	void validateId(int id){
		if(id <0){
			throw new InvalidIdException("id should not be negative");
		}
	}

}
