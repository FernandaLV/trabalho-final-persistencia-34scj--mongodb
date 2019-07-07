package br.com.fiap.spring.data.mongodb.service;

import java.util.List;

import br.com.fiap.spring.data.mongodb.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
	Customer getCustomerById(String id);
	Customer createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(String id);
}
