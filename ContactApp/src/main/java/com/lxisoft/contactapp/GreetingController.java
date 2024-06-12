package com.lxisoft.contactapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @Value("${hai}")
    private String haii;

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", greetingMessage);
        model.addAttribute("messagee", haii);
        return "hello";
    }
}


