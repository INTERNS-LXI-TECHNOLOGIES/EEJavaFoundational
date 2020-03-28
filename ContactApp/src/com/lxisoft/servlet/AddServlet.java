package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class AddServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			ContactDatabase db = new ContactDatabase();
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			Contact contact = new Contact();				
			contact.setFirstname(request.getParameter("fname"));
			contact.setLastname(request.getParameter("lname"));
			contact.setNumber(request.getParameter("number"));
			db.addToDatabase(contact);
					
			response.sendRedirect("view.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	