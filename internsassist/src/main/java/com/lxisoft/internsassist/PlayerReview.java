package com.lxisoft.internsassist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int currentCell;

    public boolean[] getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(boolean[] cellStatus) {
        this.cellStatus = cellStatus;
    }
    private boolean[] cellStatus; // Add this to track completion status of each cell
    
    public PlayerReview() {
        cellStatus = new boolean[100]; // Assuming 100 cells
        cellStatus[0] = true; // Unlock the first cell initially
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentCell() {
        return currentCell;
    }
    public void setCurrentCell(int currentCell) {
        this.currentCell = currentCell;
    }

    // Getters and Setters
}
