package com.lxisoft.internsassist;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BooleanQuestionRepository extends JpaRepository<BooleanQuestion, Long> {
   // Optional<Question> findByCell_CellNumber(int cellNumber);
}
