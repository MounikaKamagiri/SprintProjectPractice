package com.cg.empmgt.service;
import com.cg.empmgt.entities.Employee;
import java.util.List;

public interface IEmployeeService {
	Employee addEmployee(String name, String department);

    Employee findById(int id);
    void removeById(int id);
    
    List<Employee>findAll();

}
