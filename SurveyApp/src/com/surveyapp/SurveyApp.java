package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.SurveyException;
import java.util.*;

public class SurveyApp {
    public static void main(String[] args)throws SurveyException  {
        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // can hold 10 surveys initially
        
        // Create controller
        SurveyController controller = new SurveyController(surveys, view);
		
		Engineer engineer=new Engineer();
		List<String> skillGaps =new ArrayList<>();
        
        // Example of creating a new survey object
        Survey survey = new Survey(engineer, skillGaps);
        
        // Use controller to add and display surveys
        controller.addSurvey(survey);
        controller.displaySurvey();
    }
}
