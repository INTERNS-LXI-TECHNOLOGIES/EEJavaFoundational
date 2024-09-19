package com.surveyapp.controller;

import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyController {
    private Survey[] surveys ;
    private SurveyView view;

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }


    public Survey[] getSurveys() {
        return surveys;
    }

    public void setSurveys(Survey[] surveys) {
        this.surveys = surveys;
    }

    public SurveyView getView() {
        return view;
    }

    public void setView(SurveyView view) {
        this.view = view;
    }





    public void addSurvey(Survey[] surveys)throws SurveyException {
        for (int i = 0; i < 2; i++) {
            if(surveys[i] == null)
            { 
                surveys[i] = view.addData();   
            }
        }

    }

    public void displaySurvey(Survey[] surveys) {
        int a = 1;
        for(Survey i :surveys)
        {
         
          if(i!=null)
          {
            System.out.println("\n\tSURVEY DETAILS");
            System.out.println("\n"+a+"."+i.getEngineer().getName()); 
            System.out.println("  "+i.getEngineer().getSkillGap());
            ++a;
          }
        }
    }
}
