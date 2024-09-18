package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.exception.*;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) throws SurveyException {
        // TODO: Implement adding survey to the array
		if(survey.getEngineer()!=null){
			for(int i=0;i<surveys.length;i++){
				if(surveys[i]==null){
					surveys[i]=survey;
					break;
				}
			}
		}
		else{
			throw new SurveyException("Engineer object is null");
		}
		
    }

    public void displaySurvey() {
        // TODO: Implement displaying survey details
		for(Survey s:surveys){
			view.displaySurveyDetails(s);
		}
    }
}
