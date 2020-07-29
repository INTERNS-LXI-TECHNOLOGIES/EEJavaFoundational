package com.lxisoft.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.model.Question;
import com.lxisoft.repository.DatabaseRepo;

public class ExamSetupServlet extends HttpServlet 
{
	private DatabaseRepo db = new DatabaseRepo();
	private ArrayList<Question> questions = new ArrayList<Question>();
	public void doGet(HttpServletRequest request , HttpServletResponse response)
	{
		questions = db.PrintDatabase();
		HttpSession sessions = request.getSession(true);
		sessions.setAttribute("questions",questions);
		
	}

}
