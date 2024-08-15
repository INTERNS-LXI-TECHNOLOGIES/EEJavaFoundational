package com.lxisoft.internsassist.repository;

import com.lxisoft.internsassist.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findByCell_CellNumber(int cellNumber);
}
