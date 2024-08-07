package com.lxisoft.hungergame;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private GameService gameService ;
    
    @Autowired
    private QuestionBankSevice questionBankService ;
    
    @GetMapping("/admin/internsDetails")
    public String getInternsDetails(Model model) {

        List<Player> player = gameService.getInterns();
        model.addAttribute("players",player);
        return "InternsDetails";
    }

    @GetMapping("/admin/addMultipleChoice")
    public String multipleChoice() {
        return "addMultipleChoice";
    }

    @PostMapping("/addMultipleChoice")
    public String addMultipleChoice(@ModelAttribute MultipleChoiceQuestion question) {
        questionBankService.addMultipleChoice(question);
        return "adminHome";
    }

    @GetMapping("/admin/addTrueOrFalse")
    public String trueOrFalse() {
        return "addTrueOrFalse";
    }

    @PostMapping("/addTrueOrFalse")
    public String addTrueOrFalse(@ModelAttribute TrueOrFalse question)
    {
        questionBankService.addTrueOrFalse(question);
        return "adminHome" ;
    }
    
}
