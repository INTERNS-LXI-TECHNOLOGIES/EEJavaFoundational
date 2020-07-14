package com.lxisoft.model;
public class Question
{
    public String question,answere;
    public String option1,option2,option3;
    public void setQuestion(String question)                               
    { 
        this.question = question; 
    } 
                          
    public void setOption1(String op1)
    {
        this.option1=op1;
    }
    public void setOption2(String op2)
    {
        this.option2=op2;
    }
    public void setOption3(String op3)
    {
        this.option3=op3;
    }
    public void setAnswere(String answere)                       
    {                          
        this.answere=answere;
    }
    public String getQuestion()  
    { 
        return question; 
    }    
    public String getOption1()
    {
        return option1;
    }   
    public String getOption2()
    {
        return option2;
    }      
    public String getOption3()
    {
        return option3;
    }        
    public String getAnswere()
    {
        return answere;
    }   

}