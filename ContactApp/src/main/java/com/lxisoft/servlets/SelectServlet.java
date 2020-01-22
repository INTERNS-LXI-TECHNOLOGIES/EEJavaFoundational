package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;
public class SelectServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(); 
		try
		{
		int select=Integer.parseInt(request.getParameter("select"));
		ArrayList<Contact> contactList=repo.getAllContacts();
		for(Contact contact:contactList)
		{	
			if(select==contact.getId())
			{
 				session.setAttribute("currentcontact",contact);
 				response.sendRedirect("ContactEdit.jsp");	
 			}
		}
		// out.println(select);
		}catch(Exception e)
		{
			try
			{
				String select=(String)request.getParameter("select");
				ArrayList<Contact> contactList=repo.getAllContacts();
				for(Contact contact:contactList)
				{	
					if(select.equalsIgnoreCase(contact.getFullName()))
					{
		 				session.setAttribute("currentcontact",contact);
		 				response.sendRedirect("delete");	
		 			}
				}
			}catch(Exception excep)
			{
				excep.printStackTrace();
			}
		}
	
	}
}