package com.lxisoft.internsassist.repository;

import com.lxisoft.internsassist.model.PlayerReview;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerReviewRepository extends JpaRepository<PlayerReview, Long> {
    // Custom queries if needed

    PlayerReview findByName(String name);
}
