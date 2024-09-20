package com.surveyapp.controller;

import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.SurveyException;
import java.util.*;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;
	int surveyCount=0;

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void addSurvey(Survey survey)throws SurveyException {
		if (surveyCount >= surveys.length) {
        throw new SurveyException("Survey limit reached,can't add more survey");
    }
		
		 Scanner scanner = new Scanner(System.in);
    
		 
        // Loop to collect 10  engi names
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Engineer name : ");
            String engineerName=(scanner.nextLine());
			if (engineerName.isEmpty()) 
			{
            throw new SurveyException("Engineer name cannot be empty.");
            }

			
		    //Engineer engineer = new Engineer();
			//engineer.setEngineerName(engineerName);
			
			survey.engineer.setEngineerName(engineerName);
			
			//List<String> skillGaps = new ArrayList<>();
            System.out.println("Enter your skill gaps (type 'D' when finished): ");
			
            while (true) {
                String skillGap = scanner.nextLine();
                if (skillGap.equalsIgnoreCase("D")) {
                    break;
                }
                survey.getSkillGaps().add(skillGap);
            }
			if (survey.getSkillGaps().isEmpty()) 
			{
            throw new SurveyException("At least one skill gap must be provided.");
             }
			 
			//survey = new Survey(survey.engineer, survey.getSkillGaps());  // Create a new survey for each engineer
            surveys[surveyCount++] = survey;  // Add survey to the array

            System.out.println("Survey for " + engineerName + " added successfully!\n");
		
		
        }
		
        
    }

    public void displaySurvey() {
		
	System.out.println("\nDisplaying all surveys:");
        for (int i = 0; i < surveyCount; i++) {
            view.displaySurveyDetails(surveys[i]);
        // TODO: Implement displaying survey details
    }
}
}