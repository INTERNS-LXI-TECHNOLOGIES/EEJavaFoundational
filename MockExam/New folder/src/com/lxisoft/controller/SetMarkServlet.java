package com.lxisoft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.model.Question;
import com.lxisoft.repository.DatabaseRepo;

public class SetMarkServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private ArrayList<Question> questions = new ArrayList<Question>();
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = response.getWriter();
		HttpSession sessions = request.getSession(false);
		int userMark = (Integer)sessions.getAttribute("userMark");
		int option;
		questions = db.PrintDatabase();
		
		int qId =(Integer)sessions.getAttribute("question_count");
		qId=qId-1;
		try{
		option = Integer.parseInt(request.getParameter("options"));
		}
		catch(NumberFormatException e)
		{
			option = 0;
		}
		String userChoice = "";
		pw.println("mark = "+userMark);
		switch(option)
		{
		case 1 : userChoice = questions.get(qId).getOption1();
				 break;
		case 2 : userChoice = questions.get(qId).getOption2();
		 		 break;
		case 3 : userChoice = questions.get(qId).getOption3();
		 	     break;
		case 4 : userChoice = questions.get(qId).getAnswer();
		 		 break;
		 		 
		default : userChoice = "";
				  break;
		}
		
		if(userChoice.equals((questions).get(qId).getAnswer()))
		{
			userMark++;
			sessions.setAttribute("userMark", userMark);
			pw.println("mark = "+userMark);
		}
	request.getRequestDispatcher("startexam.jsp").forward(request,response);
	}
}
