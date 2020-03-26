package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class ViewContactServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
			ArrayList<Contact> contactList = new ArrayList<Contact>();
			DataBase db = new DataBase();
		try
		{
			int i = 0;
			contactList =  db.getAllContacts(contactList);
			PrintWriter pw = res.getWriter();
			pw.println(contactList.get(i).getFirstName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	