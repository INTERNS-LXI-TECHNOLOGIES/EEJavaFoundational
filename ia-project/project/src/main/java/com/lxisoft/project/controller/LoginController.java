package com.lxisoft.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        System.out.println("Nyan login pagilethitaa..");
        return "login"; 
    }
  

}