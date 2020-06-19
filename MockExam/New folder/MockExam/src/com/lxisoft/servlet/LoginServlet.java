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
			
		 response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
			for(int i=0;i<users.size();i++)
			{
				if(user.getName()==users.get(i).getName()&&user.getPassword()==users.get(i).getPassword())
				{
					//response.sendRedirect("exam.jsp");	
					//request.getRequestDispatcher("introduction.jsp").forward(request,response);
					//response.sendRedirect("exam.jsp");
					 RequestDispatcher rd=request.getRequestDispatcher("exam.jsp");  
       				 rd.forward(request, response);  	

				}
				else
				{
					//request.getRequestDispatcher("login.html").forward(request,response);
					//response.sendRedirect("login.html");		
					//response.sendRedirect("login.html");	
					 RequestDispatcher rd=request.getRequestDispatcher("login.html");  
       				 rd.forward(request, response);  	
				}
			}



			// 	for(int i=0;i<users.size();i++)
			// {
			// 	if(user.getName()==users.get(i).getName()&&user.getPassword()==users.get(i).getPassword())
			// 	{
			// 		//response.sendRedirect("exam.jsp");	
			// 		//request.getRequestDispatcher("introduction.jsp").forward(request,response);
			// 		//response.sendRedirect("exam.jsp");
			// 		 RequestDispatcher rd=request.getRequestDispatcher("exam.jsp");  
   //     				 rd.forward(request, response);  	

			// 	}
			// 	else
			// 	{
			// 		//request.getRequestDispatcher("login.html").forward(request,response);
			// 		//response.sendRedirect("login.html");		
			// 		//response.sendRedirect("login.html");	
			// 		 RequestDispatcher rd=request.getRequestDispatcher("login.html");  
   //     				 rd.forward(request, response);  	
			// 	}
			// }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	