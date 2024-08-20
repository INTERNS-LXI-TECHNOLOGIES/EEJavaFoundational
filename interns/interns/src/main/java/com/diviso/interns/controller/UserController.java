package com.diviso.interns.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.interns.entity.Role;
import com.diviso.interns.entity.User;
import com.diviso.interns.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("userExists", false);
        return "signup";
    }

    @PostMapping("/signup")
    public String signupUser(@RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        User user = new User();
        user.setUserName(username);
        user.setPassword(passwordEncoder.encode(password));

            Set<Role> role = new HashSet<>();
            user.setRoles(role);

        userService.saveUser(user);

        // boolean isUserCreated = userService.createUser(username, password);
        if (userService.userExists(username)) {
            model.addAttribute("userExists", true);
            return "signup";
        }
        userService.createUser(username, password);
        return "home";

    }
}
