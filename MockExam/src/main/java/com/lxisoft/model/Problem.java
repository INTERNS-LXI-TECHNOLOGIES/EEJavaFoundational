package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class Problem
{
private String question,option1,option2,option3,option4,;
private int id,answer;

public void setId(int id)
    {
        this.id = id;
    }

public void setQuestion(String question)                               
    { 
        this.question = question; 
    } 
                      
public void setOPtion1(String option1)
    {
      this.option1=option1;
  }
public void setOPtion2(String option2)
    {
      this.option2=option2;
  }
public void setOPtion3(String option3)
    {
      this.option3=option3;
  }
public void setOPtion4(String option4)
    {
      this.option4=option4;
  }      
public void setAnswer(String answer)                       
    {                          
        this.answer=answer;
    }

public int getId()
    {
        return id;
    }
public String getQuestion()  
    { 
        return question; 
    }    
public String getOprion1()
    {
        return option1;
    }   
public String getOprion2()
    {
        return option2;
    }      
public String getOprion3()
    {
        return option3;
    }        

public String getOprion4()
    {
        return option4;
    }       
public String getNumber()
    {
        return answer;
    }   

}
