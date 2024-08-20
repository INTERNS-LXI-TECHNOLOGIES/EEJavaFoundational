package com.diviso.interns.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.diviso.interns.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Custom query methods to retrieve questions based on the type and cellId

    List<Question> findByCellIdAndTrueFalseQuestionIsNotNull(Long cellId);

    List<Question> findByCellIdAndOptionsQuestionIsNotNull(Long cellId);

    List<Question> findByCellId(Long cellId);
}
