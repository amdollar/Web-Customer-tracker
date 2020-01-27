package com.webcustomertracker.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webcustomertracker.springdemo.dao.CustomerDao;
import com.webcustomertracker.springdemo.entity.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao customer;

	@RequestMapping("/list")
	public String listCustomer(Model theModel) {

		List<Customer> customers = customer.getCustomerList();

		theModel.addAttribute("customers", customers);

		return "list-customers";
	}
}
