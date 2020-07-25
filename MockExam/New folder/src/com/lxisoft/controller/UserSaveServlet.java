package com.lxisoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.repository.DatabaseRepo;

public class UserSaveServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException
	{
		String name = request.getParameter("name"); 
		String regno = request.getParameter("regno");
		db.addUser(name,regno);
		response.sendRedirect("useroptions.html");
	}

}
