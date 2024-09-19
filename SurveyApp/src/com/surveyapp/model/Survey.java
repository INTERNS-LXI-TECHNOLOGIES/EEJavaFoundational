package com.surveyapp.model;
import java.util.List;



public class Survey {
    private Engineer engineer;
    private List<String> skillGap;

    public Survey(Engineer engineer,List<String>  skillGap) {
        this.engineer = engineer;
        this.skillGap = skillGap;
    }

    // Getters and Setters
    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public List<String>  getSkillGap() {
        return skillGap;
    }

    public void setSkillGap(List<String> skillGap) {
        this.skillGap = skillGap;
    }

    
    /*public String toString() {
        return "Survey :"+
        "Engineer: "+engineer.getEngineerName()+
        "  SkillGaps: "+getSkillGap();
    }*/
}
