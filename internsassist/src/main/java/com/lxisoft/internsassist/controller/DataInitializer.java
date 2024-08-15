package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.repository.RoleRepository;
import com.lxisoft.internsassist.model.Role;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Component
public class DataInitializer implements CommandLineRunner
{


    @Autowired
    public RoleRepository  role;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override 
    public void run(String... args) //from CommandLineRunner
    {

        role.deleteAll(); 


     Role role1 = new Role();
     role1.setName("user");
     role.save(role1);

     Role role2 = new Role();
     role2.setName("admin");
     role.save(role2);
    }
}