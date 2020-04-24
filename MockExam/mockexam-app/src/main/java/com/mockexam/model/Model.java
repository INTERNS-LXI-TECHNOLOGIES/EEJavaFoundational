package com.mockexam.model;

public class Model
{
	private int id;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String answer;
	private boolean attempted;
	// private boolean completed;
	private int mark;
	// private int result;  

	public  void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setQuestion(String quest)
	{
		this.question = quest;
	}
	public String getQuestion()
	{
		return question;
	}
	public  void setOpt1(String opt)
	{
		this.opt1 = opt;
	}
	public String getOpt1()
	{
		return opt1;
	}
	public  void setOpt2(String opt)
	{
		this.opt2 = opt;
	}
	public String getOpt2()
	{
		return opt2;
	}
	public  void setOpt3(String opt)
	{
		this.opt3 = opt;
	}
	public String getOpt3()
	{
		return opt3;
	}
	public  void setOpt4(String opt)
	{
		this.opt4 = opt;
	}
	public String  getOpt4()
	{
		return opt4;
	}
	public  void setAnswer(String ans)
	{
		this.answer = ans;
	}
	public String getAnswer()
	{
		return answer;
	}
	public  void setAttempted(boolean attempted)
	{
		this.attempted = attempted;
	}
	public boolean getAttempted()
	{
		return attempted;
	}
	public  void setMark(int mark)
	{
		this.mark = mark;
	}
	public int getMark()
	{
		return mark;
	}
	
	

}