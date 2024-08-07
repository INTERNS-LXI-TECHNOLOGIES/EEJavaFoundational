package com.lxisoft.hungergame;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//@Component
public class DataInitializer implements CommandLineRunner{

    @Autowired
    private RoleRepository roleRepository ;

    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private PasswordEncoder passwordEncoder ;

    public void run(String... args)
    {
        Role userRole = new Role();
        userRole.setRole_name("user");
        roleRepository.save(userRole);

        Role adminRole = new Role();
        adminRole.setRole_name("admin");
        roleRepository.save(adminRole);

        Role guestRole = new Role();
        guestRole.setRole_name("guest");
        roleRepository.save(guestRole);

        User user = new User();

        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("admin"));
        Set<Role> role = new HashSet<>();
        role.add(adminRole);
        user.setRoles(role);
        userRepository.save(user);
    }
}

