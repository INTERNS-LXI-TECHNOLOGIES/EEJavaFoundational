package com.lxisoft.Model;
import com.lxisoft.Model.ExamModel;
public class ExamModel
{
	
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	private int qNo;
	private String question;
	public void setQuestion(String question)
	{
		this.question = question;
	}
	public String getQuestion()
	{
		return question;
	}
	public void setQuestionNumber(int qNo)
	{
		this.qNo=qNo;
	}
	public int getQuestionNumber()
	{
		return qNo;
	}
	public void setOpt1(String opt1)
	{
		this.opt1=opt1;
	}
	public String getOpt1()
	{
		return opt1;
	}
	public void setOpt2(String opt2)
	{
		this.opt2=opt2;
	}
	public String getOpt2()
	{
		return opt2;
	}
	public void setOpt3(String opt3)
	{
		this.opt3=opt3;
	}
	public String getOpt3()
	{
		return opt3;
	}
	public void setOpt4(String opt4)
	{
		this.opt4=opt4;
	}
	public String getOpt4()
	{
		return opt4;
	}
	public void setAnswer(String ans)
	{
		this.ans=ans;
	}
	public String getAnswer()
	{
		return ans;
	}


}
