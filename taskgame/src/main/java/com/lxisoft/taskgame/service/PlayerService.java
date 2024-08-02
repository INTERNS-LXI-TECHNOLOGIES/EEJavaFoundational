package com.lxisoft.taskgame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.taskgame.model.Player;
import com.lxisoft.taskgame.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;



}
