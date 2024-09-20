package com.surveyapp.model;

import java.util.*;

public class Engineer{
	private String engineerName;
    private List<String> skillgap = new ArrayList<String>();

    /*public Engineer(String engineerName, List<String> skillgap) {
        this.engineerName = engineerName;
        this.skillgap = skillgap;
    }*/

    // Getters and Setters
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public List<String> getSkillgap() {
        return skillgap;
    }

    public void setSkillgap(List<String> skillgap) {
        this.skillgap = skillgap;
    }

    @Override
    public String toString() {
        return "Engineer: " + engineerName + ", Skill Gap: " + skillgap;
    }

}