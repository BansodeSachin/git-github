package com.sachin.springboot.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.springboot.starter.dao.CustomerRepository;
import com.sachin.springboot.starter.entity.Customer;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	/*private List<Customer> topics = new ArrayList<>(Arrays.asList(
			new Customer("Spring","Spring Framework", "Spring Framework Description"),
			new Customer("Java","Core Java", "Core Java Description"),
			new Customer("JavaScript","JavaScript", "JavaScript Description")
			));*/
	
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(int id) {
		return customerRepository.findOne(id);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(int id, Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(int id) {
		customerRepository.delete(id);
	}
}
