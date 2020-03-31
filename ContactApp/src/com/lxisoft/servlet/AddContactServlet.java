<<<<<<< HEAD
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
			boolean duplicateFlag = false;
			DataBase db = new DataBase();
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			Contact contact = new Contact();
			contact.setFirstName(request.getParameter("firstname"));
			contact.setLastName(request.getParameter("lastname"));
			contact.setPhoneNum(request.getParameter("phno"));
			contactList = db.getAllContacts(contactList);
			PrintWriter writer = response.getWriter();
			writer.println(contactList.size());
			int i = 0;
			for (Contact c:contactList) 
			{
				if(c.getFullName().toLowerCase().equals(contact.getFullName().toLowerCase()))
				{
					duplicateFlag = true;		
				}
			}	
			if(duplicateFlag == true)
			{
				response.sendRedirect("error.jsp");
			}	
			else
			{
				db.addToDatabase(contact);					
				response.sendRedirect("index.jsp");
				
			}	
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
=======
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
			boolean duplicateFlag = false;
			DataBase db = new DataBase();
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			Contact contact = new Contact();
			contact.setFirstName(request.getParameter("firstname"));
			contact.setLastName(request.getParameter("lastname"));
			contact.setPhoneNum(request.getParameter("phno"));
			contactList = db.getAllContacts(contactList);
			int i = 0;
			for (Contact c:contactList) 
			{
				if(c.getFullName().toLowerCase().equals(contact.getFullName().toLowerCase()))
				{
					duplicateFlag = true;		
				}
			}	
			if(duplicateFlag == true)
			{
				response.sendRedirect("error.jsp");
			}	
			else
			{
				db.addToDatabase(contact);					
				response.sendRedirect("ViewContacts.jsp");
				
			}	
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
>>>>>>> b81f6fd2e67710b4348ee6ebc133966c3528ddee
}	