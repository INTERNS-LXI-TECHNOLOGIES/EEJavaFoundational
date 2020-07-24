package com.lxisoft.controller;
import java.io.IOException;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddQuestionServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private Question question=new Question();
	private DatabaseRepo db = new DatabaseRepo();;	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
		question.setQuestion(request.getParameter("question"));
		question.setAnswer(request.getParameter("answere"));
		question.setOption1(request.getParameter("opt1"));
		question.setOption2(request.getParameter("opt2"));
		question.setOption3(request.getParameter("opt3"));
		db.addToDatabase(question);
		response.sendRedirect("index.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
