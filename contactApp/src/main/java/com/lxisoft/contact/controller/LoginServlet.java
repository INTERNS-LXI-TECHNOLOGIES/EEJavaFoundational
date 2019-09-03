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
		Contact contact=new Contact();
		ContactRepository cR=new ContactRepository(); 
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		HttpSession session=req.getSession(true);
		session.setAttribute("username",username);
		cR.userLogin(username,password);
		}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
