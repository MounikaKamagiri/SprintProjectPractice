package com.cg.apps.employeemswithoutjpa.service;

import com.cg.apps.employeemswithoutjpa.entities.Employee;


import java.util.List;

public interface IEmployeeService {

   Employee addEmployee(String name, int score);
    
   Employee findById(int id);

    List<Employee>findAll();

    Employee updateName(int id, String name);

    void deleteById(int id);

}
