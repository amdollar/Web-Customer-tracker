package com.webcustomertracker.springdemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webcustomertracker.springdemo.entity.Customer;

@Repository
public interface CustomerDao {
	public List<Customer> getCustomerList();

	public void addCustomer(Customer customer);
	
	public Customer getCustomerById(int customerId);

	public void deleteCustomerById(int customerId);
}
