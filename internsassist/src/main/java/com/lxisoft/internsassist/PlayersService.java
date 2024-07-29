package com.lxisoft.internsassist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersService {

    @Autowired
    private PlayerRepository playersRepository;

    public List<Player> getAllPlayers() {
        return playersRepository.findAll();
    }

    public Player savePlayer(Player player) {
        return playersRepository.save(player);
    }
}
