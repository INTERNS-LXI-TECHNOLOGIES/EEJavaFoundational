package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
public class LoginServlet extends HttpServlet{ 

public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException,IndexOutOfBoundsException
{ 
	try{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ContactRepository cR=new ContactRepository(); 
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		if(cR.userLogin(username,password)!=0)
		{
		res.sendRedirect("home.jsp");
		HttpSession session=req.getSession(true);
		session.setAttribute("username",username);
		}
		}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
