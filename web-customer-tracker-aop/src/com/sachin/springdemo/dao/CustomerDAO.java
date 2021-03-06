package com.sachin.springdemo.dao;

import java.util.List;

import com.sachin.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer saveCustomer(int theId);

	public void deleteCustomer(int theId);
}
