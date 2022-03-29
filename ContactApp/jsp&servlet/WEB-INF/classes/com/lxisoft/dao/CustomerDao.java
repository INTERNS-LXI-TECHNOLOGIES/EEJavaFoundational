package com.lxisoft.dao;

import com.lxisoft.model.Customer;

public interface CustomerDao {
     
     public int insertCustomer(Customer c);

     public Customer retriveCustomer(String username,String pwd);
}
