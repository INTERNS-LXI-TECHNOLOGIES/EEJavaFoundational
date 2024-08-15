package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.service.QuestionService;
import com.lxisoft.internsassist.repository.PlayerReviewRepository;
import com.lxisoft.internsassist.repository.UserRepository;
import com.lxisoft.internsassist.model.Question;
import com.lxisoft.internsassist.model.PlayerReview;

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
import java.util.stream.Collectors;

@Controller
public class GameControllerr {
    @Autowired
    private QuestionService questionService;

    @Autowired
    private PlayerReviewRepository playerReviewRepository;

    private Random random = new Random();

    @GetMapping("/questions")
    public String getQuestions(@RequestParam("cellNumber") int cellNumber, HttpSession session, Model model) {
        List<Question> allQuestions = questionService.getAllQuestion();

        // Filter questions by type
        List<Question> oneWordQuestions = allQuestions.stream()
                .filter(q -> "one_word".equals(q.getType()))
                .collect(Collectors.toList());

        List<Question> multipleChoiceQuestions = allQuestions.stream()
                .filter(q -> "multiple_choice".equals(q.getType()))
                .collect(Collectors.toList());

        List<Question> trueFalseQuestions = allQuestions.stream()
                .filter(q -> "true_false".equals(q.getType()))
                .collect(Collectors.toList());

        // Get a random question of each type
        Question randomOneWordQuestion = getRandomQuestion(oneWordQuestions);
        Question randomMultipleChoiceQuestion = getRandomQuestion(multipleChoiceQuestions);
        Question randomTrueFalseQuestion = getRandomQuestion(trueFalseQuestions);

        // Set attributes for the Thymeleaf page
        model.addAttribute("cellNumber", cellNumber);
        model.addAttribute("oneWordQuestion", randomOneWordQuestion);
        model.addAttribute("multipleChoiceQuestion", randomMultipleChoiceQuestion);
        model.addAttribute("trueFalseQuestion", randomTrueFalseQuestion);
        

        // Optionally set the questions in the session if needed
        session.setAttribute("lowerPartLocked", true);
        session.setAttribute("cellNumber", cellNumber);
        session.setAttribute("oneWordQuestion", randomOneWordQuestion);
        session.setAttribute("multipleChoiceQuestion", randomMultipleChoiceQuestion);
        session.setAttribute("trueFalseQuestion", randomTrueFalseQuestion);
        session.setAttribute("allQuestions", allQuestions);

        List<Question> questions = (List<Question>) session.getAttribute("allQuestions");

        // Select a random question from the list
        int randomIndex = new Random().nextInt(questions.size());
        Question finalQuestion = questions.get(randomIndex);

        // Separate the question based on its type
        String questionType = finalQuestion.getType();
        model.addAttribute("cellNumber", session.getAttribute("cellNumber"));

        if ("multiple_choice".equals(questionType)) {
            model.addAttribute("mcqQuestion", finalQuestion);
            System.out.println("11111111111111111");
        } else if ("true_false".equals(questionType)) {
            model.addAttribute("booleanQuestion", finalQuestion);
            System.out.println("2222222222222222222222");
        } else if ("one_word".equals(questionType)) {
            model.addAttribute("textQuestion", finalQuestion);
            System.out.println("3333333333333333333333");
        }

        // This is the Thymeleaf template to render

        return "questions";
    }

    private Question getRandomQuestion(List<Question> questions) {
        if (questions.isEmpty()) {
            return null; // Handle case with no questions
        }
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    @PostMapping("/checkAnswer")
    public String checkAnswer(
            @RequestParam(required = false) String userAnswerOneWord,
            @RequestParam(required = false) String correctAnswerOneWord,
            @RequestParam(required = false) String userAnswerTrueFalse,
            @RequestParam(required = false) String correctAnswerTrueFalse,
            @RequestParam(required = false) String userAnswerMultipleChoice,
            @RequestParam(required = false) String correctAnswerMultipleChoice,
            HttpSession session, Model model) {
    
        boolean allCorrect = true;
    
        // Check one-word question
        if (userAnswerOneWord != null && correctAnswerOneWord != null) {
            boolean oneWordCorrect = userAnswerOneWord.equalsIgnoreCase(correctAnswerOneWord);
            model.addAttribute("oneWordCorrect", oneWordCorrect);
            allCorrect = allCorrect && oneWordCorrect;
            session.setAttribute("userAnswerOneWord", userAnswerOneWord);
        }
    
        // Check true/false question
        if (userAnswerTrueFalse != null && correctAnswerTrueFalse != null) {
            boolean trueFalseCorrect = userAnswerTrueFalse.equalsIgnoreCase(correctAnswerTrueFalse);
            model.addAttribute("trueFalseCorrect", trueFalseCorrect);
            allCorrect = allCorrect && trueFalseCorrect;
            session.setAttribute("userAnswerTrueFalse", userAnswerTrueFalse);
        }
    
        // Check multiple-choice question
        if (userAnswerMultipleChoice != null && correctAnswerMultipleChoice != null) {
            boolean multipleChoiceCorrect = userAnswerMultipleChoice.equalsIgnoreCase(correctAnswerMultipleChoice);
            model.addAttribute("multipleChoiceCorrect", multipleChoiceCorrect);
            allCorrect = allCorrect && multipleChoiceCorrect;
            session.setAttribute("userAnswerMultipleChoice", userAnswerMultipleChoice);
        }
    
        // If all answers are correct, unlock the lower part
        if (allCorrect) {
            session.setAttribute("lowerPartLocked", true);
        }
    
        // Add old questions and answers back to the model to retain the data
        model.addAttribute("userAnswerOneWord", session.getAttribute("userAnswerOneWord"));
        model.addAttribute("correctAnswerOneWord", correctAnswerOneWord);
        model.addAttribute("userAnswerTrueFalse", session.getAttribute("userAnswerTrueFalse"));
        model.addAttribute("correctAnswerTrueFalse", correctAnswerTrueFalse);
        model.addAttribute("userAnswerMultipleChoice", session.getAttribute("userAnswerMultipleChoice"));
        model.addAttribute("correctAnswerMultipleChoice", correctAnswerMultipleChoice);
    
        return "last";
    }
    
    
    
    @PostMapping("/checkAnswerend")
    public String checkAnswerr(@RequestParam List<String> userAnswers, HttpSession session,
            @RequestParam List<String> correctAnswers, Model model) {
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
    public String checkFinalAnswer(@RequestParam String userAnswer, @RequestParam String correctAnswer,
            @RequestParam int cellNumber, Model model, Principal principal) {

        String name = principal.getName();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            model.addAttribute("result", "Correct! You can proceed to the next cell.");

            // Save player progress
            PlayerReview player = new PlayerReview();
            player.setName(name);
            player.setCurrentCell(cellNumber);
            playerReviewRepository.save(player);

            return "result"; // Assuming this is the page showing the result of the final question
        } else {
            model.addAttribute("result", "Wrong answer! Try again.");
            return "error"; // This should point to an error
        }
    }

}
