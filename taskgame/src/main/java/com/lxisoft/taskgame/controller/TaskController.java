package com.lxisoft.taskgame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lxisoft.taskgame.model.Cell;
import com.lxisoft.taskgame.model.Player;
import com.lxisoft.taskgame.model.QuestionBank;
import com.lxisoft.taskgame.model.User;
import com.lxisoft.taskgame.service.CellService;
import com.lxisoft.taskgame.service.PlayerService;
import com.lxisoft.taskgame.service.QuestionBankService;
import com.lxisoft.taskgame.service.UserService;

@Controller
public class TaskController {

    @Autowired
    private QuestionBankService qbService;

    @Autowired
    private CellService cellService;

    @Autowired
    private UserService userService;

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public String getIndex(){
        System.out.println("this is index");
        return "index";
    }
    
    @GetMapping("/login")
    public String getLoginPage(){
        System.out.println("enterd into login page");
        return "login";
    }

    @GetMapping("/signup")
    public String getSignUpPage(){
        System.out.println("this is signup page");
        return "signup";
    }

    @PostMapping("/addUser")
    public String addingNewUser(){
        System.out.println("adding new user");
        System.out.println("USER ADDED");
        return "index";
    }
    
    @GetMapping("/gethome")
    public String getHome(Model model){
        Cell[][] cells = cellService.generateCells();
        System.out.println("This is home");
        //System.out.println("##### Cell Id"+cells[0][0].getId());
        model.addAttribute("cells",cells);
        System.out.println("This is home 2");
        return "home";
    }

    @GetMapping("/addproject")
    public String getAddProject(Model model){
        System.out.println("entered add project");
        QuestionBank qb = new QuestionBank();
        model.addAttribute("qb",qb);
        return "addproject";
    }

    @PostMapping("/addNewProject")
    public String addNewProject(@ModelAttribute QuestionBank qb){
        qbService.addNewQuestion(qb);
        return "home"; 
    }
    
}
