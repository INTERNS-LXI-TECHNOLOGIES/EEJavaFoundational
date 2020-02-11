package com.lxisoft.Controler;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
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
		}
		catch(Exception e)
		{
			System.out.println("hahhahahhahhaa");
		}
		
		//Date date = new Date();
		
       // do something in here
  	}
}