package com.cg.apps.springdatajpa.customerms.dao;
import com.cg.apps.springdatajpa.customerms.entities.Customer;
public interface ICustomerDao {
	public Customer add(Customer customer);
    public Customer findByID(long customerID);
    public Customer update(Customer customer);

}
