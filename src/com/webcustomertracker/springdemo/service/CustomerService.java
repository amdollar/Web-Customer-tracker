package com.webcustomertracker.springdemo.service;

import java.util.List;

import com.webcustomertracker.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void addCustomer(Customer customer);

	public Customer getCustomerById(int customerId);

	public void deleteCustomerById(int customerId);
}
