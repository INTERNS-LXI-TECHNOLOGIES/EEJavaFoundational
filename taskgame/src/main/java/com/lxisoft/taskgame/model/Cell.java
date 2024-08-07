package com.lxisoft.taskgame.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cell {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="cell")
    private List <Player> players;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="cell_qb",
        joinColumns=@JoinColumn(name="cell_id"),
        inverseJoinColumns=@JoinColumn(name="qb_id")
    )
    private Set<QuestionBank> qbSet;

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

    public Set<QuestionBank> getQbSet() {
        return qbSet;
    }

    public void setQbSet(Set<QuestionBank> qbSet) {
        this.qbSet = qbSet;
    }

}
