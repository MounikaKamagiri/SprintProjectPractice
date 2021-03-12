package com.cg.apps.springdatajpa.customerms.ui;

import com.cg.apps.springdatajpa.customerms.entities.Customer;
import com.cg.apps.springdatajpa.customerms.service.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMain {
	@Autowired
	private ICustomerService service;
	
	public static void main(String[] args) {
		CustomerMain app=new CustomerMain();
		app.start();
	}
	
	public void start() {
		
		Customer c1=service.createCustomer("mounika");
		System.out.println(c1);
		Customer findc1=service.findByID(2);
		System.out.println("Customer with id-"+ findc1.getId()+ " is: name = "+findc1.getName());
		
	}

}
