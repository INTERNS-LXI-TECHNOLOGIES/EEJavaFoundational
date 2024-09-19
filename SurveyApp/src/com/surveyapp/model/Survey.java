package com.surveyapp.model;

import java.util.List;

public class Survey {
    private Engineer engineer;
    private List<String> skillGaps;

    public Survey(Engineer engineer, List<String> skillGaps) {
        this.engineer = engineer;
        this.skillGaps = skillGaps;
    }

    // Getters and Setters
    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public List<String> getSkillGaps() {
        return skillGaps;
    }

    public void setSkillGaps(List<String> skillGaps) {
        this.skillGaps = skillGaps;
    }

    @Override
    public String toString() {
		String skill = "";
		for(int i=0; i<skillGaps.size();i++)
		{
			skill+=skillGaps.get(i)+" ";
		}
		return "Name of Engineer: " + engineer.getName() + " , Skill Gap: " + skill;
    }
}
