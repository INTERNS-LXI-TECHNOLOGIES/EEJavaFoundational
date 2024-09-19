package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyApp {
    public static void main(String[] args) throws SurveyException{

        System.out.println("\n\tWELCOME TO SURVEY");

        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // can hold 10 surveys initially

        // Create controller
        SurveyController controller = new SurveyController(surveys, view);
        
        // Use controller to add and display surveys
        controller.addSurvey(surveys);
        controller.displaySurvey(surveys);
    }
}
