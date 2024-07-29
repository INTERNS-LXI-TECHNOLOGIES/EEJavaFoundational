package com.lxisoft.internsassist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cell_id")
    private Cell cell;
    private String trueFalseQuestion;
    private String optionsQuestion;
    private String text;
    private String correctAnswer;
    private String type;


    public Question(String text, String correctAnswer, String type) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Question() {

    }




    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public String getTrueFalseQuestion() {
        return trueFalseQuestion;
    }

    public void setTrueFalseQuestion(String trueFalseQuestion) {
        this.trueFalseQuestion = trueFalseQuestion;
    }

    public String getOptionsQuestion() {
        return optionsQuestion;
    }

    public void setOptionsQuestion(String optionsQuestion) {
        this.optionsQuestion = optionsQuestion;
    }
}
