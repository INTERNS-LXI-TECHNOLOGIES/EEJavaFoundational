package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class LoginServlet extends HttpServlet
{
	static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		try
		{

			boolean login= repo.loginValidate(name,pass);
			HttpSession session=request.getSession();
			session.setAttribute("username",name);
			session.setAttribute("password",pass);
			if(login) 
			{
            	
				response.sendRedirect("viewall");
			}
			else
			{
				response.sendRedirect("/index.jsp");	
			}
            out.println(name+pass+login+login);
		}catch(Exception e)
		{

		}
	}
}
