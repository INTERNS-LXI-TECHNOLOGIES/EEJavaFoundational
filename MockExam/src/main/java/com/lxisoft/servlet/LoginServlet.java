package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class LoginServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			ExamDatabase db = new ExamDatabase();
			
			String name=(request.getParameter("name"));
			String password=(request.getParameter("password"));
			db.addToDatabase(problem);
			
			
			response.sendRedirect("a.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	