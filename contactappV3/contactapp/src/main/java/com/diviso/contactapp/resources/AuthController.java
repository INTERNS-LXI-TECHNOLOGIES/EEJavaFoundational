package com.diviso.contactapp.resources;

import com.diviso.contactapp.entity.Role;
import com.diviso.contactapp.entity.User;
import com.diviso.contactapp.bll.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;
import java.util.Set;

@Controller
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    private CustomUserDetailsService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        logger.info("signupform() method is called");
        return "signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role userRole = userService.findRoleByName("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(userRole);
        user.setRoles(roles);
        userService.saveUser(user);
        logger.info("signupsubmit() method is called");
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        logger.info("loginform() method is called");
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user) {
        // Handle login logic here
        logger.info("loginsubmit() method is called");
        return "redirect:/home";
    }
}
