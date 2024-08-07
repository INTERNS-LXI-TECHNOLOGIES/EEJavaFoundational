package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class GameControllerr {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private PlayerReviewRepository playerReviewRepository;

    private Random random = new Random();

    @GetMapping("/questions")
    public String getQuestions(@RequestParam("cellNumber") int cellNumber, HttpSession session, Model model) {
        List<Question> questions = questionService.getAllQuestion();
        List<Question> firstTenQuestions = questions.subList(0, Math.min(10, questions.size()));
        List<Question> secondTenQuestions = questions.subList(10, Math.min(20, questions.size()));
        List<Question> remainingQuestions = questions.subList(Math.min(20, questions.size()), questions.size());

        List<Question> questionsForCell = (List<Question>) session.getAttribute("questionsForCell");

        if (questionsForCell == null || (int) session.getAttribute("cellNumber") != cellNumber) {
            if (cellNumber <= 10) {
                questionsForCell = getRandomQuestions(firstTenQuestions, 3);
            } else if (cellNumber <= 20) {
                questionsForCell = getRandomQuestions(secondTenQuestions, 3);
            } else if (cellNumber <= 100) {
                questionsForCell = List.of(remainingQuestions.get(cellNumber - 21));
            }
            session.setAttribute("questionsForCell", questionsForCell);
            session.setAttribute("cellNumber", cellNumber);
        }

        model.addAttribute("cellNumber", cellNumber);
        model.addAttribute("questions", questionsForCell);
        model.addAttribute("results", null);
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
    public String checkAnswer(@RequestParam List<String> userAnswers, HttpSession session, @RequestParam List<String> correctAnswers, Model model) {
        List<Boolean> results = new ArrayList<>();
        boolean allCorrect = true;

        for (int i = 0; i < userAnswers.size(); i++) {
            boolean correct = userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i));
            results.add(correct);
            if (!correct) {
                allCorrect = false;
            }
        }

        model.addAttribute("results", results);
        model.addAttribute("allCorrect", allCorrect);
        model.addAttribute("cellNumber", session.getAttribute("cellNumber"));
        model.addAttribute("questions", session.getAttribute("questionsForCell"));

        return "questionend";
    }

    @PostMapping("/checkAnswerend")
    public String checkAnswerr(@RequestParam List<String> userAnswers, HttpSession session, @RequestParam List<String> correctAnswers, Model model) {
        boolean allCorrect = true;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (!userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                allCorrect = false;
                break;
            }
        }

        if (allCorrect) {
            List<Question> questions = (List<Question>) session.getAttribute("questionsForCell");
            int randomIndex = random.nextInt(questions.size());
            Question finalQuestion = questions.get(randomIndex);

            model.addAttribute("cellNumber", session.getAttribute("cellNumber"));
            model.addAttribute("finalQuestion", finalQuestion);
            return "randomQuestion";
        } else {
            model.addAttribute("result", "Some answers were wrong! Try again.");
            return "error";
        }
    }


    @PostMapping("/checkFinalAnswer")
    public String checkFinalAnswer(@RequestParam String userAnswer, @RequestParam String correctAnswer, @RequestParam int cellNumber, Model model, Principal principal) {
        String name = principal.getName();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            model.addAttribute("result", "Correct! You can proceed to the next cell.");
            PlayerReview player = new PlayerReview();
            player.setName(name);
            player.setCurrentCell(cellNumber);
            playerReviewRepository.save(player);

            return "result";
        } else {
            model.addAttribute("result", "Wrong answer! Try again.");
        }
        return "error";
    }
}
