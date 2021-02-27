package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;



public class AddServlet extends HttpServlet
{
	public AddServlet(){
		super();
	}

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
	{
		
	   ContactRepository contactrepo = new ContactRepository();
	   String name= request.getParameter("name");
	   String lastname= request.getParameter("lname");
	   String email= request.getParameter("email");
	   String number= request.getParameter("number");
	   Contact contact=new Contact();
	   contact.setFirstName(name);
	   contact.setLastName(lastname);
	   contact.setMailId(email); 
	   contact.setNumber(number);
	   contactrepo.addToDatabase(name,lastname,email,number);

	   RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
		rd.forward(request,response);
	}
	
}