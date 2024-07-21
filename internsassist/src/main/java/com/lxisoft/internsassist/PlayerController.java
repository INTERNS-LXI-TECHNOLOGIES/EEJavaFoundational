package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
public class PlayerController {
    
    @Autowired
    private PlayersService playersService;
    

    @GetMapping("/home")
    public String showAddPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "home";
    }
    
    @PostMapping("/add")
    public String addPlayer(@ModelAttribute("player") @Validated  Player player, BindingResult result) {
      
        playersService.savePlayer(player);
        return "game-board";
    }
}
