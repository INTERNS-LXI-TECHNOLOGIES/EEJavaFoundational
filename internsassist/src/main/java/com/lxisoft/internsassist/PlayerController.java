package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    

    @GetMapping("/home")
    public String showAddPlayerForm(Model model, @AuthenticationPrincipal UserDetails currentUser) {
        Player player = new Player();
        User user = userRepository.findByUserName(currentUser.getUsername());
        player.setUser(user);
        player.setName(user.getUserName());
        model.addAttribute("player", player);
        return "home";
    }
    @GetMapping("/add")
    public String next(Model model, @AuthenticationPrincipal UserDetails currentUser)
    {
        Player player = new Player();
        User user = userRepository.findByUserName(currentUser.getUsername());
        player.setUser(user);
        player.setName(user.getUserName());
        model.addAttribute("player", player);
      return "game-board";
    }
   /*  @PostMapping("/add")
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
    }*/
}
