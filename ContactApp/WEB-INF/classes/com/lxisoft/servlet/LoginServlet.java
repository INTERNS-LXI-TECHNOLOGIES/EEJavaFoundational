package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.http.HttpServlet;

import java.io.IOException;


public class LoginServlet extends HttpServlet  {

	public LoginServlet(){
	super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{

		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		//if(uname.equals("karthik")&&password.equals("123456"))
		//if (request.isUserInRole("admin"))
		
		//{
			response.sendRedirect("Menu.jsp");
		/*}
		else
		{
			response.sendRedirect("Failed.jsp");
		}*/
	}
}

