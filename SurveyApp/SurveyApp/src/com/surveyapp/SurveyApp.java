package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyApp {
    public static void main(String[] args) {
        // Create a view
        SurveyView view = new SurveyView();

        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // Can hold 10 surveys initially

        // Create controller
        SurveyController controller = new SurveyController(surveys, view);

        controller.startSurveyProcess();
    }
}
