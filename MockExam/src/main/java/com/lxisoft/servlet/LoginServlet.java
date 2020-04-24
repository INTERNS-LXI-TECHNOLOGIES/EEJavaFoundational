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
			PrintWriter pw = response.getWriter();
			ExamDatabase db = new ExamDatabase();
			ArrayList<User> users = new ArrayList<User>();
			String name=(request.getParameter("name"));
			String password=(request.getParameter("password"));
			String role="admin";
			users=db.viewUserDatabase(users);

			for(int i=0;i<users.size();i++){

			if(users.get(i).getName().equals(name) && users.get(i).getPassword().equals(password))
			{
				if(users.get(i).getRole().equals(role))
				{
					response.sendRedirect("admin.jsp");
					return;
				}
				else
				{
					response.sendRedirect("instraction.jsp");
					return;
				}
			}  }
			response.sendRedirect("index.jsp");
			return;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	