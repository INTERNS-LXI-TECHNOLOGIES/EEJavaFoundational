package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
public class Authenticate extends HttpServlet
{
	Sqlrepository sqlrep=new Sqlrepository();
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{
		
	
		PrintWriter out = res.getWriter();
		String userName=req.getRemoteUser();
		
		String userRoll=sqlrep.authenticate(userName);
		//out.println("userName :"+userName );
		
		//out.println("user roll : "+userRoll);
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=utf-8");
		if (userRoll==null) 
		{
			
		}
		else
		{

			if(userRoll.equals("user"))
			{
				
				  res.sendRedirect("introduction.jsp");
			}
			else if(userRoll.equals("admin"))
			{
				  res.sendRedirect("admin.jsp");
				  
			}

		}
	}
}