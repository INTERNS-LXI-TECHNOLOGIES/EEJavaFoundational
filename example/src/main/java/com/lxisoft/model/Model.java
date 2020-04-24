package com.lxisoft.model;
public class Model
{
	private int id;
	private String question;
	private String answer;
	private String option1;
	private String option2;
	private String option3;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setQuestion(String question)
	{
		this.question=question;
	}
	public String getQuestion()
	{
		return this.question;
	}
	public void setAnswer(String answer)
	{
		this.answer=answer;
	}
	public String getAnswer()
	{
		return this.answer;
	}
	public void setOption1(String option1)
	{
		this.option1=option1;
	}
	public String getOption1()
	{
		return this.option1;
	}
	public void setOption2(String option2)
	{
		this.option2=option2;
	}
	public  String getOption2()
	{
		return this.option2;
	}
	public void setOption3(String option3)
	{
		this.option3=option3;
	}
	public String getOption3()
	{
		return this.option3;
	}

}