package com.surveyapp.model;

public class Survey {
   

private Engineer engineer;

public Survey(Engineer engineer) {
    this.engineer = engineer;
}

public Engineer getEngineer() {
    return engineer;
}

public void setEngineer(Engineer engineer) {
    this.engineer = engineer;
}

@Override
    public String toString() {
        return "" + engineer ;
    }

}
