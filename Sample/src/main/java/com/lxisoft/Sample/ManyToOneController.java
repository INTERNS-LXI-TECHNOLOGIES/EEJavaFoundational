package com.lxisoft.Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.Sample.User;

@RestController
public class ManyToOneController
{
@Autowired
ManyToOneService service;
@PostMapping("/contact")
public User create(@RequestBody User user){
    
    return service.createUser(user);
}
}