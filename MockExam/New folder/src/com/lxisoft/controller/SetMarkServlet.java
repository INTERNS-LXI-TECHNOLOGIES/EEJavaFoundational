package com.lxisoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetMarkServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession sessions = request.getSession(false);
		int qId =(Integer)sessions.getAttribute("question_count");
		int option = Integer.parseInt(request.getParameter("options"));
		
		request.getRequestDispatcher("startexam.jsp").forward(request,response);
	}
}
