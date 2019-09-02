package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
public class RegistrationServlet extends HttpServlet{ 

public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException,IndexOutOfBoundsException
{ 
	try{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Contact contact=new Contact();
		ContactRepository cR=new ContactRepository(); 
		
		cR.addUser(req.getParameter("username"),req.getParameter("password"));
		}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
