package com.surveyapp.controller;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.surveyapp.model.Engineer;
import com.surveyapp.exception.SurveyException;

public class EngineerController
{
	Scanner scan = new Scanner(System.in);
	
	public void addEngineer(Engineer engineer)throws SurveyException
	{
		System.out.println("Enter Engineer Name");
		String name = scan.nextLine();
		if(name==null || name ==""){
			throw new SurveyException("Engineer name is null . please enter the name");
		}
		else{
			engineer.setName(name);
		}
	}
	
	public List<String> addSkillGaps() {
		List<String> skillGaps = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true){

			System.out.println("Do you have any Gaps ? :(yes/no)");
			String yesOrNo = scan.nextLine();

				if(yesOrNo.equalsIgnoreCase("yes")){
					System.out.println("Enter your gap");
					String gap = scan.nextLine();
					skillGaps.add(gap);
					//break ;
				}
				else if(yesOrNo.equalsIgnoreCase("no")){
					System.out.println("Thank you For your information");
					break ;
				}
				else{
					System.out.println("Wrong Choice");
				}
		}

    return skillGaps;
	
	}
}
