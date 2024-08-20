package com.diviso.interns;

import org.springframework.stereotype.Component;

import com.diviso.interns.entity.Question;
import com.diviso.interns.entity.Role;
import com.diviso.interns.repo.QuestionRepository;
import com.diviso.interns.repo.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    public RoleRepository role;

    @Autowired
    public PasswordEncoder passwordEncoder;
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public void run(String... args) {// from CommandLineRunner

        role.deleteAll();

        Role role1 = new Role();
        role1.setName("user");
        role.save(role1);

        Role role2 = new Role();
        role2.setName("admin");
        role.save(role2);

    }

}
