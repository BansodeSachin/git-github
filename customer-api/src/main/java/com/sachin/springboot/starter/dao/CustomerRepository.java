package com.sachin.springboot.starter.dao;

import org.springframework.data.repository.CrudRepository;

import com.sachin.springboot.starter.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
