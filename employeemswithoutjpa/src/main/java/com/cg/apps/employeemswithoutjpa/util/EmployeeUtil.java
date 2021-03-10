package com.cg.apps.employeemswithoutjpa.util;

import com.cg.apps.employeemswithoutjpa.dto.EmployeeDetails;
import com.cg.apps.employeemswithoutjpa.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeUtil {

    public EmployeeDetails toDetails(Employee employee){
    	EmployeeDetails details=new EmployeeDetails(employee.getId(), employee.getName(),employee.getScore());
        return details;
    }

    public List<EmployeeDetails> toDetailsList(Collection<Employee> employees){
        List<EmployeeDetails>desired=new ArrayList<>();
        for (Employee employee:employees){
        	EmployeeDetails details=toDetails(employee);
            desired.add(details);
        }
        return desired;

    }

   
}
