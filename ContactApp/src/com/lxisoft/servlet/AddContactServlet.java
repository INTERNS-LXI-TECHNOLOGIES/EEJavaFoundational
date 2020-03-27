package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class AddContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			DataBase db = new DataBase();
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			Contact contact = new Contact();				
			contact.setFirstName(request.getParameter("firstname"));
			contact.setLastName(request.getParameter("lastname"));
			contact.setPhoneNum(request.getParameter("phno"));
			db.addToDatabase(contact);
			//request.getRequestDispatcher("ViewContacts.jsp").forward(request,response);					
			response.sendRedirect("ViewContacts.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	