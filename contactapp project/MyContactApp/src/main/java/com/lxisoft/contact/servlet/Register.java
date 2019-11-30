package com.lxisoft.contact.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repo.*;
import java.sql.*;
import java.io.*;
@WebServlet("/register")
public class Register extends HttpServlet
{
	
	public void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException
	{
		try{
		 String userName=request.getParameter("Username");
		 String password=request.getParameter("password");
		 LogImpl log =new LogImpl();
		 log.registerValidation(userName,password);
		 
		 PrintWriter out=res.getWriter();
			out.println("<h1>"+"Registration Successfull"+"</h1>");
			out.println("<a href="+"login.jsp"+">back to jsp</a>");
		}
		catch(Exception e){//System.out.println(e);
	e.printStackTrace();}
		
	}
	
	
}