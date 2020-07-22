package com.lxisoft.controller;
import java.io.IOException;

import com.lxisoft.model.*;
import com.lxisoft.repository.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddQuestionServlet extends HttpServlet
{
	private Question question;
	private DatabaseRepo db;	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		question.setQuestion(request.getParameter("question"));
		question.setAnswer(request.getParameter("answere"));
		question.setOption1(request.getParameter("opt1"));
		question.setOption2(request.getParameter("opt2"));
		question.setOption3(request.getParameter("opt3"));
		db.addToDatabase(question);
	}
	
}
