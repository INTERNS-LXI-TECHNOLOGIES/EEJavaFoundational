package com.lxisoft.Controler;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.Httpservlet.ServletException;
import javax.Httpservlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
public class MockExamController extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		try
		{
		PrintWriter out = response.getWriter();
		out.println("Welcome");
		response.sendRedirect("welcome.jsp");
		out.close();
		}
		catch(Exception e)
		{
			System.out.println("hahhahahhahhaa");
		}
		
		//Date date = new Date();
		
       // do something in here
  	}
}