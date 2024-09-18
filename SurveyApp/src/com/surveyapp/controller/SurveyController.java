package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.exception.SurveyException;

public class SurveyController{
    private Survey[] surveys;
    private SurveyView view;
    private int surveyCount = 0;

    public SurveyController(Survey[] surveys, SurveyView view){
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) throws SurveyException{
        view.addSurveyDetails(survey);
        if (surveyCount < surveys.length){
            surveys[surveyCount] = survey;
            surveyCount++;
        } else {
            throw new SurveyException("Survey limit reached");
        }
    }

    public void displaySurvey(){
        for (int i = 0; i < surveyCount; i++) {
            view.displaySurveyDetails(surveys[i]);
        }
    }
}
