package com.surveyapp.controller;

import java.util.Scanner;
import com.surveyapp.exception.SurveyException;
import com.surveyapp.model.Engineer;
import com.surveyapp.model.Survey;
import com.surveyapp.view.SurveyView;

public class SurveyController {
    private Survey[] surveys;
    private SurveyView view;
    private int surveyCount = 0; // To track the number of surveys
    static Scanner scanner = new Scanner(System.in);

    public SurveyController(Survey[] surveys, SurveyView view) {
        this.surveys = surveys;
        this.view = view;
    }

    public void startSurveyProcess() {
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1. Add a Survey");
            System.out.println("2. Display all Surveys");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        addSurvey();
                    } catch (SurveyException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    displaySurvey();
                    break;
                case "3":
                    keepGoing = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }

    // Add the Survey Details
    public void addSurvey() throws SurveyException {
        // To collect the user inputs
        System.out.println("Enter Engineer Name:");
        String engineerName = scanner.nextLine();

        // Throw an exception if the engineer's name is empty
        if (engineerName.trim().isEmpty()) {
            throw new SurveyException("Engineer name cannot be empty.");
        }

        Engineer engineer = new Engineer(engineerName);

        // Input skill gaps (comma-separated)
        System.out.println("Enter Skill Gaps (comma-separated, e.g., Core Java,Spring boot,Docker,Kubernetes ):");
        String skillGapsInput = scanner.nextLine();

        // Throw an exception if no skill gaps are provided
        if (skillGapsInput.trim().isEmpty()) {
            throw new SurveyException("At least one skill gap must be provided.");
        }

        String[] skillGaps = skillGapsInput.split(",\\s*");

        // Create new Survey object and add it to the array
        Survey survey = new Survey(engineer, skillGaps);
        if (surveyCount < surveys.length) {
            surveys[surveyCount] = survey;
            surveyCount++;
            System.out.println("Survey added successfully!\n");
        } else {
            throw new SurveyException("Survey list is full.");
        }
    }

    public void displaySurvey() {
        if (surveyCount == 0) {
            System.out.println(new SurveyException("At least one skill gap must be provided."));
            return;
        }

        // loop to print details
        System.out.println("Survey Details:");
        for (int i = 0; i < surveyCount; i++) {
            view.displaySurveyDetails(surveys[i]);
        }
    }
}
