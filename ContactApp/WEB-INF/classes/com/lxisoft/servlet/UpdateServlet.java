package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class UpdateServlet extends HttpServlet
{
	public UpdateServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBookRepository addressbookrepo =new AddressBookRepository();
		String name = request.getParameter("name");
		String newname =request.getParameter("newname");
		addressbookrepo.updateName(newname,name);
		try{
			response.sendRedirect("UpdateMessage.jsp");
		}catch(Exception e)
		{
		}

	 
	}
}
