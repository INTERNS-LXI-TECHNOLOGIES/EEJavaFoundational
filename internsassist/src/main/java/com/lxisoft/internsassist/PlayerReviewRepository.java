package com.lxisoft.internsassist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerReviewRepository extends JpaRepository<PlayerReview, Long> {
    // Custom queries if needed
}
