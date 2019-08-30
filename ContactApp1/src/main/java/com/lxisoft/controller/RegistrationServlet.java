package com.lxisoft.controller;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*; 

public class RegistrationServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("username");
			String password=request.getParameter("password");
			RepoImpl repoImpl=new RepoImpl();
			// System.out.println("Username"+name);
			// System.out.println("Password"+password);
			repoImpl.registration(name,password);
			System.out.println("Success");
			// if(status!=0)
			// {
			// 	HttpSession session=request.getSession();
			// 	session.setAttribute("uname",name);
			// }
			// pw.close();
			response.sendRedirect("index.html");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

