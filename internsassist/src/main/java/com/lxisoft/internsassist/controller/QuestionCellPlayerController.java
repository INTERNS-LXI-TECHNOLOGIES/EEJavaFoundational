/*package com.lxisoft.internsassist.controller;

import com.lxisoft.internsassist.model.Player;
import com.lxisoft.internsassist.model.QuestionCellPlayer;
import com.lxisoft.internsassist.repository.QuestionRepository;
import com.lxisoft.internsassist.service.PlayersService;
import com.lxisoft.internsassist.service.QuestionCellPlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/questions")
public class QuestionCellPlayerController {

@Autowired
pQuestionRepository questionrepo;

    @Autowired
    private QuestionCellPlayerService questionCellPlayerService;

    @Autowired
    private PlayersService playerService;

    @PostMapping("/add")
    public QuestionCellPlayer addQuestionCellPlayer(
            @RequestParam Long playerId,
            @RequestParam String question,
            @RequestParam String text,
            @RequestParam String correctAnswer,
            @RequestParam String type,
            @RequestParam String options) {
        
        // Find the player by ID
        Player player = playerService.findById(playerId);

        // Create a new QuestionCellPlayer and populate its fields
        QuestionCellPlayer questionCellPlayer = new QuestionCellPlayer();
        questionCellPlayer.setName(player.getName());
        questionCellPlayer.setCell(player.getCurrentCell());
        questionCellPlayer.setQuestion(question);
        questionCellPlayer.setText(text);
        questionCellPlayer.setCorrectAnswer(correctAnswer);
        questionCellPlayer.setType(type);
        questionCellPlayer.setOptionss(options);

        // Save and return the new QuestionCellPlayer
        return questionCellPlayerService.save(questionCellPlayer);
    }
}
*/