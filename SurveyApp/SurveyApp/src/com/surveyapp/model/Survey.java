package com.surveyapp.model;


public class Survey {
    private Engineer engineer  = new Engineer();


    // Getters and Setters

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }


    

    @Override
    public String toString() {
        return "Engineer Name: " + engineer.getName() + ", Skill Gap: " + engineer.getSkillGap();
    }

}
