package com.lxisoft.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.model.Question;
import com.lxisoft.repository.DatabaseRepo;

public class ExamSetupServlet extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DatabaseRepo db = new DatabaseRepo();
	private ArrayList<Question> questions = new ArrayList<Question>();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		int id=0;
		questions = db.PrintDatabase();
		HttpSession sessions = request.getSession(true);
     	sessions.setAttribute("question_count",id);
		request.getRequestDispatcher("startexam.jsp").forward(request,response);
		
	}

}
