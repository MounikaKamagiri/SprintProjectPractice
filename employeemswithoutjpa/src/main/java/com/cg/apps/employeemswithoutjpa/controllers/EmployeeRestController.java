package com.cg.apps.employeemswithoutjpa.controllers;

import com.cg.apps.employeemswithoutjpa.dto.*;
import com.cg.apps.employeemswithoutjpa.entities.*;
import com.cg.apps.employeemswithoutjpa.service.IEmployeeService;

import java.util.List;

import com.cg.apps.employeemswithoutjpa.util.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@RestController
public class EmployeeRestController {

    @Autowired
    private IEmployeeService service;

    @Autowired
    private EmployeeUtil util;

    @GetMapping(value = "/byid/{id}")
    public EmployeeDetails fetchEmployee(@PathVariable("id") Integer employeeId) {
        Employee employee = service.findById(employeeId);
        EmployeeDetails details=util.toDetails(employee);
        return details;
    }

    @GetMapping
    public List<EmployeeDetails> allEmployees() {
        List<Employee> list = service.findAll();
        List<EmployeeDetails>desiredvalue=util.toDetailsList(list);
        return desiredvalue;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public String addEmployee(@RequestBody CreateEmployeeRequest requestData) {
        Employee created = service.addEmployee(requestData.getName(), requestData.getScore());
        return "created employee with id=" + created.getId();
    }

    @PutMapping("/changename")
    public EmployeeDetails changeName(@RequestBody ChangeNameRequest requestData) {
        Employee employee = service.updateName(requestData.getId(), requestData.getName());
        EmployeeDetails desired=util.toDetails(employee);
        return desired;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody DeleteEmployeeRequest requestData){
        service.deleteById(requestData.getId());
        return "employee deleted for id="+requestData.getId();
    }



}
