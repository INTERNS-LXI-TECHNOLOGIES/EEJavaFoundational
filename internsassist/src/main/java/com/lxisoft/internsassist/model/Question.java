package com.lxisoft.internsassist.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    @ManyToOne
    @JoinColumn(name = "cell_id")
    private Cell cell;

    private String trueFalseQuestion;
    private String optionsQuestion;
    @Column(nullable = false)
    private String text;
    private String correctAnswer;
    @Column(nullable = false)
    private String type;

    @ElementCollection
    private List<String> options;

    private String optionss;
    private Boolean isTrue;

    @ManyToMany(mappedBy = "questions")
    private List<Player> players = new ArrayList<>();

    public Question(String text, String correctAnswer, String type) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.type = type;
    }


    public String getOptionss() {
        return optionss;
    }

    public void setOptionss(String optionss) {
        this.optionss = optionss;
    }

   

    public List<String> getOptions() {
        return Arrays.asList(optionss.split(","));
    }

    public Boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Boolean isTrue) {
        this.isTrue = isTrue;
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

    public void setOptions(List<String> options) {
        this.options = options;
    }

}
