package com.cg.apps.springdatajpa.customerms.dao;

import com.cg.apps.springdatajpa.customerms.entities.Customer;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImp implements ICustomerDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Customer add(Customer customer) {
		em.persist(customer);
		return customer;
	}
	@Override
	public Customer findByID(long customerID) {
		Customer customer=em.find(Customer.class,customerID);
		return customer;
	}
	@Override
	public Customer update(Customer customer) {
		return null;
	}
	
}
