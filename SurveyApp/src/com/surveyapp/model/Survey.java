package com.surveyapp.model;
import com.surveyapp.model.Engineer;
import java.util.*;

public class Survey {
    public Engineer engineer;
    private List<String> skillGaps; 

    public Survey(Engineer engineer, List<String> skillGaps) {
        this.engineer = engineer;
        this.skillGaps = skillGaps;
    }

    // Getters and Setters
    

    public List<String> getSkillGaps() {
        return skillGaps;
    }

    public void setSkillGaps(List<String> skillGaps) {
        this.skillGaps = skillGaps;
    }

    @Override
    public String toString() {
        return "Engineer: " + engineer.getEngineerName() + ", Skill Gap: " + skillGaps;
    }
}
