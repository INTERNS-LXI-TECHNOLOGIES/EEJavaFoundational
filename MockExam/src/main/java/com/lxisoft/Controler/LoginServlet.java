package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class LoginServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		//out.println("admin : "+request.getParameter("admin"));
		//out.println("user : "+request.getParameter("user"));
		if(request.getParameter("admin")!=null)
		{
			if(request.getParameter("admin").equals("admin"))
			{
				request.getRequestDispatcher("Login.jsp").forward(request,response);
			}
		}
		else if(request.getParameter("user")!=null)
		{
			if(request.getParameter("user").equals("user"))
			{
				request.getRequestDispatcher("UserLogin.jsp").forward(request,response);	
			}
		}
	}
	
}