package br.com.fiap.springdatajpa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.fiap.springdatajpa.advice.ResponseError;
import br.com.fiap.springdatajpa.model.Customer;
import br.com.fiap.springdatajpa.repository.CustomerRepository;
import br.com.fiap.springdatajpa.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customers = StreamSupport.stream(customerRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return customers;
	}

	@Override
	public Customer getCustomerById(String id) {
		return customerRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		Customer storedCustomer = customerRepository.findById(customer.getId()).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Cliente não encontrado"));

		storedCustomer.setName(customer.getName());
		storedCustomer.setSurname(customer.getSurname());
		storedCustomer.setGender(customer.getGender());
		storedCustomer.setBirthDate(customer.getBirthDate());
		storedCustomer.setAddress(customer.getAddress());
		storedCustomer.setPhones(customer.getPhones());

		customerRepository.save(storedCustomer);
	}

	@Override
	public void deleteCustomer(String id) {
		customerRepository.delete(customerRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Cliente não encontrado")));
	}
}
