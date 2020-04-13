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

			 pw.println("user name ="+name);
			  pw.println("user psswd ="+password);
			//for(int i=0;i<users.size();i++){

			 // pw.println("user ="+users.get(i).getName());
			 // pw.println("password ="+users.get(i).getPassword());	
			if(users.get(0).getName() == name && users.get(0).getPassword() == password)
			{
				if(users.get(0).getRole()==role)
				{
				response.sendRedirect("admin.jsp");
				return;}
				else
				{
					response.sendRedirect("question.jsp");
					return;				}	

				 	 
			}
		// 		}
		// // 	else{
			// response.sendRedirect("index.jsp");}
				 pw.println("user ="+users.get(0).getName());
			 pw.println("password ="+users.get(0).getPassword());	
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	