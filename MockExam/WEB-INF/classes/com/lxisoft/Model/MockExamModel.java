package com.lxisoft.Model;
import com.lxisoft.Model.Question;
import com.lxisoft.Model.Answer;
public class MockExamModel
{
	private int iD;
	private Question question = new Question();
	private Answer answer = new Answer();
	Option  options[];
	Option selectedOption;

	public void setId(int iD)
	{
		this.iD = iD;
	}
	public int getId()
	{
		return iD;
	}
	public Question getQuestion()
	{
		return this.question;
	}
	public Answer getAnswer()
	{
		return this.answer;
	}

	setSelectedAnswer(i) {
		this.selectedOption = this.option[i];
	}
}