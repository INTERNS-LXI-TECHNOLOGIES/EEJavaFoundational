package com.diviso.interns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.diviso.interns.entity.Cell;
import com.diviso.interns.entity.Question;
import com.diviso.interns.repo.CellRepository;
import com.diviso.interns.repo.QuestionRepository;

//@Component
public class DataSeeder implements CommandLineRunner {

    private final CellRepository cellRepository;
    private final QuestionRepository questionRepository;

    public DataSeeder(CellRepository cellRepository, QuestionRepository questionRepository) {
        this.cellRepository = cellRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Cell 1
        Cell cell1 = new Cell();
        cell1.setName("Cell 1");
        cellRepository.save(cell1);

        Question q1 = new Question();
        q1.setCell(cell1);
        q1.setTrueFalseQuestion("Java is platform-independent.");
        questionRepository.save(q1);

        Question q2 = new Question();
        q2.setCell(cell1);
        q2.setOptionsQuestion(
                "Which of these is not a feature of Java? (a) Object-oriented (b) Multithreaded (c) Compiled (d) Cross-platform");
        questionRepository.save(q2);

        // Cell 2
        Cell cell2 = new Cell();
        cell2.setName("Cell 2");
        cellRepository.save(cell2);

        Question q3 = new Question();
        q3.setCell(cell2);
        q3.setTrueFalseQuestion("The default value of an int variable in Java is 0.");
        questionRepository.save(q3);

        Question q4 = new Question();
        q4.setCell(cell2);
        q4.setOptionsQuestion(
                "Which one of these is not a valid keyword in Java? (a) void (b) public (c) static (d) intialize");
        questionRepository.save(q4);

        // Continue with similar structure for more cells...

        // Cell 3
        Cell cell3 = new Cell();
        cell3.setName("Cell 3");
        cellRepository.save(cell3);

        Question q5 = new Question();
        q5.setCell(cell3);
        q5.setTrueFalseQuestion("In Java, 'this' keyword refers to the current object.");
        questionRepository.save(q5);

        Question q6 = new Question();
        q6.setCell(cell3);
        q6.setOptionsQuestion(
                "Which of the following is a type of polymorphism in Java? (a) Compile-time (b) Run-time (c) Both (d) None");
        questionRepository.save(q6);

        // Cell 4
        Cell cell4 = new Cell();
        cell4.setName("Cell 4");
        cellRepository.save(cell4);

        Question q7 = new Question();
        q7.setCell(cell4);
        q7.setTrueFalseQuestion("In Java, strings are immutable.");
        questionRepository.save(q7);

        Question q8 = new Question();
        q8.setCell(cell4);
        q8.setOptionsQuestion("Which of the following is not a Java data type? (a) int (b) float (c) double (d) real");
        questionRepository.save(q8);

        // Cell 5
        Cell cell5 = new Cell();
        cell5.setName("Cell 5");
        cellRepository.save(cell5);

        Question q9 = new Question();
        q9.setCell(cell5);
        q9.setTrueFalseQuestion("Java supports operator overloading.");
        questionRepository.save(q9);

        Question q10 = new Question();
        q10.setCell(cell5);
        q10.setOptionsQuestion(
                "Which of the following loops is not available in Java? (a) for (b) while (c) do-while (d) repeat-until");
        questionRepository.save(q10);

        // Cell 6 to Cell 100 (Continue the pattern...)

        // Example for additional cells:

        // Cell 6
        Cell cell6 = new Cell();
        cell6.setName("Cell 6");
        cellRepository.save(cell6);

        Question q11 = new Question();
        q11.setCell(cell6);
        q11.setTrueFalseQuestion("In Java, an abstract class can have a constructor.");
        questionRepository.save(q11);

        Question q12 = new Question();
        q12.setCell(cell6);
        q12.setOptionsQuestion(
                "Which of the following is not a valid access modifier in Java? (a) private (b) protected (c) friendly (d) public");
        questionRepository.save(q12);

        // Cell 7
        Cell cell7 = new Cell();
        cell7.setName("Cell 7");
        cellRepository.save(cell7);

        Question q13 = new Question();
        q13.setCell(cell7);
        q13.setTrueFalseQuestion("Java does not support unsigned integers.");
        questionRepository.save(q13);

        Question q14 = new Question();
        q14.setCell(cell7);
        q14.setOptionsQuestion(
                "Which of the following methods is used to start a thread in Java? (a) start() (b) run() (c) init() (d) execute()");
        questionRepository.save(q14);

        // Cell 8
        Cell cell8 = new Cell();
        cell8.setName("Cell 8");
        cellRepository.save(cell8);

        Question q15 = new Question();
        q15.setCell(cell8);
        q15.setTrueFalseQuestion("Java uses pass-by-value for primitive data types.");
        questionRepository.save(q15);

        Question q16 = new Question();
        q16.setCell(cell8);
        q16.setOptionsQuestion(
                "Which of the following classes in Java can be used to handle exceptions? (a) Error (b) Exception (c) Throwable (d) All of the above");
        questionRepository.save(q16);

        // Cell 9
        Cell cell9 = new Cell();
        cell9.setName("Cell 9");
        cellRepository.save(cell9);

        Question q17 = new Question();
        q17.setCell(cell9);
        q17.setTrueFalseQuestion(
                "In Java, the 'volatile' keyword guarantees visibility of changes to variables across threads.");
        questionRepository.save(q17);

        Question q18 = new Question();
        q18.setCell(cell9);
        q18.setOptionsQuestion(
                "Which of these cannot be used for a variable name in Java? (a) $variable (b) _variable (c) variable$ (d) 1variable");
        questionRepository.save(q18);

        // Cell 10
        Cell cell10 = new Cell();
        cell10.setName("Cell 10");
        cellRepository.save(cell10);

        Question q19 = new Question();
        q19.setCell(cell10);
        q19.setTrueFalseQuestion(
                "The keyword 'instanceof' can be used to test whether an object is an instance of a specified type.");
        questionRepository.save(q19);

        Question q20 = new Question();
        q20.setCell(cell10);
        q20.setOptionsQuestion(
                "Which of the following is not a feature of the Java programming language? (a) Multithreaded (b) Architecture-neutral (c) Distributed (d) Procedural");
        questionRepository.save(q20);

        // Continue this pattern up to Cell 100...
        // Ensure each cell and question is unique.
    }
}
