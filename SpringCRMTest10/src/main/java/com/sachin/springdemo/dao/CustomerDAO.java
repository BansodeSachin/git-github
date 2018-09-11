package com.sachin.springdemo.dao;

import java.util.List;

import com.sachin.springdemo.entity.Customer;

public interface CustomerDAO {

	List<Customer> getCustomers();

	Customer getCustomer(int theId);

	void saveCustomer(Customer theCustomer);

	void deleteCustomer(int theId);

}
