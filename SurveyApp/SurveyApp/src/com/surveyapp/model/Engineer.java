package com.surveyapp.model;

import java.util.ArrayList;
import java.util.List;


public class Engineer
{
    private String name;
    private List <String> skillGap = new ArrayList<>();
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkillGap() {
        return skillGap;
    }

    public void setSkillGap(List<String> skillGap) {
        this.skillGap = skillGap;
    }



   
}