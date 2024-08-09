package com.lxisoft.internsassist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrueFalseQuestionRepository extends JpaRepository<TrueFalseQuestion, Long> {
    // You can define custom query methods here if needed
}
