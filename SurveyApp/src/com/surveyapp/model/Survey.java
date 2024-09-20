package com.surveyapp.model;

import com.surveyapp.model.Engineer;


public class Survey {
	
    private Engineer engineer;
    

    public Survey() {
       
    }
	
	public void setEngineer(Engineer engineer){
        this.engineer = engineer;
    }
	public Engineer getEngineer(){
        return engineer;
    }

 

    @Override
	public String toString() {
       return "Engineer: " + engineer.toString();
   }

}
