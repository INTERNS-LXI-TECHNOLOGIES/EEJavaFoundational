package com.lxisoft.internsassist;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService 
{
     
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Inside credential loader");
        User user = userRepository.findByUserName(username);
        System.out.println("haiiiiii"+user);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassword(),
                user.getRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getName()))
                        .collect(Collectors.toList())

        );

    }
}