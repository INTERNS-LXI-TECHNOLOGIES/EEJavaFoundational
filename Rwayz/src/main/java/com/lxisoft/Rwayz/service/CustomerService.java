package com.lxisoft.Rwayz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.Rwayz.model.Customer;
import com.lxisoft.Rwayz.repository.CustomerRepository;



@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public Customer findById(Long id) {
	
		return repository.findById(id).get();
	}

	public void deleteById(long id) {
		repository.deleteById(id);
		
	}
	
//	public Customer findById(Long id) {
//		return repository.findById(id).get();
//	}

}