package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class DeleteServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		try
		{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(); 
		String name=request.getParameter("user");
		out.println("hi.."+name);
		int id=getId(contact);
		repo.deleteContact(0);
		response.sendRedirect("jsp\\ContactView.jsp");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public int getId(Contact contact)
	{
		int id=0;
		
		try
		{
		ArrayList<Contact> contactList=repo.getAllContacts();
		for(int i=0;i<contactList.size();i++)
		{
			if(contact.equals(contactList.get(i)))
			{
				id=contact.getId();
			}
		}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return id;
	}
}