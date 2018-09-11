package com.sachin.springdemo.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sachin.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> theCustomers = theQuery.getResultList();
		
		/*List<Customer> theCustomers = new ArrayList<Customer>();
		
		theCustomers.add(new Customer(101, "Sachin", "Bansode", "sachin@gmail.com"));
		theCustomers.add(new Customer(102, "Sachin2", "Bansode2", "sachin2@gmail.com"));
		theCustomers.add(new Customer(103, "Sachin3", "Bansode3", "sachin3@gmail.com"));*/
		
		return theCustomers;
	}

	public Customer getCustomer(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		return theCustomer;
	}

	public void saveCustomer(Customer theCustomer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theCustomer);
		
	}

	public void deleteCustomer(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
	
		Query<Customer> theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
		
	}

}
