package com.surveyapp.view;

import com.surveyapp.model.Survey;

public class SurveyView {
    public void displaySurveyDetails(Survey[] survey) {
        for(Survey s:survey){
            if(s!=null){
        System.out.println("EngineerName: "+s.getEngineer().getEngineerName());
        for(int i=0;i<s.getSkillGap().size();i++){
            System.out.println("Skillgap: "+s.getSkillGap().get(i));
        }
    }
}
}
}
