package com.cg.empmgt.dao;
import com.cg.empmgt.entities.Employee;
import java.util.*;

public class EmployeeDaoImp implements IEmployeeDao {
	private int generatedId=0;

	public int generateId() {
	    generatedId++;
	    return generatedId;
	}

	@Override
	public void add(Employee employee) {
		Map<Integer,Employee>store=StoreHolder.store;
		int id=generateId();
		employee.setId(id);
		store.put(id, employee);
	}

	@Override
	public Employee findById(int id) {
		Map<Integer,Employee>store=StoreHolder.store;
		Employee employee=store.get(id);
	    return employee; 
	}
	@Override
	public void removeById(int id) {
		Map<Integer,Employee>store=StoreHolder.store;
		store.remove(id);
	}
	

	@Override
	public List<Employee> findAll() {
		Map<Integer,Employee>store=StoreHolder.store;
		
		Collection<Employee>employees=store.values();
		//List<Employee>allemployees=(ArrayList)store.values();
		List<Employee>list=new ArrayList<>(employees);
		return list;		
	}


}
