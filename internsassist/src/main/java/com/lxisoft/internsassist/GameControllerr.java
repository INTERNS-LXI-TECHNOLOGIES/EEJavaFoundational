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
    private TrueFalseQuestionService trueFalseQuestionService;

    @Autowired
    private PlayerReviewRepository playerReviewRepository;

    private Random random = new Random();

    @GetMapping("/questions")
    public String getQuestions(@RequestParam("cellNumber") int cellNumber, HttpSession session, Model model) {
        List<Question> oneWordQuestions = questionService.getAllQuestion();
        List<TrueFalseQuestion> trueFalseQuestions = trueFalseQuestionService.getAllTrueFalseQuestions();

        Question oneWordQuestionForCell = null;
        TrueFalseQuestion trueFalseQuestionForCell = null;

        if (cellNumber <= 10) {
            oneWordQuestionForCell = getRandomOneQuestion(oneWordQuestions);
            trueFalseQuestionForCell = getRandomOneTrueFalseQuestion(trueFalseQuestions);
        } else if (cellNumber <= 20) {
            oneWordQuestionForCell = getRandomOneQuestion(oneWordQuestions);
            trueFalseQuestionForCell = getRandomOneTrueFalseQuestion(trueFalseQuestions);
        } else if (cellNumber <= 100) {
            oneWordQuestionForCell = oneWordQuestions.get(cellNumber - 21);
            trueFalseQuestionForCell = trueFalseQuestions.get(cellNumber - 21);
        }

        session.setAttribute("oneWordQuestionForCell", oneWordQuestionForCell);
        session.setAttribute("trueFalseQuestionForCell", trueFalseQuestionForCell);
        session.setAttribute("cellNumber", cellNumber);

        model.addAttribute("cellNumber", cellNumber);
        model.addAttribute("oneWordQuestion", oneWordQuestionForCell);
        model.addAttribute("trueFalseQuestion", trueFalseQuestionForCell);
        model.addAttribute("results", null);
        return "questions";
    }

    private Question getRandomOneQuestion(List<Question> questions) {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    private TrueFalseQuestion getRandomOneTrueFalseQuestion(List<TrueFalseQuestion> questions) {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    @PostMapping("/checkAnswer")
    public String checkAnswer(@RequestParam String userAnswerOneWord, 
                              @RequestParam String userAnswerTrueFalse, 
                              HttpSession session, 
                              Model model) {
        Question oneWordQuestion = (Question) session.getAttribute("oneWordQuestionForCell");
        TrueFalseQuestion trueFalseQuestion = (TrueFalseQuestion) session.getAttribute("trueFalseQuestionForCell");

        boolean oneWordCorrect = userAnswerOneWord.equalsIgnoreCase(oneWordQuestion.getCorrectAnswer());
        boolean trueFalseCorrect = Boolean.parseBoolean(userAnswerTrueFalse) == trueFalseQuestion.isCorrectAnswer();

        model.addAttribute("oneWordCorrect", oneWordCorrect);
        model.addAttribute("trueFalseCorrect", trueFalseCorrect);
        model.addAttribute("allCorrect", oneWordCorrect && trueFalseCorrect);
        model.addAttribute("cellNumber", session.getAttribute("cellNumber"));
        model.addAttribute("oneWordQuestion", oneWordQuestion);
        model.addAttribute("trueFalseQuestion", trueFalseQuestion);

        return oneWordCorrect && trueFalseCorrect ? "result" : "error";
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
