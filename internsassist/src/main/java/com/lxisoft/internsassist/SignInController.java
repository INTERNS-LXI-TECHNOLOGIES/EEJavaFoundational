package com.lxisoft.internsassist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    
    @GetMapping("/sign_in")
    public String showSignForm() {
        return "login";
    }
}
