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
			user.setQuestion(request.getParameter("name"));
			user.setOption1(request.getParameter("password"));
			user.setOption2(request.getParameter("role"));
			
			db.addUserToDatabase(user);
			response.sendRedirect("add.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	