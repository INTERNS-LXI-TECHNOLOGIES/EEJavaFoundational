package com.diviso.interns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.interns.entity.Cell;
import com.diviso.interns.entity.Question;
import com.diviso.interns.service.CellService;
import com.diviso.interns.service.QuestionService;

@Controller
public class GameController {

    @Autowired
    private CellService cellService;

    @Autowired
    private QuestionService questionService;

    /*
     * @PostMapping("/question")
     * public String addQuestion(@RequestBody Question question) {
     * questionService.saveQuestion(question);
     * System.out.println("Question saved: " + question);
     * return "questions";
     * }
     */

    @GetMapping("/game")
    public String showGame(Model model) {
        // Retrieve all cells and add to the model
        List<Cell> cells = cellService.getAllCellsWithQuestions();
        model.addAttribute("cells", cells);
        return "game"; // This corresponds to game.html
    }

    @GetMapping("/questions")
    public String questions(Model model) {
        // Add cellId to the model to pass it to the next page
        List<Cell> cell = cellService.getAllCellsWithQuestions();
        System.out.println("Question saved: ");
        model.addAttribute("cellId", cell);
        return "questions";
    }

    @GetMapping("/questions/multiple-choice/{id}")
    public String multipleChoiceQuestions(@PathVariable Long id, @RequestParam(required = false) Long cellId,
            Model model) {
        // Logic to retrieve multiple choice questions based on cellId
        List<Question> multipleChoiceQuestions = questionService.findMultipleChoiceQuestionsByCellId(cellId);

        // Add questions to the model if needed
        System.out.println("Question saved:123 ");
        model.addAttribute("questions", multipleChoiceQuestions);
        return "game";
    }

    @GetMapping("/questions/true-false")
    public String trueFalseQuestions(@RequestParam("cellId") Long cellId, Model model) {
        // Logic to retrieve true/false questions based on cellId
        List<Question> trueFalseQuestions = questionService.findTrueFalseQuestionsByCellId(cellId);

        // Add questions to the model if needed
        model.addAttribute("questions", trueFalseQuestions);
        return "trueFalseQuestions";
    }

    @GetMapping("/questions/real-test")
    public String realTest(@RequestParam("cellId") Long cellId, Model model) {
        // Logic for real test based on cellId
        List<Question> realTestQuestions = questionService.findRealTestQuestionsByCellId(cellId);

        // Add questions to the model if needed
        model.addAttribute("questions", realTestQuestions);
        return "realTest";
    }

}
