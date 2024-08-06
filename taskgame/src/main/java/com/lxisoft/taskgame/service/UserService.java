package com.lxisoft.taskgame.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.*;
import com.lxisoft.taskgame.repository.*;

@Service
public class UserService{

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private RoleService roleService;

   public void addUser(User user){
    User newUser = new User();
    List <Role> userRoles = new ArrayList<>();
    userRoles.add(roleService.getRoleByName("user"));
    newUser.setUserName(user.getUserName());
    newUser.setPassword(passwordEncoder.encode(user.getPassword()));
    newUser.setRole(userRoles);
    userRepository.save(newUser);
   }

   public User getUserByUserName(String name){
    return userRepository.findByUserName(name);
   }

  
}
