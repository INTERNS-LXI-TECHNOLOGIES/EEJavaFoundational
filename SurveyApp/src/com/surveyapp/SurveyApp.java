package com.surveyapp;

import com.surveyapp.controller.SurveyController;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class SurveyApp {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        // Create a view
        SurveyView view = new SurveyView();
        
        // Create an empty array to hold survey data
        Survey[] surveys = new Survey[10]; // can hold 10 surveys initially
        
        // Create controller
        SurveyController controller = new SurveyController(surveys, view);
        
        // Example of creating a new survey object
        //Survey survey = new Survey("John Doe", "Lack of Java skills");
		
		for(int i=0;i<surveys.length;i++){
			System.out.print("ENTER THE ENGINEER NAME : ");
			String name = scan.nextLine();
			Engineer engineer =new Engineer(name);
			List<String>gapStack=new ArrayList<>();
			boolean check=true;
			do{
				System.out.println("ENTER YOUR WEAK : ");
				gapStack.add(scan.nextLine());
				System.out.println("ENTER 1 TO ADD MORE OR PRESS ANY KEY TO EXIT : ");
				if((Integer.parseInt(scan.nextLine()))==1)
					check=true;
				else
					check=false;
			}while(check);
			Survey survey =new Survey(engineer,gapStack);
			try{
				// Use controller to add and display surveys
				controller.addSurvey(survey);
			}
			catch(SurveyException s){
				System.out.println(s.getMessage());
				
			}
		}
        

        controller.displaySurvey();
    }
}
