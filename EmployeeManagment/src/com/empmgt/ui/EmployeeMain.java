package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeMain app = new EmployeeMain();
		app.run();

	}

	void run() {

		Department department1 = new Department("D1", "Developing");
		Department depatment2 = new Department("D2", "Testing");

		Employee employee1 = new Developer(1, "Mounika", department1, "Java");
		Employee employee2 = new Developer(2, "Madhuri", department1, "python");

		Employee tester1 = new Tester(3, "Ram", depatment2, "Selenium");
		Employee tester2 = new Tester(4, "Soumya", depatment2, "Jasmine");

		Employee employees[] = new Employee[4];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = tester1;
		employees[3] = tester2;

		for (int i = 0; i < employees.length; i++) {
			Employee iterated = employees[i];
			if (iterated instanceof Developer) {
				Developer developer = (Developer) iterated;
				displayEmployee(developer);
			}
			if (iterated instanceof Tester) {
				Tester tester = (Tester) iterated;
				display(tester);
			}
		}

	}

	void displayBaseEmployee(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department = employee.getDepartment();
		String deptId = department.getDeptId();
		String deptName = department.getDeptName();
		System.out.println("Id: " + id + " Name : " + name);
		System.out.println("Department ID: " + deptId + "\nDepartment Name: " + deptName);
	}

	void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		String language = employee.getLanguage();
		System.out.println("Language: " + language);
	}

	void display(Tester employee) {
		displayBaseEmployee(employee);
		String tools = employee.getTools();
		System.out.println("Tools: " + tools);
	}

}