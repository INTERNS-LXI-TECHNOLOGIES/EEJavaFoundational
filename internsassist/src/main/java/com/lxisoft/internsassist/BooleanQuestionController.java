package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooleanQuestionController
{

    @Autowired
    public BooleanQuestionService booleanQuestionService;

        @PostMapping("/assign-questions")
    public String assignQuestions(@RequestParam String questionText, @RequestParam String correctAnswer){
        BooleanQuestion q =new BooleanQuestion();
        q.setText(questionText);
        q.setCorrectAnswer(correctAnswer);
        booleanQuestionService.saveQuestion(q);
        return "redirect:/assign-question?success";

    }

}