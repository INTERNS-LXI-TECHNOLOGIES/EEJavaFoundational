package com.surveyapp.model;
import java.util.*;

public class Engineer{

	private String name;
	private String skillGap;
	
	public Engineer(String name , String skillGap){
		this.name = name;
		this.skillGap = skillGap;
	}

	public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSkillGap() {
        return skillGap;
    }
    public void setSkillGap(String skillGap){
        this.skillGap = skillGap;
    }

	public String toString(){
		
		return "Name: " + name + ", Skill Gap: " + skillGap;
		
	}
}