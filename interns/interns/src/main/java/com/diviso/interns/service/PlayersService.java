package com.diviso.interns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diviso.interns.entity.Player;
import com.diviso.interns.repo.PlayerRepository;
import com.diviso.interns.repo.UserRepository;

import java.util.List;

@Service
public class PlayersService {

    @Autowired
    private PlayerRepository playersRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Player> getAllPlayers() {
        return playersRepository.findAll();
    }

    public Player savePlayer(Player player) {
        return playersRepository.save(player);
    }
}
