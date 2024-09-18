package com.surveyapp.model;

public class Survey{
    private Engineer engineer;

    public Survey(){
		//changed the constructor to default
	}

    public Engineer getEngineer(){
        return engineer;
    }
    public void setEngineer(Engineer engineer){
        this.engineer = engineer;
    }


	public String toString(){
		if (engineer != null) {
			return "Survey Details: " + engineer.toString();
		} else {
			return "No Engineer Assigned";
		}
	}

}