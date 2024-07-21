package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.Set;

@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@RequestParam("username") String username, 
                         @RequestParam("password") String password, 
                         Model model) {
        if (userRepository.findByUserName(username) != null) {
            model.addAttribute("error", "User already exists");
            return "signup";
        }

        User user = new User();
        user.setUserName(username);
        user.setPassword(passwordEncoder.encode(password));

        Role userRole = roleRepository.findByName("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(userRole);
        user.setRoles(roles);

        userRepository.save(user);

        return "redirect:/login";
    }
}
