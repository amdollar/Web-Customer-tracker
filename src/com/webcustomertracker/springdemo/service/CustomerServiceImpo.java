package com.webcustomertracker.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webcustomertracker.springdemo.dao.CustomerDao;
import com.webcustomertracker.springdemo.entity.Customer;

@Service
public class CustomerServiceImpo implements CustomerService {

	@Autowired
	CustomerDao customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomerList();
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomerById(int customerId) {
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	@Transactional
	public void deleteCustomerById(int customerId) {
		customerDAO.deleteCustomerById(customerId);		
	}

}
