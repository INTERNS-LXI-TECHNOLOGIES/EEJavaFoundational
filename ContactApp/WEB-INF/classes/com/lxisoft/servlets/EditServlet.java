package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class EditServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	ArrayList<Contact> contactList=null;
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		// String name=(String)request.getParameter("user");
		HttpSession session=request.getSession(); 
		Contact contact= (Contact)session.getAttribute("currentcontactList");
		out.println("hi......"+contact.getName());
			 try{
			 	// int i=getId(contact);
              contact.setName(request.getParameter("name"));
              contact.setNo(request.getParameter("num"));
              repo.updateRepo(0,contact);
              response.sendRedirect("jsp\\ContactView.jsp");
          }catch(Exception e)
          {
          	e.printStackTrace();
          }
	}
	// public int getId(Contact contact)
	// {
	// 	int id=0;
		
	// 	try
	// 	{
	// 	ArrayList<Contact> contactList=repo.getAllContacts();
	// 	}catch(SQLException e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	for(int i=0;i<contactList.size();i++)
	// 	{
	// 		if(contact.equals(contactList.get(i)))
	// 		{
	// 			id=contact.getId();
	// 		}
	// 	}
	// 	return id;
	// }
    
}
