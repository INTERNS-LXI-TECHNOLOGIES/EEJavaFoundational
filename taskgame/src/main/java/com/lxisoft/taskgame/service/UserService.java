package com.lxisoft.taskgame.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.*;
import com.lxisoft.taskgame.repository.*;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

   

  
}
