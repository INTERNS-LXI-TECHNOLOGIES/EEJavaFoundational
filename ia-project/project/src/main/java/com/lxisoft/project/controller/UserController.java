package com.lxisoft.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(){
        System.out.println("Ivdend User pagilu..");
        return "user";
    }

  
}
