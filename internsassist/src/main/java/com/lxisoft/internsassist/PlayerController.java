package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class PlayerController {

    @Autowired
    private PlayersService playersService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String showAddPlayerForm(Model model) {
        return "firstpage";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/home")
    public String showAddPlayerFormm(Model model, Principal principal) {
        // Get the authenticated user's username
        String username = principal.getName();

        // Find the user by username
        User user = userRepository.findByUserName(username);

        // Create a new player and set the user
        Player player = new Player();
        player.setUser(user);

        model.addAttribute("player", player);
        return "home";
    }

    @PostMapping("/add")
    public String addPlayer(@ModelAttribute("player") @Validated Player player, BindingResult result, Principal principal) {
        if (result.hasErrors()) {
            return "home";
        }

        // Get the authenticated user's username
        String username = principal.getName();

        // Find the user by username
        User user = userRepository.findByUserName(username);

        if (user != null) {
            player.setUser(user);
            playersService.savePlayer(player);
        }

        return "game-board";
    }
}
