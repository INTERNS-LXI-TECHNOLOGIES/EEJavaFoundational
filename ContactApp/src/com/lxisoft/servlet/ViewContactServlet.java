package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class ViewContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			DataBase db = new DataBase();
		try
		{
			response.setContentType("text/html");
			response.sendRedirect("ViewContacts.jsp");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	