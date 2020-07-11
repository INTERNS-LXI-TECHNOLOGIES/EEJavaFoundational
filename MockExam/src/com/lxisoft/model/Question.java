
public class Question
{
    private String question,answer;
    private String option1,option2,option3,option4;
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
    public void setOption4(String op4)
    {
        this.option4=op4;
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
    public String getOption4()
    {
        return option4;
    }       
    public String getAnswer()
    {
        return answer;
    }   

}