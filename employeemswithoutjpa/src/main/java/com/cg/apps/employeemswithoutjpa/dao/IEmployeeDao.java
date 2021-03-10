package com.cg.apps.employeemswithoutjpa.dao;

import com.cg.apps.employeemswithoutjpa.entities.*;

import java.util.List;

public interface IEmployeeDao {

    void add (Employee student);

    Employee findById(int id);

    List<Employee>findAll();

    Employee update(Employee  employee);

    void deleteById(int id);
}
