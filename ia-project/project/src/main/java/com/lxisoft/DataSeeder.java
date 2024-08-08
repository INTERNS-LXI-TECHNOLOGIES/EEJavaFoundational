package com.lxisoft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lxisoft.project.model.Cell;
import com.lxisoft.project.model.Question;
import com.lxisoft.project.repository.CellRepository;
import com.lxisoft.project.repository.QuestionRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CellRepository cellRepository;
    private final QuestionRepository questionRepository;

    public DataSeeder(CellRepository cellRepository, QuestionRepository questionRepository) {
        this.cellRepository = cellRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create Cells
        Cell cell1 = new Cell();
        cell1.setName("Cell 1");
        cellRepository.save(cell1);

        Cell cell2 = new Cell();
        cell2.setName("Cell 2");
        cellRepository.save(cell2);

        // Add questions to Cell 1
        Question q1 = new Question();
        q1.setCell(cell1);
        q1.setTrueFalseQuestion("Java is a statically typed language.");
        questionRepository.save(q1);

        Question q2 = new Question();
        q2.setCell(cell1);
        q2.setOptionsQuestion("Which of the following is not a primitive type in Java? (a) int (b) String (c) char (d) boolean");
        questionRepository.save(q2);

        // Add questions to Cell 2
        Question q3 = new Question();
        q3.setCell(cell2);
        q3.setTrueFalseQuestion("Java supports multiple inheritance through classes.");
        questionRepository.save(q3);

        Question q4 = new Question();
        q4.setCell(cell2);
        q4.setOptionsQuestion("Which keyword is used to define a method in Java? (a) func (b) method (c) def (d) public");
        questionRepository.save(q4);
    }
}
