package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.*;
import com.surveyapp.view.SurveyView;


public class SurveyApp {
    public static void main(String[] args) throws SurveyException  {
        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[2]; // can hold 10 surveys initially
        
        // Create controller
        SurveyController controller = new SurveyController(surveys, view);

        Engineer engineer = new Engineer();
        
        // Example of creating a new survey object
        Survey survey = new Survey(engineer);
        
        // Use controller to add and display surveys
        for (int i = 0; i < surveys.length; i++) {
        controller.addSurvey(survey);
            
        }
        controller.displaySurvey();
    }
}
