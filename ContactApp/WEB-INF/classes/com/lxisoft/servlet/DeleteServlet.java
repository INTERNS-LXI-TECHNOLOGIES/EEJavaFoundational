package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;



public class DeleteServlet extends HttpServlet
{
	public DeleteServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBook addressbook =new AddressBook();
		String name = request.getParameter("name");
	 try{
	 	addressbook.delete(name);
	response.sendRedirect("boxDelete.jsp");

	   }
	 catch(Exception e){}
}
}