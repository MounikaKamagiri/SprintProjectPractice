package com.cg.apps.springdatajpa.customerms.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.apps.springdatajpa.customerms.dao.ICustomerDao;
import com.cg.apps.springdatajpa.customerms.entities.Account;
import com.cg.apps.springdatajpa.customerms.entities.Customer;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private EntityManager em;
	@Autowired
	private ICustomerDao dao;
	

	@Override
	public Customer findByID(long customerID) {
		Customer customer=dao.findByID(customerID);
		return customer;
	}
	@Transactional
	@Override
	public Customer createCustomer(String name) {
		LocalDateTime currentTime=LocalDateTime.now();
		Account account=new Account(100,currentTime);
		em.persist(account);
		Customer customer=new Customer(name,account);
		return dao.add(customer);
	}
	
}
