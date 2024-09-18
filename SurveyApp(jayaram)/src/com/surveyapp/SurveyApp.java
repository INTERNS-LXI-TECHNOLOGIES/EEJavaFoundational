package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

import java.util.Scanner;

public class SurveyApp {
    public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
        
        
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // Can hold 10 surveys initially
        
      
        SurveyController controller = new SurveyController(surveys, view, scanner);
        
       
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("1. Add a survey");
            System.out.println("2. Display surveys");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (option) {
                case 1:
                    controller.createSurvey();
                    break;
                case 2:
                    controller.displaySurvey();
                    break;
                case 3:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
