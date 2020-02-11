public class MockExamModel
{
	private int iD;
	private Question question = new Question();
	private Answer answer = new Answer();

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
}