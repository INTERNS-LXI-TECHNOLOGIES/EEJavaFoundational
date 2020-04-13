package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class AdduserServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			ExamDatabase db = new ExamDatabase();
			ArrayList<User> questions = new ArrayList<User>();
			User user = new User();				
			user.setName(request.getParameter("name"));
			user.setPassword(request.getParameter("password"));
			user.setRole(request.getParameter("role"));
			
			db.addUserToDatabase(user);
			response.sendRedirect("add.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	