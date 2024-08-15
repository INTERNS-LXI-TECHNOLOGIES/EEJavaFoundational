package com.lxisoft.internsassist.service;

import com.lxisoft.internsassist.repository.UserRepository;
import com.lxisoft.internsassist.repository.PlayerRepository;
import com.lxisoft.internsassist.repository.RoleRepository;
import com.lxisoft.internsassist.model.User;
import com.lxisoft.internsassist.model.Role;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private RoleRepository roleRepository;

   /*  public void saveUser(User user) {
        userRepository.save(user);

        Player player = new Player();
        player.setUser(user);
        // set other player attributes if necessary
        playerRepository.save(player);
    }*/



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


