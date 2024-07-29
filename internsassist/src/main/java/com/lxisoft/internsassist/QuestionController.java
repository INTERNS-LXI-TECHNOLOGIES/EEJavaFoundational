package com.lxisoft.internsassist;

import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/{cellNumber}")
    public ResponseEntity<Question> getQuestion(@PathVariable int cellNumber) {
        return questionService.getQuestionByCellNumber(cellNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/assign-question")
    public String showAssignQuestionForm(Model model) {
        model.addAttribute("question", new Question());
        return "assignquestion";
    }

    @PostMapping("/assign-question")
    public String assignQuestion(@RequestParam String questionText, @RequestParam String correctAnswer) {
        Question question = new Question();
        question.setText(questionText);
        question.setCorrectAnswer(correctAnswer);
        questionService.saveQuestion(question);
        return "redirect:/assign-question?success";
    }
    
}
