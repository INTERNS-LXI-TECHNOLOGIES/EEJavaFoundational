package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.SurveyException;

import java.util.Scanner;

public class SurveyController {
    
	private Survey[] surveys;
    private SurveyView view;
	
	Scanner scan = new Scanner(System.in);
	
    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey() throws SurveyException {
        
		// TODO: Implement adding survey to the array		
		for(int i = 0; i<surveys.length; i++){
			
			if(surveys[i] == null){
				
				Survey survey = new Survey();
				
				System.out.print("Enter your name:");
                String name = scan.nextLine();
					
				System.out.print("Enter your skillGap:");
                String skillGap = scan.nextLine();
				
                Engineer engineer = new Engineer(name, skillGap);
			
                survey.setEngineer(engineer);
				
				surveys[i] = survey;
				
                System.out.println("Survey added for engineer: " + name);
			}
			else{
				
            throw new SurveyException("Error");
				
			}
			
		}		
	}	
	

    public void displaySurvey(Survey survey) {
        // TODO: Implement displaying survey details
		view.displaySurveyDetails(survey);	
    }
}

