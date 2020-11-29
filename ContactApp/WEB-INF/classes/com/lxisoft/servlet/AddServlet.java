package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class AddServlet extends HttpServlet
{
	public AddServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
	{
		AddressBookRepository addressbookrepo=new AddressBookRepository();


		String name= request.getParameter("name");
	   String number= request.getParameter("number");
	   String email= request.getParameter("email"); 
	   Contact contact=new Contact();
	   		 contact.setName(name);
	   		 contact.setNumber(number);
	   		 contact.setEmail(email);
	   		 addressbookrepo.addToDatabase(name,number,email);
	   		 try
	   		 {
	   		response.sendRedirect("ContactAddedMessage.jsp");
	   	}
	   	catch(Exception e)
		{
		}

	}
}