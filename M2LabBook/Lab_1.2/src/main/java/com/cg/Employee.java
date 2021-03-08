package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Employee {
	
	@Value("${emp.id}")
	int empId;
	
	@Value("${emp.name}")
	String empName;
	
	@Value("${emp.salary}")
	double salary;
	
	SBU businessUnit;

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
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
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
	public SBU getSbuDetails() {
		return getBusinessUnit();
	}


}