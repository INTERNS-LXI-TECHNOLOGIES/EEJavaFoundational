package com.lxisoft.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.model.Question;
import com.lxisoft.repository.DatabaseRepo;

public class DeleteQuestionServlet extends HttpServlet  
{
	private static final long serialVersionUID = 1L;
	private DatabaseRepo db = new DatabaseRepo();
	private ArrayList<Question> questions= new ArrayList<Question>();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		questions = db.PrintDatabase();
		questions.remove(id-1);
		db.updateDatabase(questions);
		response.sendRedirect("AdminOptions.html");
		
	}
}
