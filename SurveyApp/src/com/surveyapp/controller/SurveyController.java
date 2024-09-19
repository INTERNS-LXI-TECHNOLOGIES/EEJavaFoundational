package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;

	public SurveyController()
	{}
	
    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) {
        // TODO: Implement adding survey to the array
		for (int i = 0; i < surveys.length; i++) {
        if (surveys[i] == null) {
            surveys[i] = survey;
		}
		}
    }

    public void displaySurvey() {
        // TODO: Implement displaying survey details
		
		view.displaySurveyDetails(surveys);
    }
}
