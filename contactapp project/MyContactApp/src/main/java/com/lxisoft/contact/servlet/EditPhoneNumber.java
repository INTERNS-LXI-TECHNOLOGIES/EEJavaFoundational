package com.lxisoft.contact.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repo.*;
import java.sql.*;
import java.io.*;
@WebServlet("/editPhoneNumber")
public class EditPhoneNumber extends HttpServlet
{
	
	public void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException
	{
		try{
		String d="phno";
		String n=request.getParameter("Name");
		String f=request.getParameter("PhoneNumber");
		
		RepositoryImpl re=new RepositoryImpl();
		re.editPhoneNumber(f,n,d);
		PrintWriter out=res.getWriter();
			out.println("<h1>"+"Updated"+"</h1>");
			out.println("<a href="+"editPhoneNumber.jsp"+">back to jsp</a>");
		}
		catch(Exception e){//System.out.println(e);
	e.printStackTrace();}
		
	}
	
	
}