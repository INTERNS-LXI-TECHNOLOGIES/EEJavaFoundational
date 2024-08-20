package com.diviso.interns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("home/home")
    public String showHomePage() {
        System.out.println("home");
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String getHome()
    {
        System.out.println("home2");
        return "home";
    }
}
