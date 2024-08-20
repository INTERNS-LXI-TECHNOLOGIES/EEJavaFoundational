package com.diviso.interns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.interns.service.UserService;

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
}
