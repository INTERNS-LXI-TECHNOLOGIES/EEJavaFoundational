package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class GameControllerr {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private BooleanQuestionService bquestionService;

    private List<Question> questions;
    private List<BooleanQuestion> booleanQuestions;

    private Random random = new Random();

    @GetMapping("/questions")
    public String getQuestions(@RequestParam("cellNumber") int cellNumber, Model model) {
        questions = questionService.getAllQuestion();
        List<Question> randomQuestions = getRandomQuestions(questions, 3);

        model.addAttribute("cellNumber", cellNumber);
        model.addAttribute("questions", randomQuestions);
        return "questions";
    }

    private List<Question> getRandomQuestions(List<Question> questions, int numberOfQuestions) {
        List<Question> randomQuestions = new ArrayList<>();
        List<Integer> usedIndexes = new ArrayList<>();

        while (randomQuestions.size() < numberOfQuestions) {
            int index = random.nextInt(questions.size());
            if (!usedIndexes.contains(index)) {
                randomQuestions.add(questions.get(index));
                usedIndexes.add(index);
            }
        }
        return randomQuestions;
    }

    @PostMapping("/checkAnswer")
    public String checkAnswer(@RequestParam List<String> userAnswers, @RequestParam List<String> correctAnswers, Model model) {
        boolean allCorrect = true;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (!userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                allCorrect = false;
                break;
            }
        }

        if (allCorrect) {
            int randomIndex = random.nextInt(correctAnswers.size());
            Question finalQuestion = questions.get(randomIndex);
            model.addAttribute("finalQuestion", finalQuestion);
            return "randomQuestion";
        } else {
            model.addAttribute("result", "Some answers were wrong! Try again.");
            return "result";
        }
    }

    @PostMapping("/checkFinalAnswer")
    public String checkFinalAnswer(@RequestParam String userAnswer, @RequestParam String correctAnswer, Model model) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            model.addAttribute("result", "Correct! You can proceed to the next cell.");
        } else {
            model.addAttribute("result", "Wrong answer! Try again.");
        }
        return "result";
    }
}
