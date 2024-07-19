package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/input")
    public String inputPage(Model model) {
        model.addAttribute("player", new Player());
        return "input";
    }

    @PostMapping("/submitName")
    public String submitName(Player player) {
        // Save the player name into the database
        playerRepository.save(player);
        return "redirect:/"; // Redirect to home page or another page as needed
    }
}
