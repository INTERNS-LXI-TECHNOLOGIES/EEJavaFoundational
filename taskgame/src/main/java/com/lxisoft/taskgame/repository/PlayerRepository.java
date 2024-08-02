package com.lxisoft.taskgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.taskgame.model.Player;

public interface PlayerRepository extends JpaRepository <Player,Long>{

}
