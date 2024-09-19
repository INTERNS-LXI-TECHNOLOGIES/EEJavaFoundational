package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Engineer;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SurveyApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // can hold 10 surveys initially
        
        // Create controller
        SurveyController controller = new SurveyController(surveys, view);

        
        Engineer engineers =new Engineer();

        for(int i=0;i<surveys.length;i++){
            System.out.println("Enter name of Engineer"+ (i+1)+":");
            String name=scanner.nextLine();
            engineers=new Engineer(name);
        }
        
        String skillGapsArray[]=new String[10];
        for(int i=0;i<skillGapsArray.length;i++){
            System.out.println("Enter skillGap:");
            skillGapsArray[i]=scanner.nextLine();
        }


       /* Engineer engineer=new Engineer("Sruthi");
        List<String> skillGaps=new ArrayList<>();
        skillGaps.add("Lack of Java Skills");*/ 
        // Example of creating a new survey object
        Survey survey = new Survey(engineers,skillGaps);
        
        // Use controller to add and display surveys
        controller.addSurvey(survey);
        controller.displaySurvey();
        
    }
}
