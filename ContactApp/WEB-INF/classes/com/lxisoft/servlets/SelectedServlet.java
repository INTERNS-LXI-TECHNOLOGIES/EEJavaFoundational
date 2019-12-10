package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class SelectedContact extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		//ContactModel contact=(ContactModel)request.getAttribute("id");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false); 

		String name=(String)request.getParameter("user");
		out.println("hi.."+name);
		ArrayList<Contact> contactList=repo.getAllContacts();
		ArrayList<Contact> currentList=new ArrayList<Contact>();
			for(Contact contact:contactList)
			{	if(name.equals(contact.getName()))
				{
	 				currentList.add(contact);			
	 			}
			}
			if(currentList.size()==1)
				{
					request.setAttribute("currentcontactList",currentList);
					RequestDispatcher rd=request.getRequestDispatcher("jsp\\SelectedContact.jsp");
					rd.forward(request,response);
				}
			// else
			// {
			// 	for(Contact contact:contactList)
			// }
	}
}