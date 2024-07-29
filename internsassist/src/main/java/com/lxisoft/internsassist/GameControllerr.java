package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class GameControllerr {
   @Autowired
    private QuestionService questionService;

    List<Question> questions;

   /*  @GetMapping("/questions")
    private  String viewQuestion(Model model) {
    questions = questionService.getAllQuestion();
    model.addAttribute("questions", questions);
        return "viewQuestions";
    }*/
    private final Random random = new Random();

    @GetMapping("/questions")
    public String getQuestions(Model model) {
        questions = questionService.getAllQuestion();
        Question question = questions.get(random.nextInt(questions.size()));
        model.addAttribute("question", question);
        return "questions";
    }

    @PostMapping("/checkAnswer")
    public String checkAnswer(@RequestParam String userAnswer, @RequestParam String correctAnswer, Model model) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            model.addAttribute("result", "Correct! Next question:");
            return "result";
        } else {
            model.addAttribute("result", "Wrong answer! Try again.");
            return "result";
        }
    }

}
