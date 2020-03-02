package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Question q=new Question();
		SqlRepository repo=new SqlRepository();
		
		q.setQuestion(request.getParameter("question"));
		q.setOption1(request.getParameter("option1"));
		q.setOption2(request.getParameter("option2"));
		q.setOption3(request.getParameter("option3"));
		q.setOption4(request.getParameter("option4"));
		q.setAnswer(request.getParameter("answer"));
		// q.setAnswer2(request.getParameter("answer2"));
		// String[] answer = request.getParameterValues("option");
		// q.setAnswer(answer);
		repo.insertQuestion(q);
		request.setAttribute("question",q);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);
	}
}