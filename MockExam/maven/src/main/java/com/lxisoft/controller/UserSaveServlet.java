package com.lxisoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.repository.DatabaseRepo;


public class UserSaveServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name"); 
		String regno = request.getParameter("regno");
		HttpSession sessions = request.getSession();
		db.addUser(name,regno);
		sessions.setAttribute("userId", regno);
		response.sendRedirect("useroptions.html");
	}

}
