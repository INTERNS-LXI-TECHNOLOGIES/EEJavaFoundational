package com.lxisoft.controller;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*; 

public class LoginServlet extends HttpServlet
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
			int status=repoImpl.login(name,password);
			
			if(status!=0)
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname",name);
				response.sendRedirect("Home.jsp");
			}
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}