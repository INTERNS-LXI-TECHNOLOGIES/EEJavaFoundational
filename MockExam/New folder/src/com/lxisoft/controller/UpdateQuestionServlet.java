package com.lxisoft.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.model.Question;
import com.lxisoft.repository.DatabaseRepo;

public class UpdateQuestionServlet extends HttpServlet
{

	private Question question=new Question();
	private DatabaseRepo db = new DatabaseRepo();
	private ArrayList<Question> questions = new ArrayList<Question>();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		question.setQuestion(request.getParameter("question"));
		question.setAnswer(request.getParameter("answere"));
		question.setOption1(request.getParameter("opt1"));
		question.setOption2(request.getParameter("opt2"));
		question.setOption3(request.getParameter("opt3"));
		questions = db.PrintDatabase();
		questions.remove(id-1);
		questions.add(id-1 , question);
		db.updateDatabase(questions);
		response.sendRedirect("AdminOptions.html");
	}

}
