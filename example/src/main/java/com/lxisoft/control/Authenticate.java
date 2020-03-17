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
		
		//out.println("userName :"+userName );
		String userRoll=sqlrep.authenticate(userName);
		//out.println("user roll : "+userRoll);
		if(userRoll.equals("user"))
		{
			  req.getRequestDispatcher("introduction.jsp").forward(req,res);
		}
		else if(userRoll.equals("admin"))
		{
			  req.getRequestDispatcher("admin.jsp").forward(req,res);
		}
	}
}