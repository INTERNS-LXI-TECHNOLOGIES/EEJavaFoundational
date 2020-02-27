package com.lxisoft.Model;
import com.lxisoft.Model.Question;
import com.lxisoft.Model.Answer;
import com.lxisoft.Model.Options;
public class MockExamModel
{
	private int iD;
	private Question question = new Question();
	private Answer answer = new Answer();
	private Options option1 = new Options();
	private Options option2 = new Options();
	private Options option3 = new Options();
	private Options option4 = new Options();
	private Options selectedOption = new Options();

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
	public Options getOption1()
	{
		return this.option1;
	}
	public Options getOption2()
	{
		return this.option2;
	}
	public Options getOption3()
	{
		return this.option3;
	}
	public Options getOption4()
	{
		return this.option4;
	}
	public Options getSelectedOption()
	{
		return this.selectedOption;
	}

	// setSelectedAnswer(i) {
	// 	this.selectedOption = this.option[i];
	// }
}