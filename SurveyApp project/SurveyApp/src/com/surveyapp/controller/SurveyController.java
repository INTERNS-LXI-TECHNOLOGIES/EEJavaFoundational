package com.surveyapp.controller;

import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.*;
import com.surveyapp.view.SurveyView;
import java.util.Scanner;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;
    int count = 0;

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey) throws SurveyException {
        Scanner scanner = new Scanner(System.in);
        Engineer engineer = new Engineer();
        String addSkillGap = "NO";
        

        System.out.println("\n"+"Survey Details");
        System.out.println("\n"+"Enter Engineer's Name : ");
        engineer.setName(scanner.nextLine());

        while(engineer.getSkillGap().isEmpty()| addSkillGap.equalsIgnoreCase("Yes")) {
            System.out.println("Enter Engineer's Skill Gap :");
            engineer.getSkillGap().add(scanner.nextLine());
            System.out.println("Do you want to add another skill gap? (Yes/No) : ");
            addSkillGap = scanner.nextLine();
        }
        if(engineer.getSkillGap().isEmpty()){
           throw new SurveyException("Add atleast one skill gap ");
        }
       Survey survey1 = new Survey(engineer);
  
           surveys[count++] = survey1;
    }

    public void displaySurvey() {
        for (int i = 0; i < 2; i++) {
            view.displaySurveyDetails(surveys[i]);
        }
       
}
}
