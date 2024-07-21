package com.lxisoft.internsassist;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    @Transactional
    public void assignRole(String username, String roleName) {
        User user = userRepository.findByUserName(username);
        if (user != null) {
            Role role = roleRepository.findByName(roleName);
            if (role != null) {
                 Set<Role>  userRoless = new HashSet<>();
                  userRoless.add(role);
                user.setRoles(userRoless);
                userRepository.save(user);
            } else {
                throw new IllegalArgumentException("Role not found: " + roleName);
            }
        } else {
            throw new IllegalArgumentException("User not found: " + username);
        }
    }
}
