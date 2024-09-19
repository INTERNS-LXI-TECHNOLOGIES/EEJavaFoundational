package com.surveyapp.view;

import com.surveyapp.model.Survey;

public class SurveyView {
    public void displaySurveyDetails(Survey[] survey) {
		for(Survey s : survey)
		{
			System.out.println(s);
		}
    }
}
