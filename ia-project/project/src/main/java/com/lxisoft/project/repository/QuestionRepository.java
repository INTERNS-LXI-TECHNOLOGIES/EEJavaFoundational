package com.lxisoft.project.repository;

import com.lxisoft.project.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCellId(Long cellId);
}
