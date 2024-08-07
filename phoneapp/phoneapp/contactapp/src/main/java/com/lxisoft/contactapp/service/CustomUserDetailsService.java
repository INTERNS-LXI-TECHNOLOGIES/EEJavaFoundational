package com.lxisoft.contactapp.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lxisoft.contactapp.repository.UserRepository;
import com.lxisoft.contactapp.model.User;
@Service
public class CustomUserDetailsService implements UserDetailsService {

@Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Inside credential loader");

        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if(user == null){
         throw new UsernameNotFoundException("User not found");
    }
    return new  org.springframework.security.core.userdetails.User(user.getUsername(), 
    user.getPassword(), 
    user.getRoles().stream().map( (role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList()) ) ;
}


}
