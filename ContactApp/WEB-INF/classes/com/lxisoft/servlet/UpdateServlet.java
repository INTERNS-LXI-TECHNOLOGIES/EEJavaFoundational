package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;



public class UpdateServlet extends HttpServlet
{
	public UpdateServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBook addressbook =new AddressBook();
		String name = request.getParameter("name");
		String newname =request.getParameter("newname");
		addressbook.updateDatabse(newname,name);
		try{
			response.sendRedirect("boxUpdate.jsp");
		}catch(Exception e)
		{
		}

	 
	}
}
