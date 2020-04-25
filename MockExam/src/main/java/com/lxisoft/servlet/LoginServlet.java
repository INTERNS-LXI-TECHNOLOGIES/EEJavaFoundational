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
			// PrintWriter pw = response.getWriter();
			// ExamDatabase db = new ExamDatabase();
			// ArrayList<User> users = new ArrayList<User>();
			// String name=(request.getParameter("name"));
			// String password=(request.getParameter("password"));
			// String role="admin";
			// users=db.viewUserDatabase(users);

			// for(int i=0;i<users.size();i++){

			// if(users.get(i).getName().equals(name) && users.get(i).getPassword().equals(password))
			// {
			// 	if(users.get(i).getRole().equals(role))
			// 	{
			// 		response.sendRedirect("admin.jsp");
			// 		return;
			// 	}
			// 	else
			// 	{
			// 		response.sendRedirect("instraction.jsp");
			// 		return;
			// 	}
			// }  }
			// response.sendRedirect("index.jsp");
			// return;
			

		ExamDatabase db = new ExamDatabase();
		PrintWriter out = response.getWriter();
		String username = request.getRemoteUser();
		String userrole = db.selectRole(username);
		
		 response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
			if(userrole.equals("admin"))
			{
				//request.getRequestDispatcher("Admin.jsp").forward(request,response);
				response.sendRedirect("admin.jsp");
			}
			else if(userrole.equals("user"))
			{
				//request.getRequestDispatcher("Introduction.jsp").forward(request,response);
				response.sendRedirect("instraction.jsp");	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	