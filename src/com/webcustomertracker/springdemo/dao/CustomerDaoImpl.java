package com.webcustomertracker.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webcustomertracker.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomerList() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> customerQuery = session.createQuery("from Customer order by firstName");
		List<Customer> customers = customerQuery.getResultList();
		return customers;

	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		System.out.println("Customer saved successFully");
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, customerId);
	}

	@Override
	public void deleteCustomerById(int customerId) {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> cus = session.createQuery("delete from Customer where id = :customerId");
		cus.setParameter("customerId", customerId);
		cus.executeUpdate();
//		session.delete(session.get(Customer.class, custom		erId));

	}

}
