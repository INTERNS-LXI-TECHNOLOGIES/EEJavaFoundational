package com.lxisoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet	
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		session.invalidate();
		PrintWriter pw = response.getWriter();
		String username = request.getRemoteUser();
		//pw.println("mark = "+username );
		if(username.equals("admin"))
		{
			response.sendRedirect("AdminOptions.html");
		}
		else if(username.equals("user"))
		{
			response.sendRedirect("useroptions.html");	
		}
	}

}
