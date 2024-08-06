package com.lxisoft.taskgame.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.*;
import com.lxisoft.taskgame.repository.CellRepository;
import com.lxisoft.taskgame.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    private CellRepository cellRepository;

    public void addPlayer(User user){
        Player player = new Player();
        Optional <Cell> optionalCell = cellRepository.findById((long)1);
        if(optionalCell.isPresent()){
            player.setCell(optionalCell.get());
        }
        else{
            System.out.println("error: cell not found");
        }
        player.setUser(user);
        playerRepository.save(player);
    }

}
