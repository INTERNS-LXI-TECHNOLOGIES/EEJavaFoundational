package com.lxisoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.repository.DatabaseRepo;

public class RegisterServlet extends HttpServlet 
{
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("username"); 
		String pass = request.getParameter("password");
		String role = request.getParameter("role");
		
		db.addUser(name, pass,role);
		
		response.sendRedirect("login");
		
		
	}

}
