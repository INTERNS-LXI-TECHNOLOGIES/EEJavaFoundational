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
			QuestionDatabase db = new QuestionDatabase();
			ArrayList<User> users = new ArrayList<User>();
			User user = new User();				
			user.setName(request.getParameter("name"));
			user.setPassword(request.getParameter("password"));
			user.setRole(request.getParameter("role"));
			users=db.viewUserDatabase(users);
			for(int i=0;i<users.size();i++)
			{
				if(user.getName()==users.get(i).getName()&&user.getPassword()==users.get(i).getPassword())
				{
					response.sendRedirect("exam.jsp");		
				}
				else
				{
					response.sendRedirect("login.html");		
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	