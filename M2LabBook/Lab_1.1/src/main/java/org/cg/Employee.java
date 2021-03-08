package org.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${emp.id}")
	int empId;
	
	@Value("${emp.name}")
	String empName;
	
	@Value("${emp.salary}")
	double salary;
	
	@Value("${emp.BU}")
	String businessUnit;
	
	
	

	@Value("${emp.age}")
	int age;

	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	@Override
	public String toString() {
		return "empId=" + empId + "\nempName=" + empName + "\nsalary=" + salary + "\nbusinessUnit="
				+ businessUnit + "\nage=" + age ;
	}


}