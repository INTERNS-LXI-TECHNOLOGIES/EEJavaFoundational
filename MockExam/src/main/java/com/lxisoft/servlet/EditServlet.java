package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		ExamDatabase db = new ExamDatabase();
			
			Problem problem = new Problem();				
			problem.setQuestion(request.getParameter("question"));
			problem.setOption1(request.getParameter("option1"));
			problem.setOption2(request.getParameter("option2"));
			problem.setOption3(request.getParameter("option3"));
			problem.setOption4(request.getParameter("option4"));
			problem.setAnswer(request.getParameter("answer"));
		
		db.editList(problem);
		response.sendRedirect("admin.jsp");
	}
}