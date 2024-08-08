package com.lxisoft.project.model;

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
