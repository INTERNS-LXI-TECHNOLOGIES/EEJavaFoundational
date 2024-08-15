package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.model.Player;
import com.lxisoft.internsassist.model.User;
import com.lxisoft.internsassist.repository.UserRepository;
import com.lxisoft.internsassist.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signup")
public class SignUpController {
    // @Autowired
    // private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public PlayerRepository players;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping
    public String signUp(@RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("mail") String mail,
            @RequestParam("number") String number,
            Model model) {
        if (userRepository.findByUserName(username) != null) {
            model.addAttribute("error", "User already exists");
            return "signup";
        }

        User userr = new User();
        userr.setUserName(username);
        userr.setPassword(passwordEncoder.encode(password));
        userRepository.save(userr);

        // Assuming UserService.saveUser(user) does additional processing
        // userService.saveUser(user);

        Player player = new Player();
        player.setName(username);
        player.setMail(mail);
        Long num = Long.parseLong(number);
        player.setPhone(num);
        player.setUser(userr);
        players.save(player);

        return "redirect:/login";
    }
}
