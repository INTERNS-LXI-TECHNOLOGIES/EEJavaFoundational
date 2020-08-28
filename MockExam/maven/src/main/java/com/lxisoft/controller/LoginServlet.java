package com.lxisoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.repository.DatabaseRepo;

public class LoginServlet extends HttpServlet	
{
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
	
		 request.getSession().invalidate();
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String username = request.getRemoteUser();
		String role = db.getRole(username);
		//pw.println("mark = "+ username +"  " +role );
		if(role.equals("admin"))
		{
			response.sendRedirect("AdminOptions.html");
		}
		else if(role.equals("user"))
		{
			session.setAttribute("userId", username);
			response.sendRedirect("useroptions.html");	
		}
	}

}
