package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class UpdateServlet  extends HttpServlet
{
	private SqlRepository sqlReppo = SqlRepository.getInstance();
	private ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		questions = sqlReppo.readFromDatabase(questions);
		MockExamModel model = new MockExamModel();
		PrintWriter out = response.getWriter();
		int index = Integer.parseInt(request.getParameter("index"));
		model.setId(Integer.parseInt(request.getParameter("Id")));
		if(request.getParameter("question").length()==0)
		{
			model.getQuestion().setQuestion(questions.get(index).getQuestion().getQuestion());	
		}
		else
		{
			model.getQuestion().setQuestion(request.getParameter("question"));
		}
		
		if(request.getParameter("answer").length()==0)
		{
			model.getAnswer().setAnswer(questions.get(index).getAnswer().getAnswer());	
		}
		else
		{
			model.getAnswer().setAnswer(request.getParameter("answer"));
		}

		if(request.getParameter("option1").length()==0)
		{
			model.getOption1().setOption(questions.get(index).getOption1().getOption());	
		}
		else
		{
			model.getOption1().setOption(request.getParameter("option1"));
		}

		if(request.getParameter("option2").length()==0)
		{
			model.getOption2().setOption(questions.get(index).getOption2().getOption());	
		}
		else
		{
			model.getOption2().setOption(request.getParameter("option2"));
		}

		if(request.getParameter("option3").length()==0)
		{
			model.getOption3().setOption(questions.get(index).getOption3().getOption());	
		}
		else
		{
			model.getOption3().setOption(request.getParameter("option3"));
		}

		if(request.getParameter("option4").length()==0)
		{
			model.getOption4().setOption(questions.get(index).getOption4().getOption());	
		}
		else
		{
			model.getOption4().setOption(request.getParameter("option4"));
		}
		sqlReppo.update(model);
		request.getRequestDispatcher("Update.jsp").forward(request,response);
	}
}