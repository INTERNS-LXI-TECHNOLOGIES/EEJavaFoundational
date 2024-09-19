package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) {
               for(int i=0;i<surveys.length;i++){
                if(surveys[i]==null){
                surveys[i] =survey;  
                break;                                                            
               } 
            }
    }

    public void displaySurvey() {
        view.displaySurveyDetails(surveys);
        } 
                                                                            
    }


