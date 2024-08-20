package com.diviso.interns.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diviso.interns.entity.Player;
import com.diviso.interns.entity.Role;

public interface PlayerRepository extends JpaRepository<Player, Long> {
     Role findByName(String name);
    // Custom queries if needed
}
