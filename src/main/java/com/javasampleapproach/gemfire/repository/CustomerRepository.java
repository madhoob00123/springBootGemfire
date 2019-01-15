package com.javasampleapproach.gemfire.repository;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.gemfire.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Customer findByFirstname(String firstname);
	Customer findByLastname(String lastname);
	Iterable<Customer> findByAgeGreaterThan(int age);
	Iterable<Customer> findByAgeLessThan(int age);
}