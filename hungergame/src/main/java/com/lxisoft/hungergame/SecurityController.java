package com.lxisoft.hungergame;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SecurityController {
    
    @Autowired
    private SecurityService securityService ;

    @Autowired
    private GameService gameService ;
    
    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
        public String signupPage() {
        return "signup"; 
    }

    @PostMapping("/signup-data")
    public String signupPage(@ModelAttribute User user) {
        user.setRoles(new HashSet<>());
        securityService.handleSignup(user);
        
        gameService.addPlayerName(user.getUsername());

        return "redirect:/home";
    }
    
    @GetMapping("hungergame/home")
    public String homePage() {
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String homePage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);

        boolean isAdmin = authentication.getAuthorities().stream().anyMatch(role -> role.getAuthority().equals("admin"));

        if(isAdmin)
        {
            return "adminhome";
        }
        else{
            return "userHome";
        }
    }
}
