package com.lxisoft.hungergame;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CoustomUserDetails implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepository ;

    public UserDetails loadUserByUsername(String user)
    {
        User userDetails = userRepository.findByUsername(user);

        return new org.springframework.security.core.userdetails.User(userDetails.getUsername(), userDetails.getPassword(), userDetails.getRoles().stream()
        .map((role) -> new SimpleGrantedAuthority(role.getRole_name())).collect(Collectors.toList()));
        
    }
}
