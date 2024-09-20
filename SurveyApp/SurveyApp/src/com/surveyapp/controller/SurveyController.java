package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import java.util.Scanner;
import java.util.*;
import com.surveyapp.model.Engineer;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;
	
    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) {    
		view.addData(survey);	
		
    }

    public void displaySurvey() {
       
		view.displaySurveyDetails(surveys);
		
    }
}
