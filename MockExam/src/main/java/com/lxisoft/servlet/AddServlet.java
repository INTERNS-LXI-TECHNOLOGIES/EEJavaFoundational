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
			ExamDatabase db = new ExamDatabase();
			ArrayList<Problem> contactList = new ArrayList<Problem>();
			Problem problem = new Problem();				
			problem.setQuestion(request.getParameter("question"));
			problem.setOption1(request.getParameter("option1"));
			problem.setOption2(request.getParameter("option2"));
			problem.setOption3(request.getParameter("option3"));
			problem.setOption4(request.getParameter("option4"));
			problem.setAnswer(request.getParameter("answer"));
			
			db.addToDatabase(problem);
			response.sendRedirect("add.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	