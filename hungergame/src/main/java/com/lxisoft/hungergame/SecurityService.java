package com.lxisoft.hungergame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {
    
    @Autowired
    private UserRepository userRepository ;

    @Autowired
    private RoleRepository roleRepository ;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User handleSignup(User user)
    {
        Role role = roleRepository.findByRoleName("guest");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(role);
        return userRepository.save(user);
    }

}
