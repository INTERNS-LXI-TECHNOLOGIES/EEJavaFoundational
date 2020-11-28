package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class UpdateNumberServlet extends HttpServlet
{
	public UpdateNumberServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBookRepository addressbookrepo =new AddressBookRepository();
		String number = request.getParameter("number");
		String newnumber =request.getParameter("newnumber");
		addressbookrepo.updateNumber(newnumber,number);
		try{
			response.sendRedirect("UpdateMessage.jsp");
		}catch(Exception e)
		{
		}

	 
	}
}
