package com.surveyapp.view;

import com.surveyapp.model.Survey;
import com.surveyapp.model.Engineer;
import java.util.Scanner;

public class SurveyView{
    Scanner scanner = new Scanner(System.in);
    
    public void displaySurveyDetails(Survey survey){
        System.out.println(survey);
    }

    public void addSurveyDetails(Survey survey){
        String[] engineerNames = new String[2];
        String[] skillGaps = new String[2];

        for (int i = 0; i < 2; i++){
            System.out.print("Enter Engineer Name " + (i + 1) + ": ");
            engineerNames[i] = scanner.nextLine();
            
            System.out.print("Enter Skill Gap for Engineer " + (i + 1) + ": ");
            skillGaps[i] = scanner.nextLine();
        }
        
        Engineer engineer = new Engineer(engineerNames, skillGaps);
        survey.setEngineer(engineer);
        System.out.println("Survey details successfully added");
    }
}
