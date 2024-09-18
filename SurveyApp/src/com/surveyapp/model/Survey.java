package com.surveyapp.model;

import java.util.*;

public class Survey {
    private Engineer engineer;
    private List <String> skillGap;

    public Survey(Engineer engineer, List<String> skillGap) {
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

    public List<String> getSkillGap() {
        return skillGap;
    }

    public void setSkillGap(List<String> skillGap) {
        this.skillGap = skillGap;
    }

    @Override
    public String toString() {
		String skillGaps="";
		for(String s:skillGap){
			skillGaps += skillGaps+"\n";
		}
        return "Engineer: " + engineer.getEngineerName() + ", Skill Gap: " + skillGap;
    }
}
