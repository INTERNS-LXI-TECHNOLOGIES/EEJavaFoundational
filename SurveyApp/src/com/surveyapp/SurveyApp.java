package com.surveyapp;

import java.util.*;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.*;
import com.surveyapp.view.SurveyView;

    

public class SurveyApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        SurveyView view = new SurveyView();
        int surveyCount=0;
        
        
       
        Survey[] surveys = new Survey[10];
        
        SurveyController controller = new SurveyController(surveys, view);
       
        while(surveyCount<surveys.length){

        try{
        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        if(name.isEmpty()){
            throw new SurveyException("Name cannot be empty");
        }
   
        Engineer engineer=new Engineer(name);
        List<String> skillgaps=new ArrayList<>();
        System.out.println("Enter your skill gap:");
        skillgaps.add(scanner.nextLine());

        
        Survey survey = new Survey(engineer,skillgaps);
       
        controller.addSurvey(survey);
        
        surveys[surveyCount] = survey;

        surveyCount++;
    }
    catch(SurveyException se){
        System.out.println(se.getMessage());
    }
        
          if(surveyCount<10){
          System.out.println("Do u want to add another survey?(yes/no)");
          String status=scanner.nextLine();
          if(!status.equalsIgnoreCase("yes")){
            break;
          }
        }
        
        
       
    }
       

        //SurveyController controller=new SurveyController(surveys, view);
        controller.displaySurvey();
        scanner.close();
    }
}
