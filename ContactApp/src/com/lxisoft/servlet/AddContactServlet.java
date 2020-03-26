package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class AddContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
			DataBase db = new DataBase();
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			Contact contact = new Contact();		

		
			contact.setFirstName(req.getParameter("firstname"));
			contact.setLastName(req.getParameter("lastname"));
			contact.setPhoneNum(req.getParameter("phno"));
			db.addToDatabase(contact);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	