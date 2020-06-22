package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class AddServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			QuestionDatabase db = new QuestionDatabase();
			ArrayList<Question> questions = new ArrayList<Question>();
			Question question = new Question();				
			question.setQuestion(request.getParameter("question"));
			question.setOption1(request.getParameter("option1"));
			question.setOption2(request.getParameter("option2"));
			question.setOption3(request.getParameter("option3"));
			question.setOption4(request.getParameter("option4"));
			question.setAnswer(request.getParameter("answer"));
			
			db.addToDatabase(question);
			response.sendRedirect("add.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}