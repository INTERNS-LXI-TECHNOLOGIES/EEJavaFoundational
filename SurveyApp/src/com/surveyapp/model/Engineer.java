package com.surveyapp.model;

import java.util.Arrays;

public class Engineer{
    private String[] engineerNames;
    private String[] skillGaps;

    public Engineer(String[] engineerNames, String[] skillGaps) {
        this.engineerNames = engineerNames;
        this.skillGaps = skillGaps;
    }

    public String[] getEngineerNames(){
        return engineerNames;
    }
    public void setEngineerNames(String[] engineerNames){
        this.engineerNames = engineerNames;
    }

    public String[] getSkillGaps(){
        return skillGaps;
    }
    public void setSkillGaps(String[] skillGaps){
        this.skillGaps = skillGaps;
    }

    @Override
    public String toString() {
        return "Engineer names: " + Arrays.toString(engineerNames) + ", Skill Gaps: " + Arrays.toString(skillGaps);
    }
}