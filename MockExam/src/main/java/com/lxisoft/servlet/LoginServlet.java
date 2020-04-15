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

			 // pw.println("user name ="+name);
			 //  pw.println("user psswd ="+password);
			for(int i=0;i<users.size();i++){

			if(users.get(i).getName().equals(name) && users.get(i).getPassword().equals(password))
			{
				if(users.get(i).getRole().equals(role))
				{
					// RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");	
					// rd.forward(request,response);
				response.sendRedirect("admin.jsp");
				return;
				}
				else
				{
					// RequestDispatcher rd= request.getRequestDispatcher("instraction.jsp");	
					// rd.forward(request,response);
				response.sendRedirect("instraction.jsp");
				return;
				}
			}
			
			}
			response.sendRedirect("index.jsp");
			return;
			
				//  pw.println("user ="+users.get(0).getName());
			 // pw.println("password ="+users.get(0).getPassword());	
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	