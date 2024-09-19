package com.surveyapp.view;

import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.Survey;
import java.util.Scanner;

public class SurveyView {



    public Survey addData()throws SurveyException
    {
        Survey survey = new Survey();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter The Engineer Name :");
        String name = scanner.nextLine();
        if(name.isEmpty())
        {
            throw new SurveyException("name is empty");
        }
        survey.getEngineer().setName(name);
        System.out.println("\nEnter The SkillGaps :         (press d to stop adding skillgap)");
        
        while(true)
        {

            String skillGap = scanner.nextLine();
            if(!skillGap.isEmpty())
            {
                if(skillGap.equalsIgnoreCase("d"))
                {
                    break;
                }
                survey.getEngineer().getSkillGap().add(skillGap);
            }
            else
            {
             throw new SurveyException("skill gap is empty");     
            }
        }
        System.out.println("Survey Added Successfully");
        return survey;
    }





    public void displaySurveyDetails(Survey survey) {
        System.out.println(survey);
    }
}
