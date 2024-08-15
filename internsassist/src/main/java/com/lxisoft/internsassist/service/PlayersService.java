package com.lxisoft.internsassist.service;

import com.lxisoft.internsassist.repository.PlayerRepository;
import com.lxisoft.internsassist.repository.QuestionRepository;
import com.lxisoft.internsassist.model.Player;
import com.lxisoft.internsassist.model.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private PlayerRepository playersRepository;

    public Player findById(Long id) {
        return playersRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public List<Player> getAllPlayers() {
        return playersRepository.findAll();
    }

    public Player savePlayer(Player player) {
        return playersRepository.save(player);
    }


    public void assignQuestionsToPlayer(Player player, List<Question> questions) {
        // Fetch the player from the database using the User object
        Player existingPlayer = playersRepository.findByUser(player.getUser());

        // Add the list of questions to the player's question list
        existingPlayer.getQuestions().addAll(questions);

        // Save the updated player back to the database
        playersRepository.save(existingPlayer);
    }
}
