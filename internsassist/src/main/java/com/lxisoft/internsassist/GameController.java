package com.lxisoft.internsassist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Random;

@Controller
public class GameController {

  /* private List<String> questions = List.of(
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "Who wrote 'To Kill a Mockingbird'?"
            // Add more questions here
    );

    @GetMapping("/random-question/{cellNum}")
    public String getRandomQuestion(@PathVariable int cellNum, Model model) {
        Random random = new Random();
        String randomQuestion = questions.get(random.nextInt(questions.size()));
        model.addAttribute("question", randomQuestion);
        return "question"; // Return the name of your question view
    }*/
}
