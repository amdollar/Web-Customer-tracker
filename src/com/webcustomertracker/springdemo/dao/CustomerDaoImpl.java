package com.webcustomertracker.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webcustomertracker.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.getCurrentSession();

		Query<Customer> customerQuery = session.createQuery("from Customer");

		List<Customer> customers = customerQuery.getResultList();

		return customers;

	}

}
