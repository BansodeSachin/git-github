package com.sachin.springboot.starter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springboot.starter.entity.Customer;
import com.sachin.springboot.starter.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllTopics() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getAllTopics(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addTopic(@RequestBody Customer topic) {
		customerService.addCustomer(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void addTopic(@RequestBody Customer topic, @PathVariable int id) {
		customerService.updateCustomer(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void addTopic(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
	
}
