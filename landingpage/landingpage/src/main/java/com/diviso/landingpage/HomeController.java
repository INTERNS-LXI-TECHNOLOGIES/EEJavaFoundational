package com.diviso.landingpage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${landingpage.name}")
    private String name;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
