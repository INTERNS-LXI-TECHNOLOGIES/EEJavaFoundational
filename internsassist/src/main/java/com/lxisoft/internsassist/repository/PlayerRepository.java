package com.lxisoft.internsassist.repository;

import com.lxisoft.internsassist.model.Player;
import com.lxisoft.internsassist.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findByUser(User user);  // Method should find Player by User object
}

