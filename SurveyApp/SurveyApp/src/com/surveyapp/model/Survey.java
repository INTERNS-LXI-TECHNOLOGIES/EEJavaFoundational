package com.surveyapp.model;

import java.util.Arrays;

public class Survey {
    private Engineer engineer;
    private String[] skillGaps;

    public Survey(Engineer engineer, String[] skillGaps) {
        this.engineer = engineer;
        this.skillGaps = skillGaps;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public String[] getSkillGaps() {
        return skillGaps;
    }

    public void setSkillGaps(String[] skillGaps) {
        this.skillGaps = skillGaps;
    }

    @Override
    public String toString() {
        return "Engineer: " + engineer + ", Skill Gaps: " + Arrays.toString(skillGaps);
    }
}
