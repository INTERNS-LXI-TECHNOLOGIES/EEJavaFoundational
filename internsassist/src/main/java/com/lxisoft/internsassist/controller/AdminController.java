package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

 

    @PostMapping("/admin/assignRole")
    public String assignRole(@RequestParam String username, @RequestParam String role, Model model) {
        try {
            userService.assignRole(username, role);
            model.addAttribute("message", "Role assigned successfully!");
        } catch (Exception e) {
            model.addAttribute("message", "Error assigning role: " + e.getMessage());
        }
        return "login";
    }

    @GetMapping("/adminhome")
    public String adminPage() {
        return "adminhome";
    }

    @GetMapping("/admin")
    public String adminPagee() {
        return "admin";
    }

    @GetMapping("/assignquestion")
    public String assignquestion() {
        return "assignquestion";
    }
}
