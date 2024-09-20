package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.SurveyException;


public class SurveyApp{

	public static void main(String[] args) throws Exception {
        
		// Create a view
		SurveyView view = new SurveyView();
		
        
		// Create an empty array to hold survey data
        Survey[] surveys = new Survey[2]; 				// can hold 10 surveys initially
        
        
        // Create controller
		SurveyController controller = new SurveyController(surveys , view);    
		
		
		// Example of creating a new survey object
        Survey survey = new Survey(); 
		
		
        // Use controller to add and display surveys
        controller.addSurvey();
        
		
		for(Survey s : surveys){
			
			if (s!=null){
				controller.displaySurvey(s);
			}
		}
		
		
		
		
    }
}
