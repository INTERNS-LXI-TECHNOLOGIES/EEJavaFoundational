package com.lxisoft.Rwayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.Rwayz.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}