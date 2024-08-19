package com.lxisoft.chatjson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/load-questions")
    public String loadQuestions() {
        questionService.saveQuestionsFromJson();
        return "redirect:/next-page";
    }

    @GetMapping("/next-page")
    public String nextPage() {
        return "nextPage";
    }
}
