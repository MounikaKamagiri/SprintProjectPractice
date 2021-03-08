package com.cg.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProblemMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		
		Employee employee=context.getBean(Employee.class);
		System.out.println("Employee details");
		System.out.print(employee);
		
		context.close();
	}

}
