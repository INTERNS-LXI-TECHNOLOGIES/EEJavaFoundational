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
		QuestionDatabase db = new QuestionDatabase();
			
			Question question = new Question();				
			question.setQuestion(request.getParameter("question"));
			question.setOption1(request.getParameter("option1"));
			question.setOption2(request.getParameter("option2"));
			question.setOption3(request.getParameter("option3"));
			question.setOption4(request.getParameter("option4"));
			question.setAnswer(request.getParameter("answer"));
		
		db.editList(question);
		response.sendRedirect("admin.jsp");
	}
}