package com.cg.apps.springdatajpa.customerms.service;

import com.cg.apps.springdatajpa.customerms.entities.Customer;

public interface ICustomerService {
	
	public Customer findByID(long customerID);
    public Customer createCustomer(String name);
    
}
