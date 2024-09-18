package com.surveyapp.model;

public class Engineer{
	
	private String engineerName;
	
	public Engineer(String name){
		this.engineerName=name;
	}
	
	public void setEngineerName(String engineerName){
		this.engineerName=engineerName;
	}
	public String getEngineerName(){
		return engineerName;
	}
	
}