package demoApp;
public class Question {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String answer;


    public Question (String question, String option1, String option2, String option3, String answer){
        this.question =question;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.answer=answer;
    }
    
    public void setquestions(String question){
        this.question = question;
    } 
    
    public String getquestions(){
        return question;
    }
    
    public void setOption1(String option1){
        this.option1=option1;
    }
    
    public String getOption1(){
    return option1;
    }

    public void setOption2(String option2){
    this.option2=option2;
    }
    
    public String getOption2(){
    return option2;
    }
    
    public void setOption3(String option3){
    this.option3=option3;
    }
    
    public String getOption3(){
    return option3;
    }
    public void setRightAnswer(String answer){
        this.answer= answer;
    }
    public String getRightAnswer(){
        return answer;
    }
    public String toString(){
        return question +" options: 1."+option1+" 2."+option2+" 3."+option3;
      }
}