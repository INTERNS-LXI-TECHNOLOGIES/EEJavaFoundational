package com.surveyapp.model;
public class Engineer {
    private String engineerName;

    public Engineer(String engineerName){
        this.engineerName=engineerName;
    }

    public String getEngineerName(){
        return engineerName;
    }

    public void setEngineerName(String engineerName){
        this.engineerName=engineerName;
    }

    /*public String toString(){
        return engineerName;
    }*/
    
}
