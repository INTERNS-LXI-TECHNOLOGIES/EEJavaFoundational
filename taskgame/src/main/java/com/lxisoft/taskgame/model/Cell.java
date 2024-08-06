package com.lxisoft.taskgame.model;

import java.util.List;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cell {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="cell")
    private List <Player> players;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="qb_id")
    private QuestionBank qb;

    public QuestionBank getQb() {
        return qb;
    }

    public void setQb(QuestionBank qb) {
        this.qb = qb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object obj) {
        Cell cell = (Cell)obj;
        if(this.getId().equals(cell.getId())){
            return true;
        }
        else{
            return false;
        }
    }

}
