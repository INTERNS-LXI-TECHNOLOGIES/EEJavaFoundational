package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class DeleteContactServlet extends HttpServlet
{
	public DeleteContactServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBookRepository addressbookrepo =new AddressBookRepository();
		String name = request.getParameter("name");
		addressbookrepo.deleteName(name);
	 try{
	 	
	response.sendRedirect("DeleteMessage.jsp");

	   }
	 catch(Exception e){}
}
}