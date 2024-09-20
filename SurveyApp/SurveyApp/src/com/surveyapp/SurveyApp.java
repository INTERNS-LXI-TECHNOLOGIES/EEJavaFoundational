package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyApp {
    public static void main(String[] args) {
        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // can hold 10 surveys initially
        
        // Create controller
        SurveyController controller = new SurveyController(surveys, view);
        
        // Example of creating a new survey object
        Survey survey = new Survey();
        
        // Use controller to add and display surveys
        controller.addSurvey(survey);
		for(int i=0;i<surveys.length;i++){
			if (surveys[i]==null){
			surveys[i]=survey;
			break;
			}
		}
        controller.displaySurvey();
    }
}
