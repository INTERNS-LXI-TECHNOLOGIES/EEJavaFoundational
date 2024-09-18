package com.surveyapp.controller;

import com.surveyapp.model.Engineer;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;
    private Scanner scanner;
    private int surveyCount = 0;

    public SurveyController(Survey[] surveys, SurveyView view, Scanner scanner) {
        this.surveys = surveys;
        this.view = view;
        this.scanner = scanner;
    }

    // Method to create and add survey
    public void createSurvey() {
        if (surveyCount >= surveys.length) {
            System.out.println("Survey storage is full. Cannot add more surveys.");
            return;
        }

        System.out.print("Enter Engineer's name: ");
        String engineerName = scanner.nextLine();
        Engineer engineer = new Engineer();
        engineer.setName(engineerName);

     
        List<String> skillGaps = new ArrayList<>();
        
            System.out.print("Enter skill gap # using coma:-" );
            String gap = scanner.nextLine();
            skillGaps.add(gap);
        

        Survey survey = new Survey(engineer, skillGaps);
        surveys[surveyCount++] = survey;
        System.out.println("Survey added successfully.");
    }

    // Method to display surveys
    public void displaySurvey() {
        if (surveyCount == 0) {
            System.out.println("No surveys available to display.");
            return;
        }

        for (int i = 0; i < surveyCount; i++) {
            view.displaySurveyDetails(surveys[i]);
        }
    }
}
