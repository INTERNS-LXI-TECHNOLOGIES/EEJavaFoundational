package com.lxisoft.hungergame;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;

    private String name ;

    private String email ;

    private String level ;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private User user ;

    @ManyToMany
    @JoinTable(
        name = "player_multiplechoice",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private Set<MultipleChoiceQuestion> multipleChoiceQuestions;

    @ManyToMany
    @JoinTable(
        name = "player_trueorfalse",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private Set<TrueOrFalse> trueOrFalses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public void setMultipleChoiceQuestions(Set<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

    public Set<TrueOrFalse> getTrueOrFalses() {
        return trueOrFalses;
    }

    public void setTrueOrFalses(Set<TrueOrFalse> trueOrFalses) {
        this.trueOrFalses = trueOrFalses;
    }

    
    
    
}