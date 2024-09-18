package com.surveyapp.model;

import java.util.List;

public class Survey {
    private Engineer engineerName;
    private List<String> skillGap;

    public Survey(Engineer engineerName, List<String> skillGap) {
        this.engineerName = engineerName;
        this.skillGap = skillGap;
    }

    public Survey() {}

    // Getters and Setters
    public Engineer getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(Engineer engineerName) {
        this.engineerName = engineerName;
    }

    public List<String> getSkillGap() {
        return skillGap;
    }

    public void setSkillGap(List<String> skillGap) {
        this.skillGap = skillGap;
    }

    @Override
    public String toString() {
        return "Engineer Name is: " + engineerName.getName() + ", Skill Gaps: " + skillGap;
    }
}
