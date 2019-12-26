package com.lxisoft.Rwayz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.Rwayz.model.Customer;
import com.lxisoft.Rwayz.service.CustomerService;

@RestController
public class CustomerController {
	
	private Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	 public Customer saveCustomer(@RequestBody Customer customer)
	 {
		this.logger.info(">>>>>>>>>>>>>>>>>>>>>"+ customer.toString());
		return service.save(customer);
	 }
	
	@GetMapping("/customer/{id}")
	public Customer findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable long id) {
		service.deleteById(id);
	}
	
	@PutMapping("/customer")
	public Customer update(@RequestBody Customer customer) {
		return service.save(customer);
	}
	
	
	
}