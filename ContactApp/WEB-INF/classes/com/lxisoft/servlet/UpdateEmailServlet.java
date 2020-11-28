package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class UpdateEmailServlet extends HttpServlet
{
	public UpdateEmailServlet(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		AddressBookRepository addressbookrepo =new AddressBookRepository();
		String mail = request.getParameter("mail");
		String newmail =request.getParameter("newmail");
		addressbookrepo.updateEmail(newmail,mail);
		try{
			response.sendRedirect("UpdateMessage.jsp");
		}catch(Exception e)
		{
		}

	 
	}
}
