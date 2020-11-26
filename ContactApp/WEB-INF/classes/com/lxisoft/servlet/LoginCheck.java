package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

//@WebServlet("/LoginCheck")

public class LoginCheck extends HttpServlet  {

	public LoginCheck(){
	super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		if(uname.equals("karthik")&&password.equals("123456"))
		{
			response.sendRedirect("Menu.html");
		}
		else
		{
			response.sendRedirect("Failed.html");
		}
	}
}

