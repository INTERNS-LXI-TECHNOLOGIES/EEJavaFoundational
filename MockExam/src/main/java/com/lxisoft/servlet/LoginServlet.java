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
			ArrayList<User> users = new ArrayList<User>();
			String name=(request.getParameter("name"));
			String password=(request.getParameter("password"));
			users=db.viewUserDatabase(users);
			if(users.get(0).getName()==name&&users.get(0).getPassword()==password)
			{
				response.sendRedirect("admin.jsp");
			}
			
			response.sendRedirect("index.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	