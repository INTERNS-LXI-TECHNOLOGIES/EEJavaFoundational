package com.diviso.contactapp.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home() {
        logger.info("sayHello() method is called");
        return "home";
    }

    @GetMapping("/logout")
    public String logout() {
        // Implement logout logic here
        logger.info("sayHello() method is called");
        return "redirect:/login";
    }
}
