package com.lxisoft.controller;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*; 

public class LogoutServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		HttpSession session=request.getSession();
	
		session.invalidate();
		//System.out.println("After invalidate:"+session.getAttribute("uname"));
		response.sendRedirect("index.html");
	}
}